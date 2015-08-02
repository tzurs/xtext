/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.idea.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.idea.generator.IdeaPluginClassNames;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class IdeaPluginExtension {
  @Inject
  @Extension
  private IdeaPluginClassNames _ideaPluginClassNames;
  
  public Iterable<AbstractRule> getAllNonTerminalRules(final Grammar grammar) {
    List<AbstractRule> _allRules = GrammarUtil.allRules(grammar);
    final Function1<AbstractRule, Boolean> _function = new Function1<AbstractRule, Boolean>() {
      @Override
      public Boolean apply(final AbstractRule it) {
        return Boolean.valueOf((!(it instanceof TerminalRule)));
      }
    };
    return IterableExtensions.<AbstractRule>filter(_allRules, _function);
  }
  
  public String getSimpleName(final Grammar grammar) {
    return GrammarUtil.getName(grammar);
  }
  
  public String getPackageName(final Grammar grammar) {
    return GrammarUtil.getNamespace(grammar);
  }
  
  public String getPath(final String packageName) {
    return packageName.replaceAll("\\.", "/");
  }
  
  public String getInstanceName(final AbstractRule abstractRule) {
    String _name = abstractRule.getName();
    return _name.toUpperCase();
  }
  
  public String getRuleInstanceName(final Assignment assignment) {
    AbstractElement _terminal = assignment.getTerminal();
    AbstractRule _rule = ((RuleCall) _terminal).getRule();
    return this.getInstanceName(_rule);
  }
  
  public String getInstanceName(final Assignment assignment) {
    AbstractRule _containingRule = GrammarUtil.containingRule(assignment);
    return this.getInstanceName(_containingRule, assignment);
  }
  
  public String getInstanceName(final EnumLiteralDeclaration enumLiteralDeclaration) {
    AbstractRule _containingRule = GrammarUtil.containingRule(enumLiteralDeclaration);
    return this.getInstanceName(_containingRule, enumLiteralDeclaration);
  }
  
  public String getInstanceName(final RuleCall ruleCall) {
    Assignment _containingAssignment = GrammarUtil.containingAssignment(ruleCall);
    return this.getInstanceName(_containingAssignment);
  }
  
  public String getInstanceName(final AbstractRule rule, final Assignment assignment) {
    String _instanceName = this.getInstanceName(rule);
    String _plus = (_instanceName + "_");
    String _feature = assignment.getFeature();
    String _upperCase = _feature.toUpperCase();
    return (_plus + _upperCase);
  }
  
  public String getInstanceName(final AbstractRule rule, final EnumLiteralDeclaration enumLiteralDeclaration) {
    String _instanceName = this.getInstanceName(rule);
    String _plus = (_instanceName + "_");
    EEnumLiteral _enumLiteral = enumLiteralDeclaration.getEnumLiteral();
    String _literal = _enumLiteral.getLiteral();
    String _upperCase = _literal.toUpperCase();
    return (_plus + _upperCase);
  }
  
  public String getPsiElementImplClassName(final Grammar grammar, final AbstractRule abstractRule) {
    String _fileImplName = this._ideaPluginClassNames.getFileImplName(grammar);
    String _packageName = this._ideaPluginClassNames.toPackageName(_fileImplName);
    String _plus = (_packageName + ".");
    String _psiElementImplClassName = this.getPsiElementImplClassName(abstractRule);
    return (_plus + _psiElementImplClassName);
  }
  
  public String getPsiElementImplClassName(final AbstractRule abstractRule) {
    String _name = abstractRule.getName();
    return (_name + "Impl");
  }
  
  public String getPsiElementClassName(final AbstractRule abstractRule) {
    return abstractRule.getName();
  }
  
  public String getPsiElementSuperClassName(final AbstractRule abstractRule) {
    boolean _hasName = this.hasName(abstractRule);
    if (_hasName) {
      return "PsiNamedElement";
    }
    return "PsiElement";
  }
  
  public boolean hasName(final AbstractRule rule) {
    List<Assignment> _assignments = this.getAssignments(rule);
    final Function1<Assignment, Boolean> _function = new Function1<Assignment, Boolean>() {
      @Override
      public Boolean apply(final Assignment a) {
        String _feature = a.getFeature();
        return Boolean.valueOf(_feature.equals("name"));
      }
    };
    Iterable<Assignment> _filter = IterableExtensions.<Assignment>filter(_assignments, _function);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    return (!_isEmpty);
  }
  
  public List<Assignment> getAssignmentsWithoutName(final AbstractRule rule) {
    List<Assignment> _assignments = this.getAssignments(rule);
    final Function1<Assignment, Boolean> _function = new Function1<Assignment, Boolean>() {
      @Override
      public Boolean apply(final Assignment a) {
        String _feature = a.getFeature();
        boolean _equals = _feature.equals("name");
        return Boolean.valueOf((!_equals));
      }
    };
    Iterable<Assignment> _filter = IterableExtensions.<Assignment>filter(_assignments, _function);
    return IterableExtensions.<Assignment>toList(_filter);
  }
  
  public List<Assignment> getAssignments(final AbstractRule rule) {
    TreeIterator<EObject> _eAllContents = rule.eAllContents();
    Iterator<Assignment> _filter = Iterators.<Assignment>filter(_eAllContents, Assignment.class);
    final Function1<Assignment, Boolean> _function = new Function1<Assignment, Boolean>() {
      @Override
      public Boolean apply(final Assignment a) {
        AbstractRule _containingRule = GrammarUtil.containingRule(a);
        return Boolean.valueOf(_containingRule.equals(rule));
      }
    };
    Iterator<Assignment> _filter_1 = IteratorExtensions.<Assignment>filter(_filter, _function);
    return IteratorExtensions.<Assignment>toList(_filter_1);
  }
  
  public List<EnumLiteralDeclaration> getEnumLiteralDeclarations(final AbstractRule rule) {
    TreeIterator<EObject> _eAllContents = rule.eAllContents();
    Iterator<EnumLiteralDeclaration> _filter = Iterators.<EnumLiteralDeclaration>filter(_eAllContents, EnumLiteralDeclaration.class);
    final Function1<EnumLiteralDeclaration, Boolean> _function = new Function1<EnumLiteralDeclaration, Boolean>() {
      @Override
      public Boolean apply(final EnumLiteralDeclaration a) {
        AbstractRule _containingRule = GrammarUtil.containingRule(a);
        return Boolean.valueOf(_containingRule.equals(rule));
      }
    };
    Iterator<EnumLiteralDeclaration> _filter_1 = IteratorExtensions.<EnumLiteralDeclaration>filter(_filter, _function);
    return IteratorExtensions.<EnumLiteralDeclaration>toList(_filter_1);
  }
  
  public String getLocalName(final AbstractRule abstractRule) {
    String _name = abstractRule.getName();
    return StringExtensions.toFirstLower(_name);
  }
  
  public String getRuleLocalName(final AbstractElement element) {
    AbstractRule _containingRule = GrammarUtil.containingRule(element);
    return this.getLocalName(_containingRule);
  }
  
  public String getRuleInstanceName(final AbstractElement element) {
    AbstractRule _containingRule = GrammarUtil.containingRule(element);
    return this.getInstanceName(_containingRule);
  }
  
  public String getLocalName(final Assignment assignment) {
    AbstractRule _containingRule = GrammarUtil.containingRule(assignment);
    String _localName = this.getLocalName(_containingRule);
    String _feature = assignment.getFeature();
    String _firstUpper = StringExtensions.toFirstUpper(_feature);
    return (_localName + _firstUpper);
  }
  
  public String getLocalName(final RuleCall ruleCall) {
    Assignment _containingAssignment = GrammarUtil.containingAssignment(ruleCall);
    return this.getLocalName(_containingAssignment);
  }
  
  public boolean hasMultipleAssigment(final AbstractRule rule) {
    Iterable<Assignment> _multipleAssignments = this.getMultipleAssignments(rule);
    boolean _isEmpty = IterableExtensions.isEmpty(_multipleAssignments);
    return (!_isEmpty);
  }
  
  public Iterable<Assignment> getMultipleAssignments(final AbstractRule rule) {
    List<Assignment> _assignments = this.getAssignments(rule);
    final Function1<Assignment, Boolean> _function = new Function1<Assignment, Boolean>() {
      @Override
      public Boolean apply(final Assignment a) {
        return Boolean.valueOf(IdeaPluginExtension.this.isMultiple(a));
      }
    };
    return IterableExtensions.<Assignment>filter(_assignments, _function);
  }
  
  public String getTypeName(final Assignment assignment) {
    boolean _isMultiple = this.isMultiple(assignment);
    if (_isMultiple) {
      String _internalTypeName = this.getInternalTypeName(assignment);
      String _plus = ("List<" + _internalTypeName);
      return (_plus + ">");
    }
    return this.getInternalTypeName(assignment);
  }
  
  public boolean isMultiple(final Assignment assignment) {
    String _operator = assignment.getOperator();
    return "+=".equals(_operator);
  }
  
  public boolean isBoolean(final Assignment assignment) {
    String _operator = assignment.getOperator();
    return "?=".equals(_operator);
  }
  
  public boolean isOneOrNone(final AbstractElement element) {
    String _cardinality = element.getCardinality();
    return "?".equals(_cardinality);
  }
  
  public boolean isExactlyOne(final AbstractElement element) {
    String _cardinality = element.getCardinality();
    return Objects.equal(_cardinality, null);
  }
  
  public boolean isAny(final AbstractElement element) {
    String _cardinality = element.getCardinality();
    return "*".equals(_cardinality);
  }
  
  public boolean isOneOrMore(final AbstractElement element) {
    String _cardinality = element.getCardinality();
    return "+".equals(_cardinality);
  }
  
  public String getVariableName(final AbstractElement abstartElement) {
    AbstractRule _containingRule = GrammarUtil.containingRule(abstartElement);
    TreeIterator<EObject> _eAllContents = _containingRule.eAllContents();
    Iterator<AbstractElement> _filter = Iterators.<AbstractElement>filter(_eAllContents, AbstractElement.class);
    List<AbstractElement> _list = IteratorExtensions.<AbstractElement>toList(_filter);
    int _indexOf = _list.indexOf(abstartElement);
    return ("variable_" + Integer.valueOf(_indexOf));
  }
  
  protected String _getInternalTypeName(final Assignment assignment) {
    boolean _isBoolean = this.isBoolean(assignment);
    if (_isBoolean) {
      return "boolean";
    }
    AbstractElement _terminal = assignment.getTerminal();
    return this.getInternalTypeName(_terminal);
  }
  
  protected String _getInternalTypeName(final CrossReference crossReference) {
    AbstractElement _terminal = crossReference.getTerminal();
    return this.getInternalTypeName(_terminal);
  }
  
  protected String _getInternalTypeName(final RuleCall ruleCall) {
    AbstractRule _rule = ruleCall.getRule();
    if ((_rule instanceof TerminalRule)) {
      return "String";
    }
    AbstractRule _rule_1 = ruleCall.getRule();
    return _rule_1.getName();
  }
  
  protected String _getInternalTypeName(final AbstractElement abstractElement) {
    return "";
  }
  
  public String getGetter(final Assignment assignment) {
    boolean _isBoolean = this.isBoolean(assignment);
    if (_isBoolean) {
      String _feature = assignment.getFeature();
      String _firstUpper = StringExtensions.toFirstUpper(_feature);
      return ("is" + _firstUpper);
    }
    String _feature_1 = assignment.getFeature();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_feature_1);
    return ("get" + _firstUpper_1);
  }
  
  public String getSetter(final Assignment assignment) {
    String _feature = assignment.getFeature();
    String _firstUpper = StringExtensions.toFirstUpper(_feature);
    return ("set" + _firstUpper);
  }
  
  public String getPsiElementImplClassName(final Assignment assignment) {
    AbstractElement _terminal = assignment.getTerminal();
    AbstractRule _rule = ((RuleCall) _terminal).getRule();
    return this.getPsiElementImplClassName(_rule);
  }
  
  public String getPsiElementClassName(final Assignment assignment) {
    AbstractElement _terminal = assignment.getTerminal();
    AbstractRule _rule = ((RuleCall) _terminal).getRule();
    return this.getPsiElementClassName(_rule);
  }
  
  public String getLanguageID(final Grammar grammar) {
    return grammar.getName();
  }
  
  public String getStubElementTypeClassName(final AbstractRule abstractRule) {
    String _name = abstractRule.getName();
    return (_name + "StubElementType");
  }
  
  public String getInternalTypeName(final AbstractElement assignment) {
    if (assignment instanceof Assignment) {
      return _getInternalTypeName((Assignment)assignment);
    } else if (assignment instanceof CrossReference) {
      return _getInternalTypeName((CrossReference)assignment);
    } else if (assignment instanceof RuleCall) {
      return _getInternalTypeName((RuleCall)assignment);
    } else if (assignment != null) {
      return _getInternalTypeName(assignment);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assignment).toString());
    }
  }
}
