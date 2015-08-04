/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.idea.generator.parser.antlr;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.generator.parser.antlr.AntlrOptions;
import org.eclipse.xtext.idea.generator.parser.antlr.AbstractActionAwareAntlrGrammarGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@Singleton
@SuppressWarnings("all")
public class AntlrGrammarGenerator extends AbstractActionAwareAntlrGrammarGenerator {
  @Override
  protected String getGrammarFileName(final Grammar it) {
    return this._namingExtensions.getGrammarFileName(it, "");
  }
  
  @Override
  protected String compileOptions(final Grammar it, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("options {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("superClass=AbstractInternalAntlrParser;");
    _builder.newLine();
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _isBacktrack = options.isBacktrack();
      if (_isBacktrack) {
        _or_1 = true;
      } else {
        boolean _isMemoize = options.isMemoize();
        _or_1 = _isMemoize;
      }
      if (_or_1) {
        _or = true;
      } else {
        int _k = options.getK();
        boolean _greaterEqualsThan = (_k >= 0);
        _or = _greaterEqualsThan;
      }
      if (_or) {
        {
          boolean _isBacktrack_1 = options.isBacktrack();
          if (_isBacktrack_1) {
            _builder.append("\t");
            _builder.append("backtrack=true;");
            _builder.newLine();
          }
        }
        {
          boolean _isMemoize_1 = options.isMemoize();
          if (_isMemoize_1) {
            _builder.append("\t");
            _builder.append("memoize=true;");
            _builder.newLine();
          }
        }
        {
          int _k_1 = options.getK();
          boolean _greaterEqualsThan_1 = (_k_1 >= 0);
          if (_greaterEqualsThan_1) {
            _builder.append("\t");
            _builder.append("memoize=");
            int _k_2 = options.getK();
            _builder.append(_k_2, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected String compileParserImports(final Grammar it, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.parser.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.parser.impl.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.util.EcoreUtil;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    {
      List<EnumRule> _allEnumRules = GrammarUtil.allEnumRules(it);
      boolean _isEmpty = _allEnumRules.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("import org.eclipse.emf.common.util.Enumerator;");
        _builder.newLine();
      }
    }
    _builder.append("import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.parser.antlr.XtextTokenStream;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;");
    _builder.newLine();
    {
      boolean _and = false;
      List<ParserRule> _allParserRules = GrammarUtil.allParserRules(it);
      final Function1<ParserRule, List<EObject>> _function = new Function1<ParserRule, List<EObject>>() {
        @Override
        public List<EObject> apply(final ParserRule it) {
          return EcoreUtil2.eAllContentsAsList(it);
        }
      };
      List<List<EObject>> _map = ListExtensions.<ParserRule, List<EObject>>map(_allParserRules, _function);
      Iterable<EObject> _flatten = Iterables.<EObject>concat(_map);
      Iterable<UnorderedGroup> _filter = Iterables.<UnorderedGroup>filter(_flatten, UnorderedGroup.class);
      boolean _isEmpty_1 = IterableExtensions.isEmpty(_filter);
      boolean _not_1 = (!_isEmpty_1);
      if (!_not_1) {
        _and = false;
      } else {
        boolean _isBacktrack = options.isBacktrack();
        _and = _isBacktrack;
      }
      if (_and) {
        _builder.append("import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;");
        _builder.newLine();
      }
    }
    _builder.append("import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;");
    _builder.newLine();
    _builder.append("import ");
    String _gaFQName = this._grammarAccess.gaFQName(it);
    _builder.append(_gaFQName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected String compileParserMembers(final Grammar it, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("@parser::members {");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isBacktrack = options.isBacktrack();
      if (_isBacktrack) {
        _builder.append("/*");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("This grammar contains a lot of empty actions to work around a bug in ANTLR.");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.");
        _builder.newLine();
        _builder.append("*/");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append(" \t");
    _builder.append("private ");
    String _gaSimpleName = this._grammarAccess.gaSimpleName(it);
    _builder.append(_gaSimpleName, " \t");
    _builder.append(" grammarAccess;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _internalParserClassName = this._namingExtensions.getInternalParserClassName(it);
    String _simpleName = this._naming.toSimpleName(_internalParserClassName);
    _builder.append(_simpleName, "    ");
    _builder.append("(TokenStream input, ");
    String _gaSimpleName_1 = this._grammarAccess.gaSimpleName(it);
    _builder.append(_gaSimpleName_1, "    ");
    _builder.append(" grammarAccess) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this(input);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.grammarAccess = grammarAccess;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("registerRules(grammarAccess.getGrammar());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected String getFirstRuleName() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return \"");
    List<ParserRule> _allParserRules = GrammarUtil.allParserRules(it);
    ParserRule _head = IterableExtensions.<ParserRule>head(_allParserRules);
    String _name = _head.getName();
    _builder.append(_name, "    \t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("   \t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("   \t");
    _builder.append("protected ");
    String _gaSimpleName_2 = this._grammarAccess.gaSimpleName(it);
    _builder.append(_gaSimpleName_2, "   \t");
    _builder.append(" getGrammarAccess() {");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t\t");
    _builder.append("return grammarAccess;");
    _builder.newLine();
    _builder.append("   \t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected String compileRuleCatch(final Grammar it, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("@rulecatch {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("catch (RecognitionException re) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("recover(input,re);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("appendSkippedTokens();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected boolean shouldBeSkipped(final TerminalRule it, final Grammar grammar) {
    return false;
  }
  
  @Override
  protected CharSequence _compileRule(final ParserRule it, final Grammar grammar, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isFragment = it.isFragment();
      boolean _not = (!_isFragment);
      if (_not) {
        String _compileEntryRule = this.compileEntryRule(it, grammar, options);
        _builder.append(_compileEntryRule, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _compileEBNF = this.compileEBNF(it, options);
    _builder.append(_compileEBNF, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String compileEntryRule(final ParserRule it, final Grammar grammar, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Entry rule ");
    String _entryRuleName = this._grammarAccessExtensions.entryRuleName(it);
    _builder.append(_entryRuleName, "");
    _builder.newLineIfNotEmpty();
    String _entryRuleName_1 = this._grammarAccessExtensions.entryRuleName(it);
    _builder.append(_entryRuleName_1, "");
    _builder.append(" returns ");
    String _compileEntryReturns = this.compileEntryReturns(it, options);
    _builder.append(_compileEntryReturns, "");
    CharSequence _compileEntryInit = this.compileEntryInit(it, options);
    _builder.append(_compileEntryInit, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{ ");
    CharSequence _newCompositeNode = this.newCompositeNode(it);
    _builder.append(_newCompositeNode, "\t");
    _builder.append(" }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("iv_");
    String _ruleName = this._grammarAccessExtensions.ruleName(it);
    _builder.append(_ruleName, "\t");
    _builder.append("=");
    String _ruleName_1 = this._grammarAccessExtensions.ruleName(it);
    _builder.append(_ruleName_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{ $current=$iv_");
    String _ruleName_2 = this._grammarAccessExtensions.ruleName(it);
    _builder.append(_ruleName_2, "\t");
    _builder.append(".current");
    {
      boolean _isDatatypeRule = GrammarUtil.isDatatypeRule(it);
      if (_isDatatypeRule) {
        _builder.append(".getText()");
      }
    }
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("EOF;");
    _builder.newLine();
    CharSequence _compileEntryFinally = this.compileEntryFinally(it, options);
    _builder.append(_compileEntryFinally, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String compileEntryReturns(final ParserRule it, final AntlrOptions options) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (it instanceof ParserRule) {
        boolean _isDatatypeRule = GrammarUtil.isDatatypeRule(it);
        if (_isDatatypeRule) {
          _matched=true;
          _switchResult = "[String current=null]";
        }
      }
    }
    if (!_matched) {
      if (it instanceof ParserRule) {
        _matched=true;
        _switchResult = "[EObject current=null]";
      }
    }
    if (!_matched) {
      throw new IllegalStateException(("Unexpected rule: " + it));
    }
    return _switchResult;
  }
  
  @Override
  protected String compileInit(final AbstractRule it, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEObjectFragmentRule = GrammarUtil.isEObjectFragmentRule(it);
      if (_isEObjectFragmentRule) {
        _builder.append("[EObject in_current]");
      }
    }
    _builder.append(" returns ");
    CharSequence _compileReturns = this.compileReturns(it, options);
    _builder.append(_compileReturns, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@init {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("enterRule();");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _compileInitHiddenTokens = this.compileInitHiddenTokens(it, options);
    _builder.append(_compileInitHiddenTokens, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compileInitUnorderedGroups = this.compileInitUnorderedGroups(it, options);
    _builder.append(_compileInitUnorderedGroups, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("@after {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("leaveRule();");
    _builder.newLine();
    _builder.append("}");
    return _builder.toString();
  }
  
  protected CharSequence compileReturns(final AbstractRule it, final AntlrOptions options) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (it instanceof EnumRule) {
        _matched=true;
        _switchResult = "returns [Enumerator current=null]";
      }
    }
    if (!_matched) {
      if (it instanceof ParserRule) {
        boolean _isDatatypeRule = GrammarUtil.isDatatypeRule(((ParserRule)it));
        if (_isDatatypeRule) {
          _matched=true;
          _switchResult = "[AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]";
        }
      }
    }
    if (!_matched) {
      if (it instanceof ParserRule) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[EObject current=");
        {
          boolean _isEObjectFragmentRule = GrammarUtil.isEObjectFragmentRule(it);
          if (_isEObjectFragmentRule) {
            _builder.append("in_current");
          } else {
            _builder.append("null");
          }
        }
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      throw new IllegalStateException(("Unexpected rule: " + it));
    }
    return _switchResult;
  }
  
  @Override
  protected String _dataTypeEbnf2(final Keyword it, final boolean supportActions) {
    String _xifexpression = null;
    if (supportActions) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("kw=");
      String __dataTypeEbnf2 = super._dataTypeEbnf2(it, supportActions);
      _builder.append(__dataTypeEbnf2, "");
      _builder.newLineIfNotEmpty();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$current.merge(kw);");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _newLeafNode = this.newLeafNode(it, "kw");
      _builder.append(_newLeafNode, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = super._dataTypeEbnf2(it, supportActions);
    }
    return _xifexpression;
  }
  
  @Override
  protected String _dataTypeEbnf2(final RuleCall it, final boolean supportActions) {
    String _xifexpression = null;
    if (supportActions) {
      String _switchResult = null;
      AbstractRule _rule = it.getRule();
      boolean _matched = false;
      if (!_matched) {
        if (_rule instanceof EnumRule) {
          boolean _isAssigned = GrammarUtil.isAssigned(it);
          if (_isAssigned) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (_rule instanceof ParserRule) {
            boolean _isAssigned = GrammarUtil.isAssigned(it);
            if (_isAssigned) {
              _matched=true;
            }
          }
        }
        if (_matched) {
          _switchResult = super._dataTypeEbnf2(it, supportActions);
        }
      }
      if (!_matched) {
        if (_rule instanceof EnumRule) {
          _matched=true;
        }
        if (!_matched) {
          if (_rule instanceof ParserRule) {
            _matched=true;
          }
        }
        if (_matched) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          CharSequence _newCompositeNode = this.newCompositeNode(it);
          _builder.append(_newCompositeNode, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          String _localVar = this._grammarAccessExtensions.localVar(it);
          _builder.append(_localVar, "");
          _builder.append("=");
          String __dataTypeEbnf2 = super._dataTypeEbnf2(it, supportActions);
          _builder.append(__dataTypeEbnf2, "");
          _builder.newLineIfNotEmpty();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$current.merge(");
          String _localVar_1 = this._grammarAccessExtensions.localVar(it);
          _builder.append(_localVar_1, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("afterParserOrEnumRuleCall();");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _switchResult = _builder.toString();
        }
      }
      if (!_matched) {
        if (_rule instanceof TerminalRule) {
          _matched=true;
          StringConcatenation _builder_1 = new StringConcatenation();
          String _localVar_2 = this._grammarAccessExtensions.localVar(it);
          _builder_1.append(_localVar_2, "");
          _builder_1.append("=");
          String __dataTypeEbnf2_1 = super._dataTypeEbnf2(it, supportActions);
          _builder_1.append(__dataTypeEbnf2_1, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("$current.merge(");
          String _localVar_3 = this._grammarAccessExtensions.localVar(it);
          _builder_1.append(_localVar_3, "\t");
          _builder_1.append(");");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          String _localVar_4 = this._grammarAccessExtensions.localVar(it);
          CharSequence _newLeafNode = this.newLeafNode(it, _localVar_4);
          _builder_1.append(_newLeafNode, "\t");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          _switchResult = _builder_1.toString();
        }
      }
      if (!_matched) {
        _switchResult = super._dataTypeEbnf2(it, supportActions);
      }
      _xifexpression = _switchResult;
    } else {
      _xifexpression = super._dataTypeEbnf2(it, supportActions);
    }
    return _xifexpression;
  }
  
  @Override
  protected String _ebnf2(final Action it, final AntlrOptions options, final boolean supportActions) {
    String _xifexpression = null;
    if (supportActions) {
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _isBacktrack = options.isBacktrack();
        if (_isBacktrack) {
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/* */");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$current = forceCreateModelElement");
      {
        String _feature = it.getFeature();
        boolean _notEquals = (!Objects.equal(_feature, null));
        if (_notEquals) {
          _builder.append("And");
          String _setOrAdd = this._grammarAccessExtensions.setOrAdd(it);
          String _firstUpper = StringExtensions.toFirstUpper(_setOrAdd);
          _builder.append(_firstUpper, "\t");
        }
      }
      _builder.append("(");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("grammarAccess.");
      String _grammarElementAccess = this._grammarAccessExtensions.grammarElementAccess(it);
      _builder.append(_grammarElementAccess, "\t\t");
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("$current);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = super._ebnf2(it, options, supportActions);
    }
    return _xifexpression;
  }
  
  @Override
  protected String _ebnf2(final Keyword it, final AntlrOptions options, final boolean supportActions) {
    String _xifexpression = null;
    if ((!supportActions)) {
      _xifexpression = super._ebnf2(it, options, supportActions);
    } else {
      String _xifexpression_1 = null;
      boolean _isAssigned = GrammarUtil.isAssigned(it);
      if (_isAssigned) {
        StringConcatenation _builder = new StringConcatenation();
        String __ebnf2 = super._ebnf2(it, options, supportActions);
        _builder.append(__ebnf2, "");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        Assignment _containingAssignment = GrammarUtil.containingAssignment(it);
        String _localVar = this._grammarAccessExtensions.localVar(_containingAssignment, it);
        CharSequence _newLeafNode = this.newLeafNode(it, _localVar);
        _builder.append(_newLeafNode, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _xifexpression_1 = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _localVar_1 = this._grammarAccessExtensions.localVar(it);
        _builder_1.append(_localVar_1, "");
        _builder_1.append("=");
        String __ebnf2_1 = super._ebnf2(it, options, supportActions);
        _builder_1.append(__ebnf2_1, "");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("{");
        _builder_1.newLine();
        _builder_1.append("\t");
        String _localVar_2 = this._grammarAccessExtensions.localVar(it);
        CharSequence _newLeafNode_1 = this.newLeafNode(it, _localVar_2);
        _builder_1.append(_newLeafNode_1, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("}");
        _builder_1.newLine();
        _xifexpression_1 = _builder_1.toString();
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  protected String _ebnf2(final EnumLiteralDeclaration it, final AntlrOptions options, final boolean supportActions) {
    String _xifexpression = null;
    if ((!supportActions)) {
      _xifexpression = super._ebnf2(it, options, supportActions);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      String _localVar = this._grammarAccessExtensions.localVar(it);
      _builder.append(_localVar, "");
      _builder.append("=");
      String __ebnf2 = super._ebnf2(it, options, supportActions);
      _builder.append(__ebnf2, "");
      _builder.newLineIfNotEmpty();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      String _localVar_1 = this._grammarAccessExtensions.localVar(it);
      CharSequence _newLeafNode = this.newLeafNode(it, _localVar_1);
      _builder.append(_newLeafNode, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xifexpression = _builder.toString();
    }
    return _xifexpression;
  }
  
  @Override
  protected String _ebnf2(final RuleCall it, final AntlrOptions options, final boolean supportActions) {
    String _xifexpression = null;
    if ((!supportActions)) {
      _xifexpression = super._ebnf2(it, options, supportActions);
    } else {
      String _switchResult = null;
      AbstractRule _rule = it.getRule();
      final AbstractRule rule = _rule;
      boolean _matched = false;
      if (!_matched) {
        if (rule instanceof EnumRule) {
          boolean _isAssigned = GrammarUtil.isAssigned(it);
          if (_isAssigned) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (rule instanceof ParserRule) {
            boolean _isAssigned = GrammarUtil.isAssigned(it);
            if (_isAssigned) {
              _matched=true;
            }
          }
        }
        if (_matched) {
          _switchResult = super._ebnf2(it, options, supportActions);
        }
      }
      if (!_matched) {
        if (rule instanceof EnumRule) {
          _matched=true;
        }
        if (!_matched) {
          if (rule instanceof ParserRule) {
            boolean _isDatatypeRule = GrammarUtil.isDatatypeRule(((ParserRule)rule));
            if (_isDatatypeRule) {
              _matched=true;
            }
          }
        }
        if (_matched) {
          StringConcatenation _builder = new StringConcatenation();
          {
            boolean _isBacktrack = options.isBacktrack();
            if (_isBacktrack) {
              _builder.append("{");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("/* */");
              _builder.newLine();
              _builder.append("}");
              _builder.newLine();
            }
          }
          _builder.append("{");
          _builder.newLine();
          {
            boolean _isEObjectFragmentRuleCall = GrammarUtil.isEObjectFragmentRuleCall(it);
            if (_isEObjectFragmentRuleCall) {
              _builder.append("\t");
              _builder.append("if ($current==null) {");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("$current = ");
              CharSequence _createModelElement = this.createModelElement(it);
              _builder.append(_createModelElement, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          CharSequence _newCompositeNode = this.newCompositeNode(it);
          _builder.append(_newCompositeNode, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          String __ebnf2 = super._ebnf2(it, options, supportActions);
          _builder.append(__ebnf2, "");
          {
            boolean _isEObjectFragmentRuleCall_1 = GrammarUtil.isEObjectFragmentRuleCall(it);
            if (_isEObjectFragmentRuleCall_1) {
              _builder.append("[$current]");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("afterParserOrEnumRuleCall();");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _switchResult = _builder.toString();
        }
      }
      if (!_matched) {
        if (rule instanceof ParserRule) {
          _matched=true;
          StringConcatenation _builder_1 = new StringConcatenation();
          {
            boolean _isBacktrack_1 = options.isBacktrack();
            if (_isBacktrack_1) {
              _builder_1.append("{");
              _builder_1.newLine();
              _builder_1.append("\t");
              _builder_1.append("/* */");
              _builder_1.newLine();
              _builder_1.append("}");
              _builder_1.newLine();
            }
          }
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          CharSequence _newCompositeNode_1 = this.newCompositeNode(it);
          _builder_1.append(_newCompositeNode_1, "\t");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          String _localVar = this._grammarAccessExtensions.localVar(it);
          _builder_1.append(_localVar, "");
          _builder_1.append("=");
          String __ebnf2_1 = super._ebnf2(it, options, supportActions);
          _builder_1.append(__ebnf2_1, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("$current = $");
          String _localVar_1 = this._grammarAccessExtensions.localVar(it);
          _builder_1.append(_localVar_1, "\t");
          _builder_1.append(".current;");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("afterParserOrEnumRuleCall();");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
          _switchResult = _builder_1.toString();
        }
      }
      if (!_matched) {
        if (rule instanceof TerminalRule) {
          _matched=true;
          StringConcatenation _builder_1 = new StringConcatenation();
          String _localVar = this._grammarAccessExtensions.localVar(it);
          _builder_1.append(_localVar, "");
          _builder_1.append("=");
          String __ebnf2_1 = super._ebnf2(it, options, supportActions);
          _builder_1.append(__ebnf2_1, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          String _localVar_1 = this._grammarAccessExtensions.localVar(it);
          CharSequence _newLeafNode = this.newLeafNode(it, _localVar_1);
          _builder_1.append(_newLeafNode, "\t");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          _switchResult = _builder_1.toString();
        }
      }
      if (!_matched) {
        _switchResult = super._ebnf2(it, options, supportActions);
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  @Override
  protected String _crossrefEbnf(final AbstractRule it, final CrossReference ref, final boolean supportActions) {
    String _xifexpression = null;
    if (supportActions) {
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (it instanceof EnumRule) {
          _matched=true;
        }
        if (!_matched) {
          if (it instanceof ParserRule) {
            _matched=true;
          }
        }
        if (_matched) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          CharSequence _newCompositeNode = this.newCompositeNode(ref);
          _builder.append(_newCompositeNode, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          String _ruleName = this._grammarAccessExtensions.ruleName(it);
          _builder.append(_ruleName, "");
          _builder.newLineIfNotEmpty();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("afterParserOrEnumRuleCall();");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _switchResult = _builder.toString();
        }
      }
      if (!_matched) {
        if (it instanceof TerminalRule) {
          _matched=true;
          StringConcatenation _builder_1 = new StringConcatenation();
          Assignment _containingAssignment = GrammarUtil.containingAssignment(ref);
          String _localVar = this._grammarAccessExtensions.localVar(_containingAssignment);
          _builder_1.append(_localVar, "");
          _builder_1.append("=");
          String _ruleName_1 = this._grammarAccessExtensions.ruleName(it);
          _builder_1.append(_ruleName_1, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          Assignment _containingAssignment_1 = GrammarUtil.containingAssignment(ref);
          String _localVar_1 = this._grammarAccessExtensions.localVar(_containingAssignment_1);
          CharSequence _newLeafNode = this.newLeafNode(ref, _localVar_1);
          _builder_1.append(_newLeafNode, "\t");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          _switchResult = _builder_1.toString();
        }
      }
      if (!_matched) {
        throw new IllegalStateException(("crossrefEbnf is not supported for " + it));
      }
      _xifexpression = _switchResult;
    } else {
      _xifexpression = super._crossrefEbnf(it, ref, supportActions);
    }
    return _xifexpression;
  }
  
  @Override
  protected String _assignmentEbnf(final CrossReference it, final Assignment assignment, final AntlrOptions options, final boolean supportActions) {
    String _xifexpression = null;
    if (supportActions) {
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _isBacktrack = options.isBacktrack();
        if (_isBacktrack) {
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/* */");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if ($current==null) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$current = ");
      CharSequence _createModelElement = this.createModelElement(assignment);
      _builder.append(_createModelElement, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String __assignmentEbnf = super._assignmentEbnf(it, assignment, options, supportActions);
      _builder.append(__assignmentEbnf, "");
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = super._assignmentEbnf(it, assignment, options, supportActions);
    }
    return _xifexpression;
  }
  
  @Override
  protected String _assignmentEbnf(final AbstractElement it, final Assignment assignment, final AntlrOptions options, final boolean supportActions) {
    String _xifexpression = null;
    if (supportActions) {
      StringConcatenation _builder = new StringConcatenation();
      String _localVar = this._grammarAccessExtensions.localVar(assignment, it);
      _builder.append(_localVar, "");
      _builder.append("=");
      String __assignmentEbnf = super._assignmentEbnf(it, assignment, options, supportActions);
      _builder.append(__assignmentEbnf, "");
      _builder.newLineIfNotEmpty();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if ($current==null) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$current = ");
      CharSequence _createModelElement = this.createModelElement(assignment);
      _builder.append(_createModelElement, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      String _setOrAdd = this._grammarAccessExtensions.setOrAdd(assignment);
      _builder.append(_setOrAdd, "\t");
      _builder.append("WithLastConsumed($current, \"");
      String _feature = assignment.getFeature();
      _builder.append(_feature, "\t");
      _builder.append("\", ");
      {
        boolean _isBooleanAssignment = GrammarUtil.isBooleanAssignment(assignment);
        if (_isBooleanAssignment) {
          _builder.append("true");
        } else {
          String _localVar_1 = this._grammarAccessExtensions.localVar(assignment, it);
          _builder.append(_localVar_1, "\t");
        }
      }
      _builder.append(", ");
      AbstractElement _terminal = assignment.getTerminal();
      CharSequence _stringLiteral = this._grammarAccessExtensions.toStringLiteral(_terminal);
      _builder.append(_stringLiteral, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = super._assignmentEbnf(it, assignment, options, supportActions);
    }
    return _xifexpression;
  }
  
  @Override
  protected String _assignmentEbnf(final RuleCall it, final Assignment assignment, final AntlrOptions options, final boolean supportActions) {
    String _xifexpression = null;
    if (supportActions) {
      String _switchResult = null;
      AbstractRule _rule = it.getRule();
      boolean _matched = false;
      if (!_matched) {
        if (_rule instanceof EnumRule) {
          _matched=true;
        }
        if (!_matched) {
          if (_rule instanceof ParserRule) {
            _matched=true;
          }
        }
        if (_matched) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          CharSequence _newCompositeNode = this.newCompositeNode(it);
          _builder.append(_newCompositeNode, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          String _localVar = this._grammarAccessExtensions.localVar(assignment, it);
          _builder.append(_localVar, "");
          _builder.append("=");
          String __assignmentEbnf = super._assignmentEbnf(it, assignment, options, supportActions);
          _builder.append(__assignmentEbnf, "");
          _builder.newLineIfNotEmpty();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("if ($current==null) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("$current = ");
          CharSequence _createModelElementForParent = this.createModelElementForParent(assignment);
          _builder.append(_createModelElementForParent, "\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          String _setOrAdd = this._grammarAccessExtensions.setOrAdd(assignment);
          _builder.append(_setOrAdd, "\t");
          _builder.append("(");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("$current,");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\"");
          String _feature = assignment.getFeature();
          _builder.append(_feature, "\t\t");
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          {
            boolean _isBooleanAssignment = GrammarUtil.isBooleanAssignment(assignment);
            if (_isBooleanAssignment) {
              _builder.append("true");
            } else {
              String _localVar_1 = this._grammarAccessExtensions.localVar(assignment, it);
              _builder.append(_localVar_1, "\t\t");
            }
          }
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          CharSequence _stringLiteral = this._grammarAccessExtensions.toStringLiteral(it);
          _builder.append(_stringLiteral, "\t\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("afterParserOrEnumRuleCall();");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _switchResult = _builder.toString();
        }
      }
      if (!_matched) {
        if (_rule instanceof TerminalRule) {
          _matched=true;
          StringConcatenation _builder_1 = new StringConcatenation();
          String _localVar_2 = this._grammarAccessExtensions.localVar(assignment, it);
          _builder_1.append(_localVar_2, "");
          _builder_1.append("=");
          String __assignmentEbnf_1 = super._assignmentEbnf(it, assignment, options, supportActions);
          _builder_1.append(__assignmentEbnf_1, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          String _localVar_3 = this._grammarAccessExtensions.localVar(assignment, it);
          CharSequence _newLeafNode = this.newLeafNode(it, _localVar_3);
          _builder_1.append(_newLeafNode, "\t");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("if ($current==null) {");
          _builder_1.newLine();
          _builder_1.append("\t\t");
          _builder_1.append("$current = ");
          CharSequence _createModelElement = this.createModelElement(assignment);
          _builder_1.append(_createModelElement, "\t\t");
          _builder_1.append(";");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("}");
          _builder_1.newLine();
          _builder_1.append("\t");
          String _setOrAdd_1 = this._grammarAccessExtensions.setOrAdd(assignment);
          _builder_1.append(_setOrAdd_1, "\t");
          _builder_1.append("WithLastConsumed(");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t");
          _builder_1.append("$current,");
          _builder_1.newLine();
          _builder_1.append("\t\t");
          _builder_1.append("\"");
          String _feature_1 = assignment.getFeature();
          _builder_1.append(_feature_1, "\t\t");
          _builder_1.append("\",");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t");
          {
            boolean _isBooleanAssignment_1 = GrammarUtil.isBooleanAssignment(assignment);
            if (_isBooleanAssignment_1) {
              _builder_1.append("true");
            } else {
              String _localVar_4 = this._grammarAccessExtensions.localVar(assignment, it);
              _builder_1.append(_localVar_4, "\t\t");
            }
          }
          _builder_1.append(",");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t");
          CharSequence _stringLiteral_1 = this._grammarAccessExtensions.toStringLiteral(it);
          _builder_1.append(_stringLiteral_1, "\t\t");
          _builder_1.append(");");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          _switchResult = _builder_1.toString();
        }
      }
      if (!_matched) {
        throw new IllegalStateException(("assignmentEbnf is not supported for " + it));
      }
      _xifexpression = _switchResult;
    } else {
      _xifexpression = super._assignmentEbnf(it, assignment, options, supportActions);
    }
    return _xifexpression;
  }
  
  protected CharSequence createModelElement(final EObject grammarElement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("createModelElement(grammarAccess.");
    ParserRule _containingParserRule = GrammarUtil.containingParserRule(grammarElement);
    String _grammarElementAccess = this._grammarAccessExtensions.grammarElementAccess(_containingParserRule);
    _builder.append(_grammarElementAccess, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence createModelElementForParent(final EObject grammarElement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("createModelElementForParent(grammarAccess.");
    ParserRule _containingParserRule = GrammarUtil.containingParserRule(grammarElement);
    String _grammarElementAccess = this._grammarAccessExtensions.grammarElementAccess(_containingParserRule);
    _builder.append(_grammarElementAccess, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence newCompositeNode(final EObject it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("newCompositeNode(grammarAccess.");
    String _grammarElementAccess = this._grammarAccessExtensions.grammarElementAccess(it);
    _builder.append(_grammarElementAccess, "");
    _builder.append(");");
    return _builder;
  }
  
  protected CharSequence newLeafNode(final EObject it, final String token) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("newLeafNode(");
    _builder.append(token, "");
    _builder.append(", grammarAccess.");
    String _grammarElementAccess = this._grammarAccessExtensions.grammarElementAccess(it);
    _builder.append(_grammarElementAccess, "");
    _builder.append(");");
    return _builder;
  }
}
