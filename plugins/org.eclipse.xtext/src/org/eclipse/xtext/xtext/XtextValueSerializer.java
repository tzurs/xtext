/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.NamedArgument;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;
import org.eclipse.xtext.services.XtextGrammarAccess;

import com.google.inject.Inject;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class XtextValueSerializer extends ValueSerializer {
	
	@Inject
	private XtextGrammarAccess grammarAccess;
	
	@Override
	public boolean isValid(EObject context, RuleCall ruleCall, Object value, IErrorAcceptor errorAcceptor) {
		if (context instanceof NamedArgument && ruleCall == grammarAccess.getNamedArgumentAccess().getLiteralValueBooleanParserRuleCall_1_0_0()) {
			NamedArgument casted = (NamedArgument) context;
			if (casted.isSetLiteralValue()) {
				return true;
			}
			return false;
		}
		return super.isValid(context, ruleCall, value, errorAcceptor);
	}

}
