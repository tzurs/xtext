package org.eclipse.xtext.parser.fragments.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFragmentTestLanguageExLexer extends Lexer {
    public static final int RULE_ID=15;
    public static final int HyphenMinus=13;
    public static final int LessThanSignHyphenMinus=12;
    public static final int RULE_ANY_OTHER=21;
    public static final int NumberSignDigitSeven=10;
    public static final int Colon=14;
    public static final int NumberSignDigitThree=6;
    public static final int EOF=-1;
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

    public InternalFragmentTestLanguageExLexer() {;} 
    public InternalFragmentTestLanguageExLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFragmentTestLanguageExLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g"; }

    // $ANTLR start "NumberSignDigitOne"
    public final void mNumberSignDigitOne() throws RecognitionException {
        try {
            int _type = NumberSignDigitOne;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:19:20: ( '#1' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:19:22: '#1'
            {
            match("#1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignDigitOne"

    // $ANTLR start "NumberSignDigitTwo"
    public final void mNumberSignDigitTwo() throws RecognitionException {
        try {
            int _type = NumberSignDigitTwo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:21:20: ( '#2' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:21:22: '#2'
            {
            match("#2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignDigitTwo"

    // $ANTLR start "NumberSignDigitThree"
    public final void mNumberSignDigitThree() throws RecognitionException {
        try {
            int _type = NumberSignDigitThree;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:23:22: ( '#3' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:23:24: '#3'
            {
            match("#3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignDigitThree"

    // $ANTLR start "NumberSignDigitFour"
    public final void mNumberSignDigitFour() throws RecognitionException {
        try {
            int _type = NumberSignDigitFour;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:25:21: ( '#4' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:25:23: '#4'
            {
            match("#4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignDigitFour"

    // $ANTLR start "NumberSignDigitFive"
    public final void mNumberSignDigitFive() throws RecognitionException {
        try {
            int _type = NumberSignDigitFive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:27:21: ( '#5' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:27:23: '#5'
            {
            match("#5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignDigitFive"

    // $ANTLR start "NumberSignDigitSix"
    public final void mNumberSignDigitSix() throws RecognitionException {
        try {
            int _type = NumberSignDigitSix;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:29:20: ( '#6' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:29:22: '#6'
            {
            match("#6"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignDigitSix"

    // $ANTLR start "NumberSignDigitSeven"
    public final void mNumberSignDigitSeven() throws RecognitionException {
        try {
            int _type = NumberSignDigitSeven;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:31:22: ( '#7' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:31:24: '#7'
            {
            match("#7"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignDigitSeven"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:33:28: ( '->' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:33:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "LessThanSignHyphenMinus"
    public final void mLessThanSignHyphenMinus() throws RecognitionException {
        try {
            int _type = LessThanSignHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:35:25: ( '<-' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:35:27: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignHyphenMinus"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:37:13: ( '-' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:37:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:39:7: ( ':' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:39:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:43:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:43:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:43:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:43:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:43:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:45:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:45:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:45:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:45:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:47:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:49:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:49:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:49:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:49:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:51:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:51:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:51:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:51:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:51:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:51:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:51:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:51:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:53:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:53:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:53:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:55:16: ( . )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:55:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:8: ( NumberSignDigitOne | NumberSignDigitTwo | NumberSignDigitThree | NumberSignDigitFour | NumberSignDigitFive | NumberSignDigitSix | NumberSignDigitSeven | HyphenMinusGreaterThanSign | LessThanSignHyphenMinus | HyphenMinus | Colon | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=18;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:10: NumberSignDigitOne
                {
                mNumberSignDigitOne(); 

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:29: NumberSignDigitTwo
                {
                mNumberSignDigitTwo(); 

                }
                break;
            case 3 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:48: NumberSignDigitThree
                {
                mNumberSignDigitThree(); 

                }
                break;
            case 4 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:69: NumberSignDigitFour
                {
                mNumberSignDigitFour(); 

                }
                break;
            case 5 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:89: NumberSignDigitFive
                {
                mNumberSignDigitFive(); 

                }
                break;
            case 6 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:109: NumberSignDigitSix
                {
                mNumberSignDigitSix(); 

                }
                break;
            case 7 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:128: NumberSignDigitSeven
                {
                mNumberSignDigitSeven(); 

                }
                break;
            case 8 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:149: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 9 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:176: LessThanSignHyphenMinus
                {
                mLessThanSignHyphenMinus(); 

                }
                break;
            case 10 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:200: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 11 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:212: Colon
                {
                mColon(); 

                }
                break;
            case 12 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:218: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:226: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:235: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:247: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:263: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:279: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/parser/fragments/parser/antlr/lexer/InternalFragmentTestLanguageExLexer.g:1:287: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\14\1\25\1\14\1\uffff\1\14\2\uffff\3\14\23\uffff";
    static final String DFA12_eofS =
        "\36\uffff";
    static final String DFA12_minS =
        "\1\0\1\61\1\76\1\55\1\uffff\1\101\2\uffff\2\0\1\52\23\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\67\1\76\1\55\1\uffff\1\172\2\uffff\2\uffff\1\57\23\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\13\1\uffff\1\14\1\15\3\uffff\1\21\1\22\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\11\1\13\1\14\1\15\1\16\1\17\1\20\1\21";
    static final String DFA12_specialS =
        "\1\0\7\uffff\1\2\1\1\24\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\10\1\1\3\14\1\11\5\14\1\2\1\14\1\12\12\7\1\4\1\14\1\3\4\14\32\6\3\14\1\5\1\6\1\14\32\6\uff85\14",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\24",
            "\1\26",
            "",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\0\32",
            "\0\32",
            "\1\33\4\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( NumberSignDigitOne | NumberSignDigitTwo | NumberSignDigitThree | NumberSignDigitFour | NumberSignDigitFive | NumberSignDigitSix | NumberSignDigitSeven | HyphenMinusGreaterThanSign | LessThanSignHyphenMinus | HyphenMinus | Colon | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='#') ) {s = 1;}

                        else if ( (LA12_0=='-') ) {s = 2;}

                        else if ( (LA12_0=='<') ) {s = 3;}

                        else if ( (LA12_0==':') ) {s = 4;}

                        else if ( (LA12_0=='^') ) {s = 5;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 6;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 7;}

                        else if ( (LA12_0=='\"') ) {s = 8;}

                        else if ( (LA12_0=='\'') ) {s = 9;}

                        else if ( (LA12_0=='/') ) {s = 10;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 11;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=',')||LA12_0=='.'||LA12_0==';'||(LA12_0>='=' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_9 = input.LA(1);

                        s = -1;
                        if ( ((LA12_9>='\u0000' && LA12_9<='\uFFFF')) ) {s = 26;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_8 = input.LA(1);

                        s = -1;
                        if ( ((LA12_8>='\u0000' && LA12_8<='\uFFFF')) ) {s = 26;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}