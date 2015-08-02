/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.generator.parser.antlr;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.xtext.AbstractRule;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.9
 */
public class AntlrRuleNameAdapter extends AdapterImpl {

	private final String name;

	public AntlrRuleNameAdapter(String name, AbstractRule rule) {
		this.name = name;
		rule.eAdapters().add(this);
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return AntlrRuleNameAdapter.class.equals(type);
	}
	
	public String getName() {
		return name;
	}
	
}
