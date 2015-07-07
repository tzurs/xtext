package org.eclipse.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.services.XtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grammar'", "'with'", "','", "'hidden'", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'fragment'", "'*'", "'returns'", "':'", "';'", "'::'", "'|'", "'&'", "'?'", "'+'", "'{'", "'='", "'+='", "'current'", "'}'", "'=>'", "'->'", "'?='", "'['", "']'", "'terminal'", "'!'", "'EOF'", "'..'", "'enum'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXtextParser.tokenNames; }
    public String getGrammarFileName() { return "../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g"; }



     	private XtextGrammarAccess grammarAccess;
     	
        public InternalXtextParser(TokenStream input, XtextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Grammar";	
       	}
       	
       	@Override
       	protected XtextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGrammar"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:67:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:68:2: (iv_ruleGrammar= ruleGrammar EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:69:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrammar_in_entryRuleGrammar75);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammar85); 

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
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:76:1: ruleGrammar returns [EObject current=null] : (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_definesHiddenTokens_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_metamodelDeclarations_12_0 = null;

        EObject lv_rules_13_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:79:28: ( (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:80:1: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:80:1: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:80:3: otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleGrammar122); 

                	newLeafNode(otherlv_0, grammarAccess.getGrammarAccess().getGrammarKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:84:1: ( (lv_name_1_0= ruleGrammarID ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:85:1: (lv_name_1_0= ruleGrammarID )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:85:1: (lv_name_1_0= ruleGrammarID )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:86:3: lv_name_1_0= ruleGrammarID
            {
             
            	        newCompositeNode(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_ruleGrammar143);
            lv_name_1_0=ruleGrammarID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGrammarRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"GrammarID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:102:2: (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:102:4: otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGrammar156); 

                        	newLeafNode(otherlv_2, grammarAccess.getGrammarAccess().getWithKeyword_2_0());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:106:1: ( ( ruleGrammarID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:107:1: ( ruleGrammarID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:107:1: ( ruleGrammarID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:108:3: ruleGrammarID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGrammarRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_ruleGrammar179);
                    ruleGrammarID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:121:2: (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:121:4: otherlv_4= ',' ( ( ruleGrammarID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGrammar192); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:125:1: ( ( ruleGrammarID ) )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:126:1: ( ruleGrammarID )
                    	    {
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:126:1: ( ruleGrammarID )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:127:3: ruleGrammarID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGrammarRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_ruleGrammar215);
                    	    ruleGrammarID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:140:6: ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:140:7: ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')'
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:140:7: ( (lv_definesHiddenTokens_6_0= 'hidden' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:141:1: (lv_definesHiddenTokens_6_0= 'hidden' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:141:1: (lv_definesHiddenTokens_6_0= 'hidden' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:142:3: lv_definesHiddenTokens_6_0= 'hidden'
                    {
                    lv_definesHiddenTokens_6_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGrammar238); 

                            newLeafNode(lv_definesHiddenTokens_6_0, grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGrammarRule());
                    	        }
                           		setWithLastConsumed(current, "definesHiddenTokens", true, "hidden");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGrammar263); 

                        	newLeafNode(otherlv_7, grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:159:1: ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:159:2: ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            {
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:159:2: ( (otherlv_8= RULE_ID ) )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:160:1: (otherlv_8= RULE_ID )
                            {
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:160:1: (otherlv_8= RULE_ID )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:161:3: otherlv_8= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getGrammarRule());
                            	        }
                                    
                            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammar284); 

                            		newLeafNode(otherlv_8, grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0()); 
                            	

                            }


                            }

                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:172:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==13) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:172:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGrammar297); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0());
                            	        
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:176:1: ( (otherlv_10= RULE_ID ) )
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:177:1: (otherlv_10= RULE_ID )
                            	    {
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:177:1: (otherlv_10= RULE_ID )
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:178:3: otherlv_10= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getGrammarRule());
                            	    	        }
                            	            
                            	    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammar317); 

                            	    		newLeafNode(otherlv_10, grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGrammar333); 

                        	newLeafNode(otherlv_11, grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:193:3: ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:194:1: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    {
            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:194:1: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:195:3: lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractMetamodelDeclaration_in_ruleGrammar356);
            	    lv_metamodelDeclarations_12_0=ruleAbstractMetamodelDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metamodelDeclarations",
            	            		lv_metamodelDeclarations_12_0, 
            	            		"AbstractMetamodelDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:211:3: ( (lv_rules_13_0= ruleAbstractRule ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==21||LA7_0==41||LA7_0==45) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:212:1: (lv_rules_13_0= ruleAbstractRule )
            	    {
            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:212:1: (lv_rules_13_0= ruleAbstractRule )
            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:213:3: lv_rules_13_0= ruleAbstractRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractRule_in_ruleGrammar378);
            	    lv_rules_13_0=ruleAbstractRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_13_0, 
            	            		"AbstractRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleGrammarID"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:237:1: entryRuleGrammarID returns [String current=null] : iv_ruleGrammarID= ruleGrammarID EOF ;
    public final String entryRuleGrammarID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGrammarID = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:238:2: (iv_ruleGrammarID= ruleGrammarID EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:239:2: iv_ruleGrammarID= ruleGrammarID EOF
            {
             newCompositeNode(grammarAccess.getGrammarIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_entryRuleGrammarID416);
            iv_ruleGrammarID=ruleGrammarID();

            state._fsp--;

             current =iv_ruleGrammarID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammarID427); 

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
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:246:1: ruleGrammarID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleGrammarID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:249:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:250:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:250:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:250:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammarID467); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:257:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:258:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGrammarID486); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammarID501); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleAbstractRule"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:278:1: entryRuleAbstractRule returns [EObject current=null] : iv_ruleAbstractRule= ruleAbstractRule EOF ;
    public final EObject entryRuleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRule = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:279:2: (iv_ruleAbstractRule= ruleAbstractRule EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:280:2: iv_ruleAbstractRule= ruleAbstractRule EOF
            {
             newCompositeNode(grammarAccess.getAbstractRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractRule_in_entryRuleAbstractRule548);
            iv_ruleAbstractRule=ruleAbstractRule();

            state._fsp--;

             current =iv_ruleAbstractRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractRule558); 

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
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:287:1: ruleAbstractRule returns [EObject current=null] : (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule ) ;
    public final EObject ruleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject this_ParserRule_0 = null;

        EObject this_TerminalRule_1 = null;

        EObject this_EnumRule_2 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:290:28: ( (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:291:1: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:291:1: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 21:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 45:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:292:5: this_ParserRule_0= ruleParserRule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParserRule_in_ruleAbstractRule605);
                    this_ParserRule_0=ruleParserRule();

                    state._fsp--;

                     
                            current = this_ParserRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:302:5: this_TerminalRule_1= ruleTerminalRule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTerminalRule_in_ruleAbstractRule632);
                    this_TerminalRule_1=ruleTerminalRule();

                    state._fsp--;

                     
                            current = this_TerminalRule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:312:5: this_EnumRule_2= ruleEnumRule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumRule_in_ruleAbstractRule659);
                    this_EnumRule_2=ruleEnumRule();

                    state._fsp--;

                     
                            current = this_EnumRule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMetamodelDeclaration"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:328:1: entryRuleAbstractMetamodelDeclaration returns [EObject current=null] : iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF ;
    public final EObject entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMetamodelDeclaration = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:329:2: (iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:330:2: iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractMetamodelDeclaration_in_entryRuleAbstractMetamodelDeclaration694);
            iv_ruleAbstractMetamodelDeclaration=ruleAbstractMetamodelDeclaration();

            state._fsp--;

             current =iv_ruleAbstractMetamodelDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractMetamodelDeclaration704); 

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
    // $ANTLR end "entryRuleAbstractMetamodelDeclaration"


    // $ANTLR start "ruleAbstractMetamodelDeclaration"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:337:1: ruleAbstractMetamodelDeclaration returns [EObject current=null] : (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel ) ;
    public final EObject ruleAbstractMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_GeneratedMetamodel_0 = null;

        EObject this_ReferencedMetamodel_1 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:340:28: ( (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:341:1: (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:341:1: (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:342:5: this_GeneratedMetamodel_0= ruleGeneratedMetamodel
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneratedMetamodel_in_ruleAbstractMetamodelDeclaration751);
                    this_GeneratedMetamodel_0=ruleGeneratedMetamodel();

                    state._fsp--;

                     
                            current = this_GeneratedMetamodel_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:352:5: this_ReferencedMetamodel_1= ruleReferencedMetamodel
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReferencedMetamodel_in_ruleAbstractMetamodelDeclaration778);
                    this_ReferencedMetamodel_1=ruleReferencedMetamodel();

                    state._fsp--;

                     
                            current = this_ReferencedMetamodel_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractMetamodelDeclaration"


    // $ANTLR start "entryRuleGeneratedMetamodel"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:368:1: entryRuleGeneratedMetamodel returns [EObject current=null] : iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF ;
    public final EObject entryRuleGeneratedMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratedMetamodel = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:369:2: (iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:370:2: iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF
            {
             newCompositeNode(grammarAccess.getGeneratedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneratedMetamodel_in_entryRuleGeneratedMetamodel813);
            iv_ruleGeneratedMetamodel=ruleGeneratedMetamodel();

            state._fsp--;

             current =iv_ruleGeneratedMetamodel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneratedMetamodel823); 

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
    // $ANTLR end "entryRuleGeneratedMetamodel"


    // $ANTLR start "ruleGeneratedMetamodel"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:377:1: ruleGeneratedMetamodel returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleGeneratedMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:380:28: ( (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:381:1: (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:381:1: (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:381:3: otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGeneratedMetamodel860); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:385:1: ( (lv_name_1_0= RULE_ID ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:386:1: (lv_name_1_0= RULE_ID )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:386:1: (lv_name_1_0= RULE_ID )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:387:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneratedMetamodel877); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGeneratedMetamodelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:403:2: ( (otherlv_2= RULE_STRING ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:404:1: (otherlv_2= RULE_STRING )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:404:1: (otherlv_2= RULE_STRING )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:405:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGeneratedMetamodel902); 

            		newLeafNode(otherlv_2, grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0()); 
            	

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:416:2: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:416:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGeneratedMetamodel915); 

                        	newLeafNode(otherlv_3, grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:420:1: ( (lv_alias_4_0= RULE_ID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:421:1: (lv_alias_4_0= RULE_ID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:421:1: (lv_alias_4_0= RULE_ID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:422:3: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneratedMetamodel932); 

                    			newLeafNode(lv_alias_4_0, grammarAccess.getGeneratedMetamodelAccess().getAliasIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"alias",
                            		lv_alias_4_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleGeneratedMetamodel"


    // $ANTLR start "entryRuleReferencedMetamodel"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:446:1: entryRuleReferencedMetamodel returns [EObject current=null] : iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF ;
    public final EObject entryRuleReferencedMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedMetamodel = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:447:2: (iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:448:2: iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF
            {
             newCompositeNode(grammarAccess.getReferencedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferencedMetamodel_in_entryRuleReferencedMetamodel975);
            iv_ruleReferencedMetamodel=ruleReferencedMetamodel();

            state._fsp--;

             current =iv_ruleReferencedMetamodel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferencedMetamodel985); 

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
    // $ANTLR end "entryRuleReferencedMetamodel"


    // $ANTLR start "ruleReferencedMetamodel"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:455:1: ruleReferencedMetamodel returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleReferencedMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:458:28: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:459:1: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:459:1: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:459:3: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleReferencedMetamodel1022); 

                	newLeafNode(otherlv_0, grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:463:1: ( (otherlv_1= RULE_STRING ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:464:1: (otherlv_1= RULE_STRING )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:464:1: (otherlv_1= RULE_STRING )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:465:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencedMetamodelRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencedMetamodel1042); 

            		newLeafNode(otherlv_1, grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0()); 
            	

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:476:2: (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:476:4: otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleReferencedMetamodel1055); 

                        	newLeafNode(otherlv_2, grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:480:1: ( (lv_alias_3_0= RULE_ID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:481:1: (lv_alias_3_0= RULE_ID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:481:1: (lv_alias_3_0= RULE_ID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:482:3: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReferencedMetamodel1072); 

                    			newLeafNode(lv_alias_3_0, grammarAccess.getReferencedMetamodelAccess().getAliasIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferencedMetamodelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"alias",
                            		lv_alias_3_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleReferencedMetamodel"


    // $ANTLR start "entryRuleParserRule"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:506:1: entryRuleParserRule returns [EObject current=null] : iv_ruleParserRule= ruleParserRule EOF ;
    public final EObject entryRuleParserRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRule = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:507:2: (iv_ruleParserRule= ruleParserRule EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:508:2: iv_ruleParserRule= ruleParserRule EOF
            {
             newCompositeNode(grammarAccess.getParserRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRule_in_entryRuleParserRule1115);
            iv_ruleParserRule=ruleParserRule();

            state._fsp--;

             current =iv_ruleParserRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRule1125); 

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
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:515:1: ruleParserRule returns [EObject current=null] : ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' ) ;
    public final EObject ruleParserRule() throws RecognitionException {
        EObject current = null;

        Token lv_fragment_0_0=null;
        Token lv_name_1_0=null;
        Token lv_wildcard_2_0=null;
        Token lv_fragment_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_definesHiddenTokens_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_type_6_0 = null;

        EObject lv_alternatives_14_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:518:28: ( ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:519:1: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:519:1: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:519:2: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';'
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:519:2: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==14||(LA15_3>=23 && LA15_3<=24)) ) {
                        alt15=2;
                    }
                    else if ( (LA15_3==22) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:519:3: ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:519:3: ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:519:4: ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:519:4: ( (lv_fragment_0_0= 'fragment' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:520:1: (lv_fragment_0_0= 'fragment' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:520:1: (lv_fragment_0_0= 'fragment' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:521:3: lv_fragment_0_0= 'fragment'
                    {
                    lv_fragment_0_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParserRule1170); 

                            newLeafNode(lv_fragment_0_0, grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_0_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleRule());
                    	        }
                           		setWithLastConsumed(current, "fragment", true, "fragment");
                    	    

                    }


                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:534:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:535:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:535:1: (lv_name_1_0= RULE_ID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:536:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1200); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getParserRuleAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:552:2: ( (lv_wildcard_2_0= '*' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:553:1: (lv_wildcard_2_0= '*' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:553:1: (lv_wildcard_2_0= '*' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:554:3: lv_wildcard_2_0= '*'
                    {
                    lv_wildcard_2_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParserRule1223); 

                            newLeafNode(lv_wildcard_2_0, grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_0_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleRule());
                    	        }
                           		setWithLastConsumed(current, "wildcard", true, "*");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:568:6: ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:568:6: ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:568:7: ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )?
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:568:7: ( (lv_fragment_3_0= 'fragment' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:569:1: (lv_fragment_3_0= 'fragment' )
                            {
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:569:1: (lv_fragment_3_0= 'fragment' )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:570:3: lv_fragment_3_0= 'fragment'
                            {
                            lv_fragment_3_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParserRule1262); 

                                    newLeafNode(lv_fragment_3_0, grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_0_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParserRuleRule());
                            	        }
                                   		setWithLastConsumed(current, "fragment", true, "fragment");
                            	    

                            }


                            }
                            break;

                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:583:3: ( (lv_name_4_0= RULE_ID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:584:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:584:1: (lv_name_4_0= RULE_ID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:585:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1293); 

                    			newLeafNode(lv_name_4_0, grammarAccess.getParserRuleAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:601:2: (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:601:4: otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) )
                            {
                            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParserRule1311); 

                                	newLeafNode(otherlv_5, grammarAccess.getParserRuleAccess().getReturnsKeyword_0_1_2_0());
                                
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:605:1: ( (lv_type_6_0= ruleTypeRef ) )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:606:1: (lv_type_6_0= ruleTypeRef )
                            {
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:606:1: (lv_type_6_0= ruleTypeRef )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:607:3: lv_type_6_0= ruleTypeRef
                            {
                             
                            	        newCompositeNode(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_0_1_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleParserRule1332);
                            lv_type_6_0=ruleTypeRef();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getParserRuleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_6_0, 
                                    		"TypeRef");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:623:6: ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:623:7: ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')'
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:623:7: ( (lv_definesHiddenTokens_7_0= 'hidden' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:624:1: (lv_definesHiddenTokens_7_0= 'hidden' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:624:1: (lv_definesHiddenTokens_7_0= 'hidden' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:625:3: lv_definesHiddenTokens_7_0= 'hidden'
                    {
                    lv_definesHiddenTokens_7_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParserRule1355); 

                            newLeafNode(lv_definesHiddenTokens_7_0, grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleRule());
                    	        }
                           		setWithLastConsumed(current, "definesHiddenTokens", true, "hidden");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParserRule1380); 

                        	newLeafNode(otherlv_8, grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:642:1: ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:642:2: ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                            {
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:642:2: ( (otherlv_9= RULE_ID ) )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:643:1: (otherlv_9= RULE_ID )
                            {
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:643:1: (otherlv_9= RULE_ID )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:644:3: otherlv_9= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getParserRuleRule());
                            	        }
                                    
                            otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1401); 

                            		newLeafNode(otherlv_9, grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_1_2_0_0()); 
                            	

                            }


                            }

                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:655:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==13) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:655:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParserRule1414); 

                            	        	newLeafNode(otherlv_10, grammarAccess.getParserRuleAccess().getCommaKeyword_1_2_1_0());
                            	        
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:659:1: ( (otherlv_11= RULE_ID ) )
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:660:1: (otherlv_11= RULE_ID )
                            	    {
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:660:1: (otherlv_11= RULE_ID )
                            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:661:3: otherlv_11= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getParserRuleRule());
                            	    	        }
                            	            
                            	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1434); 

                            	    		newLeafNode(otherlv_11, grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_1_2_1_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParserRule1450); 

                        	newLeafNode(otherlv_12, grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParserRule1464); 

                	newLeafNode(otherlv_13, grammarAccess.getParserRuleAccess().getColonKeyword_2());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:680:1: ( (lv_alternatives_14_0= ruleAlternatives ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:681:1: (lv_alternatives_14_0= ruleAlternatives )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:681:1: (lv_alternatives_14_0= ruleAlternatives )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:682:3: lv_alternatives_14_0= ruleAlternatives
            {
             
            	        newCompositeNode(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParserRule1485);
            lv_alternatives_14_0=ruleAlternatives();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParserRuleRule());
            	        }
                   		set(
                   			current, 
                   			"alternatives",
                    		lv_alternatives_14_0, 
                    		"Alternatives");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParserRule1497); 

                	newLeafNode(otherlv_15, grammarAccess.getParserRuleAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleTypeRef"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:710:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:711:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:712:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_entryRuleTypeRef1533);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRef1543); 

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:719:1: ruleTypeRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:722:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:723:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:723:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:723:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:723:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==26) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:723:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:723:3: ( (otherlv_0= RULE_ID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:724:1: (otherlv_0= RULE_ID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:724:1: (otherlv_0= RULE_ID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:725:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRefRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef1589); 

                    		newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeRef1601); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:740:3: ( (otherlv_2= RULE_ID ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:741:1: (otherlv_2= RULE_ID )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:741:1: (otherlv_2= RULE_ID )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:742:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef1623); 

            		newLeafNode(otherlv_2, grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0()); 
            	

            }


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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleAlternatives"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:761:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:762:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:763:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_entryRuleAlternatives1659);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternatives1669); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:770:1: ruleAlternatives returns [EObject current=null] : (this_UnorderedGroup_0= ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )? ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnorderedGroup_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:773:28: ( (this_UnorderedGroup_0= ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:774:1: (this_UnorderedGroup_0= ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:774:1: (this_UnorderedGroup_0= ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:775:5: this_UnorderedGroup_0= ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getAlternativesAccess().getUnorderedGroupParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleAlternatives1716);
            this_UnorderedGroup_0=ruleUnorderedGroup();

            state._fsp--;

             
                    current = this_UnorderedGroup_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:783:1: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:783:2: () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:783:2: ()
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:784:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAlternativesAccess().getAlternativesElementsAction_1_0(),
                                current);
                        

                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:789:2: (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:789:4: otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAlternatives1738); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	        
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:793:1: ( (lv_elements_3_0= ruleUnorderedGroup ) )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:794:1: (lv_elements_3_0= ruleUnorderedGroup )
                    	    {
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:794:1: (lv_elements_3_0= ruleUnorderedGroup )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:795:3: lv_elements_3_0= ruleUnorderedGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlternativesAccess().getElementsUnorderedGroupParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleAlternatives1759);
                    	    lv_elements_3_0=ruleUnorderedGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlternativesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"UnorderedGroup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleUnorderedGroup"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:819:1: entryRuleUnorderedGroup returns [EObject current=null] : iv_ruleUnorderedGroup= ruleUnorderedGroup EOF ;
    public final EObject entryRuleUnorderedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedGroup = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:820:2: (iv_ruleUnorderedGroup= ruleUnorderedGroup EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:821:2: iv_ruleUnorderedGroup= ruleUnorderedGroup EOF
            {
             newCompositeNode(grammarAccess.getUnorderedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup1799);
            iv_ruleUnorderedGroup=ruleUnorderedGroup();

            state._fsp--;

             current =iv_ruleUnorderedGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroup1809); 

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
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:828:1: ruleUnorderedGroup returns [EObject current=null] : (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) ;
    public final EObject ruleUnorderedGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Group_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:831:28: ( (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:832:1: (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:832:1: (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:833:5: this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getUnorderedGroupAccess().getGroupParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup1856);
            this_Group_0=ruleGroup();

            state._fsp--;

             
                    current = this_Group_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:841:1: ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:841:2: () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:841:2: ()
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:842:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getUnorderedGroupAccess().getUnorderedGroupElementsAction_1_0(),
                                current);
                        

                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:847:2: (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==28) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:847:4: otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleUnorderedGroup1878); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getUnorderedGroupAccess().getAmpersandKeyword_1_1_0());
                    	        
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:851:1: ( (lv_elements_3_0= ruleGroup ) )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:852:1: (lv_elements_3_0= ruleGroup )
                    	    {
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:852:1: (lv_elements_3_0= ruleGroup )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:853:3: lv_elements_3_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUnorderedGroupAccess().getElementsGroupParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup1899);
                    	    lv_elements_3_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUnorderedGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


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
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleGroup"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:877:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:878:2: (iv_ruleGroup= ruleGroup EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:879:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1939);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1949); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:886:1: ruleGroup returns [EObject current=null] : (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractToken_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:889:28: ( (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:890:1: (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:890:1: (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:891:5: this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup1996);
            this_AbstractToken_0=ruleAbstractToken();

            state._fsp--;

             
                    current = this_AbstractToken_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:899:1: ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==15||LA25_0==31||(LA25_0>=36 && LA25_0<=37)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:899:2: () ( (lv_elements_2_0= ruleAbstractToken ) )+
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:899:2: ()
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:900:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getGroupAccess().getGroupElementsAction_1_0(),
                                current);
                        

                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:905:2: ( (lv_elements_2_0= ruleAbstractToken ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==15||LA24_0==31||(LA24_0>=36 && LA24_0<=37)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:906:1: (lv_elements_2_0= ruleAbstractToken )
                    	    {
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:906:1: (lv_elements_2_0= ruleAbstractToken )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:907:3: lv_elements_2_0= ruleAbstractToken
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupAccess().getElementsAbstractTokenParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup2026);
                    	    lv_elements_2_0=ruleAbstractToken();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_2_0, 
                    	            		"AbstractToken");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:931:1: entryRuleAbstractToken returns [EObject current=null] : iv_ruleAbstractToken= ruleAbstractToken EOF ;
    public final EObject entryRuleAbstractToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractToken = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:932:2: (iv_ruleAbstractToken= ruleAbstractToken EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:933:2: iv_ruleAbstractToken= ruleAbstractToken EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken2065);
            iv_ruleAbstractToken=ruleAbstractToken();

            state._fsp--;

             current =iv_ruleAbstractToken; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractToken2075); 

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
    // $ANTLR end "entryRuleAbstractToken"


    // $ANTLR start "ruleAbstractToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:940:1: ruleAbstractToken returns [EObject current=null] : (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction ) ;
    public final EObject ruleAbstractToken() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractTokenWithCardinality_0 = null;

        EObject this_Action_1 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:943:28: ( (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:944:1: (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:944:1: (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==15||(LA26_0>=36 && LA26_0<=37)) ) {
                alt26=1;
            }
            else if ( (LA26_0==31) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:945:5: this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken2122);
                    this_AbstractTokenWithCardinality_0=ruleAbstractTokenWithCardinality();

                    state._fsp--;

                     
                            current = this_AbstractTokenWithCardinality_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:955:5: this_Action_1= ruleAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleAbstractToken2149);
                    this_Action_1=ruleAction();

                    state._fsp--;

                     
                            current = this_Action_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractToken"


    // $ANTLR start "entryRuleAbstractTokenWithCardinality"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:971:1: entryRuleAbstractTokenWithCardinality returns [EObject current=null] : iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF ;
    public final EObject entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTokenWithCardinality = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:972:2: (iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:973:2: iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality2184);
            iv_ruleAbstractTokenWithCardinality=ruleAbstractTokenWithCardinality();

            state._fsp--;

             current =iv_ruleAbstractTokenWithCardinality; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality2194); 

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
    // $ANTLR end "entryRuleAbstractTokenWithCardinality"


    // $ANTLR start "ruleAbstractTokenWithCardinality"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:980:1: ruleAbstractTokenWithCardinality returns [EObject current=null] : ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final EObject ruleAbstractTokenWithCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_Assignment_0 = null;

        EObject this_AbstractTerminal_1 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:983:28: ( ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:984:1: ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:984:1: ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:984:2: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:984:2: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal )
            int alt27=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_ID) ) {
                    int LA27_5 = input.LA(3);

                    if ( ((LA27_5>=32 && LA27_5<=33)||LA27_5==38) ) {
                        alt27=1;
                    }
                    else if ( (LA27_5==EOF||(LA27_5>=RULE_ID && LA27_5<=RULE_STRING)||(LA27_5>=15 && LA27_5<=16)||LA27_5==22||LA27_5==25||(LA27_5>=27 && LA27_5<=31)||(LA27_5>=36 && LA27_5<=37)) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==RULE_STRING||LA27_1==15) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==RULE_ID) ) {
                    int LA27_5 = input.LA(3);

                    if ( ((LA27_5>=32 && LA27_5<=33)||LA27_5==38) ) {
                        alt27=1;
                    }
                    else if ( (LA27_5==EOF||(LA27_5>=RULE_ID && LA27_5<=RULE_STRING)||(LA27_5>=15 && LA27_5<=16)||LA27_5==22||LA27_5==25||(LA27_5>=27 && LA27_5<=31)||(LA27_5>=36 && LA27_5<=37)) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==RULE_STRING||LA27_2==15) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==EOF||(LA27_3>=RULE_ID && LA27_3<=RULE_STRING)||(LA27_3>=15 && LA27_3<=16)||LA27_3==22||(LA27_3>=25 && LA27_3<=31)||(LA27_3>=36 && LA27_3<=37)) ) {
                    alt27=2;
                }
                else if ( ((LA27_3>=32 && LA27_3<=33)||LA27_3==38) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 15:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:985:5: this_Assignment_0= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality2242);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:995:5: this_AbstractTerminal_1= ruleAbstractTerminal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality2269);
                    this_AbstractTerminal_1=ruleAbstractTerminal();

                    state._fsp--;

                     
                            current = this_AbstractTerminal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1003:2: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22||(LA29_0>=29 && LA29_0<=30)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1004:1: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1004:1: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1005:1: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1005:1: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt28=3;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        alt28=1;
                        }
                        break;
                    case 22:
                        {
                        alt28=2;
                        }
                        break;
                    case 30:
                        {
                        alt28=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1006:3: lv_cardinality_2_1= '?'
                            {
                            lv_cardinality_2_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAbstractTokenWithCardinality2289); 

                                    newLeafNode(lv_cardinality_2_1, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1018:8: lv_cardinality_2_2= '*'
                            {
                            lv_cardinality_2_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAbstractTokenWithCardinality2318); 

                                    newLeafNode(lv_cardinality_2_2, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1030:8: lv_cardinality_2_3= '+'
                            {
                            lv_cardinality_2_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAbstractTokenWithCardinality2347); 

                                    newLeafNode(lv_cardinality_2_3, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                            	    

                            }
                            break;

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
    // $ANTLR end "ruleAbstractTokenWithCardinality"


    // $ANTLR start "entryRuleAction"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1053:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1054:2: (iv_ruleAction= ruleAction EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1055:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2400);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2410); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1062:1: ruleAction returns [EObject current=null] : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_feature_3_0=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1065:28: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1066:1: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1066:1: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1066:3: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAction2447); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1070:1: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1071:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1071:1: (lv_type_1_0= ruleTypeRef )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1072:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleAction2468);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1088:2: (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1088:4: otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction2481); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getFullStopKeyword_2_0());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1092:1: ( (lv_feature_3_0= RULE_ID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1093:1: (lv_feature_3_0= RULE_ID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1093:1: (lv_feature_3_0= RULE_ID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1094:3: lv_feature_3_0= RULE_ID
                    {
                    lv_feature_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction2498); 

                    			newLeafNode(lv_feature_3_0, grammarAccess.getActionAccess().getFeatureIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"feature",
                            		lv_feature_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1110:2: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1111:1: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1111:1: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1112:1: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1112:1: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==32) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==33) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1113:3: lv_operator_4_1= '='
                            {
                            lv_operator_4_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAction2523); 

                                    newLeafNode(lv_operator_4_1, grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_4_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1125:8: lv_operator_4_2= '+='
                            {
                            lv_operator_4_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAction2552); 

                                    newLeafNode(lv_operator_4_2, grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_4_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAction2580); 

                        	newLeafNode(otherlv_5, grammarAccess.getActionAccess().getCurrentKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAction2594); 

                	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAbstractTerminal"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1156:1: entryRuleAbstractTerminal returns [EObject current=null] : iv_ruleAbstractTerminal= ruleAbstractTerminal EOF ;
    public final EObject entryRuleAbstractTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTerminal = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1157:2: (iv_ruleAbstractTerminal= ruleAbstractTerminal EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1158:2: iv_ruleAbstractTerminal= ruleAbstractTerminal EOF
            {
             newCompositeNode(grammarAccess.getAbstractTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal2630);
            iv_ruleAbstractTerminal=ruleAbstractTerminal();

            state._fsp--;

             current =iv_ruleAbstractTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTerminal2640); 

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
    // $ANTLR end "entryRuleAbstractTerminal"


    // $ANTLR start "ruleAbstractTerminal"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1165:1: ruleAbstractTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup ) ;
    public final EObject ruleAbstractTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedElement_2 = null;

        EObject this_PredicatedKeyword_3 = null;

        EObject this_PredicatedRuleCall_4 = null;

        EObject this_PredicatedGroup_5 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1168:28: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1169:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1169:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup )
            int alt32=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt32=1;
                }
                break;
            case RULE_ID:
                {
                alt32=2;
                }
                break;
            case 15:
                {
                alt32=3;
                }
                break;
            case 36:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt32=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt32=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt32=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 4, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt32=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt32=4;
                    }
                    break;
                case 15:
                    {
                    alt32=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1170:5: this_Keyword_0= ruleKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAbstractTerminal2687);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;

                     
                            current = this_Keyword_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1180:5: this_RuleCall_1= ruleRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAbstractTerminal2714);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;

                     
                            current = this_RuleCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1190:5: this_ParenthesizedElement_2= ruleParenthesizedElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal2741);
                    this_ParenthesizedElement_2=ruleParenthesizedElement();

                    state._fsp--;

                     
                            current = this_ParenthesizedElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1200:5: this_PredicatedKeyword_3= rulePredicatedKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedKeywordParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal2768);
                    this_PredicatedKeyword_3=rulePredicatedKeyword();

                    state._fsp--;

                     
                            current = this_PredicatedKeyword_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1210:5: this_PredicatedRuleCall_4= rulePredicatedRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedRuleCallParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal2795);
                    this_PredicatedRuleCall_4=rulePredicatedRuleCall();

                    state._fsp--;

                     
                            current = this_PredicatedRuleCall_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1220:5: this_PredicatedGroup_5= rulePredicatedGroup
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedGroupParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal2822);
                    this_PredicatedGroup_5=rulePredicatedGroup();

                    state._fsp--;

                     
                            current = this_PredicatedGroup_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractTerminal"


    // $ANTLR start "entryRuleKeyword"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1236:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1237:2: (iv_ruleKeyword= ruleKeyword EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1238:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_entryRuleKeyword2857);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyword2867); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1245:1: ruleKeyword returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1248:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1249:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1249:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1250:1: (lv_value_0_0= RULE_STRING )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1250:1: (lv_value_0_0= RULE_STRING )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1251:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeyword2908); 

            			newLeafNode(lv_value_0_0, grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleRuleCall"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1275:1: entryRuleRuleCall returns [EObject current=null] : iv_ruleRuleCall= ruleRuleCall EOF ;
    public final EObject entryRuleRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleCall = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1276:2: (iv_ruleRuleCall= ruleRuleCall EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1277:2: iv_ruleRuleCall= ruleRuleCall EOF
            {
             newCompositeNode(grammarAccess.getRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_entryRuleRuleCall2948);
            iv_ruleRuleCall=ruleRuleCall();

            state._fsp--;

             current =iv_ruleRuleCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleCall2958); 

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
    // $ANTLR end "entryRuleRuleCall"


    // $ANTLR start "ruleRuleCall"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1284:1: ruleRuleCall returns [EObject current=null] : ( ( ruleRuleID ) ) ;
    public final EObject ruleRuleCall() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1287:28: ( ( ( ruleRuleID ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1288:1: ( ( ruleRuleID ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1288:1: ( ( ruleRuleID ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1289:1: ( ruleRuleID )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1289:1: ( ruleRuleID )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1290:3: ruleRuleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_ruleRuleCall3005);
            ruleRuleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleRuleID"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1311:1: entryRuleRuleID returns [String current=null] : iv_ruleRuleID= ruleRuleID EOF ;
    public final String entryRuleRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleID = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1312:2: (iv_ruleRuleID= ruleRuleID EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1313:2: iv_ruleRuleID= ruleRuleID EOF
            {
             newCompositeNode(grammarAccess.getRuleIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_entryRuleRuleID3041);
            iv_ruleRuleID=ruleRuleID();

            state._fsp--;

             current =iv_ruleRuleID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleID3052); 

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
    // $ANTLR end "entryRuleRuleID"


    // $ANTLR start "ruleRuleID"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1320:1: ruleRuleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleRuleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1323:28: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1324:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1324:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1324:6: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID3092); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getRuleIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1331:1: (kw= '::' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1332:2: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRuleID3111); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getRuleIDAccess().getColonColonKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID3126); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getRuleIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleRuleID"


    // $ANTLR start "entryRulePredicatedKeyword"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1352:1: entryRulePredicatedKeyword returns [EObject current=null] : iv_rulePredicatedKeyword= rulePredicatedKeyword EOF ;
    public final EObject entryRulePredicatedKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedKeyword = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1353:2: (iv_rulePredicatedKeyword= rulePredicatedKeyword EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1354:2: iv_rulePredicatedKeyword= rulePredicatedKeyword EOF
            {
             newCompositeNode(grammarAccess.getPredicatedKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword3173);
            iv_rulePredicatedKeyword=rulePredicatedKeyword();

            state._fsp--;

             current =iv_rulePredicatedKeyword; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedKeyword3183); 

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
    // $ANTLR end "entryRulePredicatedKeyword"


    // $ANTLR start "rulePredicatedKeyword"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1361:1: rulePredicatedKeyword returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePredicatedKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1364:28: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1365:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1365:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1365:2: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1365:2: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            else if ( (LA34_0==37) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1365:3: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1365:3: ( (lv_predicated_0_0= '=>' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1366:1: (lv_predicated_0_0= '=>' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1366:1: (lv_predicated_0_0= '=>' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1367:3: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePredicatedKeyword3227); 

                            newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedKeywordRule());
                    	        }
                           		setWithLastConsumed(current, "predicated", true, "=>");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1381:6: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1381:6: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1382:1: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1382:1: (lv_firstSetPredicated_1_0= '->' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1383:3: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePredicatedKeyword3264); 

                            newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedKeywordRule());
                    	        }
                           		setWithLastConsumed(current, "firstSetPredicated", true, "->");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1396:3: ( (lv_value_2_0= RULE_STRING ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1397:1: (lv_value_2_0= RULE_STRING )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1397:1: (lv_value_2_0= RULE_STRING )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1398:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePredicatedKeyword3295); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPredicatedKeywordAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicatedKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "rulePredicatedKeyword"


    // $ANTLR start "entryRulePredicatedRuleCall"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1422:1: entryRulePredicatedRuleCall returns [EObject current=null] : iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF ;
    public final EObject entryRulePredicatedRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedRuleCall = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1423:2: (iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1424:2: iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF
            {
             newCompositeNode(grammarAccess.getPredicatedRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall3336);
            iv_rulePredicatedRuleCall=rulePredicatedRuleCall();

            state._fsp--;

             current =iv_rulePredicatedRuleCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedRuleCall3346); 

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
    // $ANTLR end "entryRulePredicatedRuleCall"


    // $ANTLR start "rulePredicatedRuleCall"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1431:1: rulePredicatedRuleCall returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePredicatedRuleCall() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1434:28: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1435:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1435:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1435:2: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1435:2: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            else if ( (LA35_0==37) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1435:3: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1435:3: ( (lv_predicated_0_0= '=>' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1436:1: (lv_predicated_0_0= '=>' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1436:1: (lv_predicated_0_0= '=>' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1437:3: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePredicatedRuleCall3390); 

                            newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
                    	        }
                           		setWithLastConsumed(current, "predicated", true, "=>");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1451:6: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1451:6: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1452:1: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1452:1: (lv_firstSetPredicated_1_0= '->' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1453:3: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePredicatedRuleCall3427); 

                            newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
                    	        }
                           		setWithLastConsumed(current, "firstSetPredicated", true, "->");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1466:3: ( (otherlv_2= RULE_ID ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1467:1: (otherlv_2= RULE_ID )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1467:1: (otherlv_2= RULE_ID )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1468:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePredicatedRuleCall3461); 

            		newLeafNode(otherlv_2, grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleCrossReference_1_0()); 
            	

            }


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
    // $ANTLR end "rulePredicatedRuleCall"


    // $ANTLR start "entryRuleAssignment"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1487:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1488:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1489:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment3497);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment3507); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1496:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_feature_2_0=null;
        Token lv_operator_3_1=null;
        Token lv_operator_3_2=null;
        Token lv_operator_3_3=null;
        EObject lv_terminal_4_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1499:28: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1500:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1500:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1500:2: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1500:2: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            else if ( (LA36_0==37) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1500:3: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1500:3: ( (lv_predicated_0_0= '=>' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1501:1: (lv_predicated_0_0= '=>' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1501:1: (lv_predicated_0_0= '=>' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1502:3: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAssignment3551); 

                            newLeafNode(lv_predicated_0_0, grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "predicated", true, "=>");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1516:6: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1516:6: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1517:1: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1517:1: (lv_firstSetPredicated_1_0= '->' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1518:3: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAssignment3588); 

                            newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "firstSetPredicated", true, "->");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1531:4: ( (lv_feature_2_0= RULE_ID ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1532:1: (lv_feature_2_0= RULE_ID )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1532:1: (lv_feature_2_0= RULE_ID )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1533:3: lv_feature_2_0= RULE_ID
            {
            lv_feature_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment3620); 

            			newLeafNode(lv_feature_2_0, grammarAccess.getAssignmentAccess().getFeatureIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"feature",
                    		lv_feature_2_0, 
                    		"ID");
            	    

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1549:2: ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1550:1: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1550:1: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1551:1: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1551:1: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt37=1;
                }
                break;
            case 32:
                {
                alt37=2;
                }
                break;
            case 38:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1552:3: lv_operator_3_1= '+='
                    {
                    lv_operator_3_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAssignment3645); 

                            newLeafNode(lv_operator_3_1, grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1564:8: lv_operator_3_2= '='
                    {
                    lv_operator_3_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAssignment3674); 

                            newLeafNode(lv_operator_3_2, grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1576:8: lv_operator_3_3= '?='
                    {
                    lv_operator_3_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAssignment3703); 

                            newLeafNode(lv_operator_3_3, grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_3_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1591:2: ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1592:1: (lv_terminal_4_0= ruleAssignableTerminal )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1592:1: (lv_terminal_4_0= ruleAssignableTerminal )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1593:3: lv_terminal_4_0= ruleAssignableTerminal
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignment3740);
            lv_terminal_4_0=ruleAssignableTerminal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"terminal",
                    		lv_terminal_4_0, 
                    		"AssignableTerminal");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignableTerminal"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1617:1: entryRuleAssignableTerminal returns [EObject current=null] : iv_ruleAssignableTerminal= ruleAssignableTerminal EOF ;
    public final EObject entryRuleAssignableTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableTerminal = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1618:2: (iv_ruleAssignableTerminal= ruleAssignableTerminal EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1619:2: iv_ruleAssignableTerminal= ruleAssignableTerminal EOF
            {
             newCompositeNode(grammarAccess.getAssignableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal3776);
            iv_ruleAssignableTerminal=ruleAssignableTerminal();

            state._fsp--;

             current =iv_ruleAssignableTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableTerminal3786); 

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
    // $ANTLR end "entryRuleAssignableTerminal"


    // $ANTLR start "ruleAssignableTerminal"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1626:1: ruleAssignableTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference ) ;
    public final EObject ruleAssignableTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedAssignableElement_2 = null;

        EObject this_CrossReference_3 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1629:28: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1630:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1630:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference )
            int alt38=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt38=1;
                }
                break;
            case RULE_ID:
                {
                alt38=2;
                }
                break;
            case 15:
                {
                alt38=3;
                }
                break;
            case 39:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1631:5: this_Keyword_0= ruleKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAssignableTerminal3833);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;

                     
                            current = this_Keyword_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1641:5: this_RuleCall_1= ruleRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAssignableTerminal3860);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;

                     
                            current = this_RuleCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1651:5: this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement
                    {
                     
                            newCompositeNode(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal3887);
                    this_ParenthesizedAssignableElement_2=ruleParenthesizedAssignableElement();

                    state._fsp--;

                     
                            current = this_ParenthesizedAssignableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1661:5: this_CrossReference_3= ruleCrossReference
                    {
                     
                            newCompositeNode(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_ruleAssignableTerminal3914);
                    this_CrossReference_3=ruleCrossReference();

                    state._fsp--;

                     
                            current = this_CrossReference_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAssignableTerminal"


    // $ANTLR start "entryRuleParenthesizedAssignableElement"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1677:1: entryRuleParenthesizedAssignableElement returns [EObject current=null] : iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF ;
    public final EObject entryRuleParenthesizedAssignableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedAssignableElement = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1678:2: (iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1679:2: iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedAssignableElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement3949);
            iv_ruleParenthesizedAssignableElement=ruleParenthesizedAssignableElement();

            state._fsp--;

             current =iv_ruleParenthesizedAssignableElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement3959); 

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
    // $ANTLR end "entryRuleParenthesizedAssignableElement"


    // $ANTLR start "ruleParenthesizedAssignableElement"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1686:1: ruleParenthesizedAssignableElement returns [EObject current=null] : (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedAssignableElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AssignableAlternatives_1 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1689:28: ( (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1690:1: (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1690:1: (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1690:3: otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedAssignableElement3996); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement4018);
            this_AssignableAlternatives_1=ruleAssignableAlternatives();

            state._fsp--;

             
                    current = this_AssignableAlternatives_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedAssignableElement4029); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParenthesizedAssignableElement"


    // $ANTLR start "entryRuleAssignableAlternatives"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1715:1: entryRuleAssignableAlternatives returns [EObject current=null] : iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF ;
    public final EObject entryRuleAssignableAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableAlternatives = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1716:2: (iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1717:2: iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAssignableAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives4065);
            iv_ruleAssignableAlternatives=ruleAssignableAlternatives();

            state._fsp--;

             current =iv_ruleAssignableAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableAlternatives4075); 

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
    // $ANTLR end "entryRuleAssignableAlternatives"


    // $ANTLR start "ruleAssignableAlternatives"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1724:1: ruleAssignableAlternatives returns [EObject current=null] : (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final EObject ruleAssignableAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AssignableTerminal_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1727:28: ( (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1728:1: (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1728:1: (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1729:5: this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives4122);
            this_AssignableTerminal_0=ruleAssignableTerminal();

            state._fsp--;

             
                    current = this_AssignableTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1737:1: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1737:2: () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1737:2: ()
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1738:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAssignableAlternativesAccess().getAlternativesElementsAction_1_0(),
                                current);
                        

                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1743:2: (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==27) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1743:4: otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    {
                    	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAssignableAlternatives4144); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	        
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1747:1: ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1748:1: (lv_elements_3_0= ruleAssignableTerminal )
                    	    {
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1748:1: (lv_elements_3_0= ruleAssignableTerminal )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1749:3: lv_elements_3_0= ruleAssignableTerminal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getElementsAssignableTerminalParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives4165);
                    	    lv_elements_3_0=ruleAssignableTerminal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssignableAlternativesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"AssignableTerminal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


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
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1773:1: entryRuleCrossReference returns [EObject current=null] : iv_ruleCrossReference= ruleCrossReference EOF ;
    public final EObject entryRuleCrossReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReference = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1774:2: (iv_ruleCrossReference= ruleCrossReference EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1775:2: iv_ruleCrossReference= ruleCrossReference EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_entryRuleCrossReference4205);
            iv_ruleCrossReference=ruleCrossReference();

            state._fsp--;

             current =iv_ruleCrossReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReference4215); 

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
    // $ANTLR end "entryRuleCrossReference"


    // $ANTLR start "ruleCrossReference"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1782:1: ruleCrossReference returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleCrossReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_terminal_3_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1785:28: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1786:1: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1786:1: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1786:3: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCrossReference4252); 

                	newLeafNode(otherlv_0, grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1790:1: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1791:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1791:1: (lv_type_1_0= ruleTypeRef )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1792:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleCrossReference4273);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1808:2: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1808:4: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCrossReference4286); 

                        	newLeafNode(otherlv_2, grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1812:1: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1813:1: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1813:1: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1814:3: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {
                     
                    	        newCompositeNode(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference4307);
                    lv_terminal_3_0=ruleCrossReferenceableTerminal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"terminal",
                            		lv_terminal_3_0, 
                            		"CrossReferenceableTerminal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCrossReference4321); 

                	newLeafNode(otherlv_4, grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleCrossReference"


    // $ANTLR start "entryRuleCrossReferenceableTerminal"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1842:1: entryRuleCrossReferenceableTerminal returns [EObject current=null] : iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF ;
    public final EObject entryRuleCrossReferenceableTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReferenceableTerminal = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1843:2: (iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1844:2: iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal4357);
            iv_ruleCrossReferenceableTerminal=ruleCrossReferenceableTerminal();

            state._fsp--;

             current =iv_ruleCrossReferenceableTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal4367); 

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
    // $ANTLR end "entryRuleCrossReferenceableTerminal"


    // $ANTLR start "ruleCrossReferenceableTerminal"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1851:1: ruleCrossReferenceableTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall ) ;
    public final EObject ruleCrossReferenceableTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1854:28: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1855:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1855:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1856:5: this_Keyword_0= ruleKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal4414);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;

                     
                            current = this_Keyword_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1866:5: this_RuleCall_1= ruleRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal4441);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;

                     
                            current = this_RuleCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleCrossReferenceableTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1882:1: entryRuleParenthesizedElement returns [EObject current=null] : iv_ruleParenthesizedElement= ruleParenthesizedElement EOF ;
    public final EObject entryRuleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedElement = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1883:2: (iv_ruleParenthesizedElement= ruleParenthesizedElement EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1884:2: iv_ruleParenthesizedElement= ruleParenthesizedElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement4476);
            iv_ruleParenthesizedElement=ruleParenthesizedElement();

            state._fsp--;

             current =iv_ruleParenthesizedElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedElement4486); 

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
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1891:1: ruleParenthesizedElement returns [EObject current=null] : (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Alternatives_1 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1894:28: ( (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1895:1: (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1895:1: (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1895:3: otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedElement4523); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParenthesizedElement4545);
            this_Alternatives_1=ruleAlternatives();

            state._fsp--;

             
                    current = this_Alternatives_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedElement4556); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRulePredicatedGroup"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1920:1: entryRulePredicatedGroup returns [EObject current=null] : iv_rulePredicatedGroup= rulePredicatedGroup EOF ;
    public final EObject entryRulePredicatedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedGroup = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1921:2: (iv_rulePredicatedGroup= rulePredicatedGroup EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1922:2: iv_rulePredicatedGroup= rulePredicatedGroup EOF
            {
             newCompositeNode(grammarAccess.getPredicatedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup4592);
            iv_rulePredicatedGroup=rulePredicatedGroup();

            state._fsp--;

             current =iv_rulePredicatedGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedGroup4602); 

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
    // $ANTLR end "entryRulePredicatedGroup"


    // $ANTLR start "rulePredicatedGroup"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1929:1: rulePredicatedGroup returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) ;
    public final EObject rulePredicatedGroup() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1932:28: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1933:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1933:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1933:2: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')'
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1933:2: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            else if ( (LA43_0==37) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1933:3: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1933:3: ( (lv_predicated_0_0= '=>' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1934:1: (lv_predicated_0_0= '=>' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1934:1: (lv_predicated_0_0= '=>' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1935:3: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePredicatedGroup4646); 

                            newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedGroupRule());
                    	        }
                           		setWithLastConsumed(current, "predicated", true, "=>");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1949:6: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1949:6: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1950:1: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1950:1: (lv_firstSetPredicated_1_0= '->' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1951:3: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePredicatedGroup4683); 

                            newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedGroupRule());
                    	        }
                           		setWithLastConsumed(current, "firstSetPredicated", true, "->");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePredicatedGroup4709); 

                	newLeafNode(otherlv_2, grammarAccess.getPredicatedGroupAccess().getLeftParenthesisKeyword_1());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1968:1: ( (lv_elements_3_0= ruleAlternatives ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1969:1: (lv_elements_3_0= ruleAlternatives )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1969:1: (lv_elements_3_0= ruleAlternatives )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1970:3: lv_elements_3_0= ruleAlternatives
            {
             
            	        newCompositeNode(grammarAccess.getPredicatedGroupAccess().getElementsAlternativesParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_rulePredicatedGroup4730);
            lv_elements_3_0=ruleAlternatives();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicatedGroupRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_3_0, 
                    		"Alternatives");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePredicatedGroup4742); 

                	newLeafNode(otherlv_4, grammarAccess.getPredicatedGroupAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulePredicatedGroup"


    // $ANTLR start "entryRuleTerminalRule"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1998:1: entryRuleTerminalRule returns [EObject current=null] : iv_ruleTerminalRule= ruleTerminalRule EOF ;
    public final EObject entryRuleTerminalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalRule = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:1999:2: (iv_ruleTerminalRule= ruleTerminalRule EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2000:2: iv_ruleTerminalRule= ruleTerminalRule EOF
            {
             newCompositeNode(grammarAccess.getTerminalRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule4778);
            iv_ruleTerminalRule=ruleTerminalRule();

            state._fsp--;

             current =iv_ruleTerminalRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalRule4788); 

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
    // $ANTLR end "entryRuleTerminalRule"


    // $ANTLR start "ruleTerminalRule"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2007:1: ruleTerminalRule returns [EObject current=null] : (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) ;
    public final EObject ruleTerminalRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fragment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_5_0 = null;

        EObject lv_alternatives_7_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2010:28: ( (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2011:1: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2011:1: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2011:3: otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTerminalRule4825); 

                	newLeafNode(otherlv_0, grammarAccess.getTerminalRuleAccess().getTerminalKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2015:1: ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2015:2: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2015:2: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2015:3: ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2015:3: ( (lv_fragment_1_0= 'fragment' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2016:1: (lv_fragment_1_0= 'fragment' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2016:1: (lv_fragment_1_0= 'fragment' )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2017:3: lv_fragment_1_0= 'fragment'
                    {
                    lv_fragment_1_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTerminalRule4845); 

                            newLeafNode(lv_fragment_1_0, grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalRuleRule());
                    	        }
                           		setWithLastConsumed(current, "fragment", true, "fragment");
                    	    

                    }


                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2030:2: ( (lv_name_2_0= RULE_ID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2031:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2031:1: (lv_name_2_0= RULE_ID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2032:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule4875); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getTerminalRuleAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2049:6: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2049:6: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2049:7: ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2049:7: ( (lv_name_3_0= RULE_ID ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2050:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2050:1: (lv_name_3_0= RULE_ID )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2051:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule4905); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getTerminalRuleAccess().getNameIDTerminalRuleCall_1_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2067:2: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==23) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2067:4: otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) )
                            {
                            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTerminalRule4923); 

                                	newLeafNode(otherlv_4, grammarAccess.getTerminalRuleAccess().getReturnsKeyword_1_1_1_0());
                                
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2071:1: ( (lv_type_5_0= ruleTypeRef ) )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2072:1: (lv_type_5_0= ruleTypeRef )
                            {
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2072:1: (lv_type_5_0= ruleTypeRef )
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2073:3: lv_type_5_0= ruleTypeRef
                            {
                             
                            	        newCompositeNode(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleTerminalRule4944);
                            lv_type_5_0=ruleTypeRef();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_5_0, 
                                    		"TypeRef");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTerminalRule4960); 

                	newLeafNode(otherlv_6, grammarAccess.getTerminalRuleAccess().getColonKeyword_2());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2093:1: ( (lv_alternatives_7_0= ruleTerminalAlternatives ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2094:1: (lv_alternatives_7_0= ruleTerminalAlternatives )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2094:1: (lv_alternatives_7_0= ruleTerminalAlternatives )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2095:3: lv_alternatives_7_0= ruleTerminalAlternatives
            {
             
            	        newCompositeNode(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule4981);
            lv_alternatives_7_0=ruleTerminalAlternatives();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
            	        }
                   		set(
                   			current, 
                   			"alternatives",
                    		lv_alternatives_7_0, 
                    		"TerminalAlternatives");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTerminalRule4993); 

                	newLeafNode(otherlv_8, grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleTerminalRule"


    // $ANTLR start "entryRuleTerminalAlternatives"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2123:1: entryRuleTerminalAlternatives returns [EObject current=null] : iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF ;
    public final EObject entryRuleTerminalAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalAlternatives = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2124:2: (iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2125:2: iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF
            {
             newCompositeNode(grammarAccess.getTerminalAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives5029);
            iv_ruleTerminalAlternatives=ruleTerminalAlternatives();

            state._fsp--;

             current =iv_ruleTerminalAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalAlternatives5039); 

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
    // $ANTLR end "entryRuleTerminalAlternatives"


    // $ANTLR start "ruleTerminalAlternatives"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2132:1: ruleTerminalAlternatives returns [EObject current=null] : (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final EObject ruleTerminalAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TerminalGroup_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2135:28: ( (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2136:1: (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2136:1: (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2137:5: this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives5086);
            this_TerminalGroup_0=ruleTerminalGroup();

            state._fsp--;

             
                    current = this_TerminalGroup_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2145:1: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2145:2: () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2145:2: ()
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2146:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getTerminalAlternativesAccess().getAlternativesElementsAction_1_0(),
                                current);
                        

                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2151:2: (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==27) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2151:4: otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTerminalAlternatives5108); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	        
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2155:1: ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2156:1: (lv_elements_3_0= ruleTerminalGroup )
                    	    {
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2156:1: (lv_elements_3_0= ruleTerminalGroup )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2157:3: lv_elements_3_0= ruleTerminalGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getElementsTerminalGroupParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives5129);
                    	    lv_elements_3_0=ruleTerminalGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTerminalAlternativesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"TerminalGroup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


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
    // $ANTLR end "ruleTerminalAlternatives"


    // $ANTLR start "entryRuleTerminalGroup"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2181:1: entryRuleTerminalGroup returns [EObject current=null] : iv_ruleTerminalGroup= ruleTerminalGroup EOF ;
    public final EObject entryRuleTerminalGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalGroup = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2182:2: (iv_ruleTerminalGroup= ruleTerminalGroup EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2183:2: iv_ruleTerminalGroup= ruleTerminalGroup EOF
            {
             newCompositeNode(grammarAccess.getTerminalGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup5169);
            iv_ruleTerminalGroup=ruleTerminalGroup();

            state._fsp--;

             current =iv_ruleTerminalGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalGroup5179); 

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
    // $ANTLR end "entryRuleTerminalGroup"


    // $ANTLR start "ruleTerminalGroup"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2190:1: ruleTerminalGroup returns [EObject current=null] : (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) ;
    public final EObject ruleTerminalGroup() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalToken_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2193:28: ( (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2194:1: (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2194:1: (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2195:5: this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup5226);
            this_TerminalToken_0=ruleTerminalToken();

            state._fsp--;

             
                    current = this_TerminalToken_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2203:1: ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)||LA49_0==15||LA49_0==17||LA49_0==37||(LA49_0>=42 && LA49_0<=43)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2203:2: () ( (lv_elements_2_0= ruleTerminalToken ) )+
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2203:2: ()
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2204:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getTerminalGroupAccess().getGroupElementsAction_1_0(),
                                current);
                        

                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2209:2: ( (lv_elements_2_0= ruleTerminalToken ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||LA48_0==15||LA48_0==17||LA48_0==37||(LA48_0>=42 && LA48_0<=43)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2210:1: (lv_elements_2_0= ruleTerminalToken )
                    	    {
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2210:1: (lv_elements_2_0= ruleTerminalToken )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2211:3: lv_elements_2_0= ruleTerminalToken
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTerminalGroupAccess().getElementsTerminalTokenParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup5256);
                    	    lv_elements_2_0=ruleTerminalToken();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTerminalGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_2_0, 
                    	            		"TerminalToken");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);


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
    // $ANTLR end "ruleTerminalGroup"


    // $ANTLR start "entryRuleTerminalToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2235:1: entryRuleTerminalToken returns [EObject current=null] : iv_ruleTerminalToken= ruleTerminalToken EOF ;
    public final EObject entryRuleTerminalToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalToken = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2236:2: (iv_ruleTerminalToken= ruleTerminalToken EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2237:2: iv_ruleTerminalToken= ruleTerminalToken EOF
            {
             newCompositeNode(grammarAccess.getTerminalTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken5295);
            iv_ruleTerminalToken=ruleTerminalToken();

            state._fsp--;

             current =iv_ruleTerminalToken; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalToken5305); 

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
    // $ANTLR end "entryRuleTerminalToken"


    // $ANTLR start "ruleTerminalToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2244:1: ruleTerminalToken returns [EObject current=null] : (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final EObject ruleTerminalToken() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;
        EObject this_TerminalTokenElement_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2247:28: ( (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2248:1: (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2248:1: (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2249:5: this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken5352);
            this_TerminalTokenElement_0=ruleTerminalTokenElement();

            state._fsp--;

             
                    current = this_TerminalTokenElement_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2257:1: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==22||(LA51_0>=29 && LA51_0<=30)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2258:1: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2258:1: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2259:1: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2259:1: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt50=3;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        alt50=1;
                        }
                        break;
                    case 22:
                        {
                        alt50=2;
                        }
                        break;
                    case 30:
                        {
                        alt50=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2260:3: lv_cardinality_1_1= '?'
                            {
                            lv_cardinality_1_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTerminalToken5371); 

                                    newLeafNode(lv_cardinality_1_1, grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTerminalTokenRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2272:8: lv_cardinality_1_2= '*'
                            {
                            lv_cardinality_1_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTerminalToken5400); 

                                    newLeafNode(lv_cardinality_1_2, grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTerminalTokenRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_1_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2284:8: lv_cardinality_1_3= '+'
                            {
                            lv_cardinality_1_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTerminalToken5429); 

                                    newLeafNode(lv_cardinality_1_3, grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTerminalTokenRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_1_3, null);
                            	    

                            }
                            break;

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
    // $ANTLR end "ruleTerminalToken"


    // $ANTLR start "entryRuleTerminalTokenElement"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2307:1: entryRuleTerminalTokenElement returns [EObject current=null] : iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF ;
    public final EObject entryRuleTerminalTokenElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalTokenElement = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2308:2: (iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2309:2: iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF
            {
             newCompositeNode(grammarAccess.getTerminalTokenElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement5482);
            iv_ruleTerminalTokenElement=ruleTerminalTokenElement();

            state._fsp--;

             current =iv_ruleTerminalTokenElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalTokenElement5492); 

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
    // $ANTLR end "entryRuleTerminalTokenElement"


    // $ANTLR start "ruleTerminalTokenElement"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2316:1: ruleTerminalTokenElement returns [EObject current=null] : (this_CharacterRange_0= ruleCharacterRange | this_RuleCall_1= ruleRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF ) ;
    public final EObject ruleTerminalTokenElement() throws RecognitionException {
        EObject current = null;

        EObject this_CharacterRange_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedTerminalElement_2 = null;

        EObject this_AbstractNegatedToken_3 = null;

        EObject this_Wildcard_4 = null;

        EObject this_EOF_5 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2319:28: ( (this_CharacterRange_0= ruleCharacterRange | this_RuleCall_1= ruleRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2320:1: (this_CharacterRange_0= ruleCharacterRange | this_RuleCall_1= ruleRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2320:1: (this_CharacterRange_0= ruleCharacterRange | this_RuleCall_1= ruleRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF )
            int alt52=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt52=1;
                }
                break;
            case RULE_ID:
                {
                alt52=2;
                }
                break;
            case 15:
                {
                alt52=3;
                }
                break;
            case 37:
            case 42:
                {
                alt52=4;
                }
                break;
            case 17:
                {
                alt52=5;
                }
                break;
            case 43:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2321:5: this_CharacterRange_0= ruleCharacterRange
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement5539);
                    this_CharacterRange_0=ruleCharacterRange();

                    state._fsp--;

                     
                            current = this_CharacterRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2331:5: this_RuleCall_1= ruleRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getRuleCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleTerminalTokenElement5566);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;

                     
                            current = this_RuleCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2341:5: this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement5593);
                    this_ParenthesizedTerminalElement_2=ruleParenthesizedTerminalElement();

                    state._fsp--;

                     
                            current = this_ParenthesizedTerminalElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2351:5: this_AbstractNegatedToken_3= ruleAbstractNegatedToken
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement5620);
                    this_AbstractNegatedToken_3=ruleAbstractNegatedToken();

                    state._fsp--;

                     
                            current = this_AbstractNegatedToken_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2361:5: this_Wildcard_4= ruleWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_ruleTerminalTokenElement5647);
                    this_Wildcard_4=ruleWildcard();

                    state._fsp--;

                     
                            current = this_Wildcard_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2371:5: this_EOF_5= ruleEOF
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getEOFParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEOF_in_ruleTerminalTokenElement5674);
                    this_EOF_5=ruleEOF();

                    state._fsp--;

                     
                            current = this_EOF_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleTerminalTokenElement"


    // $ANTLR start "entryRuleParenthesizedTerminalElement"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2387:1: entryRuleParenthesizedTerminalElement returns [EObject current=null] : iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF ;
    public final EObject entryRuleParenthesizedTerminalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedTerminalElement = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2388:2: (iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2389:2: iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedTerminalElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement5709);
            iv_ruleParenthesizedTerminalElement=ruleParenthesizedTerminalElement();

            state._fsp--;

             current =iv_ruleParenthesizedTerminalElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement5719); 

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
    // $ANTLR end "entryRuleParenthesizedTerminalElement"


    // $ANTLR start "ruleParenthesizedTerminalElement"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2396:1: ruleParenthesizedTerminalElement returns [EObject current=null] : (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedTerminalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_TerminalAlternatives_1 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2399:28: ( (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2400:1: (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2400:1: (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2400:3: otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedTerminalElement5756); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement5778);
            this_TerminalAlternatives_1=ruleTerminalAlternatives();

            state._fsp--;

             
                    current = this_TerminalAlternatives_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedTerminalElement5789); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParenthesizedTerminalElement"


    // $ANTLR start "entryRuleAbstractNegatedToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2425:1: entryRuleAbstractNegatedToken returns [EObject current=null] : iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF ;
    public final EObject entryRuleAbstractNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNegatedToken = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2426:2: (iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2427:2: iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF
            {
             newCompositeNode(grammarAccess.getAbstractNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken5825);
            iv_ruleAbstractNegatedToken=ruleAbstractNegatedToken();

            state._fsp--;

             current =iv_ruleAbstractNegatedToken; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNegatedToken5835); 

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
    // $ANTLR end "entryRuleAbstractNegatedToken"


    // $ANTLR start "ruleAbstractNegatedToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2434:1: ruleAbstractNegatedToken returns [EObject current=null] : (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken ) ;
    public final EObject ruleAbstractNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject this_NegatedToken_0 = null;

        EObject this_UntilToken_1 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2437:28: ( (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2438:1: (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2438:1: (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            else if ( (LA53_0==37) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2439:5: this_NegatedToken_0= ruleNegatedToken
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken5882);
                    this_NegatedToken_0=ruleNegatedToken();

                    state._fsp--;

                     
                            current = this_NegatedToken_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2449:5: this_UntilToken_1= ruleUntilToken
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken5909);
                    this_UntilToken_1=ruleUntilToken();

                    state._fsp--;

                     
                            current = this_UntilToken_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractNegatedToken"


    // $ANTLR start "entryRuleNegatedToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2465:1: entryRuleNegatedToken returns [EObject current=null] : iv_ruleNegatedToken= ruleNegatedToken EOF ;
    public final EObject entryRuleNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegatedToken = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2466:2: (iv_ruleNegatedToken= ruleNegatedToken EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2467:2: iv_ruleNegatedToken= ruleNegatedToken EOF
            {
             newCompositeNode(grammarAccess.getNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken5944);
            iv_ruleNegatedToken=ruleNegatedToken();

            state._fsp--;

             current =iv_ruleNegatedToken; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegatedToken5954); 

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
    // $ANTLR end "entryRuleNegatedToken"


    // $ANTLR start "ruleNegatedToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2474:1: ruleNegatedToken returns [EObject current=null] : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final EObject ruleNegatedToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_terminal_1_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2477:28: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2478:1: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2478:1: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2478:3: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNegatedToken5991); 

                	newLeafNode(otherlv_0, grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2482:1: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2483:1: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2483:1: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2484:3: lv_terminal_1_0= ruleTerminalTokenElement
            {
             
            	        newCompositeNode(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken6012);
            lv_terminal_1_0=ruleTerminalTokenElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNegatedTokenRule());
            	        }
                   		set(
                   			current, 
                   			"terminal",
                    		lv_terminal_1_0, 
                    		"TerminalTokenElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleNegatedToken"


    // $ANTLR start "entryRuleUntilToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2508:1: entryRuleUntilToken returns [EObject current=null] : iv_ruleUntilToken= ruleUntilToken EOF ;
    public final EObject entryRuleUntilToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilToken = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2509:2: (iv_ruleUntilToken= ruleUntilToken EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2510:2: iv_ruleUntilToken= ruleUntilToken EOF
            {
             newCompositeNode(grammarAccess.getUntilTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_entryRuleUntilToken6048);
            iv_ruleUntilToken=ruleUntilToken();

            state._fsp--;

             current =iv_ruleUntilToken; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUntilToken6058); 

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
    // $ANTLR end "entryRuleUntilToken"


    // $ANTLR start "ruleUntilToken"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2517:1: ruleUntilToken returns [EObject current=null] : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final EObject ruleUntilToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_terminal_1_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2520:28: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2521:1: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2521:1: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2521:3: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleUntilToken6095); 

                	newLeafNode(otherlv_0, grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2525:1: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2526:1: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2526:1: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2527:3: lv_terminal_1_0= ruleTerminalTokenElement
            {
             
            	        newCompositeNode(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken6116);
            lv_terminal_1_0=ruleTerminalTokenElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUntilTokenRule());
            	        }
                   		set(
                   			current, 
                   			"terminal",
                    		lv_terminal_1_0, 
                    		"TerminalTokenElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleUntilToken"


    // $ANTLR start "entryRuleWildcard"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2551:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2552:2: (iv_ruleWildcard= ruleWildcard EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2553:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_entryRuleWildcard6152);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcard6162); 

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
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2560:1: ruleWildcard returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2563:28: ( ( () otherlv_1= '.' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2564:1: ( () otherlv_1= '.' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2564:1: ( () otherlv_1= '.' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2564:2: () otherlv_1= '.'
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2564:2: ()
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2565:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWildcardAccess().getWildcardAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWildcard6208); 

                	newLeafNode(otherlv_1, grammarAccess.getWildcardAccess().getFullStopKeyword_1());
                

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
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleEOF"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2582:1: entryRuleEOF returns [EObject current=null] : iv_ruleEOF= ruleEOF EOF ;
    public final EObject entryRuleEOF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOF = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2583:2: (iv_ruleEOF= ruleEOF EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2584:2: iv_ruleEOF= ruleEOF EOF
            {
             newCompositeNode(grammarAccess.getEOFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEOF_in_entryRuleEOF6244);
            iv_ruleEOF=ruleEOF();

            state._fsp--;

             current =iv_ruleEOF; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEOF6254); 

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
    // $ANTLR end "entryRuleEOF"


    // $ANTLR start "ruleEOF"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2591:1: ruleEOF returns [EObject current=null] : ( () otherlv_1= 'EOF' ) ;
    public final EObject ruleEOF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2594:28: ( ( () otherlv_1= 'EOF' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2595:1: ( () otherlv_1= 'EOF' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2595:1: ( () otherlv_1= 'EOF' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2595:2: () otherlv_1= 'EOF'
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2595:2: ()
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2596:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEOFAccess().getEOFAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEOF6300); 

                	newLeafNode(otherlv_1, grammarAccess.getEOFAccess().getEOFKeyword_1());
                

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
    // $ANTLR end "ruleEOF"


    // $ANTLR start "entryRuleCharacterRange"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2613:1: entryRuleCharacterRange returns [EObject current=null] : iv_ruleCharacterRange= ruleCharacterRange EOF ;
    public final EObject entryRuleCharacterRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterRange = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2614:2: (iv_ruleCharacterRange= ruleCharacterRange EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2615:2: iv_ruleCharacterRange= ruleCharacterRange EOF
            {
             newCompositeNode(grammarAccess.getCharacterRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange6336);
            iv_ruleCharacterRange=ruleCharacterRange();

            state._fsp--;

             current =iv_ruleCharacterRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterRange6346); 

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
    // $ANTLR end "entryRuleCharacterRange"


    // $ANTLR start "ruleCharacterRange"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2622:1: ruleCharacterRange returns [EObject current=null] : (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final EObject ruleCharacterRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Keyword_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2625:28: ( (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2626:1: (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2626:1: (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2627:5: this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange6393);
            this_Keyword_0=ruleKeyword();

            state._fsp--;

             
                    current = this_Keyword_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2635:1: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2635:2: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2635:2: ()
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2636:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleCharacterRange6414); 

                        	newLeafNode(otherlv_2, grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2645:1: ( (lv_right_3_0= ruleKeyword ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2646:1: (lv_right_3_0= ruleKeyword )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2646:1: (lv_right_3_0= ruleKeyword )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2647:3: lv_right_3_0= ruleKeyword
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange6435);
                    lv_right_3_0=ruleKeyword();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Keyword");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleCharacterRange"


    // $ANTLR start "entryRuleEnumRule"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2671:1: entryRuleEnumRule returns [EObject current=null] : iv_ruleEnumRule= ruleEnumRule EOF ;
    public final EObject entryRuleEnumRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRule = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2672:2: (iv_ruleEnumRule= ruleEnumRule EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2673:2: iv_ruleEnumRule= ruleEnumRule EOF
            {
             newCompositeNode(grammarAccess.getEnumRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumRule_in_entryRuleEnumRule6473);
            iv_ruleEnumRule=ruleEnumRule();

            state._fsp--;

             current =iv_ruleEnumRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumRule6483); 

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
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2680:1: ruleEnumRule returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) ;
    public final EObject ruleEnumRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_alternatives_5_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2683:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2684:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2684:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2684:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEnumRule6520); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumRuleAccess().getEnumKeyword_0());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2688:1: ( (lv_name_1_0= RULE_ID ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2689:1: (lv_name_1_0= RULE_ID )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2689:1: (lv_name_1_0= RULE_ID )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2690:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumRule6537); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2706:2: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==23) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2706:4: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumRule6555); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumRuleAccess().getReturnsKeyword_2_0());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2710:1: ( (lv_type_3_0= ruleTypeRef ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2711:1: (lv_type_3_0= ruleTypeRef )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2711:1: (lv_type_3_0= ruleTypeRef )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2712:3: lv_type_3_0= ruleTypeRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleEnumRule6576);
                    lv_type_3_0=ruleTypeRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"TypeRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEnumRule6590); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumRuleAccess().getColonKeyword_3());
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2732:1: ( (lv_alternatives_5_0= ruleEnumLiterals ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2733:1: (lv_alternatives_5_0= ruleEnumLiterals )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2733:1: (lv_alternatives_5_0= ruleEnumLiterals )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2734:3: lv_alternatives_5_0= ruleEnumLiterals
            {
             
            	        newCompositeNode(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_ruleEnumRule6611);
            lv_alternatives_5_0=ruleEnumLiterals();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRuleRule());
            	        }
                   		set(
                   			current, 
                   			"alternatives",
                    		lv_alternatives_5_0, 
                    		"EnumLiterals");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumRule6623); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumRuleAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleEnumLiterals"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2762:1: entryRuleEnumLiterals returns [EObject current=null] : iv_ruleEnumLiterals= ruleEnumLiterals EOF ;
    public final EObject entryRuleEnumLiterals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiterals = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2763:2: (iv_ruleEnumLiterals= ruleEnumLiterals EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2764:2: iv_ruleEnumLiterals= ruleEnumLiterals EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals6659);
            iv_ruleEnumLiterals=ruleEnumLiterals();

            state._fsp--;

             current =iv_ruleEnumLiterals; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiterals6669); 

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
    // $ANTLR end "entryRuleEnumLiterals"


    // $ANTLR start "ruleEnumLiterals"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2771:1: ruleEnumLiterals returns [EObject current=null] : (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final EObject ruleEnumLiterals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EnumLiteralDeclaration_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2774:28: ( (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2775:1: (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2775:1: (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2776:5: this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals6716);
            this_EnumLiteralDeclaration_0=ruleEnumLiteralDeclaration();

            state._fsp--;

             
                    current = this_EnumLiteralDeclaration_0; 
                    afterParserOrEnumRuleCall();
                
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2784:1: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==27) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2784:2: () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2784:2: ()
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2785:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getEnumLiteralsAccess().getAlternativesElementsAction_1_0(),
                                current);
                        

                    }

                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2790:2: (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==27) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2790:4: otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumLiterals6738); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0());
                    	        
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2794:1: ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2795:1: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2795:1: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2796:3: lv_elements_3_0= ruleEnumLiteralDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumLiteralsAccess().getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals6759);
                    	    lv_elements_3_0=ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumLiteralsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"EnumLiteralDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);


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
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2820:1: entryRuleEnumLiteralDeclaration returns [EObject current=null] : iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF ;
    public final EObject entryRuleEnumLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralDeclaration = null;


        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2821:2: (iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2822:2: iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration6799);
            iv_ruleEnumLiteralDeclaration=ruleEnumLiteralDeclaration();

            state._fsp--;

             current =iv_ruleEnumLiteralDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration6809); 

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
    // $ANTLR end "entryRuleEnumLiteralDeclaration"


    // $ANTLR start "ruleEnumLiteralDeclaration"
    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2829:1: ruleEnumLiteralDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final EObject ruleEnumLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_literal_2_0 = null;


         enterRule(); 
            
        try {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2832:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2833:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2833:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2833:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2833:2: ( (otherlv_0= RULE_ID ) )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2834:1: (otherlv_0= RULE_ID )
            {
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2834:1: (otherlv_0= RULE_ID )
            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2835:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumLiteralDeclarationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration6854); 

            		newLeafNode(otherlv_0, grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0()); 
            	

            }


            }

            // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2846:2: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==32) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2846:4: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEnumLiteralDeclaration6867); 

                        	newLeafNode(otherlv_1, grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0());
                        
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2850:1: ( (lv_literal_2_0= ruleKeyword ) )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2851:1: (lv_literal_2_0= ruleKeyword )
                    {
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2851:1: (lv_literal_2_0= ruleKeyword )
                    // ../../plugins/org.eclipse.xtext/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtext.g:2852:3: lv_literal_2_0= ruleKeyword
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration6888);
                    lv_literal_2_0=ruleKeyword();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumLiteralDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_2_0, 
                            		"Keyword");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleEnumLiteralDeclaration"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGrammar_in_entryRuleGrammar75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammar85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleGrammar122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar143 = new BitSet(new long[]{0x0000220000345010L});
        public static final BitSet FOLLOW_12_in_ruleGrammar156 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar179 = new BitSet(new long[]{0x0000220000347010L});
        public static final BitSet FOLLOW_13_in_ruleGrammar192 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar215 = new BitSet(new long[]{0x0000220000347010L});
        public static final BitSet FOLLOW_14_in_ruleGrammar238 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGrammar263 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammar284 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleGrammar297 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammar317 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleGrammar333 = new BitSet(new long[]{0x0000220000345010L});
        public static final BitSet FOLLOW_ruleAbstractMetamodelDeclaration_in_ruleGrammar356 = new BitSet(new long[]{0x0000220000345010L});
        public static final BitSet FOLLOW_ruleAbstractRule_in_ruleGrammar378 = new BitSet(new long[]{0x0000220000345012L});
        public static final BitSet FOLLOW_ruleGrammarID_in_entryRuleGrammarID416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammarID427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID467 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleGrammarID486 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID501 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleAbstractRule_in_entryRuleAbstractRule548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRule558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRule_in_ruleAbstractRule605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRule_in_ruleAbstractRule632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumRule_in_ruleAbstractRule659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMetamodelDeclaration_in_entryRuleAbstractMetamodelDeclaration694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMetamodelDeclaration704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneratedMetamodel_in_ruleAbstractMetamodelDeclaration751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencedMetamodel_in_ruleAbstractMetamodelDeclaration778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneratedMetamodel_in_entryRuleGeneratedMetamodel813 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneratedMetamodel823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleGeneratedMetamodel860 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneratedMetamodel877 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGeneratedMetamodel902 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleGeneratedMetamodel915 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneratedMetamodel932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencedMetamodel_in_entryRuleReferencedMetamodel975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferencedMetamodel985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleReferencedMetamodel1022 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencedMetamodel1042 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleReferencedMetamodel1055 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReferencedMetamodel1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRule_in_entryRuleParserRule1115 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRule1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleParserRule1170 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1200 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleParserRule1223 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_21_in_ruleParserRule1262 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1293 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_23_in_ruleParserRule1311 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleParserRule1332 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleParserRule1355 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleParserRule1380 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1401 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleParserRule1414 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1434 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleParserRule1450 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParserRule1464 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParserRule1485 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleParserRule1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef1589 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTypeRef1601 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef1623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives1659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleAlternatives1716 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleAlternatives1738 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleAlternatives1759 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup1799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroup1809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup1856 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleUnorderedGroup1878 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup1899 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup1996 = new BitSet(new long[]{0x0000003080008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup2026 = new BitSet(new long[]{0x0000003080008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken2065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractToken2075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken2122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_ruleAbstractToken2149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality2184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality2242 = new BitSet(new long[]{0x0000000060400002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality2269 = new BitSet(new long[]{0x0000000060400002L});
        public static final BitSet FOLLOW_29_in_ruleAbstractTokenWithCardinality2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAbstractTokenWithCardinality2318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAbstractTokenWithCardinality2347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAction2447 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleAction2468 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_17_in_ruleAction2481 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction2498 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleAction2523 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_33_in_ruleAction2552 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAction2580 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAction2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal2630 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTerminal2640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAbstractTerminal2687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAbstractTerminal2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal2741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal2768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal2795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword2857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyword2867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeyword2908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_entryRuleRuleCall2948 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleCall2958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_ruleRuleCall3005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_entryRuleRuleID3041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleID3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID3092 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRuleID3111 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID3126 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword3173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedKeyword3183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePredicatedKeyword3227 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_37_in_rulePredicatedKeyword3264 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePredicatedKeyword3295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall3336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedRuleCall3346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePredicatedRuleCall3390 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_37_in_rulePredicatedRuleCall3427 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePredicatedRuleCall3461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3497 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAssignment3551 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_37_in_ruleAssignment3588 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3620 = new BitSet(new long[]{0x0000004300000000L});
        public static final BitSet FOLLOW_33_in_ruleAssignment3645 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_32_in_ruleAssignment3674 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_38_in_ruleAssignment3703 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignment3740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal3776 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableTerminal3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAssignableTerminal3833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAssignableTerminal3860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal3887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_ruleAssignableTerminal3914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement3949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedAssignableElement3996 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement4018 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedAssignableElement4029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives4065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableAlternatives4075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives4122 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleAssignableAlternatives4144 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives4165 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_entryRuleCrossReference4205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReference4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCrossReference4252 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleCrossReference4273 = new BitSet(new long[]{0x0000010008000000L});
        public static final BitSet FOLLOW_27_in_ruleCrossReference4286 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference4307 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCrossReference4321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal4357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal4367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal4414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement4476 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement4486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedElement4523 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParenthesizedElement4545 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedElement4556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup4592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedGroup4602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePredicatedGroup4646 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_37_in_rulePredicatedGroup4683 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePredicatedGroup4709 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_rulePredicatedGroup4730 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePredicatedGroup4742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule4778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalRule4788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTerminalRule4825 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_21_in_ruleTerminalRule4845 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule4875 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule4905 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleTerminalRule4923 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleTerminalRule4944 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTerminalRule4960 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule4981 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTerminalRule4993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives5029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalAlternatives5039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives5086 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleTerminalAlternatives5108 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives5129 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup5169 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalGroup5179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup5226 = new BitSet(new long[]{0x00000C2000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup5256 = new BitSet(new long[]{0x00000C2000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken5295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalToken5305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken5352 = new BitSet(new long[]{0x0000000060400002L});
        public static final BitSet FOLLOW_29_in_ruleTerminalToken5371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleTerminalToken5400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleTerminalToken5429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement5482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalTokenElement5492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement5539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleTerminalTokenElement5566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement5593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement5620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_ruleTerminalTokenElement5647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_ruleTerminalTokenElement5674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement5709 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement5719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedTerminalElement5756 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement5778 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedTerminalElement5789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken5825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNegatedToken5835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken5882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken5909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken5944 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegatedToken5954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleNegatedToken5991 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken6012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_entryRuleUntilToken6048 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUntilToken6058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleUntilToken6095 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken6116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard6152 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcard6162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleWildcard6208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_entryRuleEOF6244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEOF6254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEOF6300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange6336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterRange6346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange6393 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleCharacterRange6414 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange6435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumRule_in_entryRuleEnumRule6473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumRule6483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEnumRule6520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumRule6537 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumRule6555 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleEnumRule6576 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEnumRule6590 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_ruleEnumRule6611 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleEnumRule6623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals6659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiterals6669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals6716 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumLiterals6738 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals6759 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration6799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration6809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration6854 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleEnumLiteralDeclaration6867 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration6888 = new BitSet(new long[]{0x0000000000000002L});
    }


}