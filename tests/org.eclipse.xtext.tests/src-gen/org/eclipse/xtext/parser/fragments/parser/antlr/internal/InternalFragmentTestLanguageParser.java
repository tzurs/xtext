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
        	return "Fragments";	
       	}
       	
       	@Override
       	protected FragmentTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFragments"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:67:1: entryRuleFragments returns [EObject current=null] : iv_ruleFragments= ruleFragments EOF ;
    public final EObject entryRuleFragments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragments = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:68:2: (iv_ruleFragments= ruleFragments EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:69:2: iv_ruleFragments= ruleFragments EOF
            {
             newCompositeNode(grammarAccess.getFragmentsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragments_in_entryRuleFragments75);
            iv_ruleFragments=ruleFragments();

            state._fsp--;

             current =iv_ruleFragments; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragments85); 

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
    // $ANTLR end "entryRuleFragments"


    // $ANTLR start "ruleFragments"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:76:1: ruleFragments returns [EObject current=null] : ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) ) ;
    public final EObject ruleFragments() throws RecognitionException {
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
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:79:28: ( ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:80:1: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:80:1: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:80:2: () ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:80:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFragmentsAccess().getFragmentsAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:86:2: ( (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) )
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:86:3: (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:86:3: (otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:86:5: otherlv_1= '#1' ( (lv_element_2_0= ruleNamed ) )
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFragments133); 

                        	newLeafNode(otherlv_1, grammarAccess.getFragmentsAccess().getNumberSignDigitOneKeyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:90:1: ( (lv_element_2_0= ruleNamed ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:91:1: (lv_element_2_0= ruleNamed )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:91:1: (lv_element_2_0= ruleNamed )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:92:3: lv_element_2_0= ruleNamed
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleFragments154);
                    lv_element_2_0=ruleNamed();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_2_0, 
                            		"Named");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:109:6: (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:109:6: (otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:109:8: otherlv_3= '#2' ( (lv_element_4_0= ruleNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFragments174); 

                        	newLeafNode(otherlv_3, grammarAccess.getFragmentsAccess().getNumberSignDigitTwoKeyword_1_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:113:1: ( (lv_element_4_0= ruleNamed ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:114:1: (lv_element_4_0= ruleNamed )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:114:1: (lv_element_4_0= ruleNamed )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:115:3: lv_element_4_0= ruleNamed
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleFragments195);
                    lv_element_4_0=ruleNamed();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_4_0, 
                            		"Named");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFragments207); 

                        	newLeafNode(otherlv_5, grammarAccess.getFragmentsAccess().getHyphenMinusGreaterThanSignKeyword_1_1_2());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:135:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:136:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:136:1: (otherlv_6= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:137:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFragmentsRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragments227); 

                    		newLeafNode(otherlv_6, grammarAccess.getFragmentsAccess().getRefNamedCrossReference_1_1_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:149:6: (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:149:6: (otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:149:8: otherlv_7= '#3' ( (lv_element_8_0= ruleNamedRefFirst ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFragments247); 

                        	newLeafNode(otherlv_7, grammarAccess.getFragmentsAccess().getNumberSignDigitThreeKeyword_1_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:153:1: ( (lv_element_8_0= ruleNamedRefFirst ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:154:1: (lv_element_8_0= ruleNamedRefFirst )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:154:1: (lv_element_8_0= ruleNamedRefFirst )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:155:3: lv_element_8_0= ruleNamedRefFirst
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedRefFirstParserRuleCall_1_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedRefFirst_in_ruleFragments268);
                    lv_element_8_0=ruleNamedRefFirst();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_8_0, 
                            		"NamedRefFirst");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:172:6: (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:172:6: (otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:172:8: otherlv_9= '#4' ( (lv_element_10_0= ruleNamedWithAction ) )
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFragments288); 

                        	newLeafNode(otherlv_9, grammarAccess.getFragmentsAccess().getNumberSignDigitFourKeyword_1_3_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:176:1: ( (lv_element_10_0= ruleNamedWithAction ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:177:1: (lv_element_10_0= ruleNamedWithAction )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:177:1: (lv_element_10_0= ruleNamedWithAction )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:178:3: lv_element_10_0= ruleNamedWithAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedWithActionParserRuleCall_1_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithAction_in_ruleFragments309);
                    lv_element_10_0=ruleNamedWithAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_10_0, 
                            		"NamedWithAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:195:6: (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:195:6: (otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:195:8: otherlv_11= '#5' ( (lv_element_12_0= ruleNamedWithActionInFragment ) )
                    {
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFragments329); 

                        	newLeafNode(otherlv_11, grammarAccess.getFragmentsAccess().getNumberSignDigitFiveKeyword_1_4_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:199:1: ( (lv_element_12_0= ruleNamedWithActionInFragment ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:200:1: (lv_element_12_0= ruleNamedWithActionInFragment )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:200:1: (lv_element_12_0= ruleNamedWithActionInFragment )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:201:3: lv_element_12_0= ruleNamedWithActionInFragment
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedWithActionInFragmentParserRuleCall_1_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment_in_ruleFragments350);
                    lv_element_12_0=ruleNamedWithActionInFragment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_12_0, 
                            		"NamedWithActionInFragment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:218:6: (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:218:6: (otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:218:8: otherlv_13= '#6' ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) )
                    {
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFragments370); 

                        	newLeafNode(otherlv_13, grammarAccess.getFragmentsAccess().getNumberSignDigitSixKeyword_1_5_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:222:1: ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:223:1: (lv_element_14_0= ruleNamedWithActionInFragment2 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:223:1: (lv_element_14_0= ruleNamedWithActionInFragment2 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:224:3: lv_element_14_0= ruleNamedWithActionInFragment2
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment2_in_ruleFragments391);
                    lv_element_14_0=ruleNamedWithActionInFragment2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_14_0, 
                            		"NamedWithActionInFragment2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:241:6: (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:241:6: (otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:241:8: otherlv_15= '#7' ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) )
                    {
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFragments411); 

                        	newLeafNode(otherlv_15, grammarAccess.getFragmentsAccess().getNumberSignDigitSevenKeyword_1_6_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:245:1: ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:246:1: (lv_element_16_0= ruleNamedWithActionInFragment3 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:246:1: (lv_element_16_0= ruleNamedWithActionInFragment3 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:247:3: lv_element_16_0= ruleNamedWithActionInFragment3
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment3_in_ruleFragments432);
                    lv_element_16_0=ruleNamedWithActionInFragment3();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFragmentsRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_16_0, 
                            		"NamedWithActionInFragment3");
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
    // $ANTLR end "ruleFragments"


    // $ANTLR start "entryRuleNamed"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:271:1: entryRuleNamed returns [EObject current=null] : iv_ruleNamed= ruleNamed EOF ;
    public final EObject entryRuleNamed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamed = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:272:2: (iv_ruleNamed= ruleNamed EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:273:2: iv_ruleNamed= ruleNamed EOF
            {
             newCompositeNode(grammarAccess.getNamedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamed_in_entryRuleNamed470);
            iv_ruleNamed=ruleNamed();

            state._fsp--;

             current =iv_ruleNamed; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamed480); 

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
    // $ANTLR end "entryRuleNamed"


    // $ANTLR start "ruleNamed"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:280:1: ruleNamed returns [EObject current=null] : (this_NamedFragment_0= ruleNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current] ) )? ) ;
    public final EObject ruleNamed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_NamedFragment_0 = null;

        EObject this_NamedRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:283:28: ( (this_NamedFragment_0= ruleNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current] ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:284:1: (this_NamedFragment_0= ruleNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current] ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:284:1: (this_NamedFragment_0= ruleNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current] ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:285:5: this_NamedFragment_0= ruleNamedFragment[$current] ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current] ) )?
            {
             
            		if (current==null) {
            			current = createModelElement(grammarAccess.getNamedRule());
            		}
                    newCompositeNode(grammarAccess.getNamedAccess().getNamedFragmentParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_ruleNamed527);
            this_NamedFragment_0=ruleNamedFragment(current);

            state._fsp--;

             
                    current = this_NamedFragment_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:296:1: ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current] ) )?
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
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNamed541); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedAccess().getColonKeyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:300:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:301:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:301:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:302:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamed561); 

                    		newLeafNode(otherlv_2, grammarAccess.getNamedAccess().getRefNamedCrossReference_1_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:314:6: (otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current] )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:314:6: (otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current] )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:314:8: otherlv_3= '-' this_NamedRef_4= ruleNamedRef[$current]
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamed581); 

                        	newLeafNode(otherlv_3, grammarAccess.getNamedAccess().getHyphenMinusKeyword_1_1_0());
                        
                     
                    		if (current==null) {
                    			current = createModelElement(grammarAccess.getNamedRule());
                    		}
                            newCompositeNode(grammarAccess.getNamedAccess().getNamedRefParserRuleCall_1_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNamedRef_in_ruleNamed603);
                    this_NamedRef_4=ruleNamedRef(current);

                    state._fsp--;

                     
                            current = this_NamedRef_4; 
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
    // $ANTLR end "ruleNamed"


    // $ANTLR start "entryRuleNamedRefFirst"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:338:1: entryRuleNamedRefFirst returns [EObject current=null] : iv_ruleNamedRefFirst= ruleNamedRefFirst EOF ;
    public final EObject entryRuleNamedRefFirst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedRefFirst = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:339:2: (iv_ruleNamedRefFirst= ruleNamedRefFirst EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:340:2: iv_ruleNamedRefFirst= ruleNamedRefFirst EOF
            {
             newCompositeNode(grammarAccess.getNamedRefFirstRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedRefFirst_in_entryRuleNamedRefFirst642);
            iv_ruleNamedRefFirst=ruleNamedRefFirst();

            state._fsp--;

             current =iv_ruleNamedRefFirst; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedRefFirst652); 

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
    // $ANTLR end "entryRuleNamedRefFirst"


    // $ANTLR start "ruleNamedRefFirst"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:347:1: ruleNamedRefFirst returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_NamedFragment_2= ruleNamedFragment[$current] ) ;
    public final EObject ruleNamedRefFirst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_NamedFragment_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:350:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_NamedFragment_2= ruleNamedFragment[$current] ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:351:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_NamedFragment_2= ruleNamedFragment[$current] )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:351:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_NamedFragment_2= ruleNamedFragment[$current] )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:351:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' this_NamedFragment_2= ruleNamedFragment[$current]
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:351:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:352:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:352:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:353:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedRefFirstRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedRefFirst697); 

            		newLeafNode(otherlv_0, grammarAccess.getNamedRefFirstAccess().getRefNamedCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNamedRefFirst709); 

                	newLeafNode(otherlv_1, grammarAccess.getNamedRefFirstAccess().getLessThanSignHyphenMinusKeyword_1());
                
             
            		if (current==null) {
            			current = createModelElement(grammarAccess.getNamedRefFirstRule());
            		}
                    newCompositeNode(grammarAccess.getNamedRefFirstAccess().getNamedFragmentParserRuleCall_2()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_ruleNamedRefFirst731);
            this_NamedFragment_2=ruleNamedFragment(current);

            state._fsp--;

             
                    current = this_NamedFragment_2; 
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
    // $ANTLR end "ruleNamedRefFirst"


    // $ANTLR start "entryRuleNamedWithAction"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:388:1: entryRuleNamedWithAction returns [EObject current=null] : iv_ruleNamedWithAction= ruleNamedWithAction EOF ;
    public final EObject entryRuleNamedWithAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedWithAction = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:389:2: (iv_ruleNamedWithAction= ruleNamedWithAction EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:390:2: iv_ruleNamedWithAction= ruleNamedWithAction EOF
            {
             newCompositeNode(grammarAccess.getNamedWithActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithAction_in_entryRuleNamedWithAction767);
            iv_ruleNamedWithAction=ruleNamedWithAction();

            state._fsp--;

             current =iv_ruleNamedWithAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithAction777); 

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
    // $ANTLR end "entryRuleNamedWithAction"


    // $ANTLR start "ruleNamedWithAction"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:397:1: ruleNamedWithAction returns [EObject current=null] : (this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleNamedWithAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_Named_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:400:28: ( (this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:401:1: (this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:401:1: (this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:402:5: this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getNamedWithActionAccess().getNamedParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleNamedWithAction824);
            this_Named_0=ruleNamed();

            state._fsp--;

             
                    current = this_Named_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:410:1: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:411:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getNamedWithActionAccess().getNamedWithActionPrevAction_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:416:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:417:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:417:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:418:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction849); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNamedWithActionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedWithActionRule());
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
                    	            current = createModelElement(grammarAccess.getNamedWithActionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction875); 

                    		newLeafNode(otherlv_3, grammarAccess.getNamedWithActionAccess().getRefNamedCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:447:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:448:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:448:1: (otherlv_4= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:449:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedWithActionRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction895); 

                    		newLeafNode(otherlv_4, grammarAccess.getNamedWithActionAccess().getRef2NamedCrossReference_3_1_0()); 
                    	

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
    // $ANTLR end "ruleNamedWithAction"


    // $ANTLR start "entryRuleNamedWithActionInFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:468:1: entryRuleNamedWithActionInFragment returns [EObject current=null] : iv_ruleNamedWithActionInFragment= ruleNamedWithActionInFragment EOF ;
    public final EObject entryRuleNamedWithActionInFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedWithActionInFragment = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:469:2: (iv_ruleNamedWithActionInFragment= ruleNamedWithActionInFragment EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:470:2: iv_ruleNamedWithActionInFragment= ruleNamedWithActionInFragment EOF
            {
             newCompositeNode(grammarAccess.getNamedWithActionInFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment_in_entryRuleNamedWithActionInFragment933);
            iv_ruleNamedWithActionInFragment=ruleNamedWithActionInFragment();

            state._fsp--;

             current =iv_ruleNamedWithActionInFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment943); 

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
    // $ANTLR end "entryRuleNamedWithActionInFragment"


    // $ANTLR start "ruleNamedWithActionInFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:477:1: ruleNamedWithActionInFragment returns [EObject current=null] : (this_FragmentWithAction_0= ruleFragmentWithAction[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleNamedWithActionInFragment() throws RecognitionException {
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
            			current = createModelElement(grammarAccess.getNamedWithActionInFragmentRule());
            		}
                    newCompositeNode(grammarAccess.getNamedWithActionInFragmentAccess().getFragmentWithActionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_ruleNamedWithActionInFragment990);
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
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment1003); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedWithActionInFragmentAccess().getHyphenMinusKeyword_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:497:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:498:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:498:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:499:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedWithActionInFragmentRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment1023); 

                    		newLeafNode(otherlv_2, grammarAccess.getNamedWithActionInFragmentAccess().getRefNamedCrossReference_1_1_0()); 
                    	

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
    // $ANTLR end "ruleNamedWithActionInFragment"


    // $ANTLR start "entryRuleNamedWithActionInFragment2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:518:1: entryRuleNamedWithActionInFragment2 returns [EObject current=null] : iv_ruleNamedWithActionInFragment2= ruleNamedWithActionInFragment2 EOF ;
    public final EObject entryRuleNamedWithActionInFragment2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedWithActionInFragment2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:519:2: (iv_ruleNamedWithActionInFragment2= ruleNamedWithActionInFragment2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:520:2: iv_ruleNamedWithActionInFragment2= ruleNamedWithActionInFragment2 EOF
            {
             newCompositeNode(grammarAccess.getNamedWithActionInFragment2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment2_in_entryRuleNamedWithActionInFragment21061);
            iv_ruleNamedWithActionInFragment2=ruleNamedWithActionInFragment2();

            state._fsp--;

             current =iv_ruleNamedWithActionInFragment2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment21071); 

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
    // $ANTLR end "entryRuleNamedWithActionInFragment2"


    // $ANTLR start "ruleNamedWithActionInFragment2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:527:1: ruleNamedWithActionInFragment2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2[$current] (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleNamedWithActionInFragment2() throws RecognitionException {
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
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21113); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNamedWithActionInFragment2Access().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedWithActionInFragment2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

             
            		if (current==null) {
            			current = createModelElement(grammarAccess.getNamedWithActionInFragment2Rule());
            		}
                    newCompositeNode(grammarAccess.getNamedWithActionInFragment2Access().getFragmentWithAction2ParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_ruleNamedWithActionInFragment21140);
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
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment21153); 

                        	newLeafNode(otherlv_2, grammarAccess.getNamedWithActionInFragment2Access().getHyphenMinusKeyword_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:565:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:566:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:566:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:567:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedWithActionInFragment2Rule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21173); 

                    		newLeafNode(otherlv_3, grammarAccess.getNamedWithActionInFragment2Access().getRefNamedCrossReference_2_1_0()); 
                    	

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
    // $ANTLR end "ruleNamedWithActionInFragment2"


    // $ANTLR start "entryRuleNamedWithActionInFragment3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:586:1: entryRuleNamedWithActionInFragment3 returns [EObject current=null] : iv_ruleNamedWithActionInFragment3= ruleNamedWithActionInFragment3 EOF ;
    public final EObject entryRuleNamedWithActionInFragment3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedWithActionInFragment3 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:587:2: (iv_ruleNamedWithActionInFragment3= ruleNamedWithActionInFragment3 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:588:2: iv_ruleNamedWithActionInFragment3= ruleNamedWithActionInFragment3 EOF
            {
             newCompositeNode(grammarAccess.getNamedWithActionInFragment3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment3_in_entryRuleNamedWithActionInFragment31211);
            iv_ruleNamedWithActionInFragment3=ruleNamedWithActionInFragment3();

            state._fsp--;

             current =iv_ruleNamedWithActionInFragment3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment31221); 

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
    // $ANTLR end "entryRuleNamedWithActionInFragment3"


    // $ANTLR start "ruleNamedWithActionInFragment3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:595:1: ruleNamedWithActionInFragment3 returns [EObject current=null] : (this_FragmentWithAction3_0= ruleFragmentWithAction3[$current] (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleNamedWithActionInFragment3() throws RecognitionException {
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
            			current = createModelElement(grammarAccess.getNamedWithActionInFragment3Rule());
            		}
                    newCompositeNode(grammarAccess.getNamedWithActionInFragment3Access().getFragmentWithAction3ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_ruleNamedWithActionInFragment31268);
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
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNamedWithActionInFragment31281); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedWithActionInFragment3Access().getHyphenMinusKeyword_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:615:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:616:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:616:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:617:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedWithActionInFragment3Rule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment31301); 

                    		newLeafNode(otherlv_2, grammarAccess.getNamedWithActionInFragment3Access().getRefNamedCrossReference_1_1_0()); 
                    	

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
    // $ANTLR end "ruleNamedWithActionInFragment3"


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
                        grammarAccess.getFragmentWithActionAccess().getNamedWithActionPrevAction_1(),
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

                    		newLeafNode(otherlv_3, grammarAccess.getFragmentWithActionAccess().getRef2NamedCrossReference_3_0()); 
                    	

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
                        grammarAccess.getFragmentWithAction2Access().getNamedWithActionPrevAction_0(),
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

                    		newLeafNode(otherlv_2, grammarAccess.getFragmentWithAction2Access().getRef2NamedCrossReference_2_0()); 
                    	

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
            	                grammarAccess.getFragmentWithAction3Access().getNamedWithActionPrevAction_1_0(),
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

            	            		newLeafNode(otherlv_4, grammarAccess.getFragmentWithAction3Access().getRef2NamedCrossReference_1_3_0()); 
            	            	

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


    // $ANTLR start "ruleNamedFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:827:1: ruleNamedFragment[EObject in_current] returns [EObject current=in_current] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNamedFragment(EObject in_current) throws RecognitionException {
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
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedFragment1694); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNamedFragmentAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedFragmentRule());
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
    // $ANTLR end "ruleNamedFragment"


    // $ANTLR start "ruleNamedRef"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguage.g:858:1: ruleNamedRef[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNamedRef(EObject in_current) throws RecognitionException {
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
            	            current = createModelElement(grammarAccess.getNamedRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedRef1757); 

            		newLeafNode(otherlv_0, grammarAccess.getNamedRefAccess().getRefNamedCrossReference_0()); 
            	

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
    // $ANTLR end "ruleNamedRef"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFragments_in_entryRuleFragments75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragments85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFragments133 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleFragments154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleFragments174 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleFragments195 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFragments207 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragments227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleFragments247 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedRefFirst_in_ruleFragments268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleFragments288 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithAction_in_ruleFragments309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleFragments329 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment_in_ruleFragments350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleFragments370 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment2_in_ruleFragments391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleFragments411 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment3_in_ruleFragments432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamed_in_entryRuleNamed470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamed480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedFragment_in_ruleNamed527 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_ruleNamed541 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamed561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNamed581 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedRef_in_ruleNamed603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedRefFirst_in_entryRuleNamedRefFirst642 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedRefFirst652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedRefFirst697 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleNamedRefFirst709 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNamedFragment_in_ruleNamedRefFirst731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithAction_in_entryRuleNamedWithAction767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithAction777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleNamedWithAction824 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction849 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction875 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment_in_entryRuleNamedWithActionInFragment933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_ruleNamedWithActionInFragment990 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment1003 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment2_in_entryRuleNamedWithActionInFragment21061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment21071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21113 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_ruleNamedWithActionInFragment21140 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment21153 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment3_in_entryRuleNamedWithActionInFragment31211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment31221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_ruleNamedWithActionInFragment31268 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleNamedWithActionInFragment31281 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment31301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1360 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1391 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21483 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31566 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleFragmentWithAction31593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31610 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31635 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedFragment1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedRef1757 = new BitSet(new long[]{0x0000000000000002L});
    }


}