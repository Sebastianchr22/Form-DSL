package form.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import form.services.FormDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'shortText'", "'date'", "'number'", "'money'", "'email'", "'longText'", "'stringNumber'", "'optional'", "'focus'", "'require'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFormDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFormDSL.g"; }



     	private FormDSLGrammarAccess grammarAccess;

        public InternalFormDSLParser(TokenStream input, FormDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Form";
       	}

       	@Override
       	protected FormDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleForm"
    // InternalFormDSL.g:64:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalFormDSL.g:64:45: (iv_ruleForm= ruleForm EOF )
            // InternalFormDSL.g:65:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalFormDSL.g:71:1: ruleForm returns [EObject current=null] : ( () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )* ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalFormDSL.g:77:2: ( ( () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )* ) )
            // InternalFormDSL.g:78:2: ( () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )* )
            {
            // InternalFormDSL.g:78:2: ( () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )* )
            // InternalFormDSL.g:79:3: () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )*
            {
            // InternalFormDSL.g:79:3: ()
            // InternalFormDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormAccess().getFormAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFormAccess().getFormKeyword_1());
            		
            // InternalFormDSL.g:90:3: ( (lv_content_2_0= ruleInput ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFormDSL.g:91:4: (lv_content_2_0= ruleInput )
            	    {
            	    // InternalFormDSL.g:91:4: (lv_content_2_0= ruleInput )
            	    // InternalFormDSL.g:92:5: lv_content_2_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getFormAccess().getContentInputParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_content_2_0=ruleInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFormRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_2_0,
            	    						"form.FormDSL.Input");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleInput"
    // InternalFormDSL.g:113:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalFormDSL.g:113:46: (iv_ruleInput= ruleInput EOF )
            // InternalFormDSL.g:114:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalFormDSL.g:120:1: ruleInput returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalFormDSL.g:126:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )? ) )
            // InternalFormDSL.g:127:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )? )
            {
            // InternalFormDSL.g:127:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )? )
            // InternalFormDSL.g:128:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )?
            {
            // InternalFormDSL.g:128:3: ( (lv_type_0_0= ruleType ) )
            // InternalFormDSL.g:129:4: (lv_type_0_0= ruleType )
            {
            // InternalFormDSL.g:129:4: (lv_type_0_0= ruleType )
            // InternalFormDSL.g:130:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"form.FormDSL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormDSL.g:147:3: ( (lv_name_1_0= ruleName ) )
            // InternalFormDSL.g:148:4: (lv_name_1_0= ruleName )
            {
            // InternalFormDSL.g:148:4: (lv_name_1_0= ruleName )
            // InternalFormDSL.g:149:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getInputAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"form.FormDSL.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormDSL.g:166:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=19 && LA2_0<=21)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFormDSL.g:167:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalFormDSL.g:167:4: (lv_expression_2_0= ruleExpression )
                    // InternalFormDSL.g:168:5: lv_expression_2_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getInputAccess().getExpressionExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInputRule());
                    					}
                    					set(
                    						current,
                    						"expression",
                    						lv_expression_2_0,
                    						"form.FormDSL.Expression");
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleType"
    // InternalFormDSL.g:189:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFormDSL.g:189:45: (iv_ruleType= ruleType EOF )
            // InternalFormDSL.g:190:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFormDSL.g:196:1: ruleType returns [EObject current=null] : ( ( (lv_text_0_0= 'shortText' ) ) | ( (lv_text_1_0= 'date' ) ) | ( (lv_text_2_0= 'number' ) ) | ( (lv_text_3_0= 'money' ) ) | ( (lv_text_4_0= 'email' ) ) | ( (lv_text_5_0= 'longText' ) ) | ( (lv_text_6_0= 'stringNumber' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_text_1_0=null;
        Token lv_text_2_0=null;
        Token lv_text_3_0=null;
        Token lv_text_4_0=null;
        Token lv_text_5_0=null;
        Token lv_text_6_0=null;


        	enterRule();

        try {
            // InternalFormDSL.g:202:2: ( ( ( (lv_text_0_0= 'shortText' ) ) | ( (lv_text_1_0= 'date' ) ) | ( (lv_text_2_0= 'number' ) ) | ( (lv_text_3_0= 'money' ) ) | ( (lv_text_4_0= 'email' ) ) | ( (lv_text_5_0= 'longText' ) ) | ( (lv_text_6_0= 'stringNumber' ) ) ) )
            // InternalFormDSL.g:203:2: ( ( (lv_text_0_0= 'shortText' ) ) | ( (lv_text_1_0= 'date' ) ) | ( (lv_text_2_0= 'number' ) ) | ( (lv_text_3_0= 'money' ) ) | ( (lv_text_4_0= 'email' ) ) | ( (lv_text_5_0= 'longText' ) ) | ( (lv_text_6_0= 'stringNumber' ) ) )
            {
            // InternalFormDSL.g:203:2: ( ( (lv_text_0_0= 'shortText' ) ) | ( (lv_text_1_0= 'date' ) ) | ( (lv_text_2_0= 'number' ) ) | ( (lv_text_3_0= 'money' ) ) | ( (lv_text_4_0= 'email' ) ) | ( (lv_text_5_0= 'longText' ) ) | ( (lv_text_6_0= 'stringNumber' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFormDSL.g:204:3: ( (lv_text_0_0= 'shortText' ) )
                    {
                    // InternalFormDSL.g:204:3: ( (lv_text_0_0= 'shortText' ) )
                    // InternalFormDSL.g:205:4: (lv_text_0_0= 'shortText' )
                    {
                    // InternalFormDSL.g:205:4: (lv_text_0_0= 'shortText' )
                    // InternalFormDSL.g:206:5: lv_text_0_0= 'shortText'
                    {
                    lv_text_0_0=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(lv_text_0_0, grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_0_0, "shortText");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:219:3: ( (lv_text_1_0= 'date' ) )
                    {
                    // InternalFormDSL.g:219:3: ( (lv_text_1_0= 'date' ) )
                    // InternalFormDSL.g:220:4: (lv_text_1_0= 'date' )
                    {
                    // InternalFormDSL.g:220:4: (lv_text_1_0= 'date' )
                    // InternalFormDSL.g:221:5: lv_text_1_0= 'date'
                    {
                    lv_text_1_0=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_text_1_0, grammarAccess.getTypeAccess().getTextDateKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_1_0, "date");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:234:3: ( (lv_text_2_0= 'number' ) )
                    {
                    // InternalFormDSL.g:234:3: ( (lv_text_2_0= 'number' ) )
                    // InternalFormDSL.g:235:4: (lv_text_2_0= 'number' )
                    {
                    // InternalFormDSL.g:235:4: (lv_text_2_0= 'number' )
                    // InternalFormDSL.g:236:5: lv_text_2_0= 'number'
                    {
                    lv_text_2_0=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_text_2_0, grammarAccess.getTypeAccess().getTextNumberKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_2_0, "number");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFormDSL.g:249:3: ( (lv_text_3_0= 'money' ) )
                    {
                    // InternalFormDSL.g:249:3: ( (lv_text_3_0= 'money' ) )
                    // InternalFormDSL.g:250:4: (lv_text_3_0= 'money' )
                    {
                    // InternalFormDSL.g:250:4: (lv_text_3_0= 'money' )
                    // InternalFormDSL.g:251:5: lv_text_3_0= 'money'
                    {
                    lv_text_3_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_text_3_0, grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_3_0, "money");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFormDSL.g:264:3: ( (lv_text_4_0= 'email' ) )
                    {
                    // InternalFormDSL.g:264:3: ( (lv_text_4_0= 'email' ) )
                    // InternalFormDSL.g:265:4: (lv_text_4_0= 'email' )
                    {
                    // InternalFormDSL.g:265:4: (lv_text_4_0= 'email' )
                    // InternalFormDSL.g:266:5: lv_text_4_0= 'email'
                    {
                    lv_text_4_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_text_4_0, grammarAccess.getTypeAccess().getTextEmailKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_4_0, "email");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalFormDSL.g:279:3: ( (lv_text_5_0= 'longText' ) )
                    {
                    // InternalFormDSL.g:279:3: ( (lv_text_5_0= 'longText' ) )
                    // InternalFormDSL.g:280:4: (lv_text_5_0= 'longText' )
                    {
                    // InternalFormDSL.g:280:4: (lv_text_5_0= 'longText' )
                    // InternalFormDSL.g:281:5: lv_text_5_0= 'longText'
                    {
                    lv_text_5_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_text_5_0, grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_5_0, "longText");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalFormDSL.g:294:3: ( (lv_text_6_0= 'stringNumber' ) )
                    {
                    // InternalFormDSL.g:294:3: ( (lv_text_6_0= 'stringNumber' ) )
                    // InternalFormDSL.g:295:4: (lv_text_6_0= 'stringNumber' )
                    {
                    // InternalFormDSL.g:295:4: (lv_text_6_0= 'stringNumber' )
                    // InternalFormDSL.g:296:5: lv_text_6_0= 'stringNumber'
                    {
                    lv_text_6_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_text_6_0, grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_6_0, "stringNumber");
                    				

                    }


                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleName"
    // InternalFormDSL.g:312:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalFormDSL.g:312:45: (iv_ruleName= ruleName EOF )
            // InternalFormDSL.g:313:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalFormDSL.g:319:1: ruleName returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalFormDSL.g:325:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalFormDSL.g:326:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalFormDSL.g:326:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalFormDSL.g:327:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalFormDSL.g:327:3: (lv_text_0_0= RULE_STRING )
            // InternalFormDSL.g:328:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getNameAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleExpression"
    // InternalFormDSL.g:347:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFormDSL.g:347:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFormDSL.g:348:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFormDSL.g:354:1: ruleExpression returns [EObject current=null] : ( ( (lv_text_0_0= 'optional' ) ) | ( (lv_text_1_0= 'focus' ) ) | ( (lv_text_2_0= 'require' ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_text_1_0=null;
        Token lv_text_2_0=null;


        	enterRule();

        try {
            // InternalFormDSL.g:360:2: ( ( ( (lv_text_0_0= 'optional' ) ) | ( (lv_text_1_0= 'focus' ) ) | ( (lv_text_2_0= 'require' ) ) ) )
            // InternalFormDSL.g:361:2: ( ( (lv_text_0_0= 'optional' ) ) | ( (lv_text_1_0= 'focus' ) ) | ( (lv_text_2_0= 'require' ) ) )
            {
            // InternalFormDSL.g:361:2: ( ( (lv_text_0_0= 'optional' ) ) | ( (lv_text_1_0= 'focus' ) ) | ( (lv_text_2_0= 'require' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFormDSL.g:362:3: ( (lv_text_0_0= 'optional' ) )
                    {
                    // InternalFormDSL.g:362:3: ( (lv_text_0_0= 'optional' ) )
                    // InternalFormDSL.g:363:4: (lv_text_0_0= 'optional' )
                    {
                    // InternalFormDSL.g:363:4: (lv_text_0_0= 'optional' )
                    // InternalFormDSL.g:364:5: lv_text_0_0= 'optional'
                    {
                    lv_text_0_0=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_text_0_0, grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_0_0, "optional");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:377:3: ( (lv_text_1_0= 'focus' ) )
                    {
                    // InternalFormDSL.g:377:3: ( (lv_text_1_0= 'focus' ) )
                    // InternalFormDSL.g:378:4: (lv_text_1_0= 'focus' )
                    {
                    // InternalFormDSL.g:378:4: (lv_text_1_0= 'focus' )
                    // InternalFormDSL.g:379:5: lv_text_1_0= 'focus'
                    {
                    lv_text_1_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_text_1_0, grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_1_0, "focus");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:392:3: ( (lv_text_2_0= 'require' ) )
                    {
                    // InternalFormDSL.g:392:3: ( (lv_text_2_0= 'require' ) )
                    // InternalFormDSL.g:393:4: (lv_text_2_0= 'require' )
                    {
                    // InternalFormDSL.g:393:4: (lv_text_2_0= 'require' )
                    // InternalFormDSL.g:394:5: lv_text_2_0= 'require'
                    {
                    lv_text_2_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_text_2_0, grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_2_0, "require");
                    				

                    }


                    }


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
    // $ANTLR end "ruleExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007F002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000380002L});

}