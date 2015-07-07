/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.Strings;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class SuperCallScope implements IScope {

	private EObject context;

	public SuperCallScope(EObject context) {
		this.context = context;
	}
	
	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		return doGetSingleElement(name);
	}

	private IEObjectDescription doGetSingleElement(QualifiedName qn) {
		List<String> name = Strings.split(qn.getFirstSegment(), '.');
		if (name.size() == 1) {
			if ("super".equals(name.get(0))) {
				AbstractRule containingRule = GrammarUtil.containingRule(context);
				if (containingRule != null) {
					Grammar grammar = GrammarUtil.getGrammar(containingRule);
					for(Grammar parent: grammar.getUsedGrammars()) {
						AbstractRule superRule = GrammarUtil.findRuleForName(parent, containingRule.getName());
						if (superRule != null) {
							return EObjectDescription.create(qn, superRule);
						}
					}
				}
			}
		} else if (name.size() > 1) {
			Grammar grammar = GrammarUtil.getGrammar(context);
			if (grammar != null) {
				String firstSegment = name.get(0);
				if (name.size() == 2) {
					String ruleName = name.get(1);
					if ("super".equals(firstSegment)) {
						for(Grammar parent: grammar.getUsedGrammars()) {
							AbstractRule superRule = GrammarUtil.findRuleForName(parent, ruleName);
							if (superRule != null) {
								return EObjectDescription.create(QualifiedName.create(name), superRule);
							}
						}
					}
					if (firstSegment.equals(GrammarUtil.getName(grammar))) {
						AbstractRule rule = GrammarUtil.findRuleForName(grammar, grammar.getName() + "." + ruleName);
						if (rule != null) {
							return EObjectDescription.create(QualifiedName.create(name), rule);
						}
					}
					for(Grammar usedGrammar: GrammarUtil.allUsedGrammars(grammar)) {
						if (firstSegment.equals(GrammarUtil.getName(usedGrammar))) {
							AbstractRule rule = GrammarUtil.findRuleForName(usedGrammar, usedGrammar.getName() + "." + ruleName);
							if (rule != null) {
								return EObjectDescription.create(QualifiedName.create(name), rule);
							}
						}	
					}
				}
				AbstractRule result = GrammarUtil.findRuleForName(grammar, qn.getFirstSegment());
				if (result != null) {
					return EObjectDescription.create(QualifiedName.create(name), result);
				}
			}
		}
		return null;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		if (name.getSegmentCount() == 1) {
			IEObjectDescription result = doGetSingleElement(name);
			if (result != null) {
				return Collections.singletonList(result);
			}
			return Collections.emptyList();
		} else {
			return null;
		}
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		// TODO Auto-generated method stub
		return null;
	}

}
