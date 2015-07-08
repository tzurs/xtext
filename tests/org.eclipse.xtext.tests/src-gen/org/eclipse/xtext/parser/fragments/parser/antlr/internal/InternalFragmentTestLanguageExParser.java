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
    		return "FragmentsEx";	
    	} 
    	   	   	
    	@Override
    	protected FragmentTestLanguageExGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleFragmentsEx"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:61:1: entryRuleFragmentsEx returns [EObject current=null] : iv_ruleFragmentsEx= ruleFragmentsEx EOF ;
    public final EObject entryRuleFragmentsEx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentsEx = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:62:2: (iv_ruleFragmentsEx= ruleFragmentsEx EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:63:2: iv_ruleFragmentsEx= ruleFragmentsEx EOF
            {
             newCompositeNode(grammarAccess.getFragmentsExRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragmentsEx_in_entryRuleFragmentsEx67);
            iv_ruleFragmentsEx=ruleFragmentsEx();

            state._fsp--;

             current =iv_ruleFragmentsEx; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragmentsEx77); 

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
    // $ANTLR end "entryRuleFragmentsEx"


    // $ANTLR start "ruleFragmentsEx"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:70:1: ruleFragmentsEx returns [EObject current=null] : this_Fragments_0= ruleFragments ;
    public final EObject ruleFragmentsEx() throws RecognitionException {
        EObject current = null;

        EObject this_Fragments_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:73:28: (this_Fragments_0= ruleFragments )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:75:5: this_Fragments_0= ruleFragments
            {
             
                    newCompositeNode(grammarAccess.getFragmentsExAccess().getFragmentsParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragments_in_ruleFragmentsEx123);
            this_Fragments_0=ruleFragments();

            state._fsp--;


                    current = this_Fragments_0;
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
    // $ANTLR end "ruleFragmentsEx"


    // $ANTLR start "entryRuleFragments"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:91:1: entryRuleFragments returns [EObject current=null] : iv_ruleFragments= ruleFragments EOF ;
    public final EObject entryRuleFragments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragments = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:92:2: (iv_ruleFragments= ruleFragments EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:93:2: iv_ruleFragments= ruleFragments EOF
            {
             newCompositeNode(grammarAccess.getFragmentsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFragments_in_entryRuleFragments156);
            iv_ruleFragments=ruleFragments();

            state._fsp--;

             current =iv_ruleFragments; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFragments166); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:100:1: ruleFragments returns [EObject current=null] : ( () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:103:28: ( ( () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:104:1: ( () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:104:1: ( () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:104:2: () ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:104:2: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:105:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFragmentsAccess().getFragmentsAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:110:2: ( (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) ) ) | (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) ) ) | (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) ) ) | (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) ) | (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) ) | (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) ) )
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:110:3: (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:110:3: (otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:111:2: otherlv_1= NumberSignDigitOne ( (lv_element_2_0= ruleNamed ) )
                    {
                    otherlv_1=(Token)match(input,NumberSignDigitOne,FollowSets000.FOLLOW_NumberSignDigitOne_in_ruleFragments215); 

                        	newLeafNode(otherlv_1, grammarAccess.getFragmentsAccess().getNumberSignDigitOneKeyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:115:1: ( (lv_element_2_0= ruleNamed ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:116:1: (lv_element_2_0= ruleNamed )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:116:1: (lv_element_2_0= ruleNamed )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:117:3: lv_element_2_0= ruleNamed
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleFragments235);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:134:6: (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:134:6: (otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:135:2: otherlv_3= NumberSignDigitTwo ( (lv_element_4_0= ruleNamed ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,NumberSignDigitTwo,FollowSets000.FOLLOW_NumberSignDigitTwo_in_ruleFragments256); 

                        	newLeafNode(otherlv_3, grammarAccess.getFragmentsAccess().getNumberSignDigitTwoKeyword_1_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:139:1: ( (lv_element_4_0= ruleNamed ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:140:1: (lv_element_4_0= ruleNamed )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:140:1: (lv_element_4_0= ruleNamed )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:141:3: lv_element_4_0= ruleNamed
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleFragments276);
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

                    otherlv_5=(Token)match(input,HyphenMinusGreaterThanSign,FollowSets000.FOLLOW_HyphenMinusGreaterThanSign_in_ruleFragments289); 

                        	newLeafNode(otherlv_5, grammarAccess.getFragmentsAccess().getHyphenMinusGreaterThanSignKeyword_1_1_2());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:162:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:163:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:163:1: (otherlv_6= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:164:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFragmentsRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFragments308); 

                    		newLeafNode(otherlv_6, grammarAccess.getFragmentsAccess().getRefNamedCrossReference_1_1_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:176:6: (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:176:6: (otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:177:2: otherlv_7= NumberSignDigitThree ( (lv_element_8_0= ruleNamedRefFirst ) )
                    {
                    otherlv_7=(Token)match(input,NumberSignDigitThree,FollowSets000.FOLLOW_NumberSignDigitThree_in_ruleFragments329); 

                        	newLeafNode(otherlv_7, grammarAccess.getFragmentsAccess().getNumberSignDigitThreeKeyword_1_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:181:1: ( (lv_element_8_0= ruleNamedRefFirst ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:182:1: (lv_element_8_0= ruleNamedRefFirst )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:182:1: (lv_element_8_0= ruleNamedRefFirst )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:183:3: lv_element_8_0= ruleNamedRefFirst
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedRefFirstParserRuleCall_1_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedRefFirst_in_ruleFragments349);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:200:6: (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:200:6: (otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:201:2: otherlv_9= NumberSignDigitFour ( (lv_element_10_0= ruleNamedWithAction ) )
                    {
                    otherlv_9=(Token)match(input,NumberSignDigitFour,FollowSets000.FOLLOW_NumberSignDigitFour_in_ruleFragments370); 

                        	newLeafNode(otherlv_9, grammarAccess.getFragmentsAccess().getNumberSignDigitFourKeyword_1_3_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:205:1: ( (lv_element_10_0= ruleNamedWithAction ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:206:1: (lv_element_10_0= ruleNamedWithAction )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:206:1: (lv_element_10_0= ruleNamedWithAction )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:207:3: lv_element_10_0= ruleNamedWithAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedWithActionParserRuleCall_1_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithAction_in_ruleFragments390);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:224:6: (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:224:6: (otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:225:2: otherlv_11= NumberSignDigitFive ( (lv_element_12_0= ruleNamedWithActionInFragment ) )
                    {
                    otherlv_11=(Token)match(input,NumberSignDigitFive,FollowSets000.FOLLOW_NumberSignDigitFive_in_ruleFragments411); 

                        	newLeafNode(otherlv_11, grammarAccess.getFragmentsAccess().getNumberSignDigitFiveKeyword_1_4_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:229:1: ( (lv_element_12_0= ruleNamedWithActionInFragment ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:230:1: (lv_element_12_0= ruleNamedWithActionInFragment )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:230:1: (lv_element_12_0= ruleNamedWithActionInFragment )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:231:3: lv_element_12_0= ruleNamedWithActionInFragment
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedWithActionInFragmentParserRuleCall_1_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment_in_ruleFragments431);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:248:6: (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:248:6: (otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:249:2: otherlv_13= NumberSignDigitSix ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) )
                    {
                    otherlv_13=(Token)match(input,NumberSignDigitSix,FollowSets000.FOLLOW_NumberSignDigitSix_in_ruleFragments452); 

                        	newLeafNode(otherlv_13, grammarAccess.getFragmentsAccess().getNumberSignDigitSixKeyword_1_5_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:253:1: ( (lv_element_14_0= ruleNamedWithActionInFragment2 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:254:1: (lv_element_14_0= ruleNamedWithActionInFragment2 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:254:1: (lv_element_14_0= ruleNamedWithActionInFragment2 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:255:3: lv_element_14_0= ruleNamedWithActionInFragment2
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment2_in_ruleFragments472);
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
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:272:6: (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:272:6: (otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:273:2: otherlv_15= NumberSignDigitSeven ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) )
                    {
                    otherlv_15=(Token)match(input,NumberSignDigitSeven,FollowSets000.FOLLOW_NumberSignDigitSeven_in_ruleFragments493); 

                        	newLeafNode(otherlv_15, grammarAccess.getFragmentsAccess().getNumberSignDigitSevenKeyword_1_6_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:277:1: ( (lv_element_16_0= ruleNamedWithActionInFragment3 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:278:1: (lv_element_16_0= ruleNamedWithActionInFragment3 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:278:1: (lv_element_16_0= ruleNamedWithActionInFragment3 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:279:3: lv_element_16_0= ruleNamedWithActionInFragment3
                    {
                     
                    	        newCompositeNode(grammarAccess.getFragmentsAccess().getElementNamedWithActionInFragment3ParserRuleCall_1_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment3_in_ruleFragments513);
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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:303:1: entryRuleNamed returns [EObject current=null] : iv_ruleNamed= ruleNamed EOF ;
    public final EObject entryRuleNamed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamed = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:304:2: (iv_ruleNamed= ruleNamed EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:305:2: iv_ruleNamed= ruleNamed EOF
            {
             newCompositeNode(grammarAccess.getNamedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamed_in_entryRuleNamed550);
            iv_ruleNamed=ruleNamed();

            state._fsp--;

             current =iv_ruleNamed; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamed560); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:312:1: ruleNamed returns [EObject current=null] : (this_NamedFragment_0= ruleNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef ) )? ) ;
    public final EObject ruleNamed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_NamedFragment_0 = null;

        EObject this_NamedRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:315:28: ( (this_NamedFragment_0= ruleNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:316:1: (this_NamedFragment_0= ruleNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:316:1: (this_NamedFragment_0= ruleNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:317:5: this_NamedFragment_0= ruleNamedFragment ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef ) )?
            {
             
                    newCompositeNode(grammarAccess.getNamedAccess().getNamedFragmentParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_ruleNamed607);
            this_NamedFragment_0=ruleNamedFragment();

            state._fsp--;


                    current = this_NamedFragment_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:325:1: ( (otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef ) )?
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
                    otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_Colon_in_ruleNamed621); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedAccess().getColonKeyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:330:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:331:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:331:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:332:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamed640); 

                    		newLeafNode(otherlv_2, grammarAccess.getNamedAccess().getRefNamedCrossReference_1_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:344:6: (otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:344:6: (otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:345:2: otherlv_3= HyphenMinus this_NamedRef_4= ruleNamedRef
                    {
                    otherlv_3=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_HyphenMinus_in_ruleNamed661); 

                        	newLeafNode(otherlv_3, grammarAccess.getNamedAccess().getHyphenMinusKeyword_1_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getNamedAccess().getNamedRefParserRuleCall_1_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNamedRef_in_ruleNamed682);
                    this_NamedRef_4=ruleNamedRef();

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:366:1: entryRuleNamedRefFirst returns [EObject current=null] : iv_ruleNamedRefFirst= ruleNamedRefFirst EOF ;
    public final EObject entryRuleNamedRefFirst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedRefFirst = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:367:2: (iv_ruleNamedRefFirst= ruleNamedRefFirst EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:368:2: iv_ruleNamedRefFirst= ruleNamedRefFirst EOF
            {
             newCompositeNode(grammarAccess.getNamedRefFirstRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedRefFirst_in_entryRuleNamedRefFirst719);
            iv_ruleNamedRefFirst=ruleNamedRefFirst();

            state._fsp--;

             current =iv_ruleNamedRefFirst; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedRefFirst729); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:375:1: ruleNamedRefFirst returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_NamedFragment_2= ruleNamedFragment ) ;
    public final EObject ruleNamedRefFirst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_NamedFragment_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:378:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_NamedFragment_2= ruleNamedFragment ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:379:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_NamedFragment_2= ruleNamedFragment )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:379:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_NamedFragment_2= ruleNamedFragment )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:379:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= LessThanSignHyphenMinus this_NamedFragment_2= ruleNamedFragment
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:379:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:380:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:380:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:381:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedRefFirstRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedRefFirst774); 

            		newLeafNode(otherlv_0, grammarAccess.getNamedRefFirstAccess().getRefNamedCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,LessThanSignHyphenMinus,FollowSets000.FOLLOW_LessThanSignHyphenMinus_in_ruleNamedRefFirst787); 

                	newLeafNode(otherlv_1, grammarAccess.getNamedRefFirstAccess().getLessThanSignHyphenMinusKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getNamedRefFirstAccess().getNamedFragmentParserRuleCall_2()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_ruleNamedRefFirst808);
            this_NamedFragment_2=ruleNamedFragment();

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:414:1: entryRuleNamedWithAction returns [EObject current=null] : iv_ruleNamedWithAction= ruleNamedWithAction EOF ;
    public final EObject entryRuleNamedWithAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedWithAction = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:415:2: (iv_ruleNamedWithAction= ruleNamedWithAction EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:416:2: iv_ruleNamedWithAction= ruleNamedWithAction EOF
            {
             newCompositeNode(grammarAccess.getNamedWithActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithAction_in_entryRuleNamedWithAction842);
            iv_ruleNamedWithAction=ruleNamedWithAction();

            state._fsp--;

             current =iv_ruleNamedWithAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithAction852); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:423:1: ruleNamedWithAction returns [EObject current=null] : (this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleNamedWithAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_Named_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:426:28: ( (this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:427:1: (this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:427:1: (this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:428:5: this_Named_0= ruleNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getNamedWithActionAccess().getNamedParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNamed_in_ruleNamedWithAction899);
            this_Named_0=ruleNamed();

            state._fsp--;


                    current = this_Named_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:436:1: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:437:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getNamedWithActionAccess().getNamedWithActionPrevAction_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:442:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:443:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:443:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:444:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction924); 

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
                    	            current = createModelElement(grammarAccess.getNamedWithActionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction950); 

                    		newLeafNode(otherlv_3, grammarAccess.getNamedWithActionAccess().getRefNamedCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:473:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:474:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:474:1: (otherlv_4= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:475:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedWithActionRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithAction970); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:494:1: entryRuleNamedWithActionInFragment returns [EObject current=null] : iv_ruleNamedWithActionInFragment= ruleNamedWithActionInFragment EOF ;
    public final EObject entryRuleNamedWithActionInFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedWithActionInFragment = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:495:2: (iv_ruleNamedWithActionInFragment= ruleNamedWithActionInFragment EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:496:2: iv_ruleNamedWithActionInFragment= ruleNamedWithActionInFragment EOF
            {
             newCompositeNode(grammarAccess.getNamedWithActionInFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment_in_entryRuleNamedWithActionInFragment1007);
            iv_ruleNamedWithActionInFragment=ruleNamedWithActionInFragment();

            state._fsp--;

             current =iv_ruleNamedWithActionInFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment1017); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:503:1: ruleNamedWithActionInFragment returns [EObject current=null] : (this_FragmentWithAction_0= ruleFragmentWithAction (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleNamedWithActionInFragment() throws RecognitionException {
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
             
                    newCompositeNode(grammarAccess.getNamedWithActionInFragmentAccess().getFragmentWithActionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction_in_ruleNamedWithActionInFragment1064);
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
                    otherlv_1=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_HyphenMinus_in_ruleNamedWithActionInFragment1077); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedWithActionInFragmentAccess().getHyphenMinusKeyword_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:521:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:522:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:522:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:523:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedWithActionInFragmentRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment1096); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:542:1: entryRuleNamedWithActionInFragment2 returns [EObject current=null] : iv_ruleNamedWithActionInFragment2= ruleNamedWithActionInFragment2 EOF ;
    public final EObject entryRuleNamedWithActionInFragment2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedWithActionInFragment2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:543:2: (iv_ruleNamedWithActionInFragment2= ruleNamedWithActionInFragment2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:544:2: iv_ruleNamedWithActionInFragment2= ruleNamedWithActionInFragment2 EOF
            {
             newCompositeNode(grammarAccess.getNamedWithActionInFragment2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment2_in_entryRuleNamedWithActionInFragment21133);
            iv_ruleNamedWithActionInFragment2=ruleNamedWithActionInFragment2();

            state._fsp--;

             current =iv_ruleNamedWithActionInFragment2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment21143); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:551:1: ruleNamedWithActionInFragment2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_FragmentWithAction2_1= ruleFragmentWithAction2 (otherlv_2= HyphenMinus ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleNamedWithActionInFragment2() throws RecognitionException {
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
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21185); 

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

             
                    newCompositeNode(grammarAccess.getNamedWithActionInFragment2Access().getFragmentWithAction2ParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction2_in_ruleNamedWithActionInFragment21212);
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
                    otherlv_2=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_HyphenMinus_in_ruleNamedWithActionInFragment21225); 

                        	newLeafNode(otherlv_2, grammarAccess.getNamedWithActionInFragment2Access().getHyphenMinusKeyword_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:587:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:588:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:588:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:589:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedWithActionInFragment2Rule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21244); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:608:1: entryRuleNamedWithActionInFragment3 returns [EObject current=null] : iv_ruleNamedWithActionInFragment3= ruleNamedWithActionInFragment3 EOF ;
    public final EObject entryRuleNamedWithActionInFragment3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedWithActionInFragment3 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:609:2: (iv_ruleNamedWithActionInFragment3= ruleNamedWithActionInFragment3 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:610:2: iv_ruleNamedWithActionInFragment3= ruleNamedWithActionInFragment3 EOF
            {
             newCompositeNode(grammarAccess.getNamedWithActionInFragment3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedWithActionInFragment3_in_entryRuleNamedWithActionInFragment31281);
            iv_ruleNamedWithActionInFragment3=ruleNamedWithActionInFragment3();

            state._fsp--;

             current =iv_ruleNamedWithActionInFragment3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedWithActionInFragment31291); 

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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:617:1: ruleNamedWithActionInFragment3 returns [EObject current=null] : (this_FragmentWithAction3_0= ruleFragmentWithAction3 (otherlv_1= HyphenMinus ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleNamedWithActionInFragment3() throws RecognitionException {
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
             
                    newCompositeNode(grammarAccess.getNamedWithActionInFragment3Access().getFragmentWithAction3ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleFragmentWithAction3_in_ruleNamedWithActionInFragment31338);
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
                    otherlv_1=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_HyphenMinus_in_ruleNamedWithActionInFragment31351); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedWithActionInFragment3Access().getHyphenMinusKeyword_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:635:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:636:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:636:1: (otherlv_2= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:637:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedWithActionInFragment3Rule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment31370); 

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
                        grammarAccess.getFragmentWithActionAccess().getNamedWithActionPrevAction_1(),
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
                        grammarAccess.getFragmentWithAction2Access().getNamedWithActionPrevAction_0(),
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
            	                grammarAccess.getFragmentWithAction3Access().getNamedWithActionPrevAction_1_0(),
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


    // $ANTLR start "entryRuleNamedFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:871:1: entryRuleNamedFragment returns [EObject current=null] : iv_ruleNamedFragment= ruleNamedFragment EOF ;
    public final EObject entryRuleNamedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFragment = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:872:2: (iv_ruleNamedFragment= ruleNamedFragment EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:873:2: iv_ruleNamedFragment= ruleNamedFragment EOF
            {
             newCompositeNode(grammarAccess.getNamedFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedFragment_in_entryRuleNamedFragment1832);
            iv_ruleNamedFragment=ruleNamedFragment();

            state._fsp--;

             current =iv_ruleNamedFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedFragment1842); 

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
    // $ANTLR end "entryRuleNamedFragment"


    // $ANTLR start "ruleNamedFragment"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:880:1: ruleNamedFragment returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNamedFragment() throws RecognitionException {
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
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedFragment1883); 

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


    // $ANTLR start "entryRuleNamedRef"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:910:1: entryRuleNamedRef returns [EObject current=null] : iv_ruleNamedRef= ruleNamedRef EOF ;
    public final EObject entryRuleNamedRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedRef = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:911:2: (iv_ruleNamedRef= ruleNamedRef EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:912:2: iv_ruleNamedRef= ruleNamedRef EOF
            {
             newCompositeNode(grammarAccess.getNamedRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedRef_in_entryRuleNamedRef1922);
            iv_ruleNamedRef=ruleNamedRef();

            state._fsp--;

             current =iv_ruleNamedRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedRef1932); 

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
    // $ANTLR end "entryRuleNamedRef"


    // $ANTLR start "ruleNamedRef"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/internal/InternalFragmentTestLanguageExParser.g:919:1: ruleNamedRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNamedRef() throws RecognitionException {
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
            	            current = createModelElement(grammarAccess.getNamedRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedRef1976); 

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
        public static final BitSet FOLLOW_ruleFragmentsEx_in_entryRuleFragmentsEx67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragmentsEx77 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragments_in_ruleFragmentsEx123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragments_in_entryRuleFragments156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFragments166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitOne_in_ruleFragments215 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleFragments235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitTwo_in_ruleFragments256 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleFragments276 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_HyphenMinusGreaterThanSign_in_ruleFragments289 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFragments308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitThree_in_ruleFragments329 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamedRefFirst_in_ruleFragments349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitFour_in_ruleFragments370 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamedWithAction_in_ruleFragments390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitFive_in_ruleFragments411 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment_in_ruleFragments431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitSix_in_ruleFragments452 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment2_in_ruleFragments472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_NumberSignDigitSeven_in_ruleFragments493 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment3_in_ruleFragments513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamed_in_entryRuleNamed550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamed560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedFragment_in_ruleNamed607 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_Colon_in_ruleNamed621 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamed640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_HyphenMinus_in_ruleNamed661 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamedRef_in_ruleNamed682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedRefFirst_in_entryRuleNamedRefFirst719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedRefFirst729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedRefFirst774 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_LessThanSignHyphenMinus_in_ruleNamedRefFirst787 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNamedFragment_in_ruleNamedRefFirst808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithAction_in_entryRuleNamedWithAction842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithAction852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamed_in_ruleNamedWithAction899 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction924 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction950 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithAction970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment_in_entryRuleNamedWithActionInFragment1007 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction_in_ruleNamedWithActionInFragment1064 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_HyphenMinus_in_ruleNamedWithActionInFragment1077 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment2_in_entryRuleNamedWithActionInFragment21133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment21143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21185 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleFragmentWithAction2_in_ruleNamedWithActionInFragment21212 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_HyphenMinus_in_ruleNamedWithActionInFragment21225 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment21244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedWithActionInFragment3_in_entryRuleNamedWithActionInFragment31281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedWithActionInFragment31291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFragmentWithAction3_in_ruleNamedWithActionInFragment31338 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_HyphenMinus_in_ruleNamedWithActionInFragment31351 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedWithActionInFragment31370 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleNamedFragment_in_entryRuleNamedFragment1832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedFragment1842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedFragment1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedRef_in_entryRuleNamedRef1922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedRef1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedRef1976 = new BitSet(new long[]{0x0000000000000002L});
    }


}