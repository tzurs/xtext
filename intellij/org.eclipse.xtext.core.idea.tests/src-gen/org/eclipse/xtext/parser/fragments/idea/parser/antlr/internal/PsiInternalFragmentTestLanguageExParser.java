package org.eclipse.xtext.parser.fragments.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parser.fragments.idea.lang.FragmentTestLanguageExElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageExGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalFragmentTestLanguageExParser extends AbstractPsiAntlrParser {
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


        public PsiInternalFragmentTestLanguageExParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalFragmentTestLanguageExParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalFragmentTestLanguageExParser.tokenNames; }
    public String getGrammarFileName() { return "../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g"; }



    	protected FragmentTestLanguageExGrammarAccess grammarAccess;

    	protected FragmentTestLanguageExElementTypeProvider elementTypeProvider;

    	public PsiInternalFragmentTestLanguageExParser(PsiBuilder builder, TokenStream input, FragmentTestLanguageExElementTypeProvider elementTypeProvider, FragmentTestLanguageExGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "ParserRuleFragmentsEx";
    	}




    // $ANTLR start "entryRuleParserRuleFragmentsEx"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:52:1: entryRuleParserRuleFragmentsEx : ruleParserRuleFragmentsEx EOF ;
    public final void entryRuleParserRuleFragmentsEx() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:52:31: ( ruleParserRuleFragmentsEx EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:53:2: ruleParserRuleFragmentsEx EOF
            {
             markComposite(elementTypeProvider.getParserRuleFragmentsExElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRuleFragmentsEx_in_entryRuleParserRuleFragmentsEx54);
            ruleParserRuleFragmentsEx();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRuleFragmentsEx57); 

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
    // $ANTLR end "entryRuleParserRuleFragmentsEx"


    // $ANTLR start "ruleParserRuleFragmentsEx"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:58:1: ruleParserRuleFragmentsEx : ruleParserRuleFragments ;
    public final void ruleParserRuleFragmentsEx() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:58:26: ( ruleParserRuleFragments )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:59:2: ruleParserRuleFragments
            {

            		markComposite(elementTypeProvider.getParserRuleFragmentsEx_ParserRuleFragmentsParserRuleCallElementType());
            	
            pushFollow(FollowSets000.FOLLOW_ruleParserRuleFragments_in_ruleParserRuleFragmentsEx69);
            ruleParserRuleFragments();

            state._fsp--;


            		doneComposite();
            	

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
    // $ANTLR end "ruleParserRuleFragmentsEx"


    // $ANTLR start "entryRuleParserRuleFragments"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:69:1: entryRuleParserRuleFragments : ruleParserRuleFragments EOF ;
    public final void entryRuleParserRuleFragments() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:69:29: ( ruleParserRuleFragments EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:70:2: ruleParserRuleFragments EOF
            {
             markComposite(elementTypeProvider.getParserRuleFragmentsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRuleFragments_in_entryRuleParserRuleFragments85);
            ruleParserRuleFragments();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRuleFragments88); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:75:1: ruleParserRuleFragments : ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) ) ;
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
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:75:24: ( ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:76:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:76:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:77:3: () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:77:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:78:4: 
            {

            				precedeComposite(elementTypeProvider.getParserRuleFragments_ParserRuleFragmentsAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:83:3: ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) )
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
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:84:4: (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:84:4: (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:85:5: otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitOneKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleParserRuleFragments133); 

                    					doneLeaf(otherlv_1);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:92:5: ( (lv_element_2_0= rulePRFNamed ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:93:6: (lv_element_2_0= rulePRFNamed )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:93:6: (lv_element_2_0= rulePRFNamed )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:94:7: lv_element_2_0= rulePRFNamed
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedParserRuleCall_1_0_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_ruleParserRuleFragments170);
                    rulePRFNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:105:4: (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:105:4: (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:106:5: otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitTwoKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParserRuleFragments224); 

                    					doneLeaf(otherlv_3);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:113:5: ( (lv_element_4_0= rulePRFNamed ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:114:6: (lv_element_4_0= rulePRFNamed )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:114:6: (lv_element_4_0= rulePRFNamed )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:115:7: lv_element_4_0= rulePRFNamed
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedParserRuleCall_1_1_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_ruleParserRuleFragments261);
                    rulePRFNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getParserRuleFragments_HyphenMinusGreaterThanSignKeyword_1_1_2ElementType());
                    				
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParserRuleFragments296); 

                    					doneLeaf(otherlv_5);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:131:5: ( (otherlv_6= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:132:6: (otherlv_6= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:132:6: (otherlv_6= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:133:7: otherlv_6= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getParserRuleFragments_RefPRFNamedCrossReference_1_1_3_0ElementType());
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRuleFragments333); 

                    							doneLeaf(otherlv_6);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:144:4: (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:144:4: (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:145:5: otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitThreeKeyword_1_2_0ElementType());
                    				
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParserRuleFragments387); 

                    					doneLeaf(otherlv_7);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:152:5: ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:153:6: (lv_element_8_0= rulePRFNamedRefFirst )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:153:6: (lv_element_8_0= rulePRFNamedRefFirst )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:154:7: lv_element_8_0= rulePRFNamedRefFirst
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedRefFirstParserRuleCall_1_2_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedRefFirst_in_ruleParserRuleFragments424);
                    rulePRFNamedRefFirst();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:165:4: (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:165:4: (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:166:5: otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitFourKeyword_1_3_0ElementType());
                    				
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParserRuleFragments478); 

                    					doneLeaf(otherlv_9);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:173:5: ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:174:6: (lv_element_10_0= rulePRFNamedWithAction )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:174:6: (lv_element_10_0= rulePRFNamedWithAction )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:175:7: lv_element_10_0= rulePRFNamedWithAction
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionParserRuleCall_1_3_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithAction_in_ruleParserRuleFragments515);
                    rulePRFNamedWithAction();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:186:4: (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:186:4: (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:187:5: otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitFiveKeyword_1_4_0ElementType());
                    				
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParserRuleFragments569); 

                    					doneLeaf(otherlv_11);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:194:5: ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:195:6: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:195:6: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:196:7: lv_element_12_0= rulePRFNamedWithActionInFragment
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragmentParserRuleCall_1_4_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment_in_ruleParserRuleFragments606);
                    rulePRFNamedWithActionInFragment();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:207:4: (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:207:4: (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:208:5: otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitSixKeyword_1_5_0ElementType());
                    				
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParserRuleFragments660); 

                    					doneLeaf(otherlv_13);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:215:5: ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:216:6: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:216:6: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:217:7: lv_element_14_0= rulePRFNamedWithActionInFragment2
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment2_in_ruleParserRuleFragments697);
                    rulePRFNamedWithActionInFragment2();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:228:4: (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:228:4: (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:229:5: otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitSevenKeyword_1_6_0ElementType());
                    				
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParserRuleFragments751); 

                    					doneLeaf(otherlv_15);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:236:5: ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:237:6: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:237:6: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:238:7: lv_element_16_0= rulePRFNamedWithActionInFragment3
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragment3ParserRuleCall_1_6_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment3_in_ruleParserRuleFragments788);
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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:253:1: entryRulePRFNamed : rulePRFNamed EOF ;
    public final void entryRulePRFNamed() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:253:18: ( rulePRFNamed EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:254:2: rulePRFNamed EOF
            {
             markComposite(elementTypeProvider.getPRFNamedElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_entryRulePRFNamed834);
            rulePRFNamed();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamed837); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:259:1: rulePRFNamed : ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? ) ;
    public final void rulePRFNamed() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:259:13: ( ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:260:2: ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:260:2: ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:261:3: rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamed_PRFNamedFragmentParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_rulePRFNamed854);
            rulePRFNamedFragment();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:268:3: ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )?
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
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:269:4: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:269:4: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:270:5: otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getPRFNamed_ColonKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePRFNamed881); 

                    					doneLeaf(otherlv_1);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:277:5: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:278:6: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:278:6: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:279:7: otherlv_2= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getPRFNamed_RefPRFNamedCrossReference_1_0_1_0ElementType());
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamed918); 

                    							doneLeaf(otherlv_2);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:290:4: (otherlv_3= '-' rulePRFNamedRef )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:290:4: (otherlv_3= '-' rulePRFNamedRef )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:291:5: otherlv_3= '-' rulePRFNamedRef
                    {

                    					markLeaf(elementTypeProvider.getPRFNamed_HyphenMinusKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamed972); 

                    					doneLeaf(otherlv_3);
                    				

                    					markComposite(elementTypeProvider.getPRFNamed_PRFNamedRefParserRuleCall_1_1_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedRef_in_rulePRFNamed990);
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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:311:1: entryRulePRFNamedRefFirst : rulePRFNamedRefFirst EOF ;
    public final void entryRulePRFNamedRefFirst() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:311:26: ( rulePRFNamedRefFirst EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:312:2: rulePRFNamedRefFirst EOF
            {
             markComposite(elementTypeProvider.getPRFNamedRefFirstElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedRefFirst_in_entryRulePRFNamedRefFirst1022);
            rulePRFNamedRefFirst();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedRefFirst1025); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:317:1: rulePRFNamedRefFirst : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment ) ;
    public final void rulePRFNamedRefFirst() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:317:21: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:318:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:318:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:319:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:319:3: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:320:4: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:320:4: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:321:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedRefFirst_RefPRFNamedCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedRefFirst1057); 

            					doneLeaf(otherlv_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getPRFNamedRefFirst_LessThanSignHyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePRFNamedRefFirst1082); 

            			doneLeaf(otherlv_1);
            		

            			markComposite(elementTypeProvider.getPRFNamedRefFirst_PRFNamedFragmentParserRuleCall_2ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_rulePRFNamedRefFirst1094);
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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:348:1: entryRulePRFNamedWithAction : rulePRFNamedWithAction EOF ;
    public final void entryRulePRFNamedWithAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:348:28: ( rulePRFNamedWithAction EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:349:2: rulePRFNamedWithAction EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithAction_in_entryRulePRFNamedWithAction1114);
            rulePRFNamedWithAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithAction1117); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:354:1: rulePRFNamedWithAction : ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithAction() throws RecognitionException {
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:354:23: ( ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:355:2: ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:355:2: ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:356:3: rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithAction_PRFNamedParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_rulePRFNamedWithAction1134);
            rulePRFNamed();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:363:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:364:4: 
            {

            				precedeComposite(elementTypeProvider.getPRFNamedWithAction_PRFNamedWithActionPrevAction_1ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:369:3: ( (lv_name_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:370:4: (lv_name_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:370:4: (lv_name_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:371:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedWithAction_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction1174); 

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:380:3: ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:381:4: ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:381:4: ( (otherlv_3= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:382:5: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:382:5: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:383:6: otherlv_3= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithAction_RefPRFNamedCrossReference_3_0_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction1220); 

                    						doneLeaf(otherlv_3);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:392:4: ( (otherlv_4= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:393:5: (otherlv_4= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:393:5: (otherlv_4= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:394:6: otherlv_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithAction_Ref2PRFNamedCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction1265); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:408:1: entryRulePRFNamedWithActionInFragment : rulePRFNamedWithActionInFragment EOF ;
    public final void entryRulePRFNamedWithActionInFragment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:408:38: ( rulePRFNamedWithActionInFragment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:409:2: rulePRFNamedWithActionInFragment EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment_in_entryRulePRFNamedWithActionInFragment1304);
            rulePRFNamedWithActionInFragment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment1307); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:414:1: rulePRFNamedWithActionInFragment : ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:414:33: ( ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:415:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:415:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:416:3: ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_rulePRFNamedWithActionInFragment1324);
            ruleFragmentWithAction();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:423:3: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:424:4: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment1344); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:431:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:432:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:432:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:433:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment_RefPRFNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment1376); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:447:1: entryRulePRFNamedWithActionInFragment2 : rulePRFNamedWithActionInFragment2 EOF ;
    public final void entryRulePRFNamedWithActionInFragment2() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:447:39: ( rulePRFNamedWithActionInFragment2 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:448:2: rulePRFNamedWithActionInFragment2 EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragment2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment2_in_entryRulePRFNamedWithActionInFragment21415);
            rulePRFNamedWithActionInFragment2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment21418); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:453:1: rulePRFNamedWithActionInFragment2 : ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment2() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:453:34: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:455:3: ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:455:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:456:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:456:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:457:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21450); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }


            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_rulePRFNamedWithActionInFragment21473);
            ruleFragmentWithAction2();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:473:3: (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:474:4: otherlv_2= '-' ( (otherlv_3= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_HyphenMinusKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment21493); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:481:4: ( (otherlv_3= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:482:5: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:482:5: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:483:6: otherlv_3= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_RefPRFNamedCrossReference_2_1_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21525); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:497:1: entryRulePRFNamedWithActionInFragment3 : rulePRFNamedWithActionInFragment3 EOF ;
    public final void entryRulePRFNamedWithActionInFragment3() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:497:39: ( rulePRFNamedWithActionInFragment3 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:498:2: rulePRFNamedWithActionInFragment3 EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragment3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment3_in_entryRulePRFNamedWithActionInFragment31564);
            rulePRFNamedWithActionInFragment3();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment31567); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:503:1: rulePRFNamedWithActionInFragment3 : ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment3() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:503:34: ( ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:504:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:504:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:505:3: ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_rulePRFNamedWithActionInFragment31584);
            ruleFragmentWithAction3();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:512:3: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:513:4: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment3_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment31604); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:520:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:521:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:521:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:522:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment3_RefPRFNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment31636); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:536:1: entryRuleFragmentWithAction : ruleFragmentWithAction EOF ;
    public final void entryRuleFragmentWithAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:536:28: ( ruleFragmentWithAction EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:537:2: ruleFragmentWithAction EOF
            {
             markComposite(elementTypeProvider.getFragmentWithActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_entryRuleFragmentWithAction1675);
            ruleFragmentWithAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction1678); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:542:1: ruleFragmentWithAction : ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) ;
    public final void ruleFragmentWithAction() throws RecognitionException {
        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:542:23: ( ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:543:2: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:543:2: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:544:3: ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:544:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:545:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:545:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:546:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1710); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:555:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:556:4: 
            {

            				precedeComposite(elementTypeProvider.getFragmentWithAction_PRFNamedWithActionPrevAction_1ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:561:3: ( (lv_name_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:562:4: (lv_name_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:562:4: (lv_name_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:563:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1761); 

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:572:3: ( (otherlv_3= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:573:4: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:573:4: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:574:5: otherlv_3= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getFragmentWithAction_Ref2PRFNamedCrossReference_3_0ElementType());
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1799); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:587:1: entryRuleFragmentWithAction2 : ruleFragmentWithAction2 EOF ;
    public final void entryRuleFragmentWithAction2() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:587:29: ( ruleFragmentWithAction2 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:588:2: ruleFragmentWithAction2 EOF
            {
             markComposite(elementTypeProvider.getFragmentWithAction2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_entryRuleFragmentWithAction21831);
            ruleFragmentWithAction2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction21834); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:593:1: ruleFragmentWithAction2 : ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) ;
    public final void ruleFragmentWithAction2() throws RecognitionException {
        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:593:24: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:594:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:594:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:595:3: () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:595:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:596:4: 
            {

            				precedeComposite(elementTypeProvider.getFragmentWithAction2_PRFNamedWithActionPrevAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:601:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:602:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:602:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:603:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction2_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction21879); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:612:3: ( (otherlv_2= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:613:4: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:613:4: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:614:5: otherlv_2= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getFragmentWithAction2_Ref2PRFNamedCrossReference_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction21917); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:627:1: entryRuleFragmentWithAction3 : ruleFragmentWithAction3 EOF ;
    public final void entryRuleFragmentWithAction3() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:627:29: ( ruleFragmentWithAction3 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:628:2: ruleFragmentWithAction3 EOF
            {
             markComposite(elementTypeProvider.getFragmentWithAction3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_entryRuleFragmentWithAction31949);
            ruleFragmentWithAction3();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction31952); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:633:1: ruleFragmentWithAction3 : ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) ;
    public final void ruleFragmentWithAction3() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:633:24: ( ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:634:2: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:634:2: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:635:3: ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:635:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:636:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:636:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:637:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction31984); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:646:3: ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:647:4: () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )?
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:647:4: ()
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:648:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getFragmentWithAction3_PRFNamedWithActionPrevAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getFragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFragmentWithAction32031); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:660:4: ( (lv_name_3_0= RULE_ID ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:661:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:661:5: (lv_name_3_0= RULE_ID )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:662:6: lv_name_3_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_1_2_0ElementType());
            	    					
            	    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction32063); 

            	    						doneLeaf(lv_name_3_0);
            	    					

            	    }


            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:671:4: ( (otherlv_4= RULE_ID ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:672:5: (otherlv_4= RULE_ID )
            	            {
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:672:5: (otherlv_4= RULE_ID )
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:673:6: otherlv_4= RULE_ID
            	            {

            	            						markLeaf(elementTypeProvider.getFragmentWithAction3_Ref2PRFNamedCrossReference_1_3_0ElementType());
            	            					
            	            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction32108); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:687:1: entryRulePRFNamedFragment : rulePRFNamedFragment EOF ;
    public final void entryRulePRFNamedFragment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:687:26: ( rulePRFNamedFragment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:688:2: rulePRFNamedFragment EOF
            {
             markComposite(elementTypeProvider.getPRFNamedFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_entryRulePRFNamedFragment2148);
            rulePRFNamedFragment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedFragment2151); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:693:1: rulePRFNamedFragment : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void rulePRFNamedFragment() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:693:21: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:694:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:694:2: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:695:3: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:695:3: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:696:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getPRFNamedFragment_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedFragment2176); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:708:1: entryRulePRFNamedRef : rulePRFNamedRef EOF ;
    public final void entryRulePRFNamedRef() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:708:21: ( rulePRFNamedRef EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:709:2: rulePRFNamedRef EOF
            {
             markComposite(elementTypeProvider.getPRFNamedRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedRef_in_entryRulePRFNamedRef2201);
            rulePRFNamedRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedRef2204); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:714:1: rulePRFNamedRef : ( (otherlv_0= RULE_ID ) ) ;
    public final void rulePRFNamedRef() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:714:16: ( ( (otherlv_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:715:2: ( (otherlv_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:715:2: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:716:3: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:716:3: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:717:4: otherlv_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getPRFNamedRef_RefPRFNamedCrossReference_0ElementType());
            			
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedRef2229); 

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
        public static final BitSet FOLLOW_ruleParserRuleFragmentsEx_in_entryRuleParserRuleFragmentsEx54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRuleFragmentsEx57 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRuleFragments_in_ruleParserRuleFragmentsEx69 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRuleFragments_in_entryRuleParserRuleFragments85 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRuleFragments88 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleParserRuleFragments133 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamed_in_ruleParserRuleFragments170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleParserRuleFragments224 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamed_in_ruleParserRuleFragments261 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParserRuleFragments296 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRuleFragments333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleParserRuleFragments387 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedRefFirst_in_ruleParserRuleFragments424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParserRuleFragments478 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithAction_in_ruleParserRuleFragments515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleParserRuleFragments569 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment_in_ruleParserRuleFragments606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleParserRuleFragments660 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment2_in_ruleParserRuleFragments697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleParserRuleFragments751 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment3_in_ruleParserRuleFragments788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamed_in_entryRulePRFNamed834 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamed837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_rulePRFNamed854 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_rulePRFNamed881 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamed918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamed972 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedRef_in_rulePRFNamed990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedRefFirst_in_entryRulePRFNamedRefFirst1022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedRefFirst1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedRefFirst1057 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePRFNamedRefFirst1082 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_rulePRFNamedRefFirst1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithAction_in_entryRulePRFNamedWithAction1114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithAction1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamed_in_rulePRFNamedWithAction1134 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction1174 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction1220 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment_in_entryRulePRFNamedWithActionInFragment1304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_rulePRFNamedWithActionInFragment1324 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment1344 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment2_in_entryRulePRFNamedWithActionInFragment21415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment21418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21450 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_rulePRFNamedWithActionInFragment21473 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment21493 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment3_in_entryRulePRFNamedWithActionInFragment31564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment31567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_rulePRFNamedWithActionInFragment31584 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment31604 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment31636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_entryRuleFragmentWithAction1675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1710 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1761 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_entryRuleFragmentWithAction21831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction21834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21879 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_entryRuleFragmentWithAction31949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction31952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31984 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleFragmentWithAction32031 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction32063 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction32108 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_entryRulePRFNamedFragment2148 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedFragment2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedFragment2176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedRef_in_entryRulePRFNamedRef2201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedRef2204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedRef2229 = new BitSet(new long[]{0x0000000000000002L});
    }


}