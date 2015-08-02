/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.grammarinheritance;

import org.eclipse.xtext.grammarinheritance.inheritanceTest.Model;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class ParserTest extends AbstractXtextTests {

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new InheritanceTest3LanguageStandaloneSetup());
	}
	
	@Override
	protected boolean shouldTestSerializer(XtextResource resource) {
		return false;
	}

	@Test public void test_01() throws Exception {
		Model model = (Model) getModel("model id { element id }");
		assertEquals("id", model.getName());
		assertEquals("id", model.getElements().get(0).getName());
	}
	
	@Test public void test_02() throws Exception {
		Model model = (Model) getModel("model id { element inheritedIdSyntax }");
		assertEquals("id", model.getName());
		assertEquals("inheritedIdSyntax", model.getElements().get(0).getName());
	}
}
