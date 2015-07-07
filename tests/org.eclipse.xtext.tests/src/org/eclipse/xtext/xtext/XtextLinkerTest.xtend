/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext

import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.TerminalRule
import org.eclipse.xtext.XtextStandaloneSetup
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.junit.Test

/**
 * @author Sven Efftinge - Initial contribution and API
 */
class XtextLinkerTest extends AbstractXtextTests {
	override void setUp() throws Exception {
		super.setUp()
		with(new XtextStandaloneSetup())
	}
	
	@Test def void testQualifiedRuleCall_01() throws Exception {
		val grammarAsString = '''
			grammar test.Lang with org.eclipse.xtext.common.Terminals
			generate test 'http://test'
			RuleA returns Type:
			  name+=ID name+=super::ID name+=Terminals::ID name+=org::eclipse::xtext::common::Terminals::ID;
			RuleB returns Type:
			  name+=STRING name+=Lang::STRING name+=test::Lang::STRING;
			RuleC returns Type:
			  name+=super::STRING name+=Terminals::STRING name+=org::eclipse::xtext::common::Terminals::STRING;
			terminal STRING: super::STRING;
		'''
		val resource = grammarAsString.resourceFromString
		var grammar = resource.getContents().get(0) as Grammar
		val firstRule = grammar.rules.head
		val idRule = GrammarUtil.findRuleForName(grammar.usedGrammars.head, "ID")
		assertTrue(GrammarUtil.containedRuleCalls(firstRule).forall[
			rule == idRule 
		])
		val secondRule = grammar.rules.tail.head
		val stringRule = grammar.rules.last
		assertTrue(GrammarUtil.containedRuleCalls(secondRule).forall[
			rule == stringRule 
		])
		val thirdRule = grammar.rules.drop(2).head
		val inheritedString = GrammarUtil.findRuleForName(grammar.usedGrammars.head, "STRING")
		assertTrue(GrammarUtil.containedRuleCalls(thirdRule).forall[
			rule == inheritedString 
		])
	}
	
	@Test def void testQualifiedRuleCall_02() throws Exception {
		val grammarAsString = '''
			grammar test with org.eclipse.xtext.common.Terminals
			generate test 'http://test'
			Rule: name=ID;
			terminal STRING: super;
		'''
		val resource = grammarAsString.resourceFromString
		var grammar = resource.getContents().get(0) as Grammar
		val string = grammar.rules.get(1) as TerminalRule
		val callToSuper = string.alternatives as RuleCall
		assertEquals(GrammarUtil.findRuleForName(grammar.usedGrammars.head, "STRING"), callToSuper.rule)
	}
	
	@Test def void testQualifiedRuleCall_03() throws Exception {
		val grammarAsString = '''
			grammar test with org.eclipse.xtext.common.Terminals
			generate test 'http://test'
			Rule: name=ID;
			terminal STRING: super;
			terminal super: 'super';
		'''
		val resource = grammarAsString.resourceFromString
		var grammar = resource.getContents().get(0) as Grammar
		val string = grammar.rules.get(1) as TerminalRule
		val callToSuper = string.alternatives as RuleCall
		assertEquals(grammar.rules.last, callToSuper.rule)
	}

	@Test def void testGeneratedPackageRemovedProperly() throws Exception {
		val testGrammar = "grammar foo.Bar generate foo 'bar'  Model : name=ID;"
		checkPackageRemovalAfterGrammarChange(true, testGrammar, testGrammar.indexOf("name"), 4, "foo")
		checkPackageRemovalAfterGrammarChange(true, testGrammar, testGrammar.indexOf("generate foo") + 11, 1, "x")
		checkPackageRemovalAfterGrammarChange(true, testGrammar, testGrammar.indexOf("foo.Bar"), 1, "x")
	}

	@Test def void testImportedPackageRemovedProperly() throws Exception {
		val testGrammar = "grammar foo.Bar import 'classpath:/org/eclipse/xtext/xtext/Foo.ecore' as foo Model returns foo::Model: name=ID;"
		// package import not influenced by parser rule change
		checkPackageRemovalAfterGrammarChange(false, testGrammar, testGrammar.indexOf("name"), 4, "foo")
		checkPackageRemovalAfterGrammarChange(true, testGrammar, testGrammar.indexOf("as foo") + 4, 1, "x")
		checkPackageRemovalAfterGrammarChange(true, testGrammar, testGrammar.indexOf("foo.Bar"), 1, "x")
	}

	@Test def void testRegisteredPackageNotUnloaded() throws Exception {
		val testGrammar = "grammar foo.Bar import 'http://www.eclipse.org/emf/2002/Ecore' EClass: 'foo';"
		checkRegisteredPackageNotUnloadedAfterGrammarChange(testGrammar, testGrammar.indexOf("'foo'"), 4, "foo")
		checkRegisteredPackageNotUnloadedAfterGrammarChange(testGrammar, testGrammar.indexOf("import ") + 11, 1, "x")
		checkRegisteredPackageNotUnloadedAfterGrammarChange(testGrammar, testGrammar.indexOf("foo.Bar"), 1, "x")
	}

	def private void checkPackageRemovalAfterGrammarChange(boolean isRemoved,
			String originalGrammar, int offset,	int length, String replacement) throws Exception {
		val resource = getResourceFromStringAndExpect(originalGrammar, 1)
		var grammar = resource.getContents().get(0) as Grammar
		var generatedMetamodel = grammar.getMetamodelDeclarations().get(0)
		var ePackage = generatedMetamodel.getEPackage()
		assertEquals(ePackage.eResource().getResourceSet(), resource.getResourceSet())
		resource.update(offset, length, replacement)
		if (isRemoved) {
			assertNull(ePackage.eResource().getResourceSet())
		} else {
			assertEquals(ePackage.eResource().getResourceSet(), resource.getResourceSet())
		}
		grammar = resource.getContents().get(0) as Grammar
		generatedMetamodel = grammar.getMetamodelDeclarations().get(0)
		ePackage = generatedMetamodel.getEPackage()
		assertEquals(resource.getResourceSet(), ePackage.eResource().getResourceSet())
	}

	def private void checkRegisteredPackageNotUnloadedAfterGrammarChange(String originalGrammar,
			int offset, int length, String replacement) throws Exception {
		val resource = getResourceFromString(originalGrammar)
		val grammar = resource.getContents().get(0) as Grammar
		val generatedMetamodel = grammar.getMetamodelDeclarations().get(0)
		val ePackage = generatedMetamodel.getEPackage()
		assertNull((ePackage as InternalEObject).eProxyURI())
		resource.update(offset, length, replacement)
		assertNull((ePackage as InternalEObject).eProxyURI())
	}

}
