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
    		return "FragmentsEx";
    	}




    // $ANTLR start "entryRuleFragmentsEx"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:52:1: entryRuleFragmentsEx : ruleFragmentsEx EOF ;
    public final void entryRuleFragmentsEx() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:52:21: ( ruleFragmentsEx EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:53:2: ruleFragmentsEx EOF
            {
             markComposite(elementTypeProvider.getFragmentsExElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentsEx_in_entryRuleFragmentsEx54);
            ruleFragmentsEx();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentsEx57); 

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
    // $ANTLR end "entryRuleFragmentsEx"


    // $ANTLR start "ruleFragmentsEx"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:58:1: ruleFragmentsEx : ruleFragments ;
    public final void ruleFragmentsEx() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:58:16: ( ruleFragments )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:59:2: ruleFragments
            {

            		markComposite(elementTypeProvider.getFragmentsEx_FragmentsParserRuleCallElementType());
            	
            pushFollow(FollowSets000.FOLLOW_ruleFragments_in_ruleFragmentsEx69);
            ruleFragments();

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
    // $ANTLR end "ruleFragmentsEx"


    // $ANTLR start "entryRuleFragments"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:69:1: entryRuleFragments : ruleFragments EOF ;
    public final void entryRuleFragments() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:69:19: ( ruleFragments EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:70:2: ruleFragments EOF
            {
             markComposite(elementTypeProvider.getFragmentsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragments_in_entryRuleFragments85);
            ruleFragments();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragments88); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:75:1: ruleFragments : ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) ) ;
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
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:75:14: ( ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:76:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:76:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:77:3: () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:77:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:78:4: 
            {

            				precedeComposite(elementTypeProvider.getFragments_FragmentsAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:83:3: ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) )
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
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:84:4: (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:84:4: (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:85:5: otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitOneKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFragments133); 

                    					doneLeaf(otherlv_1);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:92:5: ( (lv_element_2_0= ruleNamed ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:93:6: (lv_element_2_0= ruleNamed )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:93:6: (lv_element_2_0= ruleNamed )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:94:7: lv_element_2_0= ruleNamed
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedParserRuleCall_1_0_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleFragments170);
                    ruleNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:105:4: (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:105:4: (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:106:5: otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitTwoKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFragments224); 

                    					doneLeaf(otherlv_3);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:113:5: ( (lv_element_4_0= ruleNamed ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:114:6: (lv_element_4_0= ruleNamed )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:114:6: (lv_element_4_0= ruleNamed )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:115:7: lv_element_4_0= ruleNamed
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedParserRuleCall_1_1_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleFragments261);
                    ruleNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getFragments_HyphenMinusGreaterThanSignKeyword_1_1_2ElementType());
                    				
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFragments296); 

                    					doneLeaf(otherlv_5);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:131:5: ( (otherlv_6= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:132:6: (otherlv_6= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:132:6: (otherlv_6= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:133:7: otherlv_6= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getFragments_RefNamedCrossReference_1_1_3_0ElementType());
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragments333); 

                    							doneLeaf(otherlv_6);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:144:4: (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:144:4: (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:145:5: otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitThreeKeyword_1_2_0ElementType());
                    				
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFragments387); 

                    					doneLeaf(otherlv_7);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:152:5: ( (lv_element_8_0= ruleNamedRefFirst ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:153:6: (lv_element_8_0= ruleNamedRefFirst )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:153:6: (lv_element_8_0= ruleNamedRefFirst )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:154:7: lv_element_8_0= ruleNamedRefFirst
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedRefFirstParserRuleCall_1_2_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedRefFirst_in_ruleFragments424);
                    ruleNamedRefFirst();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:165:4: (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:165:4: (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:166:5: otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitFourKeyword_1_3_0ElementType());
                    				
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFragments478); 

                    					doneLeaf(otherlv_9);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:173:5: ( (lv_element_10_0= ruleNamedWithAction ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:174:6: (lv_element_10_0= ruleNamedWithAction )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:174:6: (lv_element_10_0= ruleNamedWithAction )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:175:7: lv_element_10_0= ruleNamedWithAction
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedWithActionParserRuleCall_1_3_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithAction_in_ruleFragments515);
                    ruleNamedWithAction();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:186:4: (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:186:4: (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:187:5: otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitFiveKeyword_1_4_0ElementType());
                    				
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFragments569); 

                    					doneLeaf(otherlv_11);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:194:5: ( (lv_element_12_0= ruleNamedWithActionInFragment ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:195:6: (lv_element_12_0= ruleNamedWithActionInFragment )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:195:6: (lv_element_12_0= ruleNamedWithActionInFragment )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:196:7: lv_element_12_0= ruleNamedWithActionInFragment
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedWithActionInFragmentParserRuleCall_1_4_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment_in_ruleFragments606);
                    ruleNamedWithActionInFragment();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:207:4: (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:207:4: (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:208:5: otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitSixKeyword_1_5_0ElementType());
                    				
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFragments660); 

                    					doneLeaf(otherlv_13);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:215:5: ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:216:6: (lv_element_14_0= ruleNamedWithActionInFragment2 )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:216:6: (lv_element_14_0= ruleNamedWithActionInFragment2 )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:217:7: lv_element_14_0= ruleNamedWithActionInFragment2
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment2_in_ruleFragments697);
                    ruleNamedWithActionInFragment2();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:228:4: (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:228:4: (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:229:5: otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) )
                    {

                    					markLeaf(elementTypeProvider.getFragments_NumberSignDigitSevenKeyword_1_6_0ElementType());
                    				
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFragments751); 

                    					doneLeaf(otherlv_15);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:236:5: ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:237:6: (lv_element_16_0= ruleNamedWithActionInFragment3 )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:237:6: (lv_element_16_0= ruleNamedWithActionInFragment3 )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:238:7: lv_element_16_0= ruleNamedWithActionInFragment3
                    {

                    							markComposite(elementTypeProvider.getFragments_ElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment3_in_ruleFragments788);
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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:253:1: entryRuleNamed : ruleNamed EOF ;
    public final void entryRuleNamed() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:253:15: ( ruleNamed EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:254:2: ruleNamed EOF
            {
             markComposite(elementTypeProvider.getNamedElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamed_in_entryRuleNamed834);
            ruleNamed();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamed837); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:259:1: ruleNamed : ( ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )? ) ;
    public final void ruleNamed() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:259:10: ( ( ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:260:2: ( ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:260:2: ( ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:261:3: ruleNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )?
            {

            			markComposite(elementTypeProvider.getNamed_NamedFragmentParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_ruleNamed854);
            ruleNamedFragment();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:268:3: ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' ruleNamedRef ) )?
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

                    					markLeaf(elementTypeProvider.getNamed_ColonKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNamed881); 

                    					doneLeaf(otherlv_1);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:277:5: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:278:6: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:278:6: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:279:7: otherlv_2= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getNamed_RefNamedCrossReference_1_0_1_0ElementType());
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamed918); 

                    							doneLeaf(otherlv_2);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:290:4: (otherlv_3= '-' ruleNamedRef )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:290:4: (otherlv_3= '-' ruleNamedRef )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:291:5: otherlv_3= '-' ruleNamedRef
                    {

                    					markLeaf(elementTypeProvider.getNamed_HyphenMinusKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamed972); 

                    					doneLeaf(otherlv_3);
                    				

                    					markComposite(elementTypeProvider.getNamed_NamedRefParserRuleCall_1_1_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_ruleNamedRef_in_ruleNamed990);
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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:311:1: entryRuleNamedRefFirst : ruleNamedRefFirst EOF ;
    public final void entryRuleNamedRefFirst() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:311:23: ( ruleNamedRefFirst EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:312:2: ruleNamedRefFirst EOF
            {
             markComposite(elementTypeProvider.getNamedRefFirstElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedRefFirst_in_entryRuleNamedRefFirst1022);
            ruleNamedRefFirst();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedRefFirst1025); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:317:1: ruleNamedRefFirst : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment ) ;
    public final void ruleNamedRefFirst() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:317:18: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:318:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:318:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:319:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' ruleNamedFragment
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:319:3: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:320:4: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:320:4: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:321:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNamedRefFirst_RefNamedCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedRefFirst1057); 

            					doneLeaf(otherlv_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getNamedRefFirst_LessThanSignHyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNamedRefFirst1082); 

            			doneLeaf(otherlv_1);
            		

            			markComposite(elementTypeProvider.getNamedRefFirst_NamedFragmentParserRuleCall_2ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_ruleNamedRefFirst1094);
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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:348:1: entryRuleNamedWithAction : ruleNamedWithAction EOF ;
    public final void entryRuleNamedWithAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:348:25: ( ruleNamedWithAction EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:349:2: ruleNamedWithAction EOF
            {
             markComposite(elementTypeProvider.getNamedWithActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithAction_in_entryRuleNamedWithAction1114);
            ruleNamedWithAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithAction1117); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:354:1: ruleNamedWithAction : ( ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final void ruleNamedWithAction() throws RecognitionException {
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:354:20: ( ( ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:355:2: ( ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:355:2: ( ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:356:3: ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getNamedWithAction_NamedParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleNamedWithAction1134);
            ruleNamed();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:363:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:364:4: 
            {

            				precedeComposite(elementTypeProvider.getNamedWithAction_NamedWithActionPrevAction_1ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:369:3: ( (lv_name_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:370:4: (lv_name_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:370:4: (lv_name_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:371:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNamedWithAction_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction1174); 

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

                    						markLeaf(elementTypeProvider.getNamedWithAction_RefNamedCrossReference_3_0_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction1220); 

                    						doneLeaf(otherlv_3);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:392:4: ( (otherlv_4= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:393:5: (otherlv_4= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:393:5: (otherlv_4= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:394:6: otherlv_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedWithAction_Ref2NamedCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction1265); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:408:1: entryRuleNamedWithActionInFragment : ruleNamedWithActionInFragment EOF ;
    public final void entryRuleNamedWithActionInFragment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:408:35: ( ruleNamedWithActionInFragment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:409:2: ruleNamedWithActionInFragment EOF
            {
             markComposite(elementTypeProvider.getNamedWithActionInFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment_in_entryRuleNamedWithActionInFragment1304);
            ruleNamedWithActionInFragment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment1307); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:414:1: ruleNamedWithActionInFragment : ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void ruleNamedWithActionInFragment() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:414:30: ( ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:415:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:415:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:416:3: ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_ruleNamedWithActionInFragment1324);
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

                    				markLeaf(elementTypeProvider.getNamedWithActionInFragment_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment1344); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:431:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:432:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:432:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:433:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedWithActionInFragment_RefNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment1376); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:447:1: entryRuleNamedWithActionInFragment2 : ruleNamedWithActionInFragment2 EOF ;
    public final void entryRuleNamedWithActionInFragment2() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:447:36: ( ruleNamedWithActionInFragment2 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:448:2: ruleNamedWithActionInFragment2 EOF
            {
             markComposite(elementTypeProvider.getNamedWithActionInFragment2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment2_in_entryRuleNamedWithActionInFragment21415);
            ruleNamedWithActionInFragment2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment21418); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:453:1: ruleNamedWithActionInFragment2 : ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final void ruleNamedWithActionInFragment2() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:453:31: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) )
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

            					markLeaf(elementTypeProvider.getNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21450); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }


            			markComposite(elementTypeProvider.getNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_ruleNamedWithActionInFragment21473);
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

                    				markLeaf(elementTypeProvider.getNamedWithActionInFragment2_HyphenMinusKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment21493); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:481:4: ( (otherlv_3= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:482:5: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:482:5: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:483:6: otherlv_3= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedWithActionInFragment2_RefNamedCrossReference_2_1_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21525); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:497:1: entryRuleNamedWithActionInFragment3 : ruleNamedWithActionInFragment3 EOF ;
    public final void entryRuleNamedWithActionInFragment3() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:497:36: ( ruleNamedWithActionInFragment3 EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:498:2: ruleNamedWithActionInFragment3 EOF
            {
             markComposite(elementTypeProvider.getNamedWithActionInFragment3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment3_in_entryRuleNamedWithActionInFragment31564);
            ruleNamedWithActionInFragment3();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment31567); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:503:1: ruleNamedWithActionInFragment3 : ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void ruleNamedWithActionInFragment3() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:503:31: ( ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:504:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:504:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:505:3: ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_ruleNamedWithActionInFragment31584);
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

                    				markLeaf(elementTypeProvider.getNamedWithActionInFragment3_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment31604); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:520:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:521:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:521:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:522:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedWithActionInFragment3_RefNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment31636); 

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

            				precedeComposite(elementTypeProvider.getFragmentWithAction_NamedWithActionPrevAction_1ElementType());
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

                    					markLeaf(elementTypeProvider.getFragmentWithAction_Ref2NamedCrossReference_3_0ElementType());
                    				
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

            				precedeComposite(elementTypeProvider.getFragmentWithAction2_NamedWithActionPrevAction_0ElementType());
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

                    					markLeaf(elementTypeProvider.getFragmentWithAction2_Ref2NamedCrossReference_2_0ElementType());
                    				
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

            	    					precedeComposite(elementTypeProvider.getFragmentWithAction3_NamedWithActionPrevAction_1_0ElementType());
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

            	            						markLeaf(elementTypeProvider.getFragmentWithAction3_Ref2NamedCrossReference_1_3_0ElementType());
            	            					
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


    // $ANTLR start "entryRuleNamedFragment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:687:1: entryRuleNamedFragment : ruleNamedFragment EOF ;
    public final void entryRuleNamedFragment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:687:23: ( ruleNamedFragment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:688:2: ruleNamedFragment EOF
            {
             markComposite(elementTypeProvider.getNamedFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_entryRuleNamedFragment2148);
            ruleNamedFragment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedFragment2151); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:693:1: ruleNamedFragment : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleNamedFragment() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:693:18: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:694:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:694:2: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:695:3: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:695:3: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:696:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getNamedFragment_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedFragment2176); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:708:1: entryRuleNamedRef : ruleNamedRef EOF ;
    public final void entryRuleNamedRef() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:708:18: ( ruleNamedRef EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:709:2: ruleNamedRef EOF
            {
             markComposite(elementTypeProvider.getNamedRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedRef_in_entryRuleNamedRef2201);
            ruleNamedRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedRef2204); 

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:714:1: ruleNamedRef : ( (otherlv_0= RULE_ID ) ) ;
    public final void ruleNamedRef() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:714:13: ( ( (otherlv_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:715:2: ( (otherlv_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:715:2: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:716:3: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:716:3: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/fragments/idea/parser/antlr/internal/PsiInternalFragmentTestLanguageEx.g:717:4: otherlv_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getNamedRef_RefNamedCrossReference_0ElementType());
            			
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedRef2229); 

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
        public static final BitSet FOLLOW_ruleFragmentsEx_in_entryRuleFragmentsEx54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentsEx57 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragments_in_ruleFragmentsEx69 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragments_in_entryRuleFragments85 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragments88 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFragments133 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleFragments170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleFragments224 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleFragments261 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFragments296 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragments333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleFragments387 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedRefFirst_in_ruleFragments424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleFragments478 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithAction_in_ruleFragments515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleFragments569 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment_in_ruleFragments606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleFragments660 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment2_in_ruleFragments697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleFragments751 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment3_in_ruleFragments788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamed_in_entryRuleNamed834 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamed837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedFragment_in_ruleNamed854 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_ruleNamed881 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamed918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNamed972 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedRef_in_ruleNamed990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedRefFirst_in_entryRuleNamedRefFirst1022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedRefFirst1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedRefFirst1057 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleNamedRefFirst1082 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedFragment_in_ruleNamedRefFirst1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithAction_in_entryRuleNamedWithAction1114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithAction1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleNamedWithAction1134 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction1174 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction1220 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment_in_entryRuleNamedWithActionInFragment1304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_ruleNamedWithActionInFragment1324 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment1344 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment2_in_entryRuleNamedWithActionInFragment21415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment21418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21450 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_ruleNamedWithActionInFragment21473 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment21493 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment3_in_entryRuleNamedWithActionInFragment31564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment31567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_ruleNamedWithActionInFragment31584 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment31604 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment31636 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleNamedFragment_in_entryRuleNamedFragment2148 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedFragment2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedFragment2176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedRef_in_entryRuleNamedRef2201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedRef2204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedRef2229 = new BitSet(new long[]{0x0000000000000002L});
    }


}