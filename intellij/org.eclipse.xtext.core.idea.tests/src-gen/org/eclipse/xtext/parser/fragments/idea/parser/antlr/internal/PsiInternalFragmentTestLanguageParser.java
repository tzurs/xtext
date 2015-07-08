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
    		return "Fragments";
    	}




    // $ANTLR start "entryRuleFragments"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:52:1: entryRuleFragments : ruleFragments EOF ;
    public final void entryRuleFragments() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:52:19: ( ruleFragments EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:53:2: ruleFragments EOF
            {
             markComposite(elementTypeProvider.getFragmentsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragments_in_entryRuleFragments54);
            ruleFragments();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragments57); 

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
    // $ANTLR end "entryRuleFragments"


    // $ANTLR start "ruleFragments"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:58:1: ruleFragments : ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) ) ;
    public final void ruleFragments() throws RecognitionException {
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
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:58:14: ( ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:59:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:59:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:60:3: () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:60:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:61:4: 
            {

            				precedeComposite(elementTypeProvider.getFragments_FragmentsAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:66:3: ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) )
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
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:67:4: (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:67:4: (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:68:5: otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitOneKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFragments102); 

                    					doneLeaf(otherlv_1);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:75:5: ( (lv_element_2_0= ruleNamed ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:76:6: (lv_element_2_0= ruleNamed )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:76:6: (lv_element_2_0= ruleNamed )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:77:7: lv_element_2_0= ruleNamed
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedParserRuleCall_1_0_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleFragments139);
                    ruleNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:88:4: (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:88:4: (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:89:5: otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitTwoKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFragments193); 

                    					doneLeaf(otherlv_3);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:96:5: ( (lv_element_4_0= ruleNamed ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:97:6: (lv_element_4_0= ruleNamed )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:97:6: (lv_element_4_0= ruleNamed )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:98:7: lv_element_4_0= ruleNamed
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedParserRuleCall_1_1_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleFragments230);
                    ruleNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getFragments_HyphenMinusGreaterThanSignKeyword_1_1_2ElementType());
                    				
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFragments265); 

                    					doneLeaf(otherlv_5);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:114:5: ( (otherlv_6= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:115:6: (otherlv_6= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:115:6: (otherlv_6= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:116:7: otherlv_6= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getFragments_RefNamedCrossReference_1_1_3_0ElementType());
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragments302); 

                    							doneLeaf(otherlv_6);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:127:4: (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:127:4: (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:128:5: otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitThreeKeyword_1_2_0ElementType());
                    				
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFragments356); 

                    					doneLeaf(otherlv_7);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:135:5: ( (lv_element_8_0= ruleNamedRefFirst ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:136:6: (lv_element_8_0= ruleNamedRefFirst )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:136:6: (lv_element_8_0= ruleNamedRefFirst )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:137:7: lv_element_8_0= ruleNamedRefFirst
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedRefFirstParserRuleCall_1_2_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedRefFirst_in_ruleFragments393);
                    ruleNamedRefFirst();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:148:4: (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:148:4: (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:149:5: otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitFourKeyword_1_3_0ElementType());
                    				
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFragments447); 

                    					doneLeaf(otherlv_9);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:156:5: ( (lv_element_10_0= ruleNamedWithAction ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:157:6: (lv_element_10_0= ruleNamedWithAction )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:157:6: (lv_element_10_0= ruleNamedWithAction )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:158:7: lv_element_10_0= ruleNamedWithAction
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedWithActionParserRuleCall_1_3_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithAction_in_ruleFragments484);
                    ruleNamedWithAction();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:169:4: (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:169:4: (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:170:5: otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitFiveKeyword_1_4_0ElementType());
                    				
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFragments538); 

                    					doneLeaf(otherlv_11);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:177:5: ( (lv_element_12_0= ruleNamedWithActionInFragment ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:178:6: (lv_element_12_0= ruleNamedWithActionInFragment )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:178:6: (lv_element_12_0= ruleNamedWithActionInFragment )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:179:7: lv_element_12_0= ruleNamedWithActionInFragment
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedWithActionInFragmentParserRuleCall_1_4_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment_in_ruleFragments575);
                    ruleNamedWithActionInFragment();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:190:4: (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:190:4: (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:191:5: otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitSixKeyword_1_5_0ElementType());
                    				
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFragments629); 

                    					doneLeaf(otherlv_13);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:198:5: ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:199:6: (lv_element_14_0= ruleNamedWithActionInFragment2 )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:199:6: (lv_element_14_0= ruleNamedWithActionInFragment2 )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:200:7: lv_element_14_0= ruleNamedWithActionInFragment2
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment2_in_ruleFragments666);
                    ruleNamedWithActionInFragment2();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:211:4: (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:211:4: (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:212:5: otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitSevenKeyword_1_6_0ElementType());
                    				
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFragments720); 

                    					doneLeaf(otherlv_15);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:219:5: ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:220:6: (lv_element_16_0= ruleNamedWithActionInFragment3 )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:220:6: (lv_element_16_0= ruleNamedWithActionInFragment3 )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:221:7: lv_element_16_0= ruleNamedWithActionInFragment3
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment3_in_ruleFragments757);
                    ruleNamedWithActionInFragment3();

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
    // $ANTLR end "ruleFragments"


    // $ANTLR start "entryRuleNamed"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:236:1: entryRuleNamed : ruleNamed EOF ;
    public final void entryRuleNamed() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:236:15: ( ruleNamed EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:237:2: ruleNamed EOF
            {
             markComposite(elementTypeProvider.getNamedElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamed_in_entryRuleNamed803);
            ruleNamed();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamed806); 

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
    // $ANTLR end "entryRuleNamed"


    // $ANTLR start "ruleNamed"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:242:1: ruleNamed : ( ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )? ) ;
    public final void ruleNamed() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:242:10: ( ( ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:243:2: ( ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:243:2: ( ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:244:3: ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )?
            {

            			markComposite(elementTypeProvider.getNamed_NamedFragmentParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_ruleNamed823);
            ruleNamedFragment();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:251:3: ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )?
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

                    					markLeaf(elementTypeProvider.getNamed_ColonKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNamed850); 

                    					doneLeaf(otherlv_1);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:260:5: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:261:6: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:261:6: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:262:7: otherlv_2= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getNamed_RefNamedCrossReference_1_0_1_0ElementType());
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamed887); 

                    							doneLeaf(otherlv_2);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:273:4: (otherlv_3= '-' ruleNamedRef )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:273:4: (otherlv_3= '-' ruleNamedRef )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:274:5: otherlv_3= '-' ruleNamedRef
                    {

                    					markLeaf(elementTypeProvider.getNamed_HyphenMinusKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamed941); 

                    					doneLeaf(otherlv_3);
                    				

                    					markComposite(elementTypeProvider.getNamed_NamedRefParserRuleCall_1_1_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_ruleNamedRef_in_ruleNamed959);
                    ruleNamedRef();

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
    // $ANTLR end "ruleNamed"


    // $ANTLR start "entryRuleNamedRefFirst"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:294:1: entryRuleNamedRefFirst : ruleNamedRefFirst EOF ;
    public final void entryRuleNamedRefFirst() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:294:23: ( ruleNamedRefFirst EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:295:2: ruleNamedRefFirst EOF
            {
             markComposite(elementTypeProvider.getNamedRefFirstElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedRefFirst_in_entryRuleNamedRefFirst991);
            ruleNamedRefFirst();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedRefFirst994); 

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
    // $ANTLR end "entryRuleNamedRefFirst"


    // $ANTLR start "ruleNamedRefFirst"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:300:1: ruleNamedRefFirst : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment ) ;
    public final void ruleNamedRefFirst() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:300:18: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:301:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:301:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:302:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:302:3: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:303:4: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:303:4: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:304:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNamedRefFirst_RefNamedCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedRefFirst1026); 

            					doneLeaf(otherlv_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getNamedRefFirst_LessThanSignHyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNamedRefFirst1051); 

            			doneLeaf(otherlv_1);
            		

            			markComposite(elementTypeProvider.getNamedRefFirst_NamedFragmentParserRuleCall_2ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_ruleNamedRefFirst1063);
            ruleNamedFragment();

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
    // $ANTLR end "ruleNamedRefFirst"


    // $ANTLR start "entryRuleNamedWithAction"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:331:1: entryRuleNamedWithAction : ruleNamedWithAction EOF ;
    public final void entryRuleNamedWithAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:331:25: ( ruleNamedWithAction EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:332:2: ruleNamedWithAction EOF
            {
             markComposite(elementTypeProvider.getNamedWithActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithAction_in_entryRuleNamedWithAction1083);
            ruleNamedWithAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithAction1086); 

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
    // $ANTLR end "entryRuleNamedWithAction"


    // $ANTLR start "ruleNamedWithAction"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:337:1: ruleNamedWithAction : ( ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final void ruleNamedWithAction() throws RecognitionException {
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:337:20: ( ( ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:338:2: ( ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:338:2: ( ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:339:3: ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getNamedWithAction_NamedParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleNamedWithAction1103);
            ruleNamed();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:346:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:347:4: 
            {

            				precedeComposite(elementTypeProvider.getNamedWithAction_NamedWithActionPrevAction_1ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:352:3: ( (lv_name_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:353:4: (lv_name_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:353:4: (lv_name_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:354:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNamedWithAction_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction1143); 

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

                    						markLeaf(elementTypeProvider.getNamedWithAction_RefNamedCrossReference_3_0_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction1189); 

                    						doneLeaf(otherlv_3);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:375:4: ( (otherlv_4= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:376:5: (otherlv_4= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:376:5: (otherlv_4= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:377:6: otherlv_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedWithAction_Ref2NamedCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction1234); 

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
    // $ANTLR end "ruleNamedWithAction"


    // $ANTLR start "entryRuleNamedWithActionInFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:391:1: entryRuleNamedWithActionInFragment : ruleNamedWithActionInFragment EOF ;
    public final void entryRuleNamedWithActionInFragment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:391:35: ( ruleNamedWithActionInFragment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:392:2: ruleNamedWithActionInFragment EOF
            {
             markComposite(elementTypeProvider.getNamedWithActionInFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment_in_entryRuleNamedWithActionInFragment1273);
            ruleNamedWithActionInFragment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment1276); 

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
    // $ANTLR end "entryRuleNamedWithActionInFragment"


    // $ANTLR start "ruleNamedWithActionInFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:397:1: ruleNamedWithActionInFragment : ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void ruleNamedWithActionInFragment() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:397:30: ( ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:398:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:398:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:399:3: ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_ruleNamedWithActionInFragment1293);
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

                    				markLeaf(elementTypeProvider.getNamedWithActionInFragment_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment1313); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:414:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:415:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:415:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:416:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedWithActionInFragment_RefNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment1345); 

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
    // $ANTLR end "ruleNamedWithActionInFragment"


    // $ANTLR start "entryRuleNamedWithActionInFragment2"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:430:1: entryRuleNamedWithActionInFragment2 : ruleNamedWithActionInFragment2 EOF ;
    public final void entryRuleNamedWithActionInFragment2() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:430:36: ( ruleNamedWithActionInFragment2 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:431:2: ruleNamedWithActionInFragment2 EOF
            {
             markComposite(elementTypeProvider.getNamedWithActionInFragment2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment2_in_entryRuleNamedWithActionInFragment21384);
            ruleNamedWithActionInFragment2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment21387); 

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
    // $ANTLR end "entryRuleNamedWithActionInFragment2"


    // $ANTLR start "ruleNamedWithActionInFragment2"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:436:1: ruleNamedWithActionInFragment2 : ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final void ruleNamedWithActionInFragment2() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:436:31: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) )
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

            					markLeaf(elementTypeProvider.getNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21419); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }


            			markComposite(elementTypeProvider.getNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_ruleNamedWithActionInFragment21442);
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

                    				markLeaf(elementTypeProvider.getNamedWithActionInFragment2_HyphenMinusKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment21462); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:464:4: ( (otherlv_3= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:465:5: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:465:5: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:466:6: otherlv_3= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedWithActionInFragment2_RefNamedCrossReference_2_1_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21494); 

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
    // $ANTLR end "ruleNamedWithActionInFragment2"


    // $ANTLR start "entryRuleNamedWithActionInFragment3"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:480:1: entryRuleNamedWithActionInFragment3 : ruleNamedWithActionInFragment3 EOF ;
    public final void entryRuleNamedWithActionInFragment3() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:480:36: ( ruleNamedWithActionInFragment3 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:481:2: ruleNamedWithActionInFragment3 EOF
            {
             markComposite(elementTypeProvider.getNamedWithActionInFragment3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment3_in_entryRuleNamedWithActionInFragment31533);
            ruleNamedWithActionInFragment3();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment31536); 

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
    // $ANTLR end "entryRuleNamedWithActionInFragment3"


    // $ANTLR start "ruleNamedWithActionInFragment3"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:486:1: ruleNamedWithActionInFragment3 : ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void ruleNamedWithActionInFragment3() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:486:31: ( ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:487:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:487:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:488:3: ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_ruleNamedWithActionInFragment31553);
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

                    				markLeaf(elementTypeProvider.getNamedWithActionInFragment3_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment31573); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:503:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:504:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:504:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:505:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedWithActionInFragment3_RefNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment31605); 

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
    // $ANTLR end "ruleNamedWithActionInFragment3"


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

            				precedeComposite(elementTypeProvider.getFragmentWithAction_NamedWithActionPrevAction_1ElementType());
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

                    					markLeaf(elementTypeProvider.getFragmentWithAction_Ref2NamedCrossReference_3_0ElementType());
                    				
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

            				precedeComposite(elementTypeProvider.getFragmentWithAction2_NamedWithActionPrevAction_0ElementType());
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

                    					markLeaf(elementTypeProvider.getFragmentWithAction2_Ref2NamedCrossReference_2_0ElementType());
                    				
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

            	    					precedeComposite(elementTypeProvider.getFragmentWithAction3_NamedWithActionPrevAction_1_0ElementType());
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

            	            						markLeaf(elementTypeProvider.getFragmentWithAction3_Ref2NamedCrossReference_1_3_0ElementType());
            	            					
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


    // $ANTLR start "entryRuleNamedFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:670:1: entryRuleNamedFragment : ruleNamedFragment EOF ;
    public final void entryRuleNamedFragment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:670:23: ( ruleNamedFragment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:671:2: ruleNamedFragment EOF
            {
             markComposite(elementTypeProvider.getNamedFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_entryRuleNamedFragment2117);
            ruleNamedFragment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedFragment2120); 

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
    // $ANTLR end "entryRuleNamedFragment"


    // $ANTLR start "ruleNamedFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:676:1: ruleNamedFragment : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleNamedFragment() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:676:18: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:677:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:677:2: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:678:3: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:678:3: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:679:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getNamedFragment_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedFragment2145); 

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
    // $ANTLR end "ruleNamedFragment"


    // $ANTLR start "entryRuleNamedRef"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:691:1: entryRuleNamedRef : ruleNamedRef EOF ;
    public final void entryRuleNamedRef() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:691:18: ( ruleNamedRef EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:692:2: ruleNamedRef EOF
            {
             markComposite(elementTypeProvider.getNamedRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedRef_in_entryRuleNamedRef2170);
            ruleNamedRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedRef2173); 

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
    // $ANTLR end "entryRuleNamedRef"


    // $ANTLR start "ruleNamedRef"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:697:1: ruleNamedRef : ( (otherlv_0= RULE_ID ) ) ;
    public final void ruleNamedRef() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:697:13: ( ( (otherlv_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:698:2: ( (otherlv_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:698:2: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:699:3: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:699:3: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguage.g:700:4: otherlv_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getNamedRef_RefNamedCrossReference_0ElementType());
            			
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedRef2198); 

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
    // $ANTLR end "ruleNamedRef"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFragments_in_entryRuleFragments54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragments57 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFragments102 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleFragments139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleFragments193 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleFragments230 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFragments265 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragments302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleFragments356 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedRefFirst_in_ruleFragments393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleFragments447 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithAction_in_ruleFragments484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleFragments538 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment_in_ruleFragments575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleFragments629 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment2_in_ruleFragments666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleFragments720 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment3_in_ruleFragments757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamed_in_entryRuleNamed803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamed806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedFragment_in_ruleNamed823 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_ruleNamed850 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamed887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNamed941 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedRef_in_ruleNamed959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedRefFirst_in_entryRuleNamedRefFirst991 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedRefFirst994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedRefFirst1026 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleNamedRefFirst1051 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedFragment_in_ruleNamedRefFirst1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithAction_in_entryRuleNamedWithAction1083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithAction1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleNamedWithAction1103 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction1143 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction1189 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment_in_entryRuleNamedWithActionInFragment1273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_ruleNamedWithActionInFragment1293 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment1313 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment2_in_entryRuleNamedWithActionInFragment21384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment21387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21419 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_ruleNamedWithActionInFragment21442 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment21462 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment3_in_entryRuleNamedWithActionInFragment31533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment31536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_ruleNamedWithActionInFragment31553 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment31573 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment31605 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleNamedFragment_in_entryRuleNamedFragment2117 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedFragment2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedFragment2145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedRef_in_entryRuleNamedRef2170 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedRef2173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedRef2198 = new BitSet(new long[]{0x0000000000000002L});
    }


}