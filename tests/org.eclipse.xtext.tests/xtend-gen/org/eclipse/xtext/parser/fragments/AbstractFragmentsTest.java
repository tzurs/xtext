/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.parser.fragments;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.impl.InvariantChecker;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Named;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.NamedWithAction;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public abstract class AbstractFragmentsTest {
  @Inject
  @Extension
  private ParseHelper<Fragments> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper validationTestHelper;
  
  @Inject
  @Extension
  private InvariantChecker invariantChecker;
  
  @Test
  public void testSimpleModel() {
    final Fragments fragments = this.parseAndValidate("#1 myName");
    Assert.assertNotNull(fragments);
    Named _element = fragments.getElement();
    String _name = _element.getName();
    Assert.assertEquals("myName", _name);
  }
  
  @Test
  public void testReference() {
    final Fragments fragments = this.parseAndValidate("#2 myName -> myName");
    Assert.assertNotNull(fragments);
    Named _element = fragments.getElement();
    String _name = _element.getName();
    Assert.assertEquals("myName", _name);
    Named _element_1 = fragments.getElement();
    Named _ref = fragments.getRef();
    Assert.assertEquals(_element_1, _ref);
  }
  
  @Test
  public void testReference_02() {
    final Fragments fragments = this.parseAndValidate("#1 myName : myName");
    Assert.assertNotNull(fragments);
    Named _element = fragments.getElement();
    String _name = _element.getName();
    Assert.assertEquals("myName", _name);
    Named _element_1 = fragments.getElement();
    Named _element_2 = fragments.getElement();
    Named _ref = _element_2.getRef();
    Assert.assertEquals(_element_1, _ref);
  }
  
  @Test
  public void testReferenceInFragment() {
    final Fragments fragments = this.parseAndValidate("#1 myName - myName");
    Assert.assertNotNull(fragments);
    Named _element = fragments.getElement();
    String _name = _element.getName();
    Assert.assertEquals("myName", _name);
    Named _element_1 = fragments.getElement();
    Named _element_2 = fragments.getElement();
    Named _ref = _element_2.getRef();
    Assert.assertEquals(_element_1, _ref);
  }
  
  @Test
  public void testReferenceBeforeFragment() {
    final Fragments fragments = this.parseAndValidate("#3 myName <- myName");
    Assert.assertNotNull(fragments);
    Named _element = fragments.getElement();
    String _name = _element.getName();
    Assert.assertEquals("myName", _name);
    Named _element_1 = fragments.getElement();
    Named _element_2 = fragments.getElement();
    Named _ref = _element_2.getRef();
    Assert.assertEquals(_element_1, _ref);
  }
  
  @Test
  public void testAction() {
    final Fragments fragments = this.parseAndValidate("#4 prev current");
    Assert.assertNotNull(fragments);
    Named _element = fragments.getElement();
    String _name = _element.getName();
    Assert.assertEquals("current", _name);
    Named _element_1 = fragments.getElement();
    Named _prev = ((NamedWithAction) _element_1).getPrev();
    String _name_1 = _prev.getName();
    Assert.assertEquals("prev", _name_1);
  }
  
  @Test
  public void testActionAndReference() {
    final Fragments fragments = this.parseAndValidate("#4 prev current prev current");
    Assert.assertNotNull(fragments);
    final Named element = fragments.getElement();
    String _name = element.getName();
    Assert.assertEquals("current", _name);
    final Named prev = ((NamedWithAction) element).getPrev();
    String _name_1 = prev.getName();
    Assert.assertEquals("prev", _name_1);
    Named _ref = element.getRef();
    Assert.assertEquals(prev, _ref);
    Named _ref2 = ((NamedWithAction) element).getRef2();
    Assert.assertEquals(element, _ref2);
  }
  
  @Test
  public void testActionInFragment_01() {
    final Fragments fragments = this.parseAndValidate("#5 prev current");
    Assert.assertNotNull(fragments);
    Named _element = fragments.getElement();
    String _name = _element.getName();
    Assert.assertEquals("current", _name);
    Named _element_1 = fragments.getElement();
    Named _prev = ((NamedWithAction) _element_1).getPrev();
    String _name_1 = _prev.getName();
    Assert.assertEquals("prev", _name_1);
  }
  
  @Test
  public void testActionInFragment_02() {
    final Fragments fragments = this.parseAndValidate("#6 prev current");
    Assert.assertNotNull(fragments);
    Named _element = fragments.getElement();
    String _name = _element.getName();
    Assert.assertEquals("current", _name);
    Named _element_1 = fragments.getElement();
    Named _prev = ((NamedWithAction) _element_1).getPrev();
    String _name_1 = _prev.getName();
    Assert.assertEquals("prev", _name_1);
  }
  
  @Test
  public void testActionInFragmentAndReference_01() {
    final Fragments fragments = this.parseAndValidate("#5 prev current current - prev");
    Assert.assertNotNull(fragments);
    final Named element = fragments.getElement();
    String _name = element.getName();
    Assert.assertEquals("current", _name);
    final Named prev = ((NamedWithAction) element).getPrev();
    String _name_1 = prev.getName();
    Assert.assertEquals("prev", _name_1);
    Named _ref = element.getRef();
    Assert.assertEquals(prev, _ref);
    Named _ref2 = ((NamedWithAction) element).getRef2();
    Assert.assertEquals(element, _ref2);
  }
  
  @Test
  public void testActionInFragmentAndReference_02() {
    final Fragments fragments = this.parseAndValidate("#6 prev current current - prev");
    Assert.assertNotNull(fragments);
    final Named element = fragments.getElement();
    String _name = element.getName();
    Assert.assertEquals("current", _name);
    final Named prev = ((NamedWithAction) element).getPrev();
    String _name_1 = prev.getName();
    Assert.assertEquals("prev", _name_1);
    Named _ref = element.getRef();
    Assert.assertEquals(prev, _ref);
    Named _ref2 = ((NamedWithAction) element).getRef2();
    Assert.assertEquals(element, _ref2);
  }
  
  @Test
  public void testActionInFragmentAndReferenceLoop() {
    final Fragments fragments = this.parseAndValidate("#7 root -> a a -> b b -> c c - root");
    Assert.assertNotNull(fragments);
    Named element = fragments.getElement();
    while ((element instanceof NamedWithAction)) {
      {
        Named _ref2 = ((NamedWithAction)element).getRef2();
        Assert.assertEquals(element, _ref2);
        Named _prev = ((NamedWithAction)element).getPrev();
        element = _prev;
      }
    }
    Named _ref = element.getRef();
    Assert.assertEquals(element, _ref);
  }
  
  protected Fragments parseAndValidate(final CharSequence s) {
    try {
      final Fragments result = this.parseHelper.parse(s);
      this.validationTestHelper.assertNoIssues(result);
      Resource _eResource = result.eResource();
      final XtextResource resource = ((XtextResource) _eResource);
      IParseResult _parseResult = resource.getParseResult();
      final ICompositeNode node = _parseResult.getRootNode();
      this.invariantChecker.checkInvariant(node);
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
