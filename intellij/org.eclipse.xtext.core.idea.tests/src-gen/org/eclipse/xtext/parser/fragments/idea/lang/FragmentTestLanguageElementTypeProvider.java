package org.eclipse.xtext.parser.fragments.idea.lang;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import org.eclipse.xtext.parser.fragments.idea.lang.psi.impl.FragmentTestLanguageFileImpl;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageGrammarAccess;
import org.eclipse.xtext.psi.stubs.XtextFileElementType;
import org.eclipse.xtext.psi.stubs.XtextFileStub;
import org.eclipse.xtext.psi.tree.IGrammarAwareElementType;

import com.intellij.psi.tree.IFileElementType;

public class FragmentTestLanguageElementTypeProvider implements IElementTypeProvider {

	public static final IFileElementType FILE_TYPE = new XtextFileElementType<XtextFileStub<FragmentTestLanguageFileImpl>>(FragmentTestLanguageLanguage.INSTANCE);

	private static final Map<EObject, IGrammarAwareElementType> GRAMMAR_ELEMENT_TYPE = new HashMap<EObject, IGrammarAwareElementType>();

	private static IGrammarAwareElementType associate(IGrammarAwareElementType grammarAwareElementType) {
		GRAMMAR_ELEMENT_TYPE.put(grammarAwareElementType.getGrammarElement(), grammarAwareElementType);
		return grammarAwareElementType;
	}

	private static final FragmentTestLanguageGrammarAccess GRAMMAR_ACCESS = FragmentTestLanguageLanguage.INSTANCE.getInstance(FragmentTestLanguageGrammarAccess.class);

	private static class FragmentsFactory {
		public static IGrammarAwareElementType createFragmentsElementType() {
			return new IGrammarAwareElementType("Fragments_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsRule());
		}
		public static IGrammarAwareElementType createFragments_GroupElementType() {
			return new IGrammarAwareElementType("Fragments_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getGroup());
		}
		public static IGrammarAwareElementType createFragments_FragmentsAction_0ElementType() {
			return new IGrammarAwareElementType("Fragments_FragmentsAction_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getFragmentsAction_0());
		}
		public static IGrammarAwareElementType createFragments_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("Fragments_Alternatives_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createFragments_Group_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_Group_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getGroup_1_0());
		}
		public static IGrammarAwareElementType createFragments_NumberSignDigitOneKeyword_1_0_0ElementType() {
			return new IGrammarAwareElementType("Fragments_NumberSignDigitOneKeyword_1_0_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getNumberSignDigitOneKeyword_1_0_0());
		}
		public static IGrammarAwareElementType createFragments_ElementAssignment_1_0_1ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementAssignment_1_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementAssignment_1_0_1());
		}
		public static IGrammarAwareElementType createFragments_ElementNamedParserRuleCall_1_0_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementNamedParserRuleCall_1_0_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementNamedParserRuleCall_1_0_1_0());
		}
		public static IGrammarAwareElementType createFragments_Group_1_1ElementType() {
			return new IGrammarAwareElementType("Fragments_Group_1_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getGroup_1_1());
		}
		public static IGrammarAwareElementType createFragments_NumberSignDigitTwoKeyword_1_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_NumberSignDigitTwoKeyword_1_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getNumberSignDigitTwoKeyword_1_1_0());
		}
		public static IGrammarAwareElementType createFragments_ElementAssignment_1_1_1ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementAssignment_1_1_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementAssignment_1_1_1());
		}
		public static IGrammarAwareElementType createFragments_ElementNamedParserRuleCall_1_1_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementNamedParserRuleCall_1_1_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementNamedParserRuleCall_1_1_1_0());
		}
		public static IGrammarAwareElementType createFragments_HyphenMinusGreaterThanSignKeyword_1_1_2ElementType() {
			return new IGrammarAwareElementType("Fragments_HyphenMinusGreaterThanSignKeyword_1_1_2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getHyphenMinusGreaterThanSignKeyword_1_1_2());
		}
		public static IGrammarAwareElementType createFragments_RefAssignment_1_1_3ElementType() {
			return new IGrammarAwareElementType("Fragments_RefAssignment_1_1_3_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getRefAssignment_1_1_3());
		}
		public static IGrammarAwareElementType createFragments_RefNamedCrossReference_1_1_3_0ElementType() {
			return new IGrammarAwareElementType("Fragments_RefNamedCrossReference_1_1_3_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getRefNamedCrossReference_1_1_3_0());
		}
		public static IGrammarAwareElementType createFragments_RefNamedIDTerminalRuleCall_1_1_3_0_1ElementType() {
			return new IGrammarAwareElementType("Fragments_RefNamedIDTerminalRuleCall_1_1_3_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getRefNamedIDTerminalRuleCall_1_1_3_0_1());
		}
		public static IGrammarAwareElementType createFragments_Group_1_2ElementType() {
			return new IGrammarAwareElementType("Fragments_Group_1_2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getGroup_1_2());
		}
		public static IGrammarAwareElementType createFragments_NumberSignDigitThreeKeyword_1_2_0ElementType() {
			return new IGrammarAwareElementType("Fragments_NumberSignDigitThreeKeyword_1_2_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getNumberSignDigitThreeKeyword_1_2_0());
		}
		public static IGrammarAwareElementType createFragments_ElementAssignment_1_2_1ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementAssignment_1_2_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementAssignment_1_2_1());
		}
		public static IGrammarAwareElementType createFragments_ElementNamedRefFirstParserRuleCall_1_2_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementNamedRefFirstParserRuleCall_1_2_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementNamedRefFirstParserRuleCall_1_2_1_0());
		}
		public static IGrammarAwareElementType createFragments_Group_1_3ElementType() {
			return new IGrammarAwareElementType("Fragments_Group_1_3_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getGroup_1_3());
		}
		public static IGrammarAwareElementType createFragments_NumberSignDigitFourKeyword_1_3_0ElementType() {
			return new IGrammarAwareElementType("Fragments_NumberSignDigitFourKeyword_1_3_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getNumberSignDigitFourKeyword_1_3_0());
		}
		public static IGrammarAwareElementType createFragments_ElementAssignment_1_3_1ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementAssignment_1_3_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementAssignment_1_3_1());
		}
		public static IGrammarAwareElementType createFragments_ElementNamedWithActionParserRuleCall_1_3_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementNamedWithActionParserRuleCall_1_3_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementNamedWithActionParserRuleCall_1_3_1_0());
		}
		public static IGrammarAwareElementType createFragments_Group_1_4ElementType() {
			return new IGrammarAwareElementType("Fragments_Group_1_4_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getGroup_1_4());
		}
		public static IGrammarAwareElementType createFragments_NumberSignDigitFiveKeyword_1_4_0ElementType() {
			return new IGrammarAwareElementType("Fragments_NumberSignDigitFiveKeyword_1_4_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getNumberSignDigitFiveKeyword_1_4_0());
		}
		public static IGrammarAwareElementType createFragments_ElementAssignment_1_4_1ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementAssignment_1_4_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementAssignment_1_4_1());
		}
		public static IGrammarAwareElementType createFragments_ElementNamedWithActionInFragmentParserRuleCall_1_4_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementNamedWithActionInFragmentParserRuleCall_1_4_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementNamedWithActionInFragmentParserRuleCall_1_4_1_0());
		}
		public static IGrammarAwareElementType createFragments_Group_1_5ElementType() {
			return new IGrammarAwareElementType("Fragments_Group_1_5_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getGroup_1_5());
		}
		public static IGrammarAwareElementType createFragments_NumberSignDigitSixKeyword_1_5_0ElementType() {
			return new IGrammarAwareElementType("Fragments_NumberSignDigitSixKeyword_1_5_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getNumberSignDigitSixKeyword_1_5_0());
		}
		public static IGrammarAwareElementType createFragments_ElementAssignment_1_5_1ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementAssignment_1_5_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementAssignment_1_5_1());
		}
		public static IGrammarAwareElementType createFragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0());
		}
		public static IGrammarAwareElementType createFragments_Group_1_6ElementType() {
			return new IGrammarAwareElementType("Fragments_Group_1_6_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getGroup_1_6());
		}
		public static IGrammarAwareElementType createFragments_NumberSignDigitSevenKeyword_1_6_0ElementType() {
			return new IGrammarAwareElementType("Fragments_NumberSignDigitSevenKeyword_1_6_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getNumberSignDigitSevenKeyword_1_6_0());
		}
		public static IGrammarAwareElementType createFragments_ElementAssignment_1_6_1ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementAssignment_1_6_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementAssignment_1_6_1());
		}
		public static IGrammarAwareElementType createFragments_ElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0ElementType() {
			return new IGrammarAwareElementType("Fragments_ElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentsAccess().getElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0());
		}
	}

	public static final IGrammarAwareElementType Fragments_ELEMENT_TYPE = associate(FragmentsFactory.createFragmentsElementType());

	public static final IGrammarAwareElementType Fragments_Group_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_GroupElementType());

	public static final IGrammarAwareElementType Fragments_FragmentsAction_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_FragmentsAction_0ElementType());

	public static final IGrammarAwareElementType Fragments_Alternatives_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_Alternatives_1ElementType());

	public static final IGrammarAwareElementType Fragments_Group_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_Group_1_0ElementType());

	public static final IGrammarAwareElementType Fragments_NumberSignDigitOneKeyword_1_0_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_NumberSignDigitOneKeyword_1_0_0ElementType());

	public static final IGrammarAwareElementType Fragments_ElementAssignment_1_0_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementAssignment_1_0_1ElementType());

	public static final IGrammarAwareElementType Fragments_ElementNamedParserRuleCall_1_0_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementNamedParserRuleCall_1_0_1_0ElementType());

	public static final IGrammarAwareElementType Fragments_Group_1_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_Group_1_1ElementType());

	public static final IGrammarAwareElementType Fragments_NumberSignDigitTwoKeyword_1_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_NumberSignDigitTwoKeyword_1_1_0ElementType());

	public static final IGrammarAwareElementType Fragments_ElementAssignment_1_1_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementAssignment_1_1_1ElementType());

	public static final IGrammarAwareElementType Fragments_ElementNamedParserRuleCall_1_1_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementNamedParserRuleCall_1_1_1_0ElementType());

	public static final IGrammarAwareElementType Fragments_HyphenMinusGreaterThanSignKeyword_1_1_2_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_HyphenMinusGreaterThanSignKeyword_1_1_2ElementType());

	public static final IGrammarAwareElementType Fragments_RefAssignment_1_1_3_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_RefAssignment_1_1_3ElementType());

	public static final IGrammarAwareElementType Fragments_RefNamedCrossReference_1_1_3_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_RefNamedCrossReference_1_1_3_0ElementType());

	public static final IGrammarAwareElementType Fragments_RefNamedIDTerminalRuleCall_1_1_3_0_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_RefNamedIDTerminalRuleCall_1_1_3_0_1ElementType());

	public static final IGrammarAwareElementType Fragments_Group_1_2_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_Group_1_2ElementType());

	public static final IGrammarAwareElementType Fragments_NumberSignDigitThreeKeyword_1_2_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_NumberSignDigitThreeKeyword_1_2_0ElementType());

	public static final IGrammarAwareElementType Fragments_ElementAssignment_1_2_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementAssignment_1_2_1ElementType());

	public static final IGrammarAwareElementType Fragments_ElementNamedRefFirstParserRuleCall_1_2_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementNamedRefFirstParserRuleCall_1_2_1_0ElementType());

	public static final IGrammarAwareElementType Fragments_Group_1_3_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_Group_1_3ElementType());

	public static final IGrammarAwareElementType Fragments_NumberSignDigitFourKeyword_1_3_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_NumberSignDigitFourKeyword_1_3_0ElementType());

	public static final IGrammarAwareElementType Fragments_ElementAssignment_1_3_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementAssignment_1_3_1ElementType());

	public static final IGrammarAwareElementType Fragments_ElementNamedWithActionParserRuleCall_1_3_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementNamedWithActionParserRuleCall_1_3_1_0ElementType());

	public static final IGrammarAwareElementType Fragments_Group_1_4_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_Group_1_4ElementType());

	public static final IGrammarAwareElementType Fragments_NumberSignDigitFiveKeyword_1_4_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_NumberSignDigitFiveKeyword_1_4_0ElementType());

	public static final IGrammarAwareElementType Fragments_ElementAssignment_1_4_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementAssignment_1_4_1ElementType());

	public static final IGrammarAwareElementType Fragments_ElementNamedWithActionInFragmentParserRuleCall_1_4_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementNamedWithActionInFragmentParserRuleCall_1_4_1_0ElementType());

	public static final IGrammarAwareElementType Fragments_Group_1_5_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_Group_1_5ElementType());

	public static final IGrammarAwareElementType Fragments_NumberSignDigitSixKeyword_1_5_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_NumberSignDigitSixKeyword_1_5_0ElementType());

	public static final IGrammarAwareElementType Fragments_ElementAssignment_1_5_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementAssignment_1_5_1ElementType());

	public static final IGrammarAwareElementType Fragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType());

	public static final IGrammarAwareElementType Fragments_Group_1_6_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_Group_1_6ElementType());

	public static final IGrammarAwareElementType Fragments_NumberSignDigitSevenKeyword_1_6_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_NumberSignDigitSevenKeyword_1_6_0ElementType());

	public static final IGrammarAwareElementType Fragments_ElementAssignment_1_6_1_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementAssignment_1_6_1ElementType());

	public static final IGrammarAwareElementType Fragments_ElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0_ELEMENT_TYPE = associate(FragmentsFactory.createFragments_ElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0ElementType());

	private static class NamedFactory {
		public static IGrammarAwareElementType createNamedElementType() {
			return new IGrammarAwareElementType("Named_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRule());
		}
		public static IGrammarAwareElementType createNamed_GroupElementType() {
			return new IGrammarAwareElementType("Named_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getGroup());
		}
		public static IGrammarAwareElementType createNamed_NamedFragmentParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Named_NamedFragmentParserRuleCall_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getNamedFragmentParserRuleCall_0());
		}
		public static IGrammarAwareElementType createNamed_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("Named_Alternatives_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createNamed_Group_1_0ElementType() {
			return new IGrammarAwareElementType("Named_Group_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getGroup_1_0());
		}
		public static IGrammarAwareElementType createNamed_ColonKeyword_1_0_0ElementType() {
			return new IGrammarAwareElementType("Named_ColonKeyword_1_0_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getColonKeyword_1_0_0());
		}
		public static IGrammarAwareElementType createNamed_RefAssignment_1_0_1ElementType() {
			return new IGrammarAwareElementType("Named_RefAssignment_1_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getRefAssignment_1_0_1());
		}
		public static IGrammarAwareElementType createNamed_RefNamedCrossReference_1_0_1_0ElementType() {
			return new IGrammarAwareElementType("Named_RefNamedCrossReference_1_0_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getRefNamedCrossReference_1_0_1_0());
		}
		public static IGrammarAwareElementType createNamed_RefNamedIDTerminalRuleCall_1_0_1_0_1ElementType() {
			return new IGrammarAwareElementType("Named_RefNamedIDTerminalRuleCall_1_0_1_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getRefNamedIDTerminalRuleCall_1_0_1_0_1());
		}
		public static IGrammarAwareElementType createNamed_Group_1_1ElementType() {
			return new IGrammarAwareElementType("Named_Group_1_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getGroup_1_1());
		}
		public static IGrammarAwareElementType createNamed_HyphenMinusKeyword_1_1_0ElementType() {
			return new IGrammarAwareElementType("Named_HyphenMinusKeyword_1_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getHyphenMinusKeyword_1_1_0());
		}
		public static IGrammarAwareElementType createNamed_NamedRefParserRuleCall_1_1_1ElementType() {
			return new IGrammarAwareElementType("Named_NamedRefParserRuleCall_1_1_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedAccess().getNamedRefParserRuleCall_1_1_1());
		}
	}

	public static final IGrammarAwareElementType Named_ELEMENT_TYPE = associate(NamedFactory.createNamedElementType());

	public static final IGrammarAwareElementType Named_Group_ELEMENT_TYPE = associate(NamedFactory.createNamed_GroupElementType());

	public static final IGrammarAwareElementType Named_NamedFragmentParserRuleCall_0_ELEMENT_TYPE = associate(NamedFactory.createNamed_NamedFragmentParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType Named_Alternatives_1_ELEMENT_TYPE = associate(NamedFactory.createNamed_Alternatives_1ElementType());

	public static final IGrammarAwareElementType Named_Group_1_0_ELEMENT_TYPE = associate(NamedFactory.createNamed_Group_1_0ElementType());

	public static final IGrammarAwareElementType Named_ColonKeyword_1_0_0_ELEMENT_TYPE = associate(NamedFactory.createNamed_ColonKeyword_1_0_0ElementType());

	public static final IGrammarAwareElementType Named_RefAssignment_1_0_1_ELEMENT_TYPE = associate(NamedFactory.createNamed_RefAssignment_1_0_1ElementType());

	public static final IGrammarAwareElementType Named_RefNamedCrossReference_1_0_1_0_ELEMENT_TYPE = associate(NamedFactory.createNamed_RefNamedCrossReference_1_0_1_0ElementType());

	public static final IGrammarAwareElementType Named_RefNamedIDTerminalRuleCall_1_0_1_0_1_ELEMENT_TYPE = associate(NamedFactory.createNamed_RefNamedIDTerminalRuleCall_1_0_1_0_1ElementType());

	public static final IGrammarAwareElementType Named_Group_1_1_ELEMENT_TYPE = associate(NamedFactory.createNamed_Group_1_1ElementType());

	public static final IGrammarAwareElementType Named_HyphenMinusKeyword_1_1_0_ELEMENT_TYPE = associate(NamedFactory.createNamed_HyphenMinusKeyword_1_1_0ElementType());

	public static final IGrammarAwareElementType Named_NamedRefParserRuleCall_1_1_1_ELEMENT_TYPE = associate(NamedFactory.createNamed_NamedRefParserRuleCall_1_1_1ElementType());

	private static class NamedRefFirstFactory {
		public static IGrammarAwareElementType createNamedRefFirstElementType() {
			return new IGrammarAwareElementType("NamedRefFirst_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefFirstRule());
		}
		public static IGrammarAwareElementType createNamedRefFirst_GroupElementType() {
			return new IGrammarAwareElementType("NamedRefFirst_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefFirstAccess().getGroup());
		}
		public static IGrammarAwareElementType createNamedRefFirst_RefAssignment_0ElementType() {
			return new IGrammarAwareElementType("NamedRefFirst_RefAssignment_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefFirstAccess().getRefAssignment_0());
		}
		public static IGrammarAwareElementType createNamedRefFirst_RefNamedCrossReference_0_0ElementType() {
			return new IGrammarAwareElementType("NamedRefFirst_RefNamedCrossReference_0_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefFirstAccess().getRefNamedCrossReference_0_0());
		}
		public static IGrammarAwareElementType createNamedRefFirst_RefNamedIDTerminalRuleCall_0_0_1ElementType() {
			return new IGrammarAwareElementType("NamedRefFirst_RefNamedIDTerminalRuleCall_0_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefFirstAccess().getRefNamedIDTerminalRuleCall_0_0_1());
		}
		public static IGrammarAwareElementType createNamedRefFirst_LessThanSignHyphenMinusKeyword_1ElementType() {
			return new IGrammarAwareElementType("NamedRefFirst_LessThanSignHyphenMinusKeyword_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefFirstAccess().getLessThanSignHyphenMinusKeyword_1());
		}
		public static IGrammarAwareElementType createNamedRefFirst_NamedFragmentParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("NamedRefFirst_NamedFragmentParserRuleCall_2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefFirstAccess().getNamedFragmentParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType NamedRefFirst_ELEMENT_TYPE = associate(NamedRefFirstFactory.createNamedRefFirstElementType());

	public static final IGrammarAwareElementType NamedRefFirst_Group_ELEMENT_TYPE = associate(NamedRefFirstFactory.createNamedRefFirst_GroupElementType());

	public static final IGrammarAwareElementType NamedRefFirst_RefAssignment_0_ELEMENT_TYPE = associate(NamedRefFirstFactory.createNamedRefFirst_RefAssignment_0ElementType());

	public static final IGrammarAwareElementType NamedRefFirst_RefNamedCrossReference_0_0_ELEMENT_TYPE = associate(NamedRefFirstFactory.createNamedRefFirst_RefNamedCrossReference_0_0ElementType());

	public static final IGrammarAwareElementType NamedRefFirst_RefNamedIDTerminalRuleCall_0_0_1_ELEMENT_TYPE = associate(NamedRefFirstFactory.createNamedRefFirst_RefNamedIDTerminalRuleCall_0_0_1ElementType());

	public static final IGrammarAwareElementType NamedRefFirst_LessThanSignHyphenMinusKeyword_1_ELEMENT_TYPE = associate(NamedRefFirstFactory.createNamedRefFirst_LessThanSignHyphenMinusKeyword_1ElementType());

	public static final IGrammarAwareElementType NamedRefFirst_NamedFragmentParserRuleCall_2_ELEMENT_TYPE = associate(NamedRefFirstFactory.createNamedRefFirst_NamedFragmentParserRuleCall_2ElementType());

	private static class NamedWithActionFactory {
		public static IGrammarAwareElementType createNamedWithActionElementType() {
			return new IGrammarAwareElementType("NamedWithAction_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionRule());
		}
		public static IGrammarAwareElementType createNamedWithAction_GroupElementType() {
			return new IGrammarAwareElementType("NamedWithAction_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getGroup());
		}
		public static IGrammarAwareElementType createNamedWithAction_NamedParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_NamedParserRuleCall_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getNamedParserRuleCall_0());
		}
		public static IGrammarAwareElementType createNamedWithAction_NamedWithActionPrevAction_1ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_NamedWithActionPrevAction_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getNamedWithActionPrevAction_1());
		}
		public static IGrammarAwareElementType createNamedWithAction_NameAssignment_2ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_NameAssignment_2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getNameAssignment_2());
		}
		public static IGrammarAwareElementType createNamedWithAction_NameIDTerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getNameIDTerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createNamedWithAction_Group_3ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_Group_3_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createNamedWithAction_RefAssignment_3_0ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_RefAssignment_3_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getRefAssignment_3_0());
		}
		public static IGrammarAwareElementType createNamedWithAction_RefNamedCrossReference_3_0_0ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_RefNamedCrossReference_3_0_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getRefNamedCrossReference_3_0_0());
		}
		public static IGrammarAwareElementType createNamedWithAction_RefNamedIDTerminalRuleCall_3_0_0_1ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_RefNamedIDTerminalRuleCall_3_0_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getRefNamedIDTerminalRuleCall_3_0_0_1());
		}
		public static IGrammarAwareElementType createNamedWithAction_Ref2Assignment_3_1ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_Ref2Assignment_3_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getRef2Assignment_3_1());
		}
		public static IGrammarAwareElementType createNamedWithAction_Ref2NamedCrossReference_3_1_0ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_Ref2NamedCrossReference_3_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getRef2NamedCrossReference_3_1_0());
		}
		public static IGrammarAwareElementType createNamedWithAction_Ref2NamedIDTerminalRuleCall_3_1_0_1ElementType() {
			return new IGrammarAwareElementType("NamedWithAction_Ref2NamedIDTerminalRuleCall_3_1_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionAccess().getRef2NamedIDTerminalRuleCall_3_1_0_1());
		}
	}

	public static final IGrammarAwareElementType NamedWithAction_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithActionElementType());

	public static final IGrammarAwareElementType NamedWithAction_Group_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_GroupElementType());

	public static final IGrammarAwareElementType NamedWithAction_NamedParserRuleCall_0_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_NamedParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType NamedWithAction_NamedWithActionPrevAction_1_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_NamedWithActionPrevAction_1ElementType());

	public static final IGrammarAwareElementType NamedWithAction_NameAssignment_2_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_NameAssignment_2ElementType());

	public static final IGrammarAwareElementType NamedWithAction_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_NameIDTerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType NamedWithAction_Group_3_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_Group_3ElementType());

	public static final IGrammarAwareElementType NamedWithAction_RefAssignment_3_0_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_RefAssignment_3_0ElementType());

	public static final IGrammarAwareElementType NamedWithAction_RefNamedCrossReference_3_0_0_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_RefNamedCrossReference_3_0_0ElementType());

	public static final IGrammarAwareElementType NamedWithAction_RefNamedIDTerminalRuleCall_3_0_0_1_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_RefNamedIDTerminalRuleCall_3_0_0_1ElementType());

	public static final IGrammarAwareElementType NamedWithAction_Ref2Assignment_3_1_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_Ref2Assignment_3_1ElementType());

	public static final IGrammarAwareElementType NamedWithAction_Ref2NamedCrossReference_3_1_0_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_Ref2NamedCrossReference_3_1_0ElementType());

	public static final IGrammarAwareElementType NamedWithAction_Ref2NamedIDTerminalRuleCall_3_1_0_1_ELEMENT_TYPE = associate(NamedWithActionFactory.createNamedWithAction_Ref2NamedIDTerminalRuleCall_3_1_0_1ElementType());

	private static class NamedWithActionInFragmentFactory {
		public static IGrammarAwareElementType createNamedWithActionInFragmentElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragmentRule());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment_GroupElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragmentAccess().getGroup());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment_FragmentWithActionParserRuleCall_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragmentAccess().getFragmentWithActionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment_Group_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment_Group_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragmentAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment_HyphenMinusKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment_HyphenMinusKeyword_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragmentAccess().getHyphenMinusKeyword_1_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment_RefAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment_RefAssignment_1_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragmentAccess().getRefAssignment_1_1());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment_RefNamedCrossReference_1_1_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment_RefNamedCrossReference_1_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragmentAccess().getRefNamedCrossReference_1_1_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment_RefNamedIDTerminalRuleCall_1_1_0_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment_RefNamedIDTerminalRuleCall_1_1_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragmentAccess().getRefNamedIDTerminalRuleCall_1_1_0_1());
		}
	}

	public static final IGrammarAwareElementType NamedWithActionInFragment_ELEMENT_TYPE = associate(NamedWithActionInFragmentFactory.createNamedWithActionInFragmentElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment_Group_ELEMENT_TYPE = associate(NamedWithActionInFragmentFactory.createNamedWithActionInFragment_GroupElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment_FragmentWithActionParserRuleCall_0_ELEMENT_TYPE = associate(NamedWithActionInFragmentFactory.createNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment_Group_1_ELEMENT_TYPE = associate(NamedWithActionInFragmentFactory.createNamedWithActionInFragment_Group_1ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment_HyphenMinusKeyword_1_0_ELEMENT_TYPE = associate(NamedWithActionInFragmentFactory.createNamedWithActionInFragment_HyphenMinusKeyword_1_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment_RefAssignment_1_1_ELEMENT_TYPE = associate(NamedWithActionInFragmentFactory.createNamedWithActionInFragment_RefAssignment_1_1ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment_RefNamedCrossReference_1_1_0_ELEMENT_TYPE = associate(NamedWithActionInFragmentFactory.createNamedWithActionInFragment_RefNamedCrossReference_1_1_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment_RefNamedIDTerminalRuleCall_1_1_0_1_ELEMENT_TYPE = associate(NamedWithActionInFragmentFactory.createNamedWithActionInFragment_RefNamedIDTerminalRuleCall_1_1_0_1ElementType());

	private static class NamedWithActionInFragment2Factory {
		public static IGrammarAwareElementType createNamedWithActionInFragment2ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Rule());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_GroupElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getGroup());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_NameAssignment_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_NameAssignment_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getNameAssignment_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getNameIDTerminalRuleCall_0_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getFragmentWithAction2ParserRuleCall_1());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_Group_2ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_Group_2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getGroup_2());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_HyphenMinusKeyword_2_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_HyphenMinusKeyword_2_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getHyphenMinusKeyword_2_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_RefAssignment_2_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_RefAssignment_2_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getRefAssignment_2_1());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_RefNamedCrossReference_2_1_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_RefNamedCrossReference_2_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getRefNamedCrossReference_2_1_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment2_RefNamedIDTerminalRuleCall_2_1_0_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment2_RefNamedIDTerminalRuleCall_2_1_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment2Access().getRefNamedIDTerminalRuleCall_2_1_0_1());
		}
	}

	public static final IGrammarAwareElementType NamedWithActionInFragment2_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_Group_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_GroupElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_NameAssignment_0_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_NameAssignment_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_Group_2_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_Group_2ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_HyphenMinusKeyword_2_0_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_HyphenMinusKeyword_2_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_RefAssignment_2_1_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_RefAssignment_2_1ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_RefNamedCrossReference_2_1_0_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_RefNamedCrossReference_2_1_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment2_RefNamedIDTerminalRuleCall_2_1_0_1_ELEMENT_TYPE = associate(NamedWithActionInFragment2Factory.createNamedWithActionInFragment2_RefNamedIDTerminalRuleCall_2_1_0_1ElementType());

	private static class NamedWithActionInFragment3Factory {
		public static IGrammarAwareElementType createNamedWithActionInFragment3ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment3_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment3Rule());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment3_GroupElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment3_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment3Access().getGroup());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment3Access().getFragmentWithAction3ParserRuleCall_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment3_Group_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment3_Group_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment3Access().getGroup_1());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment3_HyphenMinusKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment3_HyphenMinusKeyword_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment3Access().getHyphenMinusKeyword_1_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment3_RefAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment3_RefAssignment_1_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment3Access().getRefAssignment_1_1());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment3_RefNamedCrossReference_1_1_0ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment3_RefNamedCrossReference_1_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment3Access().getRefNamedCrossReference_1_1_0());
		}
		public static IGrammarAwareElementType createNamedWithActionInFragment3_RefNamedIDTerminalRuleCall_1_1_0_1ElementType() {
			return new IGrammarAwareElementType("NamedWithActionInFragment3_RefNamedIDTerminalRuleCall_1_1_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedWithActionInFragment3Access().getRefNamedIDTerminalRuleCall_1_1_0_1());
		}
	}

	public static final IGrammarAwareElementType NamedWithActionInFragment3_ELEMENT_TYPE = associate(NamedWithActionInFragment3Factory.createNamedWithActionInFragment3ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment3_Group_ELEMENT_TYPE = associate(NamedWithActionInFragment3Factory.createNamedWithActionInFragment3_GroupElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0_ELEMENT_TYPE = associate(NamedWithActionInFragment3Factory.createNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment3_Group_1_ELEMENT_TYPE = associate(NamedWithActionInFragment3Factory.createNamedWithActionInFragment3_Group_1ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment3_HyphenMinusKeyword_1_0_ELEMENT_TYPE = associate(NamedWithActionInFragment3Factory.createNamedWithActionInFragment3_HyphenMinusKeyword_1_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment3_RefAssignment_1_1_ELEMENT_TYPE = associate(NamedWithActionInFragment3Factory.createNamedWithActionInFragment3_RefAssignment_1_1ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment3_RefNamedCrossReference_1_1_0_ELEMENT_TYPE = associate(NamedWithActionInFragment3Factory.createNamedWithActionInFragment3_RefNamedCrossReference_1_1_0ElementType());

	public static final IGrammarAwareElementType NamedWithActionInFragment3_RefNamedIDTerminalRuleCall_1_1_0_1_ELEMENT_TYPE = associate(NamedWithActionInFragment3Factory.createNamedWithActionInFragment3_RefNamedIDTerminalRuleCall_1_1_0_1ElementType());

	private static class FragmentWithActionFactory {
		public static IGrammarAwareElementType createFragmentWithActionElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionRule());
		}
		public static IGrammarAwareElementType createFragmentWithAction_GroupElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getGroup());
		}
		public static IGrammarAwareElementType createFragmentWithAction_NameAssignment_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_NameAssignment_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getNameAssignment_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction_NameIDTerminalRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getNameIDTerminalRuleCall_0_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction_NamedWithActionPrevAction_1ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_NamedWithActionPrevAction_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getNamedWithActionPrevAction_1());
		}
		public static IGrammarAwareElementType createFragmentWithAction_NameAssignment_2ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_NameAssignment_2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getNameAssignment_2());
		}
		public static IGrammarAwareElementType createFragmentWithAction_NameIDTerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getNameIDTerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction_Ref2Assignment_3ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_Ref2Assignment_3_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getRef2Assignment_3());
		}
		public static IGrammarAwareElementType createFragmentWithAction_Ref2NamedCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_Ref2NamedCrossReference_3_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getRef2NamedCrossReference_3_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction_Ref2NamedIDTerminalRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction_Ref2NamedIDTerminalRuleCall_3_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithActionAccess().getRef2NamedIDTerminalRuleCall_3_0_1());
		}
	}

	public static final IGrammarAwareElementType FragmentWithAction_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithActionElementType());

	public static final IGrammarAwareElementType FragmentWithAction_Group_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_GroupElementType());

	public static final IGrammarAwareElementType FragmentWithAction_NameAssignment_0_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_NameAssignment_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_NameIDTerminalRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction_NamedWithActionPrevAction_1_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_NamedWithActionPrevAction_1ElementType());

	public static final IGrammarAwareElementType FragmentWithAction_NameAssignment_2_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_NameAssignment_2ElementType());

	public static final IGrammarAwareElementType FragmentWithAction_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_NameIDTerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction_Ref2Assignment_3_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_Ref2Assignment_3ElementType());

	public static final IGrammarAwareElementType FragmentWithAction_Ref2NamedCrossReference_3_0_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_Ref2NamedCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction_Ref2NamedIDTerminalRuleCall_3_0_1_ELEMENT_TYPE = associate(FragmentWithActionFactory.createFragmentWithAction_Ref2NamedIDTerminalRuleCall_3_0_1ElementType());

	private static class FragmentWithAction2Factory {
		public static IGrammarAwareElementType createFragmentWithAction2ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction2Rule());
		}
		public static IGrammarAwareElementType createFragmentWithAction2_GroupElementType() {
			return new IGrammarAwareElementType("FragmentWithAction2_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction2Access().getGroup());
		}
		public static IGrammarAwareElementType createFragmentWithAction2_NamedWithActionPrevAction_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction2_NamedWithActionPrevAction_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction2Access().getNamedWithActionPrevAction_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction2_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction2_NameAssignment_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction2Access().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createFragmentWithAction2_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction2_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction2Access().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction2_Ref2Assignment_2ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction2_Ref2Assignment_2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction2Access().getRef2Assignment_2());
		}
		public static IGrammarAwareElementType createFragmentWithAction2_Ref2NamedCrossReference_2_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction2_Ref2NamedCrossReference_2_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction2Access().getRef2NamedCrossReference_2_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction2_Ref2NamedIDTerminalRuleCall_2_0_1ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction2_Ref2NamedIDTerminalRuleCall_2_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction2Access().getRef2NamedIDTerminalRuleCall_2_0_1());
		}
	}

	public static final IGrammarAwareElementType FragmentWithAction2_ELEMENT_TYPE = associate(FragmentWithAction2Factory.createFragmentWithAction2ElementType());

	public static final IGrammarAwareElementType FragmentWithAction2_Group_ELEMENT_TYPE = associate(FragmentWithAction2Factory.createFragmentWithAction2_GroupElementType());

	public static final IGrammarAwareElementType FragmentWithAction2_NamedWithActionPrevAction_0_ELEMENT_TYPE = associate(FragmentWithAction2Factory.createFragmentWithAction2_NamedWithActionPrevAction_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction2_NameAssignment_1_ELEMENT_TYPE = associate(FragmentWithAction2Factory.createFragmentWithAction2_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType FragmentWithAction2_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(FragmentWithAction2Factory.createFragmentWithAction2_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction2_Ref2Assignment_2_ELEMENT_TYPE = associate(FragmentWithAction2Factory.createFragmentWithAction2_Ref2Assignment_2ElementType());

	public static final IGrammarAwareElementType FragmentWithAction2_Ref2NamedCrossReference_2_0_ELEMENT_TYPE = associate(FragmentWithAction2Factory.createFragmentWithAction2_Ref2NamedCrossReference_2_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction2_Ref2NamedIDTerminalRuleCall_2_0_1_ELEMENT_TYPE = associate(FragmentWithAction2Factory.createFragmentWithAction2_Ref2NamedIDTerminalRuleCall_2_0_1ElementType());

	private static class FragmentWithAction3Factory {
		public static IGrammarAwareElementType createFragmentWithAction3ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Rule());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_GroupElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_Group_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getGroup());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_NameAssignment_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_NameAssignment_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getNameAssignment_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_NameIDTerminalRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getNameIDTerminalRuleCall_0_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_Group_1ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_Group_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getGroup_1());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_NamedWithActionPrevAction_1_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_NamedWithActionPrevAction_1_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getNamedWithActionPrevAction_1_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getHyphenMinusGreaterThanSignKeyword_1_1());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_NameAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_NameAssignment_1_2_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getNameAssignment_1_2());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_NameIDTerminalRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_NameIDTerminalRuleCall_1_2_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getNameIDTerminalRuleCall_1_2_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_Ref2Assignment_1_3ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_Ref2Assignment_1_3_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getRef2Assignment_1_3());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_Ref2NamedCrossReference_1_3_0ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_Ref2NamedCrossReference_1_3_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getRef2NamedCrossReference_1_3_0());
		}
		public static IGrammarAwareElementType createFragmentWithAction3_Ref2NamedIDTerminalRuleCall_1_3_0_1ElementType() {
			return new IGrammarAwareElementType("FragmentWithAction3_Ref2NamedIDTerminalRuleCall_1_3_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFragmentWithAction3Access().getRef2NamedIDTerminalRuleCall_1_3_0_1());
		}
	}

	public static final IGrammarAwareElementType FragmentWithAction3_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_Group_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_GroupElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_NameAssignment_0_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_NameAssignment_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_NameIDTerminalRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_Group_1_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_Group_1ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_NamedWithActionPrevAction_1_0_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_NamedWithActionPrevAction_1_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_NameAssignment_1_2_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_NameAssignment_1_2ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_NameIDTerminalRuleCall_1_2_0_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_NameIDTerminalRuleCall_1_2_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_Ref2Assignment_1_3_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_Ref2Assignment_1_3ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_Ref2NamedCrossReference_1_3_0_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_Ref2NamedCrossReference_1_3_0ElementType());

	public static final IGrammarAwareElementType FragmentWithAction3_Ref2NamedIDTerminalRuleCall_1_3_0_1_ELEMENT_TYPE = associate(FragmentWithAction3Factory.createFragmentWithAction3_Ref2NamedIDTerminalRuleCall_1_3_0_1ElementType());

	private static class NamedFragmentFactory {
		public static IGrammarAwareElementType createNamedFragmentElementType() {
			return new IGrammarAwareElementType("NamedFragment_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedFragmentRule());
		}
		public static IGrammarAwareElementType createNamedFragment_NameAssignmentElementType() {
			return new IGrammarAwareElementType("NamedFragment_NameAssignment_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedFragmentAccess().getNameAssignment());
		}
		public static IGrammarAwareElementType createNamedFragment_NameIDTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("NamedFragment_NameIDTerminalRuleCall_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedFragmentAccess().getNameIDTerminalRuleCall_0());
		}
	}

	public static final IGrammarAwareElementType NamedFragment_ELEMENT_TYPE = associate(NamedFragmentFactory.createNamedFragmentElementType());

	public static final IGrammarAwareElementType NamedFragment_NameAssignment_ELEMENT_TYPE = associate(NamedFragmentFactory.createNamedFragment_NameAssignmentElementType());

	public static final IGrammarAwareElementType NamedFragment_NameIDTerminalRuleCall_0_ELEMENT_TYPE = associate(NamedFragmentFactory.createNamedFragment_NameIDTerminalRuleCall_0ElementType());

	private static class NamedRefFactory {
		public static IGrammarAwareElementType createNamedRefElementType() {
			return new IGrammarAwareElementType("NamedRef_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefRule());
		}
		public static IGrammarAwareElementType createNamedRef_RefAssignmentElementType() {
			return new IGrammarAwareElementType("NamedRef_RefAssignment_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefAccess().getRefAssignment());
		}
		public static IGrammarAwareElementType createNamedRef_RefNamedCrossReference_0ElementType() {
			return new IGrammarAwareElementType("NamedRef_RefNamedCrossReference_0_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefAccess().getRefNamedCrossReference_0());
		}
		public static IGrammarAwareElementType createNamedRef_RefNamedIDTerminalRuleCall_0_1ElementType() {
			return new IGrammarAwareElementType("NamedRef_RefNamedIDTerminalRuleCall_0_1_ELEMENT_TYPE", FragmentTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedRefAccess().getRefNamedIDTerminalRuleCall_0_1());
		}
	}

	public static final IGrammarAwareElementType NamedRef_ELEMENT_TYPE = associate(NamedRefFactory.createNamedRefElementType());

	public static final IGrammarAwareElementType NamedRef_RefAssignment_ELEMENT_TYPE = associate(NamedRefFactory.createNamedRef_RefAssignmentElementType());

	public static final IGrammarAwareElementType NamedRef_RefNamedCrossReference_0_ELEMENT_TYPE = associate(NamedRefFactory.createNamedRef_RefNamedCrossReference_0ElementType());

	public static final IGrammarAwareElementType NamedRef_RefNamedIDTerminalRuleCall_0_1_ELEMENT_TYPE = associate(NamedRefFactory.createNamedRef_RefNamedIDTerminalRuleCall_0_1ElementType());

	@Override
	public IFileElementType getFileType() {
		return FILE_TYPE;
	}

	@Override
	public IGrammarAwareElementType findElementType(EObject grammarElement) {
		return GRAMMAR_ELEMENT_TYPE.get(grammarElement);
	}
	
	public IGrammarAwareElementType getFragmentsElementType() {
		return Fragments_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_GroupElementType() {
		return Fragments_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_FragmentsAction_0ElementType() {
		return Fragments_FragmentsAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_Alternatives_1ElementType() {
		return Fragments_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_Group_1_0ElementType() {
		return Fragments_Group_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_NumberSignDigitOneKeyword_1_0_0ElementType() {
		return Fragments_NumberSignDigitOneKeyword_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementAssignment_1_0_1ElementType() {
		return Fragments_ElementAssignment_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementNamedParserRuleCall_1_0_1_0ElementType() {
		return Fragments_ElementNamedParserRuleCall_1_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_Group_1_1ElementType() {
		return Fragments_Group_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_NumberSignDigitTwoKeyword_1_1_0ElementType() {
		return Fragments_NumberSignDigitTwoKeyword_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementAssignment_1_1_1ElementType() {
		return Fragments_ElementAssignment_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementNamedParserRuleCall_1_1_1_0ElementType() {
		return Fragments_ElementNamedParserRuleCall_1_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_HyphenMinusGreaterThanSignKeyword_1_1_2ElementType() {
		return Fragments_HyphenMinusGreaterThanSignKeyword_1_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_RefAssignment_1_1_3ElementType() {
		return Fragments_RefAssignment_1_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_RefNamedCrossReference_1_1_3_0ElementType() {
		return Fragments_RefNamedCrossReference_1_1_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_RefNamedIDTerminalRuleCall_1_1_3_0_1ElementType() {
		return Fragments_RefNamedIDTerminalRuleCall_1_1_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_Group_1_2ElementType() {
		return Fragments_Group_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_NumberSignDigitThreeKeyword_1_2_0ElementType() {
		return Fragments_NumberSignDigitThreeKeyword_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementAssignment_1_2_1ElementType() {
		return Fragments_ElementAssignment_1_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementNamedRefFirstParserRuleCall_1_2_1_0ElementType() {
		return Fragments_ElementNamedRefFirstParserRuleCall_1_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_Group_1_3ElementType() {
		return Fragments_Group_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_NumberSignDigitFourKeyword_1_3_0ElementType() {
		return Fragments_NumberSignDigitFourKeyword_1_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementAssignment_1_3_1ElementType() {
		return Fragments_ElementAssignment_1_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementNamedWithActionParserRuleCall_1_3_1_0ElementType() {
		return Fragments_ElementNamedWithActionParserRuleCall_1_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_Group_1_4ElementType() {
		return Fragments_Group_1_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_NumberSignDigitFiveKeyword_1_4_0ElementType() {
		return Fragments_NumberSignDigitFiveKeyword_1_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementAssignment_1_4_1ElementType() {
		return Fragments_ElementAssignment_1_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementNamedWithActionInFragmentParserRuleCall_1_4_1_0ElementType() {
		return Fragments_ElementNamedWithActionInFragmentParserRuleCall_1_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_Group_1_5ElementType() {
		return Fragments_Group_1_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_NumberSignDigitSixKeyword_1_5_0ElementType() {
		return Fragments_NumberSignDigitSixKeyword_1_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementAssignment_1_5_1ElementType() {
		return Fragments_ElementAssignment_1_5_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType() {
		return Fragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_Group_1_6ElementType() {
		return Fragments_Group_1_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_NumberSignDigitSevenKeyword_1_6_0ElementType() {
		return Fragments_NumberSignDigitSevenKeyword_1_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementAssignment_1_6_1ElementType() {
		return Fragments_ElementAssignment_1_6_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragments_ElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0ElementType() {
		return Fragments_ElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedElementType() {
		return Named_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_GroupElementType() {
		return Named_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_NamedFragmentParserRuleCall_0ElementType() {
		return Named_NamedFragmentParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_Alternatives_1ElementType() {
		return Named_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_Group_1_0ElementType() {
		return Named_Group_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_ColonKeyword_1_0_0ElementType() {
		return Named_ColonKeyword_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_RefAssignment_1_0_1ElementType() {
		return Named_RefAssignment_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_RefNamedCrossReference_1_0_1_0ElementType() {
		return Named_RefNamedCrossReference_1_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_RefNamedIDTerminalRuleCall_1_0_1_0_1ElementType() {
		return Named_RefNamedIDTerminalRuleCall_1_0_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_Group_1_1ElementType() {
		return Named_Group_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_HyphenMinusKeyword_1_1_0ElementType() {
		return Named_HyphenMinusKeyword_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamed_NamedRefParserRuleCall_1_1_1ElementType() {
		return Named_NamedRefParserRuleCall_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRefFirstElementType() {
		return NamedRefFirst_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRefFirst_GroupElementType() {
		return NamedRefFirst_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRefFirst_RefAssignment_0ElementType() {
		return NamedRefFirst_RefAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRefFirst_RefNamedCrossReference_0_0ElementType() {
		return NamedRefFirst_RefNamedCrossReference_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRefFirst_RefNamedIDTerminalRuleCall_0_0_1ElementType() {
		return NamedRefFirst_RefNamedIDTerminalRuleCall_0_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRefFirst_LessThanSignHyphenMinusKeyword_1ElementType() {
		return NamedRefFirst_LessThanSignHyphenMinusKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRefFirst_NamedFragmentParserRuleCall_2ElementType() {
		return NamedRefFirst_NamedFragmentParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionElementType() {
		return NamedWithAction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_GroupElementType() {
		return NamedWithAction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_NamedParserRuleCall_0ElementType() {
		return NamedWithAction_NamedParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_NamedWithActionPrevAction_1ElementType() {
		return NamedWithAction_NamedWithActionPrevAction_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_NameAssignment_2ElementType() {
		return NamedWithAction_NameAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_NameIDTerminalRuleCall_2_0ElementType() {
		return NamedWithAction_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_Group_3ElementType() {
		return NamedWithAction_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_RefAssignment_3_0ElementType() {
		return NamedWithAction_RefAssignment_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_RefNamedCrossReference_3_0_0ElementType() {
		return NamedWithAction_RefNamedCrossReference_3_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_RefNamedIDTerminalRuleCall_3_0_0_1ElementType() {
		return NamedWithAction_RefNamedIDTerminalRuleCall_3_0_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_Ref2Assignment_3_1ElementType() {
		return NamedWithAction_Ref2Assignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_Ref2NamedCrossReference_3_1_0ElementType() {
		return NamedWithAction_Ref2NamedCrossReference_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithAction_Ref2NamedIDTerminalRuleCall_3_1_0_1ElementType() {
		return NamedWithAction_Ref2NamedIDTerminalRuleCall_3_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragmentElementType() {
		return NamedWithActionInFragment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment_GroupElementType() {
		return NamedWithActionInFragment_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType() {
		return NamedWithActionInFragment_FragmentWithActionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment_Group_1ElementType() {
		return NamedWithActionInFragment_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment_HyphenMinusKeyword_1_0ElementType() {
		return NamedWithActionInFragment_HyphenMinusKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment_RefAssignment_1_1ElementType() {
		return NamedWithActionInFragment_RefAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment_RefNamedCrossReference_1_1_0ElementType() {
		return NamedWithActionInFragment_RefNamedCrossReference_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment_RefNamedIDTerminalRuleCall_1_1_0_1ElementType() {
		return NamedWithActionInFragment_RefNamedIDTerminalRuleCall_1_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2ElementType() {
		return NamedWithActionInFragment2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_GroupElementType() {
		return NamedWithActionInFragment2_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_NameAssignment_0ElementType() {
		return NamedWithActionInFragment2_NameAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType() {
		return NamedWithActionInFragment2_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType() {
		return NamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_Group_2ElementType() {
		return NamedWithActionInFragment2_Group_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_HyphenMinusKeyword_2_0ElementType() {
		return NamedWithActionInFragment2_HyphenMinusKeyword_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_RefAssignment_2_1ElementType() {
		return NamedWithActionInFragment2_RefAssignment_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_RefNamedCrossReference_2_1_0ElementType() {
		return NamedWithActionInFragment2_RefNamedCrossReference_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment2_RefNamedIDTerminalRuleCall_2_1_0_1ElementType() {
		return NamedWithActionInFragment2_RefNamedIDTerminalRuleCall_2_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment3ElementType() {
		return NamedWithActionInFragment3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment3_GroupElementType() {
		return NamedWithActionInFragment3_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType() {
		return NamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment3_Group_1ElementType() {
		return NamedWithActionInFragment3_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment3_HyphenMinusKeyword_1_0ElementType() {
		return NamedWithActionInFragment3_HyphenMinusKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment3_RefAssignment_1_1ElementType() {
		return NamedWithActionInFragment3_RefAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment3_RefNamedCrossReference_1_1_0ElementType() {
		return NamedWithActionInFragment3_RefNamedCrossReference_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedWithActionInFragment3_RefNamedIDTerminalRuleCall_1_1_0_1ElementType() {
		return NamedWithActionInFragment3_RefNamedIDTerminalRuleCall_1_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithActionElementType() {
		return FragmentWithAction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_GroupElementType() {
		return FragmentWithAction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_NameAssignment_0ElementType() {
		return FragmentWithAction_NameAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_NameIDTerminalRuleCall_0_0ElementType() {
		return FragmentWithAction_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_NamedWithActionPrevAction_1ElementType() {
		return FragmentWithAction_NamedWithActionPrevAction_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_NameAssignment_2ElementType() {
		return FragmentWithAction_NameAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_NameIDTerminalRuleCall_2_0ElementType() {
		return FragmentWithAction_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_Ref2Assignment_3ElementType() {
		return FragmentWithAction_Ref2Assignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_Ref2NamedCrossReference_3_0ElementType() {
		return FragmentWithAction_Ref2NamedCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction_Ref2NamedIDTerminalRuleCall_3_0_1ElementType() {
		return FragmentWithAction_Ref2NamedIDTerminalRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction2ElementType() {
		return FragmentWithAction2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction2_GroupElementType() {
		return FragmentWithAction2_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction2_NamedWithActionPrevAction_0ElementType() {
		return FragmentWithAction2_NamedWithActionPrevAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction2_NameAssignment_1ElementType() {
		return FragmentWithAction2_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction2_NameIDTerminalRuleCall_1_0ElementType() {
		return FragmentWithAction2_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction2_Ref2Assignment_2ElementType() {
		return FragmentWithAction2_Ref2Assignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction2_Ref2NamedCrossReference_2_0ElementType() {
		return FragmentWithAction2_Ref2NamedCrossReference_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction2_Ref2NamedIDTerminalRuleCall_2_0_1ElementType() {
		return FragmentWithAction2_Ref2NamedIDTerminalRuleCall_2_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3ElementType() {
		return FragmentWithAction3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_GroupElementType() {
		return FragmentWithAction3_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_NameAssignment_0ElementType() {
		return FragmentWithAction3_NameAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_NameIDTerminalRuleCall_0_0ElementType() {
		return FragmentWithAction3_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_Group_1ElementType() {
		return FragmentWithAction3_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_NamedWithActionPrevAction_1_0ElementType() {
		return FragmentWithAction3_NamedWithActionPrevAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1ElementType() {
		return FragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_NameAssignment_1_2ElementType() {
		return FragmentWithAction3_NameAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_NameIDTerminalRuleCall_1_2_0ElementType() {
		return FragmentWithAction3_NameIDTerminalRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_Ref2Assignment_1_3ElementType() {
		return FragmentWithAction3_Ref2Assignment_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_Ref2NamedCrossReference_1_3_0ElementType() {
		return FragmentWithAction3_Ref2NamedCrossReference_1_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFragmentWithAction3_Ref2NamedIDTerminalRuleCall_1_3_0_1ElementType() {
		return FragmentWithAction3_Ref2NamedIDTerminalRuleCall_1_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedFragmentElementType() {
		return NamedFragment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedFragment_NameAssignmentElementType() {
		return NamedFragment_NameAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedFragment_NameIDTerminalRuleCall_0ElementType() {
		return NamedFragment_NameIDTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRefElementType() {
		return NamedRef_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRef_RefAssignmentElementType() {
		return NamedRef_RefAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRef_RefNamedCrossReference_0ElementType() {
		return NamedRef_RefNamedCrossReference_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedRef_RefNamedIDTerminalRuleCall_0_1ElementType() {
		return NamedRef_RefNamedIDTerminalRuleCall_0_1_ELEMENT_TYPE;
	}

}
