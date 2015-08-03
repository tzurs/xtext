/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.generator.parser.antlr;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleNames;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.NewlineNormalizer;
import org.eclipse.xtext.generator.parser.antlr.postProcessing.SuppressWarningsProcessor;
import org.eclipse.xtext.generator.parser.antlr.splitting.AntlrLexerSplitter;
import org.eclipse.xtext.generator.parser.antlr.splitting.AntlrParserSplitter;
import org.eclipse.xtext.generator.parser.antlr.splitting.BacktrackingGuardForUnorderedGroupsRemover;
import org.eclipse.xtext.generator.parser.antlr.splitting.PartialClassExtractor;
import org.eclipse.xtext.generator.parser.antlr.splitting.UnorderedGroupsSplitter;
import org.eclipse.xtext.generator.parser.packrat.PackratParserFragment;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractAntlrGeneratorFragment extends AbstractGeneratorFragment {

	@Override
	public void checkConfiguration(Issues issues) {
		super.checkConfiguration(issues);
		if (!antlrTool.isWorkable()) {
			issues.addError("\n\n*ATTENTION*\nIt is highly recommended to use ANTLR's parser generator (get it from 'http://xtext.itemis.com/'). \nAs an alternative to ANTLR you could also use the alternative implementation shipped with Xtext.\nTo do so use the generator fragment '"
					+ PackratParserFragment.class.getName() + "' in your mwe2 file instead.");
		}
	}

	private AntlrToolFacade antlrTool = new AntlrToolFacade();

	public void setAntlrTool(AntlrToolFacade facade) {
		this.antlrTool = facade;
	}

	public AntlrToolFacade getAntlrTool() {
		return antlrTool;
	}

	private AntlrOptions options = new AntlrOptions();

	public void setOptions(AntlrOptions options) {
		this.options = options;
	}

	public AntlrOptions getOptions() {
		return options;
	}

	private List<String> antlrParams = Lists.newArrayList();

	public void addAntlrParam(String param) {
		antlrParams.add(param);
	}

	public String[] getAntlrParams() {
		ArrayList<String> params = new ArrayList<String>(antlrParams);
		// setting the default conversion timeout to 100secs.
		// There seem to be no practical situations where the NFA conversion would hang,
		// so Terence suggested here [1] to remove the option all together
		// [1] - http://antlr.1301665.n2.nabble.com/Xconversiontimeout-td5294411.html
		if (!params.contains("-Xconversiontimeout")) {
			params.add(0, "-Xconversiontimeout");
			params.add(1, "100000");
		}
		String[] result = params.toArray(new String[params.size()]);
		return result;
	}
	
	/**
	 * @since 2.4
	 */
	protected String getEncoding(XpandExecutionContext xpt, String outlet) {
		return xpt.getOutput().getOutlet(outlet).getFileEncoding();
	}

	@Override
	protected List<Object> getParameters(Grammar grammar) {
		return Collections.singletonList((Object) options);
	}

	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		checkGrammar(grammar);
		RuleNames.ensureAdapterInstalled(grammar);
		super.generate(grammar, ctx);
	}

	/**
	 * @since 2.8
	 */
	protected void checkGrammar(Grammar grammar) {
		if (!hasProductionRules(grammar))
			throw new IllegalArgumentException(
					"You may not generate an ANTLR parser for a grammar without production rules.");
	}

	/**
	 * @since 2.8
	 */
	protected boolean hasProductionRules(Grammar grammar) {
		AbstractRule firstRule = grammar.getRules().get(0);
		return firstRule instanceof ParserRule && !GrammarUtil.isDatatypeRule((ParserRule) firstRule);
	}

	/**
	 * @since 2.7
	 */
	protected void splitLexerClassFile(String filename, Charset encoding) throws IOException {
		String content = readFileIntoString(filename, encoding);
		AntlrLexerSplitter splitter = new AntlrLexerSplitter(content);
		writeStringIntoFile(filename, splitter.transform(), encoding);
	}
	
	/**
	 * @deprecated use {@link #splitLexerClassFile(String, Charset)} instead.
	 */
	@Deprecated
	protected void splitLexerClassFile(String filename) throws IOException {
		splitLexerClassFile(filename, Charset.defaultCharset());
	}

	/**
	 * @since 2.7
	 */
	protected void splitParserClassFile(String filename, Charset encoding) throws IOException {
		String content = readFileIntoString(filename, encoding);
		AntlrParserSplitter splitter = new AntlrParserSplitter(content, getOptions().getFieldsPerClass());
		PartialClassExtractor extractor = new PartialClassExtractor(splitter.transform(), getOptions().getMethodsPerClass());
		writeStringIntoFile(filename, extractor.transform(), encoding);
	}
	
	/**
	 * @deprecated use {@link #splitParserClassFile(String, Charset)} instead.
	 */
	@Deprecated
	protected void splitParserClassFile(String filename) throws IOException {
		splitParserClassFile(filename, Charset.defaultCharset());
	}

	/**
	 * @since 2.7
	 */
	protected void simplifyUnorderedGroupPredicatesIfRequired(Grammar grammar, String absoluteParserFileName, Charset encoding) {
		try {
			if (containsUnorderedGroup(grammar)) {
				String javaFile = absoluteParserFileName.replaceAll("\\.g$", getParserFileNameSuffix());
				simplifyUnorderedGroupPredicates(javaFile, encoding);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * @deprecated use {@link #simplifyUnorderedGroupPredicatesIfRequired(Grammar, String, Charset)} instead.
	 */
	@Deprecated
	protected void simplifyUnorderedGroupPredicatesIfRequired(Grammar grammar, String absoluteParserFileName) {
		simplifyUnorderedGroupPredicatesIfRequired(grammar, absoluteParserFileName, Charset.defaultCharset());
	}

	protected String getParserFileNameSuffix() {
		return "Parser.java";
	}

	/**
	 * @since 2.7
	 */
	protected void simplifyUnorderedGroupPredicates(String javaFile, Charset encoding) throws IOException {
		String content = readFileIntoString(javaFile, encoding);
		UnorderedGroupsSplitter splitter = new UnorderedGroupsSplitter(content);
		String transformed = splitter.transform();
		BacktrackingGuardForUnorderedGroupsRemover remover = new BacktrackingGuardForUnorderedGroupsRemover(transformed);
		String newContent = remover.transform();
		writeStringIntoFile(javaFile, newContent, encoding);
	}
	
	/**
	 * @deprecated use {@link #simplifyUnorderedGroupPredicates(String, Charset)} instead.
	 */
	@Deprecated
	protected void simplifyUnorderedGroupPredicates(String javaFile) throws IOException {
		simplifyUnorderedGroupPredicates(javaFile, Charset.defaultCharset());
	}

	private void suppressWarningsImpl(String javaFile, Charset encoding) {
		String content = readFileIntoString(javaFile, encoding);
		content = new SuppressWarningsProcessor().process(content);
		writeStringIntoFile(javaFile, content, encoding);
	}

	/**
	 * @since 2.7
	 */
	protected void suppressWarnings(String grammarFileName, Charset encoding) {
		suppressWarnings(grammarFileName, grammarFileName, encoding);
	}

	/**
	 * @since 2.7
	 */
	protected void suppressWarnings(String absoluteLexerGrammarFileName, String absoluteParserGrammarFileName, Charset encoding) {
		suppressWarningsImpl(absoluteLexerGrammarFileName.replaceAll("\\.g$", getLexerFileNameSuffix()), encoding);
		suppressWarningsImpl(absoluteParserGrammarFileName.replaceAll("\\.g$", getParserFileNameSuffix()), encoding);
	}
	
	/**
	 * @deprecated use {@link #suppressWarnings(String, Charset)} instead.
	 */
	@Deprecated
	protected void suppressWarnings(String grammarFileName) {
		suppressWarnings(grammarFileName, Charset.defaultCharset());
	}

	/**
	 * @deprecated use {@link #suppressWarnings(String, String, Charset)} instead.
	 */
	@Deprecated
	protected void suppressWarnings(String absoluteLexerGrammarFileName, String absoluteParserGrammarFileName) {
		suppressWarnings(absoluteLexerGrammarFileName, absoluteParserGrammarFileName, Charset.defaultCharset());
	}
	
	private void normalizeLineDelimitersImpl(String textFile, Charset encoding) {
		String content = readFileIntoString(textFile, encoding);
		content = new NewlineNormalizer(getLineDelimiter()) {
			// Antlr tries to outsmart us by using a line length that depends on the system
			// line delimiter when it splits a very long String (encoded DFA) into a
			// string concatenation
			// Here we join these lines again.
			@Override
			public String normalizeLineDelimiters(CharSequence content) {
				String result = super.normalizeLineDelimiters(content);
				result = result.replaceAll("\"\\+\\n\\s+\"", "");
				return result;
			}
		}.normalizeLineDelimiters(content);
		writeStringIntoFile(textFile, content, encoding);
	}

	/**
	 * @since 2.7
	 */
	protected String getLineDelimiter() {
		return getNaming().getLineDelimiter();
	}
	
	/**
	 * @since 2.7
	 */
	protected void normalizeLineDelimiters(String grammarFileName, Charset encoding) {
		normalizeLineDelimiters(grammarFileName, grammarFileName, encoding);
	}

	/**
	 * @since 2.7
	 */
	protected void normalizeTokens(String grammarFileName, Charset encoding) {
		String tokenFile = toTokenFileName(grammarFileName);
		String content = readFileIntoString(tokenFile, encoding);
		content = new NewlineNormalizer(getLineDelimiter()).normalizeLineDelimiters(content);
		List<String> splitted = Strings.split(content, getLineDelimiter());
		Collections.sort(splitted);
		content = Strings.concat(getLineDelimiter(), splitted) + getLineDelimiter();
		writeStringIntoFile(tokenFile, content, encoding);
	}
	
	private String toTokenFileName(String grammarFileName) {
		return grammarFileName.replaceAll("\\.g$", ".tokens");
	}
	
	/**
	 * @since 2.7
	 */
	protected void normalizeLineDelimiters(String absoluteLexerGrammarFileName, String absoluteParserGrammarFileName, Charset encoding) {
		normalizeLineDelimitersImpl(absoluteLexerGrammarFileName.replaceAll("\\.g$", getLexerFileNameSuffix()), encoding);
		normalizeLineDelimitersImpl(absoluteParserGrammarFileName.replaceAll("\\.g$", getParserFileNameSuffix()), encoding);
	}

	protected String getLexerFileNameSuffix() {
		return "Lexer.java";
	}

	/**
	 * @since 2.7
	 */
	protected void splitParserAndLexerIfEnabled(String absoluteLexerGrammarFileName,
			String absoluteParserGrammarFileName, Charset encoding) {

		if (getOptions().isClassSplitting()) {
			try {
				splitLexerClassFile(absoluteLexerGrammarFileName.replaceAll("\\.g$", getLexerFileNameSuffix()), encoding);
				splitParserClassFile(absoluteParserGrammarFileName.replaceAll("\\.g$", getParserFileNameSuffix()), encoding);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * @since 2.7
	 */
	protected void splitParserAndLexerIfEnabled(String absoluteGrammarFileName, Charset encoding) {
		splitParserAndLexerIfEnabled(absoluteGrammarFileName, absoluteGrammarFileName, encoding);
	}
	
	/**
	 * @deprecated use {@link #splitParserAndLexerIfEnabled(String, String, Charset)} instead.
	 */
	@Deprecated
	protected void splitParserAndLexerIfEnabled(String absoluteLexerGrammarFileName,
			String absoluteParserGrammarFileName) {
		splitParserAndLexerIfEnabled(absoluteLexerGrammarFileName, absoluteParserGrammarFileName, Charset.defaultCharset());
	}

	/**
	 * @deprecated use {@link #splitParserAndLexerIfEnabled(String, Charset)} instead.
	 */
	@Deprecated
	protected void splitParserAndLexerIfEnabled(String absoluteGrammarFileName) {
		splitParserAndLexerIfEnabled(absoluteGrammarFileName, absoluteGrammarFileName, Charset.defaultCharset());
	}

	protected boolean containsUnorderedGroup(Grammar grammar) {
		for (ParserRule rule : GrammarUtil.allParserRules(grammar)) {
			if (Iterators.filter(rule.eAllContents(), UnorderedGroup.class).hasNext()) {
				return true;
			}
		}
		return false;
	}

}