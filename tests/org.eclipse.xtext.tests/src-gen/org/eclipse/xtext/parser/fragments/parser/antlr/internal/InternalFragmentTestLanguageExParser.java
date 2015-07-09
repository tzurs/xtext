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
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageExGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFragmentTestLanguageExParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NumberSignDigitOne", "NumberSignDigitTwo", "NumberSignDigitThree", "NumberSignDigitFour", "NumberSignDigitFive", "NumberSignDigitSix", "NumberSignDigitSeven", "HyphenMinusGreaterThanSign", "LessThanSignHyphenMinus", "HyphenMinus", "Colon", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=15;
    public static final int HyphenMinus=13;
    public static final int LessThanSignHyphenMinus=12;
    public static final int RULE_ANY_OTHER=21;
    public static final int NumberSignDigitSeven=10;
    public static final int Colon=14;
    public static final int EOF=-1;
    public static final int NumberSignDigitThree=6;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_STRING=17;
    public static final int NumberSignDigitOne=4;
    public static final int NumberSignDigitTwo=5;
    public static final int RULE_INT=16;
    public static final int NumberSignDigitFour=7;
    public static final int NumberSignDigitSix=9;
    public static final int RULE_WS=20;
    public static final int NumberSignDigitFive=8;
    public static final int HyphenMinusGreaterThanSign=11;

    // delegates
    // delegators


        public InternalFragmentTestLanguageExParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFragmentTestLanguageExParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFragmentTestLanguageExParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g"; }




    	private FragmentTestLanguageExGrammarAccess grammarAccess;
    	 	
    	public InternalFragmentTestLanguageExParser(TokenStream input, FragmentTestLanguageExGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "ParserRuleFragmentsEx";	
    	} 
    	   	   	
    	@Override
    	protected FragmentTestLanguageExGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleParserRuleFragmentsEx"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:61:1: entryRuleParserRuleFragmentsEx returns [EObject current=null] : iv_ruleParserRuleFragmentsEx= ruleParserRuleFragmentsEx EOF ;
    public final EObject entryRuleParserRuleFragmentsEx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRuleFragmentsEx = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:62:2: (iv_ruleParserRuleFragmentsEx= ruleParserRuleFragmentsEx EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:63:2: iv_ruleParserRuleFragmentsEx= ruleParserRuleFragmentsEx EOF
            {
             newCompositeNode(grammarAccess.getParserRuleFragmentsExRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRuleFragmentsEx_in_entryRuleParserRuleFragmentsEx67);
            iv_ruleParserRuleFragmentsEx=ruleParserRuleFragmentsEx();

            state._fsp--;

             current =iv_ruleParserRuleFragmentsEx; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRuleFragmentsEx77); 

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
    // $ANTLR end "entryRuleParserRuleFragmentsEx"


    // $ANTLR start "ruleParserRuleFragmentsEx"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:70:1: ruleParserRuleFragmentsEx returns [EObject current=null] : this_ParserRuleFragments_0= ruleParserRuleFragments ;
    public final EObject ruleParserRuleFragmentsEx() throws RecognitionException {
        EObject current = null;

        EObject this_ParserRuleFragments_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:73:28: (this_ParserRuleFragments_0= ruleParserRuleFragments )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:75:5: this_ParserRuleFragments_0= ruleParserRuleFragments
            {
             
                    newCompositeNode(grammarAccess.getParserRuleFragmentsExAccess().getParserRuleFragmentsParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleParserRuleFragments_in_ruleParserRuleFragmentsEx123);
            this_ParserRuleFragments_0=ruleParserRuleFragments();

            state._fsp--;


                    current = this_ParserRuleFragments_0;
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleParserRuleFragmentsEx"


    // $ANTLR start "entryRuleParserRuleFragments"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:91:1: entryRuleParserRuleFragments returns [EObject current=null] : iv_ruleParserRuleFragments= ruleParserRuleFragments EOF ;
    public final EObject entryRuleParserRuleFragments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRuleFragments = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:92:2: (iv_ruleParserRuleFragments= ruleParserRuleFragments EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:93:2: iv_ruleParserRuleFragments= ruleParserRuleFragments EOF
            {
             newCompositeNode(grammarAccess.getParserRuleFragmentsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRuleFragments_in_entryRuleParserRuleFragments156);
            iv_ruleParserRuleFragments=ruleParserRuleFragments();

            state._fsp--;

             current =iv_ruleParserRuleFragments; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRuleFragments166); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:100:1: ruleParserRuleFragments returns [EObject current=null] : ( () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:103:28: ( ( () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:104:1: ( () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:104:1: ( () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:104:2: () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:104:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:105:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParserRuleFragmentsAccess().getParserRuleFragmentsAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:110:2: ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case NumberSignDigitOne:
                {
                alt1=1;
                }
                break;
            case NumberSignDigitTwo:
                {
                alt1=2;
                }
                break;
            case NumberSignDigitThree:
                {
                alt1=3;
                }
                break;
            case NumberSignDigitFour:
                {
                alt1=4;
                }
                break;
            case NumberSignDigitFive:
                {
                alt1=5;
                }
                break;
            case NumberSignDigitSix:
                {
                alt1=6;
                }
                break;
            case NumberSignDigitSeven:
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:110:3: (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:110:3: (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:111:2: otherlv_1= NumberSignDigitOne ( (lv_element_2_0= rulePRFNamed ) )
                    {
                    otherlv_1=(Token)match(input,NumberSignDigitOne,FollowSets000.FOLLOW_NumberSignDigitOne_in_ruleParserRuleFragments215); 

                        	newLeafNode(otherlv_1, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitOneKeyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:115:1: ( (lv_element_2_0= rulePRFNamed ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:116:1: (lv_element_2_0= rulePRFNamed )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:116:1: (lv_element_2_0= rulePRFNamed )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:117:3: lv_element_2_0= rulePRFNamed
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_ruleParserRuleFragments235);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:134:6: (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:134:6: (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:135:2: otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,NumberSignDigitTwo,FollowSets000.FOLLOW_NumberSignDigitTwo_in_ruleParserRuleFragments256); 

                        	newLeafNode(otherlv_3, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitTwoKeyword_1_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:139:1: ( (lv_element_4_0= rulePRFNamed ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:140:1: (lv_element_4_0= rulePRFNamed )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:140:1: (lv_element_4_0= rulePRFNamed )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:141:3: lv_element_4_0= rulePRFNamed
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_ruleParserRuleFragments276);
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

                    otherlv_5=(Token)match(input,HyphenMinusGreaterThanSign,FollowSets000.FOLLOW_HyphenMinusGreaterThanSign_in_ruleParserRuleFragments289); 

                        	newLeafNode(otherlv_5, grammarAccess.getParserRuleFragmentsAccess().getHyphenMinusGreaterThanSignKeyword_1_1_2());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:162:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:163:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:163:1: (otherlv_6= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:164:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleFragmentsRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRuleFragments308); 

                    		newLeafNode(otherlv_6, grammarAccess.getParserRuleFragmentsAccess().getRefPRFNamedCrossReference_1_1_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:176:6: (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:176:6: (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:177:2: otherlv_7= NumberSignDigitThree ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    {
                    otherlv_7=(Token)match(input,NumberSignDigitThree,FollowSets000.FOLLOW_NumberSignDigitThree_in_ruleParserRuleFragments329); 

                        	newLeafNode(otherlv_7, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitThreeKeyword_1_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:181:1: ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:182:1: (lv_element_8_0= rulePRFNamedRefFirst )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:182:1: (lv_element_8_0= rulePRFNamedRefFirst )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:183:3: lv_element_8_0= rulePRFNamedRefFirst
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedRefFirstParserRuleCall_1_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedRefFirst_in_ruleParserRuleFragments349);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:200:6: (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:200:6: (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:201:2: otherlv_9= NumberSignDigitFour ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    {
                    otherlv_9=(Token)match(input,NumberSignDigitFour,FollowSets000.FOLLOW_NumberSignDigitFour_in_ruleParserRuleFragments370); 

                        	newLeafNode(otherlv_9, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitFourKeyword_1_3_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:205:1: ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:206:1: (lv_element_10_0= rulePRFNamedWithAction )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:206:1: (lv_element_10_0= rulePRFNamedWithAction )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:207:3: lv_element_10_0= rulePRFNamedWithAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionParserRuleCall_1_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithAction_in_ruleParserRuleFragments390);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:224:6: (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:224:6: (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:225:2: otherlv_11= NumberSignDigitFive ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    {
                    otherlv_11=(Token)match(input,NumberSignDigitFive,FollowSets000.FOLLOW_NumberSignDigitFive_in_ruleParserRuleFragments411); 

                        	newLeafNode(otherlv_11, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitFiveKeyword_1_4_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:229:1: ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:230:1: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:230:1: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:231:3: lv_element_12_0= rulePRFNamedWithActionInFragment
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionInFragmentParserRuleCall_1_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment_in_ruleParserRuleFragments431);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:248:6: (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:248:6: (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:249:2: otherlv_13= NumberSignDigitSix ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    {
                    otherlv_13=(Token)match(input,NumberSignDigitSix,FollowSets000.FOLLOW_NumberSignDigitSix_in_ruleParserRuleFragments452); 

                        	newLeafNode(otherlv_13, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitSixKeyword_1_5_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:253:1: ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:254:1: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:254:1: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:255:3: lv_element_14_0= rulePRFNamedWithActionInFragment2
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionInFragment2ParserRuleCall_1_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment2_in_ruleParserRuleFragments472);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:272:6: (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:272:6: (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:273:2: otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    {
                    otherlv_15=(Token)match(input,NumberSignDigitSeven,FollowSets000.FOLLOW_NumberSignDigitSeven_in_ruleParserRuleFragments493); 

                        	newLeafNode(otherlv_15, grammarAccess.getParserRuleFragmentsAccess().getNumberSignDigitSevenKeyword_1_6_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:277:1: ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:278:1: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:278:1: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:279:3: lv_element_16_0= rulePRFNamedWithActionInFragment3
                    {
                     
                    	        newCompositeNode(grammarAccess.getParserRuleFragmentsAccess().getElementPRFNamedWithActionInFragment3ParserRuleCall_1_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment3_in_ruleParserRuleFragments513);
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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:303:1: entryRulePRFNamed returns [EObject current=null] : iv_rulePRFNamed= rulePRFNamed EOF ;
    public final EObject entryRulePRFNamed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamed = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:304:2: (iv_rulePRFNamed= rulePRFNamed EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:305:2: iv_rulePRFNamed= rulePRFNamed EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_entryRulePRFNamed550);
            iv_rulePRFNamed=rulePRFNamed();

            state._fsp--;

             current =iv_rulePRFNamed; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamed560); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:312:1: rulePRFNamed returns [EObject current=null] : (this_PRFNamedFragment_0= rulePRFNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef ) )? ) ;
    public final EObject rulePRFNamed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_PRFNamedFragment_0 = null;

        EObject this_PRFNamedRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:315:28: ( (this_PRFNamedFragment_0= rulePRFNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:316:1: (this_PRFNamedFragment_0= rulePRFNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:316:1: (this_PRFNamedFragment_0= rulePRFNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:317:5: this_PRFNamedFragment_0= rulePRFNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef ) )?
            {
             
                    newCompositeNode(grammarAccess.getPRFNamedAccess().getPRFNamedFragmentParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_rulePRFNamed607);
            this_PRFNamedFragment_0=rulePRFNamedFragment();

            state._fsp--;


                    current = this_PRFNamedFragment_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:325:1: ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef ) )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Colon) ) {
                alt2=1;
            }
            else if ( (LA2_0==HyphenMinus) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:325:2: (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:325:2: (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:326:2: otherlv_1= Colon ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_Colon_in_rulePRFNamed621); 

                        	newLeafNode(otherlv_1, grammarAccess.getPRFNamedAccess().getColonKeyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:330:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:331:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:331:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:332:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamed640); 

                    		newLeafNode(otherlv_2, grammarAccess.getPRFNamedAccess().getRefPRFNamedCrossReference_1_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:344:6: (otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:344:6: (otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:345:2: otherlv_3= HyphenMinus this_PRFNamedRef_4= rulePRFNamedRef
                    {
                    otherlv_3=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_HyphenMinus_in_rulePRFNamed661); 

                        	newLeafNode(otherlv_3, grammarAccess.getPRFNamedAccess().getHyphenMinusKeyword_1_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPRFNamedAccess().getPRFNamedRefParserRuleCall_1_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePRFNamedRef_in_rulePRFNamed682);
                    this_PRFNamedRef_4=rulePRFNamedRef();

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:366:1: entryRulePRFNamedRefFirst returns [EObject current=null] : iv_rulePRFNamedRefFirst= rulePRFNamedRefFirst EOF ;
    public final EObject entryRulePRFNamedRefFirst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedRefFirst = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:367:2: (iv_rulePRFNamedRefFirst= rulePRFNamedRefFirst EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:368:2: iv_rulePRFNamedRefFirst= rulePRFNamedRefFirst EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedRefFirstRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedRefFirst_in_entryRulePRFNamedRefFirst719);
            iv_rulePRFNamedRefFirst=rulePRFNamedRefFirst();

            state._fsp--;

             current =iv_rulePRFNamedRefFirst; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedRefFirst729); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:375:1: rulePRFNamedRefFirst returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_PRFNamedFragment_2= rulePRFNamedFragment ) ;
    public final EObject rulePRFNamedRefFirst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_PRFNamedFragment_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:378:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_PRFNamedFragment_2= rulePRFNamedFragment ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:379:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_PRFNamedFragment_2= rulePRFNamedFragment )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:379:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_PRFNamedFragment_2= rulePRFNamedFragment )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:379:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_PRFNamedFragment_2= rulePRFNamedFragment
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:379:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:380:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:380:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:381:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPRFNamedRefFirstRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedRefFirst774); 

            		newLeafNode(otherlv_0, grammarAccess.getPRFNamedRefFirstAccess().getRefPRFNamedCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,LessThanSignHyphenMinus,FollowSets000.FOLLOW_LessThanSignHyphenMinus_in_rulePRFNamedRefFirst787); 

                	newLeafNode(otherlv_1, grammarAccess.getPRFNamedRefFirstAccess().getLessThanSignHyphenMinusKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getPRFNamedRefFirstAccess().getPRFNamedFragmentParserRuleCall_2()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_rulePRFNamedRefFirst808);
            this_PRFNamedFragment_2=rulePRFNamedFragment();

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:414:1: entryRulePRFNamedWithAction returns [EObject current=null] : iv_rulePRFNamedWithAction= rulePRFNamedWithAction EOF ;
    public final EObject entryRulePRFNamedWithAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedWithAction = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:415:2: (iv_rulePRFNamedWithAction= rulePRFNamedWithAction EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:416:2: iv_rulePRFNamedWithAction= rulePRFNamedWithAction EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedWithActionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithAction_in_entryRulePRFNamedWithAction842);
            iv_rulePRFNamedWithAction=rulePRFNamedWithAction();

            state._fsp--;

             current =iv_rulePRFNamedWithAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithAction852); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:423:1: rulePRFNamedWithAction returns [EObject current=null] : (this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject rulePRFNamedWithAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_PRFNamed_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:426:28: ( (this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:427:1: (this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:427:1: (this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:428:5: this_PRFNamed_0= rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getPRFNamedWithActionAccess().getPRFNamedParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePRFNamed_in_rulePRFNamedWithAction899);
            this_PRFNamed_0=rulePRFNamed();

            state._fsp--;


                    current = this_PRFNamed_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:436:1: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:437:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getPRFNamedWithActionAccess().getPRFNamedWithActionPrevAction_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:442:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:443:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:443:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:444:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction924); 

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

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:460:2: ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:460:3: ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:460:3: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:461:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:461:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:462:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction950); 

                    		newLeafNode(otherlv_3, grammarAccess.getPRFNamedWithActionAccess().getRefPRFNamedCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:473:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:474:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:474:1: (otherlv_4= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:475:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithAction970); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:494:1: entryRulePRFNamedWithActionInFragment returns [EObject current=null] : iv_rulePRFNamedWithActionInFragment= rulePRFNamedWithActionInFragment EOF ;
    public final EObject entryRulePRFNamedWithActionInFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedWithActionInFragment = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:495:2: (iv_rulePRFNamedWithActionInFragment= rulePRFNamedWithActionInFragment EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:496:2: iv_rulePRFNamedWithActionInFragment= rulePRFNamedWithActionInFragment EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedWithActionInFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment_in_entryRulePRFNamedWithActionInFragment1007);
            iv_rulePRFNamedWithActionInFragment=rulePRFNamedWithActionInFragment();

            state._fsp--;

             current =iv_rulePRFNamedWithActionInFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment1017); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:503:1: rulePRFNamedWithActionInFragment returns [EObject current=null] : (this_FragmentWithAction_0= ruleFragmentWithAction (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject rulePRFNamedWithActionInFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_FragmentWithAction_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:506:28: ( (this_FragmentWithAction_0= ruleFragmentWithAction (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:507:1: (this_FragmentWithAction_0= ruleFragmentWithAction (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:507:1: (this_FragmentWithAction_0= ruleFragmentWithAction (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:508:5: this_FragmentWithAction_0= ruleFragmentWithAction (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getPRFNamedWithActionInFragmentAccess().getFragmentWithActionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_rulePRFNamedWithActionInFragment1064);
            this_FragmentWithAction_0=ruleFragmentWithAction();

            state._fsp--;


                    current = this_FragmentWithAction_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:516:1: (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==HyphenMinus) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:517:2: otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_HyphenMinus_in_rulePRFNamedWithActionInFragment1077); 

                        	newLeafNode(otherlv_1, grammarAccess.getPRFNamedWithActionInFragmentAccess().getHyphenMinusKeyword_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:521:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:522:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:522:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:523:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionInFragmentRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment1096); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:542:1: entryRulePRFNamedWithActionInFragment2 returns [EObject current=null] : iv_rulePRFNamedWithActionInFragment2= rulePRFNamedWithActionInFragment2 EOF ;
    public final EObject entryRulePRFNamedWithActionInFragment2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedWithActionInFragment2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:543:2: (iv_rulePRFNamedWithActionInFragment2= rulePRFNamedWithActionInFragment2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:544:2: iv_rulePRFNamedWithActionInFragment2= rulePRFNamedWithActionInFragment2 EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedWithActionInFragment2Rule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment2_in_entryRulePRFNamedWithActionInFragment21133);
            iv_rulePRFNamedWithActionInFragment2=rulePRFNamedWithActionInFragment2();

            state._fsp--;

             current =iv_rulePRFNamedWithActionInFragment2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment21143); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:551:1: rulePRFNamedWithActionInFragment2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2 (otherlv_2= HyphenMinus ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject rulePRFNamedWithActionInFragment2() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_FragmentWithAction2_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:554:28: ( ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2 (otherlv_2= HyphenMinus ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:555:1: ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2 (otherlv_2= HyphenMinus ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:555:1: ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2 (otherlv_2= HyphenMinus ( (otherlv_3= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:555:2: ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2 (otherlv_2= HyphenMinus ( (otherlv_3= RULE_ID ) ) )?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:555:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:556:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:556:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:557:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21185); 

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

             
                    newCompositeNode(grammarAccess.getPRFNamedWithActionInFragment2Access().getFragmentWithAction2ParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_rulePRFNamedWithActionInFragment21212);
            this_FragmentWithAction2_1=ruleFragmentWithAction2();

            state._fsp--;


                    current = this_FragmentWithAction2_1;
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:582:1: (otherlv_2= HyphenMinus ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==HyphenMinus) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:583:2: otherlv_2= HyphenMinus ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_HyphenMinus_in_rulePRFNamedWithActionInFragment21225); 

                        	newLeafNode(otherlv_2, grammarAccess.getPRFNamedWithActionInFragment2Access().getHyphenMinusKeyword_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:587:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:588:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:588:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:589:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionInFragment2Rule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21244); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:608:1: entryRulePRFNamedWithActionInFragment3 returns [EObject current=null] : iv_rulePRFNamedWithActionInFragment3= rulePRFNamedWithActionInFragment3 EOF ;
    public final EObject entryRulePRFNamedWithActionInFragment3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedWithActionInFragment3 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:609:2: (iv_rulePRFNamedWithActionInFragment3= rulePRFNamedWithActionInFragment3 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:610:2: iv_rulePRFNamedWithActionInFragment3= rulePRFNamedWithActionInFragment3 EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedWithActionInFragment3Rule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedWithActionInFragment3_in_entryRulePRFNamedWithActionInFragment31281);
            iv_rulePRFNamedWithActionInFragment3=rulePRFNamedWithActionInFragment3();

            state._fsp--;

             current =iv_rulePRFNamedWithActionInFragment3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment31291); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:617:1: rulePRFNamedWithActionInFragment3 returns [EObject current=null] : (this_FragmentWithAction3_0= ruleFragmentWithAction3 (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject rulePRFNamedWithActionInFragment3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_FragmentWithAction3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:620:28: ( (this_FragmentWithAction3_0= ruleFragmentWithAction3 (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:621:1: (this_FragmentWithAction3_0= ruleFragmentWithAction3 (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:621:1: (this_FragmentWithAction3_0= ruleFragmentWithAction3 (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:622:5: this_FragmentWithAction3_0= ruleFragmentWithAction3 (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getPRFNamedWithActionInFragment3Access().getFragmentWithAction3ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_rulePRFNamedWithActionInFragment31338);
            this_FragmentWithAction3_0=ruleFragmentWithAction3();

            state._fsp--;


                    current = this_FragmentWithAction3_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:630:1: (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==HyphenMinus) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:631:2: otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_HyphenMinus_in_rulePRFNamedWithActionInFragment31351); 

                        	newLeafNode(otherlv_1, grammarAccess.getPRFNamedWithActionInFragment3Access().getHyphenMinusKeyword_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:635:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:636:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:636:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:637:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPRFNamedWithActionInFragment3Rule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment31370); 

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


    // $ANTLR start "entryRuleFragmentWithAction"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:656:1: entryRuleFragmentWithAction returns [EObject current=null] : iv_ruleFragmentWithAction= ruleFragmentWithAction EOF ;
    public final EObject entryRuleFragmentWithAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentWithAction = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:657:2: (iv_ruleFragmentWithAction= ruleFragmentWithAction EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:658:2: iv_ruleFragmentWithAction= ruleFragmentWithAction EOF
            {
             newCompositeNode(grammarAccess.getFragmentWithActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_entryRuleFragmentWithAction1407);
            iv_ruleFragmentWithAction=ruleFragmentWithAction();

            state._fsp--;

             current =iv_ruleFragmentWithAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction1417); 

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
    // $ANTLR end "entryRuleFragmentWithAction"


    // $ANTLR start "ruleFragmentWithAction"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:665:1: ruleFragmentWithAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) ;
    public final EObject ruleFragmentWithAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:668:28: ( ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:669:1: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:669:1: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:669:2: ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:670:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:670:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:671:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1459); 

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

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:687:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:688:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getFragmentWithActionAccess().getPRFNamedWithActionPrevAction_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:693:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:694:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:694:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:695:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1490); 

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

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:711:2: ( (otherlv_3= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:712:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:712:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:713:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFragmentWithActionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction1515); 

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


    // $ANTLR start "entryRuleFragmentWithAction2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:732:1: entryRuleFragmentWithAction2 returns [EObject current=null] : iv_ruleFragmentWithAction2= ruleFragmentWithAction2 EOF ;
    public final EObject entryRuleFragmentWithAction2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentWithAction2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:733:2: (iv_ruleFragmentWithAction2= ruleFragmentWithAction2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:734:2: iv_ruleFragmentWithAction2= ruleFragmentWithAction2 EOF
            {
             newCompositeNode(grammarAccess.getFragmentWithAction2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_entryRuleFragmentWithAction21551);
            iv_ruleFragmentWithAction2=ruleFragmentWithAction2();

            state._fsp--;

             current =iv_ruleFragmentWithAction2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction21561); 

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
    // $ANTLR end "entryRuleFragmentWithAction2"


    // $ANTLR start "ruleFragmentWithAction2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:741:1: ruleFragmentWithAction2 returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) ;
    public final EObject ruleFragmentWithAction2() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:744:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:745:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:745:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:745:2: () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:745:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:746:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getFragmentWithAction2Access().getPRFNamedWithActionPrevAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:751:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:752:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:752:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:753:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction21612); 

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

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:769:2: ( (otherlv_2= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:770:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:770:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:771:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFragmentWithAction2Rule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction21637); 

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


    // $ANTLR start "entryRuleFragmentWithAction3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:790:1: entryRuleFragmentWithAction3 returns [EObject current=null] : iv_ruleFragmentWithAction3= ruleFragmentWithAction3 EOF ;
    public final EObject entryRuleFragmentWithAction3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentWithAction3 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:791:2: (iv_ruleFragmentWithAction3= ruleFragmentWithAction3 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:792:2: iv_ruleFragmentWithAction3= ruleFragmentWithAction3 EOF
            {
             newCompositeNode(grammarAccess.getFragmentWithAction3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_entryRuleFragmentWithAction31673);
            iv_ruleFragmentWithAction3=ruleFragmentWithAction3();

            state._fsp--;

             current =iv_ruleFragmentWithAction3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentWithAction31683); 

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
    // $ANTLR end "entryRuleFragmentWithAction3"


    // $ANTLR start "ruleFragmentWithAction3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:799:1: ruleFragmentWithAction3 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= HyphenMinusGreaterThanSign ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) ;
    public final EObject ruleFragmentWithAction3() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:802:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= HyphenMinusGreaterThanSign ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:803:1: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= HyphenMinusGreaterThanSign ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:803:1: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= HyphenMinusGreaterThanSign ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:803:2: ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= HyphenMinusGreaterThanSign ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:803:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:804:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:804:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:805:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction31725); 

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

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:821:2: ( () otherlv_2= HyphenMinusGreaterThanSign ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==HyphenMinusGreaterThanSign) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:821:3: () otherlv_2= HyphenMinusGreaterThanSign ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )?
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:821:3: ()
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:822:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getFragmentWithAction3Access().getPRFNamedWithActionPrevAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FollowSets000.FOLLOW_HyphenMinusGreaterThanSign_in_ruleFragmentWithAction31753); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFragmentWithAction3Access().getHyphenMinusGreaterThanSignKeyword_1_1());
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:832:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:833:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:833:1: (lv_name_3_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:834:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction31769); 

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

            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:850:2: ( (otherlv_4= RULE_ID ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:851:1: (otherlv_4= RULE_ID )
            	            {
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:851:1: (otherlv_4= RULE_ID )
            	            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:852:3: otherlv_4= RULE_ID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getFragmentWithAction3Rule());
            	            	        }
            	                    
            	            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragmentWithAction31794); 

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


    // $ANTLR start "entryRulePRFNamedFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:871:1: entryRulePRFNamedFragment returns [EObject current=null] : iv_rulePRFNamedFragment= rulePRFNamedFragment EOF ;
    public final EObject entryRulePRFNamedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedFragment = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:872:2: (iv_rulePRFNamedFragment= rulePRFNamedFragment EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:873:2: iv_rulePRFNamedFragment= rulePRFNamedFragment EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedFragment_in_entryRulePRFNamedFragment1832);
            iv_rulePRFNamedFragment=rulePRFNamedFragment();

            state._fsp--;

             current =iv_rulePRFNamedFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedFragment1842); 

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
    // $ANTLR end "entryRulePRFNamedFragment"


    // $ANTLR start "rulePRFNamedFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:880:1: rulePRFNamedFragment returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePRFNamedFragment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:883:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:884:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:884:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:885:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:885:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:886:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedFragment1883); 

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


    // $ANTLR start "entryRulePRFNamedRef"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:910:1: entryRulePRFNamedRef returns [EObject current=null] : iv_rulePRFNamedRef= rulePRFNamedRef EOF ;
    public final EObject entryRulePRFNamedRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePRFNamedRef = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:911:2: (iv_rulePRFNamedRef= rulePRFNamedRef EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:912:2: iv_rulePRFNamedRef= rulePRFNamedRef EOF
            {
             newCompositeNode(grammarAccess.getPRFNamedRefRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePRFNamedRef_in_entryRulePRFNamedRef1922);
            iv_rulePRFNamedRef=rulePRFNamedRef();

            state._fsp--;

             current =iv_rulePRFNamedRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePRFNamedRef1932); 

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
    // $ANTLR end "entryRulePRFNamedRef"


    // $ANTLR start "rulePRFNamedRef"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:919:1: rulePRFNamedRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePRFNamedRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:922:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:923:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:923:1: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:924:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:924:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:925:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPRFNamedRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePRFNamedRef1976); 

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
        public static final BitSet FOLLOW_ruleParserRuleFragmentsEx_in_entryRuleParserRuleFragmentsEx67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRuleFragmentsEx77 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRuleFragments_in_ruleParserRuleFragmentsEx123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRuleFragments_in_entryRuleParserRuleFragments156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRuleFragments166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitOne_in_ruleParserRuleFragments215 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamed_in_ruleParserRuleFragments235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitTwo_in_ruleParserRuleFragments256 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamed_in_ruleParserRuleFragments276 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_HyphenMinusGreaterThanSign_in_ruleParserRuleFragments289 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRuleFragments308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitThree_in_ruleParserRuleFragments329 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamedRefFirst_in_ruleParserRuleFragments349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitFour_in_ruleParserRuleFragments370 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamedWithAction_in_ruleParserRuleFragments390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitFive_in_ruleParserRuleFragments411 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment_in_ruleParserRuleFragments431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitSix_in_ruleParserRuleFragments452 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment2_in_ruleParserRuleFragments472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitSeven_in_ruleParserRuleFragments493 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment3_in_ruleParserRuleFragments513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamed_in_entryRulePRFNamed550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamed560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_rulePRFNamed607 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_Colon_in_rulePRFNamed621 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamed640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_HyphenMinus_in_rulePRFNamed661 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamedRef_in_rulePRFNamed682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedRefFirst_in_entryRulePRFNamedRefFirst719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedRefFirst729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedRefFirst774 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_LessThanSignHyphenMinus_in_rulePRFNamedRefFirst787 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_rulePRFNamedRefFirst808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithAction_in_entryRulePRFNamedWithAction842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithAction852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamed_in_rulePRFNamedWithAction899 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction924 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction950 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithAction970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment_in_entryRulePRFNamedWithActionInFragment1007 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_rulePRFNamedWithActionInFragment1064 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_HyphenMinus_in_rulePRFNamedWithActionInFragment1077 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment2_in_entryRulePRFNamedWithActionInFragment21133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment21143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21185 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_rulePRFNamedWithActionInFragment21212 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_HyphenMinus_in_rulePRFNamedWithActionInFragment21225 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment21244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedWithActionInFragment3_in_entryRulePRFNamedWithActionInFragment31281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedWithActionInFragment31291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_rulePRFNamedWithActionInFragment31338 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_HyphenMinus_in_rulePRFNamedWithActionInFragment31351 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedWithActionInFragment31370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_entryRuleFragmentWithAction1407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1459 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1490 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction1515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_entryRuleFragmentWithAction21551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction21561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21612 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction21637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_entryRuleFragmentWithAction31673 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentWithAction31683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31725 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_HyphenMinusGreaterThanSign_in_ruleFragmentWithAction31753 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31769 = new BitSet(new long[]{0x0000000000008802L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragmentWithAction31794 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rulePRFNamedFragment_in_entryRulePRFNamedFragment1832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedFragment1842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedFragment1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePRFNamedRef_in_entryRulePRFNamedRef1922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePRFNamedRef1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePRFNamedRef1976 = new BitSet(new long[]{0x0000000000000002L});
    }


}