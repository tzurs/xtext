/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.idea.documentation

import com.intellij.openapi.command.WriteCommandAction
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import org.eclipse.xtend.idea.LightXtendTest

import static extension com.intellij.codeInsight.documentation.DocumentationManager.*

/**
 * 
 * @author kosyakov - Initial contribution and API
 * @author moritz.eysholdt@itemis.de
 */
class XtendDocumentationTest extends LightXtendTest {

	protected override invokeTestRunnable(Runnable runnable) {
		WriteCommandAction.runWriteCommandAction(project, runnable)
	}

	def void testJavaClass() {
		myFixture.addFileToProject("foo/Foo.java", '''
			package foo;
			/**
			 * mydocumentation
			 */
			public class Foo {
			}
		''')
		val xtend = myFixture.configureByText('Bar.xtend', '''
			class Bar extends foo.F<caret>oo {
			}
		''')
		val expected = xtend.findReferenceAt(myFixture.caretOffset).generateDocumentation
		assertTrue(expected.contains("mydocumentation"))
	}

	def void testXtendClass() {
		myFixture.addFileToProject("foo/Foo.xtend", '''
			package foo;
			/**
			 * mydocumentation
			 */
			class Foo {
			}
		''')
		val xtend = myFixture.configureByText('Bar.xtend', '''
			class Bar extends foo.F<caret>oo {
			}
		''')
		val expected = xtend.findReferenceAt(myFixture.caretOffset).generateDocumentation
		assertTrue(expected.contains("mydocumentation"))
	}

	def void testXtendField() {
		myFixture.addFileToProject("foo/Foo.xtend", '''
			package foo;
			class Foo {
				/**
				 * mydocumentation
				 */
				public val String myfoo = "x"
			}
		''')
		val xtend = myFixture.configureByText('Bar.xtend', '''
			class Bar {
				val String x = new foo.Foo().my<caret>foo
			}
		''')
		val expected = xtend.findReferenceAt(myFixture.caretOffset).generateDocumentation
		assertTrue(expected.contains("<b>myfoo = &quot;x&quot;</b>"))
		assertTrue(expected.contains("mydocumentation"))
	}

	def void testXtendMethod() {
		myFixture.addFileToProject("foo/Foo.xtend", '''
			package foo;
			class Foo {
				/**
				 * mydocumentation
				 */
				def myfoo() { "x" }
			}
		''')
		val xtend = myFixture.configureByText('Bar.xtend', '''
			class Bar {
				val String x = new foo.Foo().my<caret>foo()
			}
		''')
		val expected = xtend.findReferenceAt(myFixture.caretOffset).generateDocumentation
		assertTrue(expected.contains("<b>myfoo</b>()"))
		assertTrue(expected.contains("mydocumentation"))
	}

	def void testXtendConstructor() {
		myFixture.addFileToProject("foo/Foo.xtend", '''
			package foo;
			class Foo {
				/**
				 * mydocumentation
				 */
				new() {}
			}
		''')
		val xtend = myFixture.configureByText('Bar.xtend', '''
			class Bar {
				val String x = new foo.F<caret>oo()
			}
		''')
		val expected = xtend.findReferenceAt(myFixture.caretOffset).generateDocumentation
		assertTrue(expected.contains("<b>Foo</b>()"))
		assertTrue(expected.contains("mydocumentation"))
	}

	protected def generateDocumentation(PsiReference reference) {
		val originalElement = reference.element
		val element = reference.resolve
		assertNotNull(originalElement)
		assertNotNull(element)
		generateDocumentation(element, originalElement)
	}

	protected def generateDocumentation(PsiElement element, PsiElement originalElement) {
		element.getProviderFromElement(originalElement).generateDoc(element, originalElement)
	}

}