/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.idea.documentation;

import com.intellij.codeInsight.documentation.DocumentationManager;
import com.intellij.lang.documentation.DocumentationProvider;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import junit.framework.TestCase;
import org.eclipse.xtend.idea.LightXtendTest;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author kosyakov - Initial contribution and API
 * @author moritz.eysholdt@itemis.de
 */
@SuppressWarnings("all")
public class XtendDocumentationTest extends LightXtendTest {
  @Override
  protected void invokeTestRunnable(final Runnable runnable) {
    Project _project = this.getProject();
    WriteCommandAction.runWriteCommandAction(_project, runnable);
  }
  
  public void testJavaClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo;");
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* mydocumentation");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class Foo {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.myFixture.addFileToProject("foo/Foo.java", _builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class Bar extends foo.F<caret>oo {");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final PsiFile xtend = this.myFixture.configureByText("Bar.xtend", _builder_1.toString());
    int _caretOffset = this.myFixture.getCaretOffset();
    PsiReference _findReferenceAt = xtend.findReferenceAt(_caretOffset);
    final String expected = this.generateDocumentation(_findReferenceAt);
    boolean _contains = expected.contains("mydocumentation");
    TestCase.assertTrue(_contains);
  }
  
  public void testXtendClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo;");
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* mydocumentation");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("class Foo {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.myFixture.addFileToProject("foo/Foo.xtend", _builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class Bar extends foo.F<caret>oo {");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final PsiFile xtend = this.myFixture.configureByText("Bar.xtend", _builder_1.toString());
    int _caretOffset = this.myFixture.getCaretOffset();
    PsiReference _findReferenceAt = xtend.findReferenceAt(_caretOffset);
    final String expected = this.generateDocumentation(_findReferenceAt);
    boolean _contains = expected.contains("mydocumentation");
    TestCase.assertTrue(_contains);
  }
  
  public void testXtendField() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo;");
    _builder.newLine();
    _builder.append("class Foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* mydocumentation");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public val String myfoo = \"x\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.myFixture.addFileToProject("foo/Foo.xtend", _builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class Bar {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("val String x = new foo.Foo().my<caret>foo");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final PsiFile xtend = this.myFixture.configureByText("Bar.xtend", _builder_1.toString());
    int _caretOffset = this.myFixture.getCaretOffset();
    PsiReference _findReferenceAt = xtend.findReferenceAt(_caretOffset);
    final String expected = this.generateDocumentation(_findReferenceAt);
    boolean _contains = expected.contains("<b>myfoo = &quot;x&quot;</b>");
    TestCase.assertTrue(_contains);
    boolean _contains_1 = expected.contains("mydocumentation");
    TestCase.assertTrue(_contains_1);
  }
  
  public void testXtendMethod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo;");
    _builder.newLine();
    _builder.append("class Foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* mydocumentation");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def myfoo() { \"x\" }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.myFixture.addFileToProject("foo/Foo.xtend", _builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class Bar {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("val String x = new foo.Foo().my<caret>foo()");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final PsiFile xtend = this.myFixture.configureByText("Bar.xtend", _builder_1.toString());
    int _caretOffset = this.myFixture.getCaretOffset();
    PsiReference _findReferenceAt = xtend.findReferenceAt(_caretOffset);
    final String expected = this.generateDocumentation(_findReferenceAt);
    boolean _contains = expected.contains("<b>myfoo</b>()");
    TestCase.assertTrue(_contains);
    boolean _contains_1 = expected.contains("mydocumentation");
    TestCase.assertTrue(_contains_1);
  }
  
  public void testXtendConstructor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo;");
    _builder.newLine();
    _builder.append("class Foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* mydocumentation");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("new() {}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.myFixture.addFileToProject("foo/Foo.xtend", _builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class Bar {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("val String x = new foo.F<caret>oo()");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final PsiFile xtend = this.myFixture.configureByText("Bar.xtend", _builder_1.toString());
    int _caretOffset = this.myFixture.getCaretOffset();
    PsiReference _findReferenceAt = xtend.findReferenceAt(_caretOffset);
    final String expected = this.generateDocumentation(_findReferenceAt);
    boolean _contains = expected.contains("<b>Foo</b>()");
    TestCase.assertTrue(_contains);
    boolean _contains_1 = expected.contains("mydocumentation");
    TestCase.assertTrue(_contains_1);
  }
  
  protected String generateDocumentation(final PsiReference reference) {
    String _xblockexpression = null;
    {
      final PsiElement originalElement = reference.getElement();
      final PsiElement element = reference.resolve();
      TestCase.assertNotNull(originalElement);
      TestCase.assertNotNull(element);
      _xblockexpression = this.generateDocumentation(element, originalElement);
    }
    return _xblockexpression;
  }
  
  protected String generateDocumentation(final PsiElement element, final PsiElement originalElement) {
    DocumentationProvider _providerFromElement = DocumentationManager.getProviderFromElement(element, originalElement);
    return _providerFromElement.generateDoc(element, originalElement);
  }
}
