package org.eclipse.xtext.parser.fragments.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFragmentTestLanguageParser extends AbstractInternalAntlrParser {
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


        public InternalFragmentTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFragmentTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFragmentTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g"; }



     	private FragmentTestLanguageGrammarAccess grammarAccess;
     	
        public InternalFragmentTestLanguageParser(TokenStream input, FragmentTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ParserRuleFragments";	
       	}
       	
       	@Override
       	protected FragmentTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleParserRuleFragments"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:67:1: entryRuleParserRuleFragments returns [EObject current=null] : iv_ruleParserRuleFragments= ruleParserRuleFragments EOF ;
    public final EObject entryRuleParserRuleFragments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRuleFragments = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:68:2: (iv_ruleParserRuleFragments= ruleParserRuleFragments EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:69:2: iv_ruleParserRuleFragments= ruleParserRuleFragments EOF
            {
             newCompositeNode(grammarAccess.getParserRuleFragmentsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRuleFragments_in_entryRuleParserRuleFragments75);
            iv_ruleParserRuleFragments=ruleParserRuleFragments();

            state._fsp--;

             current =iv_ruleParserRuleFragments; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRuleFragments85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParserRuleFragments"


    // $ANTLR start "ruleParserRuleFragments"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:76:1: ruleParserRuleFragments returns [EObject current=null] : ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) ) ;
    public final EObject ruleParserRuleFragments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;

        EObject lv_element_8_0 = null;

        EObject lv_element_10_0 = null;

        EObject lv_element_12_0 = null;

        EObject lv_element_14_0 = null;

        EObject lv_element_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:79:28: ( ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:80:1: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:80:1: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:80:2: () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:80:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParserRuleFragmentsAccess().getParserRuleFragmentsAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:86:2: ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) )
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:86:3: (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:86:3: (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:86:5: otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) )
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleParserRuleFragments133); 

                        	newLeafNode(otherlv_1, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitOneKeyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:90:1: ( (lv_element_2_0= rulePRFNamed ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:91:1: (lv_element_2_0= rulePRFNamed )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:91:1: (lv_element_2_0= rulePRFNamed )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:92:3: lv_element_2_0= rulePRFNamed
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_ruleParserRuleFragments154);
                    lv_element_2_0=rulePRFNamed();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_2_0, 
                            		"PRFNamed");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:109:6: (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:109:6: (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:109:8: otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParserRuleFragments174); 

                        	newLeafNode(otherlv_3, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitTwoKeyword_1_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:113:1: ( (lv_element_4_0= rulePRFNamed ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:114:1: (lv_element_4_0= rulePRFNamed )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:114:1: (lv_element_4_0= rulePRFNamed )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:115:3: lv_element_4_0= rulePRFNamed
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_ruleParserRuleFragments195);
                    lv_element_4_0=rulePRFNamed();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_4_0, 
                            		"PRFNamed");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParserRuleFragments207); 

                        	newLeafNode(otherlv_5, grammarAccess.getParserRuleFragmentsAccess().getHyphenMinusGreaterThanSignKeyword_1_1_2());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:135:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:136:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:136:1: (otherlv_6= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:137:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRuleFragments227); 

                    		newLeafNode(otherlv_6, grammarAccess.getParserRuleFragmentsAccess().getRefPRFNamedCrossReference_1_1_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:149:6: (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:149:6: (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:149:8: otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParserRuleFragments247); 

                        	newLeafNode(otherlv_7, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitThreeKeyword_1_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:153:1: ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:154:1: (lv_element_8_0= rulePRFNamedRefFirst )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:154:1: (lv_element_8_0= rulePRFNamedRefFirst )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:155:3: lv_element_8_0= rulePRFNamedRefFirst
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedRefFirstParserRuleCall_1_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedRefFirst_in_ruleParserRuleFragments268);
                    lv_element_8_0=rulePRFNamedRefFirst();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_8_0, 
                            		"PRFNamedRefFirst");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:172:6: (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:172:6: (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:172:8: otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParserRuleFragments288); 

                        	newLeafNode(otherlv_9, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitFourKeyword_1_3_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:176:1: ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:177:1: (lv_element_10_0= rulePRFNamedWithAction )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:177:1: (lv_element_10_0= rulePRFNamedWithAction )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:178:3: lv_element_10_0= rulePRFNamedWithAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionParserRuleCall_1_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithAction_in_ruleParserRuleFragments309);
                    lv_element_10_0=rulePRFNamedWithAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_10_0, 
                            		"PRFNamedWithAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:195:6: (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:195:6: (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:195:8: otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    {
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParserRuleFragments329); 

                        	newLeafNode(otherlv_11, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitFiveKeyword_1_4_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:199:1: ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:200:1: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:200:1: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:201:3: lv_element_12_0= rulePRFNamedWithActionInFragment
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionInFragmentParserRuleCall_1_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment_in_ruleParserRuleFragments350);
                    lv_element_12_0=rulePRFNamedWithActionInFragment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_12_0, 
                            		"PRFNamedWithActionInFragment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:218:6: (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:218:6: (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:218:8: otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    {
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParserRuleFragments370); 

                        	newLeafNode(otherlv_13, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitSixKeyword_1_5_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:222:1: ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:223:1: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:223:1: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:224:3: lv_element_14_0= rulePRFNamedWithActionInFragment2
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionInFragment2ParserRuleCall_1_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment2_in_ruleParserRuleFragments391);
                    lv_element_14_0=rulePRFNamedWithActionInFragment2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_14_0, 
                            		"PRFNamedWithActionInFragment2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:241:6: (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:241:6: (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:241:8: otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    {
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParserRuleFragments411); 

                        	newLeafNode(otherlv_15, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitSevenKeyword_1_6_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:245:1: ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:246:1: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:246:1: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:247:3: lv_element_16_0= rulePRFNamedWithActionInFragment3
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionInFragment3ParserRuleCall_1_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment3_in_ruleParserRuleFragments432);
                    lv_element_16_0=rulePRFNamedWithActionInFragment3();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_16_0, 
                            		"PRFNamedWithActionInFragment3");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParserRuleFragments"


    // $ANTLR start "entryRulePRFNamed"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:271:1: entryRulePRFNamed returns [EObject current=null] : iv_rulePRFNamed= rulePRFNamed EOF ;
    public final EObject entryRulePRFNamed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamed = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:272:2: (iv_rulePRFNamed= rulePRFNamed EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:273:2: iv_rulePRFNamed= rulePRFNamed EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_entryRulePRFNamed470);
            iv_rulePRFNamed=rulePRFNamed();

            state._fsp--;

             current =iv_rulePRFNamed; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamed480); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRFNamed"


    // $ANTLR start "rulePRFNamed"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:280:1: rulePRFNamed returns [EObject current=null] : (this_PRFNamedFragment_0= rulePRFNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current] ) )? ) ;
    public final EObject rulePRFNamed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_PRFNamedFragment_0 = null;

        EObject this_PRFNamedRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:283:28: ( (this_PRFNamedFragment_0= rulePRFNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current] ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:284:1: (this_PRFNamedFragment_0= rulePRFNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current] ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:284:1: (this_PRFNamedFragment_0= rulePRFNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current] ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:285:5: this_PRFNamedFragment_0= rulePRFNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current] ) )?
            {
             
            		if (current==null) {
            			current = createModelElement(grammarAccess.getPRFNamedRule());
            		}
                    newCompositeNode(grammarAccess.getPRFNamedAccess().getPRFNamedFragmentParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_rulePRFNamed527);
            this_PRFNamedFragment_0=rulePRFNamedFragment(current);

            state._fsp--;

             
                    current = this_PRFNamedFragment_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:296:1: ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current] ) )?
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:296:2: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:296:2: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:296:4: otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePRFNamed541); 

                        	newLeafNode(otherlv_1, grammarAccess.getPRFNamedAccess().getColonKeyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:300:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:301:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:301:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:302:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamed561); 

                    		newLeafNode(otherlv_2, grammarAccess.getPRFNamedAccess().getRefPRFNamedCrossReference_1_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:314:6: (otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current] )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:314:6: (otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current] )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:314:8: otherlv_3= '-' this_PRFNamedRef_4= rulePRFNamedRef[$current]
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamed581); 

                        	newLeafNode(otherlv_3, grammarAccess.getPRFNamedAccess().getHyphenMinusKeyword_1_1_0());
                        
                     
                    		if (current==null) {
                    			current = createModelElement(grammarAccess.getPRFNamedRule());
                    		}
                            newCompositeNode(grammarAccess.getPRFNamedAccess().getPRFNamedRefParserRuleCall_1_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedRef_in_rulePRFNamed603);
                    this_PRFNamedRef_4=rulePRFNamedRef(current);

                    state._fsp--;

                     
                            current = this_PRFNamedRef_4; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRFNamed"


    // $ANTLR start "entryRulePRFNamedRefFirst"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:338:1: entryRulePRFNamedRefFirst returns [EObject current=null] : iv_rulePRFNamedRefFirst= rulePRFNamedRefFirst EOF ;
    public final EObject entryRulePRFNamedRefFirst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedRefFirst = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:339:2: (iv_rulePRFNamedRefFirst= rulePRFNamedRefFirst EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:340:2: iv_rulePRFNamedRefFirst= rulePRFNamedRefFirst EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedRefFirstRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedRefFirst_in_entryRulePRFNamedRefFirst642);
            iv_rulePRFNamedRefFirst=rulePRFNamedRefFirst();

            state._fsp--;

             current =iv_rulePRFNamedRefFirst; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedRefFirst652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRFNamedRefFirst"


    // $ANTLR start "rulePRFNamedRefFirst"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:347:1: rulePRFNamedRefFirst returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_PRFNamedFragment_2= rulePRFNamedFragment[$current] ) ;
    public final EObject rulePRFNamedRefFirst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_PRFNamedFragment_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:350:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_PRFNamedFragment_2= rulePRFNamedFragment[$current] ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:351:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_PRFNamedFragment_2= rulePRFNamedFragment[$current] )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:351:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_PRFNamedFragment_2= rulePRFNamedFragment[$current] )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:351:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_PRFNamedFragment_2= rulePRFNamedFragment[$current]
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:351:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:352:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:352:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:353:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPRFNamedRefFirstRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedRefFirst697); 

            		newLeafNode(otherlv_0, grammarAccess.getPRFNamedRefFirstAccess().getRefPRFNamedCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePRFNamedRefFirst709); 

                	newLeafNode(otherlv_1, grammarAccess.getPRFNamedRefFirstAccess().getLessThanSignHyphenMinusKeyword_1());
                
             
            		if (current==null) {
            			current = createModelElement(grammarAccess.getPRFNamedRefFirstRule());
            		}
                    newCompositeNode(grammarAccess.getPRFNamedRefFirstAccess().getPRFNamedFragmentParserRuleCall_2()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_rulePRFNamedRefFirst731);
            this_PRFNamedFragment_2=rulePRFNamedFragment(current);

            state._fsp--;

             
                    current = this_PRFNamedFragment_2; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRFNamedRefFirst"


    // $ANTLR start "entryRulePRFNamedWithAction"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:388:1: entryRulePRFNamedWithAction returns [EObject current=null] : iv_rulePRFNamedWithAction= rulePRFNamedWithAction EOF ;
    public final EObject entryRulePRFNamedWithAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedWithAction = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:389:2: (iv_rulePRFNamedWithAction= rulePRFNamedWithAction EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:390:2: iv_rulePRFNamedWithAction= rulePRFNamedWithAction EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedWithActionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithAction_in_entryRulePRFNamedWithAction767);
            iv_rulePRFNamedWithAction=rulePRFNamedWithAction();

            state._fsp--;

             current =iv_rulePRFNamedWithAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithAction777); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRFNamedWithAction"


    // $ANTLR start "rulePRFNamedWithAction"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:397:1: rulePRFNamedWithAction returns [EObject current=null] : (this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject rulePRFNamedWithAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_PRFNamed_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:400:28: ( (this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:401:1: (this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:401:1: (this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:402:5: this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getPRFNamedWithActionAccess().getPRFNamedParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_rulePRFNamedWithAction824);
            this_PRFNamed_0=rulePRFNamed();

            state._fsp--;

             
                    current = this_PRFNamed_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:410:1: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:411:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getPRFNamedWithActionAccess().getPRFNamedWithActionPrevAction_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:416:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:417:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:417:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:418:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction849); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPRFNamedWithActionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPRFNamedWithActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:434:2: ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:434:3: ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:434:3: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:435:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:435:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:436:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction875); 

                    		newLeafNode(otherlv_3, grammarAccess.getPRFNamedWithActionAccess().getRefPRFNamedCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:447:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:448:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:448:1: (otherlv_4= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:449:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction895); 

                    		newLeafNode(otherlv_4, grammarAccess.getPRFNamedWithActionAccess().getRef2PRFNamedCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRFNamedWithAction"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:468:1: entryRulePRFNamedWithActionInFragment returns [EObject current=null] : iv_rulePRFNamedWithActionInFragment= rulePRFNamedWithActionInFragment EOF ;
    public final EObject entryRulePRFNamedWithActionInFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedWithActionInFragment = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:469:2: (iv_rulePRFNamedWithActionInFragment= rulePRFNamedWithActionInFragment EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:470:2: iv_rulePRFNamedWithActionInFragment= rulePRFNamedWithActionInFragment EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedWithActionInFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment_in_entryRulePRFNamedWithActionInFragment933);
            iv_rulePRFNamedWithActionInFragment=rulePRFNamedWithActionInFragment();

            state._fsp--;

             current =iv_rulePRFNamedWithActionInFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRFNamedWithActionInFragment"


    // $ANTLR start "rulePRFNamedWithActionInFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:477:1: rulePRFNamedWithActionInFragment returns [EObject current=null] : (this_FragmentWithAction_0= ruleFragmentWithAction[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject rulePRFNamedWithActionInFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_FragmentWithAction_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:480:28: ( (this_FragmentWithAction_0= ruleFragmentWithAction[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:481:1: (this_FragmentWithAction_0= ruleFragmentWithAction[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:481:1: (this_FragmentWithAction_0= ruleFragmentWithAction[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:482:5: this_FragmentWithAction_0= ruleFragmentWithAction[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {
             
            		if (current==null) {
            			current = createModelElement(grammarAccess.getPRFNamedWithActionInFragmentRule());
            		}
                    newCompositeNode(grammarAccess.getPRFNamedWithActionInFragmentAccess().getFragmentWithActionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_rulePRFNamedWithActionInFragment990);
            this_FragmentWithAction_0=ruleFragmentWithAction(current);

            state._fsp--;

             
                    current = this_FragmentWithAction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:493:1: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:493:3: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment1003); 

                        	newLeafNode(otherlv_1, grammarAccess.getPRFNamedWithActionInFragmentAccess().getHyphenMinusKeyword_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:497:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:498:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:498:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:499:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionInFragmentRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment1023); 

                    		newLeafNode(otherlv_2, grammarAccess.getPRFNamedWithActionInFragmentAccess().getRefPRFNamedCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRFNamedWithActionInFragment"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:518:1: entryRulePRFNamedWithActionInFragment2 returns [EObject current=null] : iv_rulePRFNamedWithActionInFragment2= rulePRFNamedWithActionInFragment2 EOF ;
    public final EObject entryRulePRFNamedWithActionInFragment2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedWithActionInFragment2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:519:2: (iv_rulePRFNamedWithActionInFragment2= rulePRFNamedWithActionInFragment2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:520:2: iv_rulePRFNamedWithActionInFragment2= rulePRFNamedWithActionInFragment2 EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedWithActionInFragment2Rule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment2_in_entryRulePRFNamedWithActionInFragment21061);
            iv_rulePRFNamedWithActionInFragment2=rulePRFNamedWithActionInFragment2();

            state._fsp--;

             current =iv_rulePRFNamedWithActionInFragment2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment21071); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRFNamedWithActionInFragment2"


    // $ANTLR start "rulePRFNamedWithActionInFragment2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:527:1: rulePRFNamedWithActionInFragment2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2[$current] (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject rulePRFNamedWithActionInFragment2() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_FragmentWithAction2_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:530:28: ( ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2[$current] (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:531:1: ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2[$current] (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:531:1: ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2[$current] (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:531:2: ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2[$current] (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:531:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:532:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:532:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:533:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21113); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPRFNamedWithActionInFragment2Access().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPRFNamedWithActionInFragment2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

             
            		if (current==null) {
            			current = createModelElement(grammarAccess.getPRFNamedWithActionInFragment2Rule());
            		}
                    newCompositeNode(grammarAccess.getPRFNamedWithActionInFragment2Access().getFragmentWithAction2ParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_rulePRFNamedWithActionInFragment21140);
            this_FragmentWithAction2_1=ruleFragmentWithAction2(current);

            state._fsp--;

             
                    current = this_FragmentWithAction2_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:561:1: (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:561:3: otherlv_2= '-' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment21153); 

                        	newLeafNode(otherlv_2, grammarAccess.getPRFNamedWithActionInFragment2Access().getHyphenMinusKeyword_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:565:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:566:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:566:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:567:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionInFragment2Rule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21173); 

                    		newLeafNode(otherlv_3, grammarAccess.getPRFNamedWithActionInFragment2Access().getRefPRFNamedCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRFNamedWithActionInFragment2"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:586:1: entryRulePRFNamedWithActionInFragment3 returns [EObject current=null] : iv_rulePRFNamedWithActionInFragment3= rulePRFNamedWithActionInFragment3 EOF ;
    public final EObject entryRulePRFNamedWithActionInFragment3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedWithActionInFragment3 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:587:2: (iv_rulePRFNamedWithActionInFragment3= rulePRFNamedWithActionInFragment3 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:588:2: iv_rulePRFNamedWithActionInFragment3= rulePRFNamedWithActionInFragment3 EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedWithActionInFragment3Rule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment3_in_entryRulePRFNamedWithActionInFragment31211);
            iv_rulePRFNamedWithActionInFragment3=rulePRFNamedWithActionInFragment3();

            state._fsp--;

             current =iv_rulePRFNamedWithActionInFragment3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment31221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePRFNamedWithActionInFragment3"


    // $ANTLR start "rulePRFNamedWithActionInFragment3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:595:1: rulePRFNamedWithActionInFragment3 returns [EObject current=null] : (this_FragmentWithAction3_0= ruleFragmentWithAction3[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject rulePRFNamedWithActionInFragment3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_FragmentWithAction3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:598:28: ( (this_FragmentWithAction3_0= ruleFragmentWithAction3[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:599:1: (this_FragmentWithAction3_0= ruleFragmentWithAction3[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:599:1: (this_FragmentWithAction3_0= ruleFragmentWithAction3[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:600:5: this_FragmentWithAction3_0= ruleFragmentWithAction3[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {
             
            		if (current==null) {
            			current = createModelElement(grammarAccess.getPRFNamedWithActionInFragment3Rule());
            		}
                    newCompositeNode(grammarAccess.getPRFNamedWithActionInFragment3Access().getFragmentWithAction3ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_rulePRFNamedWithActionInFragment31268);
            this_FragmentWithAction3_0=ruleFragmentWithAction3(current);

            state._fsp--;

             
                    current = this_FragmentWithAction3_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:611:1: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:611:3: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePRFNamedWithActionInFragment31281); 

                        	newLeafNode(otherlv_1, grammarAccess.getPRFNamedWithActionInFragment3Access().getHyphenMinusKeyword_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:615:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:616:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:616:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:617:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionInFragment3Rule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment31301); 

                    		newLeafNode(otherlv_2, grammarAccess.getPRFNamedWithActionInFragment3Access().getRefPRFNamedCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRFNamedWithActionInFragment3"


    // $ANTLR start "ruleFragmentWithAction"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:637:1: ruleFragmentWithAction[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) ;
    public final EObject ruleFragmentWithAction(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:640:28: ( ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:641:1: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:641:1: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:641:2: ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:641:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:642:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:642:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:643:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1360); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFragmentWithActionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFragmentWithActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:659:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:660:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getFragmentWithActionAccess().getPRFNamedWithActionPrevAction_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:665:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:666:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:666:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:667:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1391); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFragmentWithActionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFragmentWithActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:683:2: ( (otherlv_3= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:684:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:684:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:685:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFragmentWithActionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1416); 

                    		newLeafNode(otherlv_3, grammarAccess.getFragmentWithActionAccess().getRef2PRFNamedCrossReference_3_0()); 
                    	

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFragmentWithAction"


    // $ANTLR start "ruleFragmentWithAction2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:705:1: ruleFragmentWithAction2[EObject in_current] returns [EObject current=in_current] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) ;
    public final EObject ruleFragmentWithAction2(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:708:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:709:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:709:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:709:2: () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:709:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:710:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getFragmentWithAction2Access().getPRFNamedWithActionPrevAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:715:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:716:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:716:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:717:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction21483); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFragmentWithAction2Access().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFragmentWithAction2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:733:2: ( (otherlv_2= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:734:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:734:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:735:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFragmentWithAction2Rule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction21508); 

                    		newLeafNode(otherlv_2, grammarAccess.getFragmentWithAction2Access().getRef2PRFNamedCrossReference_2_0()); 
                    	

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFragmentWithAction2"


    // $ANTLR start "ruleFragmentWithAction3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:755:1: ruleFragmentWithAction3[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) ;
    public final EObject ruleFragmentWithAction3(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:758:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:759:1: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:759:1: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:759:2: ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:759:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:760:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:760:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:761:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction31566); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFragmentWithAction3Access().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFragmentWithAction3Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:777:2: ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:777:3: () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )?
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:777:3: ()
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:778:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getFragmentWithAction3Access().getPRFNamedWithActionPrevAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFragmentWithAction31593); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFragmentWithAction3Access().getHyphenMinusGreaterThanSignKeyword_1_1());
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:787:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:788:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:788:1: (lv_name_3_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:789:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction31610); 

            	    			newLeafNode(lv_name_3_0, grammarAccess.getFragmentWithAction3Access().getNameIDTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFragmentWithAction3Rule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:805:2: ( (otherlv_4= RULE_ID ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:806:1: (otherlv_4= RULE_ID )
            	            {
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:806:1: (otherlv_4= RULE_ID )
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:807:3: otherlv_4= RULE_ID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getFragmentWithAction3Rule());
            	            	        }
            	                    
            	            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction31635); 

            	            		newLeafNode(otherlv_4, grammarAccess.getFragmentWithAction3Access().getRef2PRFNamedCrossReference_1_3_0()); 
            	            	

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFragmentWithAction3"


    // $ANTLR start "rulePRFNamedFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:827:1: rulePRFNamedFragment[EObject in_current] returns [EObject current=in_current] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePRFNamedFragment(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:830:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:831:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:831:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:832:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:832:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:833:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedFragment1694); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPRFNamedFragmentAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPRFNamedFragmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRFNamedFragment"


    // $ANTLR start "rulePRFNamedRef"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:858:1: rulePRFNamedRef[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePRFNamedRef(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:861:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:862:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:862:1: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:863:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:863:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:864:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPRFNamedRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedRef1757); 

            		newLeafNode(otherlv_0, grammarAccess.getPRFNamedRefAccess().getRefPRFNamedCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRFNamedRef"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleParserRuleFragments_in_entryRuleParserRuleFragments75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRuleFragments85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleParserRuleFragments133 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamed_in_ruleParserRuleFragments154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleParserRuleFragments174 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamed_in_ruleParserRuleFragments195 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParserRuleFragments207 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRuleFragments227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleParserRuleFragments247 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedRefFirst_in_ruleParserRuleFragments268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParserRuleFragments288 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithAction_in_ruleParserRuleFragments309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleParserRuleFragments329 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment_in_ruleParserRuleFragments350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleParserRuleFragments370 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment2_in_ruleParserRuleFragments391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleParserRuleFragments411 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment3_in_ruleParserRuleFragments432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamed_in_entryRulePRFNamed470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamed480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_rulePRFNamed527 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_rulePRFNamed541 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamed561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamed581 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedRef_in_rulePRFNamed603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedRefFirst_in_entryRulePRFNamedRefFirst642 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedRefFirst652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedRefFirst697 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePRFNamedRefFirst709 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_rulePRFNamedRefFirst731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithAction_in_entryRulePRFNamedWithAction767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithAction777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamed_in_rulePRFNamedWithAction824 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction849 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction875 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment_in_entryRulePRFNamedWithActionInFragment933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_rulePRFNamedWithActionInFragment990 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment1003 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment2_in_entryRulePRFNamedWithActionInFragment21061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment21071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21113 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_rulePRFNamedWithActionInFragment21140 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment21153 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment3_in_entryRulePRFNamedWithActionInFragment31211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment31221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_rulePRFNamedWithActionInFragment31268 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_rulePRFNamedWithActionInFragment31281 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment31301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1360 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1391 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21483 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31566 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleFragmentWithAction31593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31610 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31635 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedFragment1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedRef1757 = new BitSet(new long[]{0x0000000000000002L});
    }


}