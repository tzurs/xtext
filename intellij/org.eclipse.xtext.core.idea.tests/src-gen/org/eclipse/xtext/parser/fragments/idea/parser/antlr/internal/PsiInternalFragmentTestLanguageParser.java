package org.eclipse.xtext.parser.fragments.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parser.fragments.idea.lang.FragmentTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalFragmentTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#1'", "'#2'", "'->'", "'#3'", "'#4'", "'#5'", "'#6'", "'#7'", "':'", "'-'", "'<-'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public PsiInternalFragmentTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalFragmentTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalFragmentTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g"; }



    	protected FragmentTestLanguageGrammarAccess grammarAccess;

    	protected FragmentTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalFragmentTestLanguageParser(PsiBuilder builder, TokenStream input, FragmentTestLanguageElementTypeProvider elementTypeProvider, FragmentTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "ParserRuleFragments";
    	}




    // $ANTLR start "entryRuleParserRuleFragments"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:52:1: entryRuleParserRuleFragments : ruleParserRuleFragments EOF ;
    public final void entryRuleParserRuleFragments() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:52:29: ( ruleParserRuleFragments EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:53:2: ruleParserRuleFragments EOF
            {
             markComposite(elementTypeProvider.getParserRuleFragmentsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRuleFragments_in_entryRuleParserRuleFragments54);
            ruleParserRuleFragments();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRuleFragments57); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParserRuleFragments"


    // $ANTLR start "ruleParserRuleFragments"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:58:1: ruleParserRuleFragments : ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) ) ;
    public final void ruleParserRuleFragments() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:58:24: ( ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:59:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:59:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:60:3: () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:60:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:61:4: 
            {

            				precedeComposite(elementTypeProvider.getParserRuleFragments_ParserRuleFragmentsAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:66:3: ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            case 18:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:67:4: (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:67:4: (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:68:5: otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitOneKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleParserRuleFragments102); 

                    					doneLeaf(otherlv_1);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:75:5: ( (lv_element_2_0= rulePRFNamed ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:76:6: (lv_element_2_0= rulePRFNamed )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:76:6: (lv_element_2_0= rulePRFNamed )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:77:7: lv_element_2_0= rulePRFNamed
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedParserRuleCall_1_0_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_ruleParserRuleFragments139);
                    rulePRFNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:88:4: (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:88:4: (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:89:5: otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitTwoKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParserRuleFragments193); 

                    					doneLeaf(otherlv_3);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:96:5: ( (lv_element_4_0= rulePRFNamed ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:97:6: (lv_element_4_0= rulePRFNamed )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:97:6: (lv_element_4_0= rulePRFNamed )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:98:7: lv_element_4_0= rulePRFNamed
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedParserRuleCall_1_1_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_ruleParserRuleFragments230);
                    rulePRFNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getParserRuleFragments_HyphenMinusGreaterThanSignKeyword_1_1_2ElementType());
                    				
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParserRuleFragments265); 

                    					doneLeaf(otherlv_5);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:114:5: ( (otherlv_6= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:115:6: (otherlv_6= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:115:6: (otherlv_6= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:116:7: otherlv_6= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getParserRuleFragments_RefPRFNamedCrossReference_1_1_3_0ElementType());
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRuleFragments302); 

                    							doneLeaf(otherlv_6);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:127:4: (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:127:4: (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:128:5: otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitThreeKeyword_1_2_0ElementType());
                    				
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParserRuleFragments356); 

                    					doneLeaf(otherlv_7);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:135:5: ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:136:6: (lv_element_8_0= rulePRFNamedRefFirst )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:136:6: (lv_element_8_0= rulePRFNamedRefFirst )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:137:7: lv_element_8_0= rulePRFNamedRefFirst
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedRefFirstParserRuleCall_1_2_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedRefFirst_in_ruleParserRuleFragments393);
                    rulePRFNamedRefFirst();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:148:4: (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:148:4: (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:149:5: otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitFourKeyword_1_3_0ElementType());
                    				
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParserRuleFragments447); 

                    					doneLeaf(otherlv_9);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:156:5: ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:157:6: (lv_element_10_0= rulePRFNamedWithAction )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:157:6: (lv_element_10_0= rulePRFNamedWithAction )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:158:7: lv_element_10_0= rulePRFNamedWithAction
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionParserRuleCall_1_3_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithAction_in_ruleParserRuleFragments484);
                    rulePRFNamedWithAction();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:169:4: (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:169:4: (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:170:5: otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitFiveKeyword_1_4_0ElementType());
                    				
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParserRuleFragments538); 

                    					doneLeaf(otherlv_11);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:177:5: ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:178:6: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:178:6: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:179:7: lv_element_12_0= rulePRFNamedWithActionInFragment
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragmentParserRuleCall_1_4_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment_in_ruleParserRuleFragments575);
                    rulePRFNamedWithActionInFragment();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:190:4: (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:190:4: (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:191:5: otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitSixKeyword_1_5_0ElementType());
                    				
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParserRuleFragments629); 

                    					doneLeaf(otherlv_13);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:198:5: ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:199:6: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:199:6: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:200:7: lv_element_14_0= rulePRFNamedWithActionInFragment2
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment2_in_ruleParserRuleFragments666);
                    rulePRFNamedWithActionInFragment2();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:211:4: (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:211:4: (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:212:5: otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitSevenKeyword_1_6_0ElementType());
                    				
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParserRuleFragments720); 

                    					doneLeaf(otherlv_15);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:219:5: ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:220:6: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:220:6: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:221:7: lv_element_16_0= rulePRFNamedWithActionInFragment3
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragment3ParserRuleCall_1_6_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment3_in_ruleParserRuleFragments757);
                    rulePRFNamedWithActionInFragment3();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParserRuleFragments"


    // $ANTLR start "entryRulePRFNamed"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:236:1: entryRulePRFNamed : rulePRFNamed EOF ;
    public final void entryRulePRFNamed() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:236:18: ( rulePRFNamed EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:237:2: rulePRFNamed EOF
            {
             markComposite(elementTypeProvider.getPRFNamedElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_entryRulePRFNamed803);
            rulePRFNamed();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamed806); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRFNamed"


    // $ANTLR start "rulePRFNamed"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:242:1: rulePRFNamed : ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? ) ;
    public final void rulePRFNamed() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:242:13: ( ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:243:2: ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:243:2: ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:244:3: rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamed_PRFNamedFragmentParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_rulePRFNamed823);
            rulePRFNamedFragment();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:251:3: ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:252:4: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:252:4: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:253:5: otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getPRFNamed_ColonKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePRFNamed850); 

                    					doneLeaf(otherlv_1);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:260:5: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:261:6: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:261:6: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:262:7: otherlv_2= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getPRFNamed_RefPRFNamedCrossReference_1_0_1_0ElementType());
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamed887); 

                    							doneLeaf(otherlv_2);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:273:4: (otherlv_3= '-' rulePRFNamedRef )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:273:4: (otherlv_3= '-' rulePRFNamedRef )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:274:5: otherlv_3= '-' rulePRFNamedRef
                    {

                    					markLeaf(elementTypeProvider.getPRFNamed_HyphenMinusKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamed941); 

                    					doneLeaf(otherlv_3);
                    				

                    					markComposite(elementTypeProvider.getPRFNamed_PRFNamedRefParserRuleCall_1_1_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedRef_in_rulePRFNamed959);
                    rulePRFNamedRef();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePRFNamed"


    // $ANTLR start "entryRulePRFNamedRefFirst"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:294:1: entryRulePRFNamedRefFirst : rulePRFNamedRefFirst EOF ;
    public final void entryRulePRFNamedRefFirst() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:294:26: ( rulePRFNamedRefFirst EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:295:2: rulePRFNamedRefFirst EOF
            {
             markComposite(elementTypeProvider.getPRFNamedRefFirstElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedRefFirst_in_entryRulePRFNamedRefFirst991);
            rulePRFNamedRefFirst();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedRefFirst994); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRFNamedRefFirst"


    // $ANTLR start "rulePRFNamedRefFirst"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:300:1: rulePRFNamedRefFirst : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment ) ;
    public final void rulePRFNamedRefFirst() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:300:21: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:301:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:301:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:302:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:302:3: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:303:4: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:303:4: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:304:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedRefFirst_RefPRFNamedCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedRefFirst1026); 

            					doneLeaf(otherlv_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getPRFNamedRefFirst_LessThanSignHyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePRFNamedRefFirst1051); 

            			doneLeaf(otherlv_1);
            		

            			markComposite(elementTypeProvider.getPRFNamedRefFirst_PRFNamedFragmentParserRuleCall_2ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_rulePRFNamedRefFirst1063);
            rulePRFNamedFragment();

            state._fsp--;


            			doneComposite();
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePRFNamedRefFirst"


    // $ANTLR start "entryRulePRFNamedWithAction"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:331:1: entryRulePRFNamedWithAction : rulePRFNamedWithAction EOF ;
    public final void entryRulePRFNamedWithAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:331:28: ( rulePRFNamedWithAction EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:332:2: rulePRFNamedWithAction EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithAction_in_entryRulePRFNamedWithAction1083);
            rulePRFNamedWithAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithAction1086); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRFNamedWithAction"


    // $ANTLR start "rulePRFNamedWithAction"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:337:1: rulePRFNamedWithAction : ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithAction() throws RecognitionException {
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:337:23: ( ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:338:2: ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:338:2: ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:339:3: rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithAction_PRFNamedParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_rulePRFNamedWithAction1103);
            rulePRFNamed();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:346:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:347:4: 
            {

            				precedeComposite(elementTypeProvider.getPRFNamedWithAction_PRFNamedWithActionPrevAction_1ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:352:3: ( (lv_name_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:353:4: (lv_name_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:353:4: (lv_name_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:354:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedWithAction_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction1143); 

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:363:3: ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:364:4: ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:364:4: ( (otherlv_3= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:365:5: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:365:5: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:366:6: otherlv_3= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithAction_RefPRFNamedCrossReference_3_0_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction1189); 

                    						doneLeaf(otherlv_3);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:375:4: ( (otherlv_4= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:376:5: (otherlv_4= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:376:5: (otherlv_4= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:377:6: otherlv_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithAction_Ref2PRFNamedCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction1234); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePRFNamedWithAction"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:391:1: entryRulePRFNamedWithActionInFragment : rulePRFNamedWithActionInFragment EOF ;
    public final void entryRulePRFNamedWithActionInFragment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:391:38: ( rulePRFNamedWithActionInFragment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:392:2: rulePRFNamedWithActionInFragment EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment_in_entryRulePRFNamedWithActionInFragment1273);
            rulePRFNamedWithActionInFragment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment1276); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRFNamedWithActionInFragment"


    // $ANTLR start "rulePRFNamedWithActionInFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:397:1: rulePRFNamedWithActionInFragment : ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:397:33: ( ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:398:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:398:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:399:3: ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_rulePRFNamedWithActionInFragment1293);
            ruleFragmentWithAction();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:406:3: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:407:4: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment1313); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:414:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:415:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:415:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:416:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment_RefPRFNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment1345); 

                    						doneLeaf(otherlv_2);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePRFNamedWithActionInFragment"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment2"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:430:1: entryRulePRFNamedWithActionInFragment2 : rulePRFNamedWithActionInFragment2 EOF ;
    public final void entryRulePRFNamedWithActionInFragment2() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:430:39: ( rulePRFNamedWithActionInFragment2 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:431:2: rulePRFNamedWithActionInFragment2 EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragment2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment2_in_entryRulePRFNamedWithActionInFragment21384);
            rulePRFNamedWithActionInFragment2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment21387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRFNamedWithActionInFragment2"


    // $ANTLR start "rulePRFNamedWithActionInFragment2"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:436:1: rulePRFNamedWithActionInFragment2 : ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment2() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:436:34: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:437:2: ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:437:2: ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:438:3: ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:438:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:439:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:439:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:440:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21419); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }


            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_rulePRFNamedWithActionInFragment21442);
            ruleFragmentWithAction2();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:456:3: (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:457:4: otherlv_2= '-' ( (otherlv_3= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_HyphenMinusKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment21462); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:464:4: ( (otherlv_3= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:465:5: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:465:5: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:466:6: otherlv_3= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_RefPRFNamedCrossReference_2_1_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21494); 

                    						doneLeaf(otherlv_3);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePRFNamedWithActionInFragment2"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment3"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:480:1: entryRulePRFNamedWithActionInFragment3 : rulePRFNamedWithActionInFragment3 EOF ;
    public final void entryRulePRFNamedWithActionInFragment3() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:480:39: ( rulePRFNamedWithActionInFragment3 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:481:2: rulePRFNamedWithActionInFragment3 EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragment3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment3_in_entryRulePRFNamedWithActionInFragment31533);
            rulePRFNamedWithActionInFragment3();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment31536); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRFNamedWithActionInFragment3"


    // $ANTLR start "rulePRFNamedWithActionInFragment3"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:486:1: rulePRFNamedWithActionInFragment3 : ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment3() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:486:34: ( ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:487:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:487:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:488:3: ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_rulePRFNamedWithActionInFragment31553);
            ruleFragmentWithAction3();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:495:3: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:496:4: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment3_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment31573); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:503:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:504:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:504:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:505:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment3_RefPRFNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment31605); 

                    						doneLeaf(otherlv_2);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePRFNamedWithActionInFragment3"


    // $ANTLR start "entryRuleFragmentWithAction"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:519:1: entryRuleFragmentWithAction : ruleFragmentWithAction EOF ;
    public final void entryRuleFragmentWithAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:519:28: ( ruleFragmentWithAction EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:520:2: ruleFragmentWithAction EOF
            {
             markComposite(elementTypeProvider.getFragmentWithActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_entryRuleFragmentWithAction1644);
            ruleFragmentWithAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction1647); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFragmentWithAction"


    // $ANTLR start "ruleFragmentWithAction"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:525:1: ruleFragmentWithAction : ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) ;
    public final void ruleFragmentWithAction() throws RecognitionException {
        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:525:23: ( ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:526:2: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:526:2: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:527:3: ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:527:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:528:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:528:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:529:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1679); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:538:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:539:4: 
            {

            				precedeComposite(elementTypeProvider.getFragmentWithAction_PRFNamedWithActionPrevAction_1ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:544:3: ( (lv_name_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:545:4: (lv_name_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:545:4: (lv_name_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:546:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1730); 

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:555:3: ( (otherlv_3= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:556:4: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:556:4: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:557:5: otherlv_3= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getFragmentWithAction_Ref2PRFNamedCrossReference_3_0ElementType());
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1768); 

                    					doneLeaf(otherlv_3);
                    				

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleFragmentWithAction"


    // $ANTLR start "entryRuleFragmentWithAction2"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:570:1: entryRuleFragmentWithAction2 : ruleFragmentWithAction2 EOF ;
    public final void entryRuleFragmentWithAction2() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:570:29: ( ruleFragmentWithAction2 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:571:2: ruleFragmentWithAction2 EOF
            {
             markComposite(elementTypeProvider.getFragmentWithAction2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_entryRuleFragmentWithAction21800);
            ruleFragmentWithAction2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction21803); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFragmentWithAction2"


    // $ANTLR start "ruleFragmentWithAction2"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:576:1: ruleFragmentWithAction2 : ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) ;
    public final void ruleFragmentWithAction2() throws RecognitionException {
        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:576:24: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:577:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:577:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:578:3: () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:578:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:579:4: 
            {

            				precedeComposite(elementTypeProvider.getFragmentWithAction2_PRFNamedWithActionPrevAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:584:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:585:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:585:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:586:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction2_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction21848); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:595:3: ( (otherlv_2= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:596:4: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:596:4: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:597:5: otherlv_2= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getFragmentWithAction2_Ref2PRFNamedCrossReference_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction21886); 

                    					doneLeaf(otherlv_2);
                    				

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleFragmentWithAction2"


    // $ANTLR start "entryRuleFragmentWithAction3"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:610:1: entryRuleFragmentWithAction3 : ruleFragmentWithAction3 EOF ;
    public final void entryRuleFragmentWithAction3() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:610:29: ( ruleFragmentWithAction3 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:611:2: ruleFragmentWithAction3 EOF
            {
             markComposite(elementTypeProvider.getFragmentWithAction3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_entryRuleFragmentWithAction31918);
            ruleFragmentWithAction3();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction31921); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFragmentWithAction3"


    // $ANTLR start "ruleFragmentWithAction3"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:616:1: ruleFragmentWithAction3 : ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) ;
    public final void ruleFragmentWithAction3() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:616:24: ( ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:617:2: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:617:2: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:618:3: ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:618:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:619:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:619:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:620:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction31953); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:629:3: ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:630:4: () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )?
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:630:4: ()
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:631:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getFragmentWithAction3_PRFNamedWithActionPrevAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getFragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFragmentWithAction32000); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:643:4: ( (lv_name_3_0= RULE_ID ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:644:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:644:5: (lv_name_3_0= RULE_ID )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:645:6: lv_name_3_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_1_2_0ElementType());
            	    					
            	    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction32032); 

            	    						doneLeaf(lv_name_3_0);
            	    					

            	    }


            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:654:4: ( (otherlv_4= RULE_ID ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:655:5: (otherlv_4= RULE_ID )
            	            {
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:655:5: (otherlv_4= RULE_ID )
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:656:6: otherlv_4= RULE_ID
            	            {

            	            						markLeaf(elementTypeProvider.getFragmentWithAction3_Ref2PRFNamedCrossReference_1_3_0ElementType());
            	            					
            	            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction32077); 

            	            						doneLeaf(otherlv_4);
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleFragmentWithAction3"


    // $ANTLR start "entryRulePRFNamedFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:670:1: entryRulePRFNamedFragment : rulePRFNamedFragment EOF ;
    public final void entryRulePRFNamedFragment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:670:26: ( rulePRFNamedFragment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:671:2: rulePRFNamedFragment EOF
            {
             markComposite(elementTypeProvider.getPRFNamedFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_entryRulePRFNamedFragment2117);
            rulePRFNamedFragment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedFragment2120); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRFNamedFragment"


    // $ANTLR start "rulePRFNamedFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:676:1: rulePRFNamedFragment : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void rulePRFNamedFragment() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:676:21: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:677:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:677:2: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:678:3: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:678:3: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:679:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getPRFNamedFragment_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedFragment2145); 

            				doneLeaf(lv_name_0_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePRFNamedFragment"


    // $ANTLR start "entryRulePRFNamedRef"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:691:1: entryRulePRFNamedRef : rulePRFNamedRef EOF ;
    public final void entryRulePRFNamedRef() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:691:21: ( rulePRFNamedRef EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:692:2: rulePRFNamedRef EOF
            {
             markComposite(elementTypeProvider.getPRFNamedRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedRef_in_entryRulePRFNamedRef2170);
            rulePRFNamedRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedRef2173); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRFNamedRef"


    // $ANTLR start "rulePRFNamedRef"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:697:1: rulePRFNamedRef : ( (otherlv_0= RULE_ID ) ) ;
    public final void rulePRFNamedRef() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:697:16: ( ( (otherlv_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:698:2: ( (otherlv_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:698:2: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:699:3: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:699:3: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:700:4: otherlv_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getPRFNamedRef_RefPRFNamedCrossReference_0ElementType());
            			
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedRef2198); 

            				doneLeaf(otherlv_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePRFNamedRef"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleParserRuleFragments_in_entryRuleParserRuleFragments54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRuleFragments57 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleParserRuleFragments102 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamed_in_ruleParserRuleFragments139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleParserRuleFragments193 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamed_in_ruleParserRuleFragments230 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParserRuleFragments265 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRuleFragments302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleParserRuleFragments356 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedRefFirst_in_ruleParserRuleFragments393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParserRuleFragments447 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithAction_in_ruleParserRuleFragments484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleParserRuleFragments538 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment_in_ruleParserRuleFragments575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleParserRuleFragments629 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment2_in_ruleParserRuleFragments666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleParserRuleFragments720 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment3_in_ruleParserRuleFragments757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamed_in_entryRulePRFNamed803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamed806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_rulePRFNamed823 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_rulePRFNamed850 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamed887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamed941 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedRef_in_rulePRFNamed959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedRefFirst_in_entryRulePRFNamedRefFirst991 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedRefFirst994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedRefFirst1026 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePRFNamedRefFirst1051 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_rulePRFNamedRefFirst1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithAction_in_entryRulePRFNamedWithAction1083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithAction1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamed_in_rulePRFNamedWithAction1103 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction1143 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction1189 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment_in_entryRulePRFNamedWithActionInFragment1273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_rulePRFNamedWithActionInFragment1293 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment1313 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment2_in_entryRulePRFNamedWithActionInFragment21384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment21387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21419 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_rulePRFNamedWithActionInFragment21442 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment21462 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment3_in_entryRulePRFNamedWithActionInFragment31533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment31536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_rulePRFNamedWithActionInFragment31553 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment31573 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment31605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_entryRuleFragmentWithAction1644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction1647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1679 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1730 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_entryRuleFragmentWithAction21800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction21803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21848 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_entryRuleFragmentWithAction31918 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction31921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31953 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleFragmentWithAction32000 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction32032 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction32077 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_entryRulePRFNamedFragment2117 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedFragment2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedFragment2145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedRef_in_entryRulePRFNamedRef2170 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedRef2173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedRef2198 = new BitSet(new long[]{0x0000000000000002L});
    }


}