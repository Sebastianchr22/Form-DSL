package form.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import form.services.FormDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'shortText'", "'date'", "'number'", "'money'", "'email'", "'longText'", "'stringNumber'", "'optional'", "'focus'", "'is'", "'length'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

    	public void setGrammarAccess(FormDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleForm"
    // InternalFormDSL.g:53:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalFormDSL.g:54:1: ( ruleForm EOF )
            // InternalFormDSL.g:55:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalFormDSL.g:62:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:66:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalFormDSL.g:67:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalFormDSL.g:67:2: ( ( rule__Form__Group__0 ) )
            // InternalFormDSL.g:68:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalFormDSL.g:69:3: ( rule__Form__Group__0 )
            // InternalFormDSL.g:69:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleInput"
    // InternalFormDSL.g:78:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalFormDSL.g:79:1: ( ruleInput EOF )
            // InternalFormDSL.g:80:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalFormDSL.g:87:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:91:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalFormDSL.g:92:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalFormDSL.g:92:2: ( ( rule__Input__Group__0 ) )
            // InternalFormDSL.g:93:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalFormDSL.g:94:3: ( rule__Input__Group__0 )
            // InternalFormDSL.g:94:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleType"
    // InternalFormDSL.g:103:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFormDSL.g:104:1: ( ruleType EOF )
            // InternalFormDSL.g:105:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFormDSL.g:112:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:116:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFormDSL.g:117:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFormDSL.g:117:2: ( ( rule__Type__Alternatives ) )
            // InternalFormDSL.g:118:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFormDSL.g:119:3: ( rule__Type__Alternatives )
            // InternalFormDSL.g:119:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleName"
    // InternalFormDSL.g:128:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalFormDSL.g:129:1: ( ruleName EOF )
            // InternalFormDSL.g:130:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalFormDSL.g:137:1: ruleName : ( ( rule__Name__TextAssignment ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:141:2: ( ( ( rule__Name__TextAssignment ) ) )
            // InternalFormDSL.g:142:2: ( ( rule__Name__TextAssignment ) )
            {
            // InternalFormDSL.g:142:2: ( ( rule__Name__TextAssignment ) )
            // InternalFormDSL.g:143:3: ( rule__Name__TextAssignment )
            {
             before(grammarAccess.getNameAccess().getTextAssignment()); 
            // InternalFormDSL.g:144:3: ( rule__Name__TextAssignment )
            // InternalFormDSL.g:144:4: rule__Name__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Name__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleExpression"
    // InternalFormDSL.g:153:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFormDSL.g:154:1: ( ruleExpression EOF )
            // InternalFormDSL.g:155:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFormDSL.g:162:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:166:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFormDSL.g:167:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFormDSL.g:167:2: ( ( rule__Expression__Alternatives ) )
            // InternalFormDSL.g:168:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFormDSL.g:169:3: ( rule__Expression__Alternatives )
            // InternalFormDSL.g:169:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExp"
    // InternalFormDSL.g:178:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalFormDSL.g:179:1: ( ruleExp EOF )
            // InternalFormDSL.g:180:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalFormDSL.g:187:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:191:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalFormDSL.g:192:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalFormDSL.g:192:2: ( ( rule__Exp__Group__0 ) )
            // InternalFormDSL.g:193:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalFormDSL.g:194:3: ( rule__Exp__Group__0 )
            // InternalFormDSL.g:194:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleComparison"
    // InternalFormDSL.g:203:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalFormDSL.g:204:1: ( ruleComparison EOF )
            // InternalFormDSL.g:205:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalFormDSL.g:212:1: ruleComparison : ( ( rule__Comparison__Alternatives ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:216:2: ( ( ( rule__Comparison__Alternatives ) ) )
            // InternalFormDSL.g:217:2: ( ( rule__Comparison__Alternatives ) )
            {
            // InternalFormDSL.g:217:2: ( ( rule__Comparison__Alternatives ) )
            // InternalFormDSL.g:218:3: ( rule__Comparison__Alternatives )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives()); 
            // InternalFormDSL.g:219:3: ( rule__Comparison__Alternatives )
            // InternalFormDSL.g:219:4: rule__Comparison__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalFormDSL.g:227:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:231:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) | ( ( rule__Type__Group_6__0 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            case 23:
                {
                alt1=6;
                }
                break;
            case 24:
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
                    // InternalFormDSL.g:232:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalFormDSL.g:232:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalFormDSL.g:233:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalFormDSL.g:234:3: ( rule__Type__Group_0__0 )
                    // InternalFormDSL.g:234:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:238:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalFormDSL.g:238:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalFormDSL.g:239:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalFormDSL.g:240:3: ( rule__Type__Group_1__0 )
                    // InternalFormDSL.g:240:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:244:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalFormDSL.g:244:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalFormDSL.g:245:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalFormDSL.g:246:3: ( rule__Type__Group_2__0 )
                    // InternalFormDSL.g:246:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFormDSL.g:250:2: ( ( rule__Type__Group_3__0 ) )
                    {
                    // InternalFormDSL.g:250:2: ( ( rule__Type__Group_3__0 ) )
                    // InternalFormDSL.g:251:3: ( rule__Type__Group_3__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_3()); 
                    // InternalFormDSL.g:252:3: ( rule__Type__Group_3__0 )
                    // InternalFormDSL.g:252:4: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFormDSL.g:256:2: ( ( rule__Type__Group_4__0 ) )
                    {
                    // InternalFormDSL.g:256:2: ( ( rule__Type__Group_4__0 ) )
                    // InternalFormDSL.g:257:3: ( rule__Type__Group_4__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_4()); 
                    // InternalFormDSL.g:258:3: ( rule__Type__Group_4__0 )
                    // InternalFormDSL.g:258:4: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFormDSL.g:262:2: ( ( rule__Type__Group_5__0 ) )
                    {
                    // InternalFormDSL.g:262:2: ( ( rule__Type__Group_5__0 ) )
                    // InternalFormDSL.g:263:3: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // InternalFormDSL.g:264:3: ( rule__Type__Group_5__0 )
                    // InternalFormDSL.g:264:4: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFormDSL.g:268:2: ( ( rule__Type__Group_6__0 ) )
                    {
                    // InternalFormDSL.g:268:2: ( ( rule__Type__Group_6__0 ) )
                    // InternalFormDSL.g:269:3: ( rule__Type__Group_6__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_6()); 
                    // InternalFormDSL.g:270:3: ( rule__Type__Group_6__0 )
                    // InternalFormDSL.g:270:4: rule__Type__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalFormDSL.g:278:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ruleExp ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:282:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ruleExp ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFormDSL.g:283:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalFormDSL.g:283:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalFormDSL.g:284:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalFormDSL.g:285:3: ( rule__Expression__Group_0__0 )
                    // InternalFormDSL.g:285:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:289:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalFormDSL.g:289:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalFormDSL.g:290:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalFormDSL.g:291:3: ( rule__Expression__Group_1__0 )
                    // InternalFormDSL.g:291:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:295:2: ( ruleExp )
                    {
                    // InternalFormDSL.g:295:2: ( ruleExp )
                    // InternalFormDSL.g:296:3: ruleExp
                    {
                     before(grammarAccess.getExpressionAccess().getExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExp();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getExpParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Exp__Alternatives_0"
    // InternalFormDSL.g:305:1: rule__Exp__Alternatives_0 : ( ( ( rule__Exp__Group_0_0__0 ) ) | ( ( rule__Exp__Group_0_1__0 ) ) );
    public final void rule__Exp__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:309:1: ( ( ( rule__Exp__Group_0_0__0 ) ) | ( ( rule__Exp__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFormDSL.g:310:2: ( ( rule__Exp__Group_0_0__0 ) )
                    {
                    // InternalFormDSL.g:310:2: ( ( rule__Exp__Group_0_0__0 ) )
                    // InternalFormDSL.g:311:3: ( rule__Exp__Group_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_0_0()); 
                    // InternalFormDSL.g:312:3: ( rule__Exp__Group_0_0__0 )
                    // InternalFormDSL.g:312:4: rule__Exp__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:316:2: ( ( rule__Exp__Group_0_1__0 ) )
                    {
                    // InternalFormDSL.g:316:2: ( ( rule__Exp__Group_0_1__0 ) )
                    // InternalFormDSL.g:317:3: ( rule__Exp__Group_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_0_1()); 
                    // InternalFormDSL.g:318:3: ( rule__Exp__Group_0_1__0 )
                    // InternalFormDSL.g:318:4: rule__Exp__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Alternatives_0"


    // $ANTLR start "rule__Comparison__Alternatives"
    // InternalFormDSL.g:326:1: rule__Comparison__Alternatives : ( ( ( rule__Comparison__Group_0__0 ) ) | ( ( rule__Comparison__Group_1__0 ) ) | ( ( rule__Comparison__Group_2__0 ) ) | ( ( rule__Comparison__Group_3__0 ) ) | ( ( rule__Comparison__Group_4__0 ) ) | ( ( rule__Comparison__Group_5__0 ) ) );
    public final void rule__Comparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:330:1: ( ( ( rule__Comparison__Group_0__0 ) ) | ( ( rule__Comparison__Group_1__0 ) ) | ( ( rule__Comparison__Group_2__0 ) ) | ( ( rule__Comparison__Group_3__0 ) ) | ( ( rule__Comparison__Group_4__0 ) ) | ( ( rule__Comparison__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFormDSL.g:331:2: ( ( rule__Comparison__Group_0__0 ) )
                    {
                    // InternalFormDSL.g:331:2: ( ( rule__Comparison__Group_0__0 ) )
                    // InternalFormDSL.g:332:3: ( rule__Comparison__Group_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_0()); 
                    // InternalFormDSL.g:333:3: ( rule__Comparison__Group_0__0 )
                    // InternalFormDSL.g:333:4: rule__Comparison__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:337:2: ( ( rule__Comparison__Group_1__0 ) )
                    {
                    // InternalFormDSL.g:337:2: ( ( rule__Comparison__Group_1__0 ) )
                    // InternalFormDSL.g:338:3: ( rule__Comparison__Group_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1()); 
                    // InternalFormDSL.g:339:3: ( rule__Comparison__Group_1__0 )
                    // InternalFormDSL.g:339:4: rule__Comparison__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:343:2: ( ( rule__Comparison__Group_2__0 ) )
                    {
                    // InternalFormDSL.g:343:2: ( ( rule__Comparison__Group_2__0 ) )
                    // InternalFormDSL.g:344:3: ( rule__Comparison__Group_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_2()); 
                    // InternalFormDSL.g:345:3: ( rule__Comparison__Group_2__0 )
                    // InternalFormDSL.g:345:4: rule__Comparison__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFormDSL.g:349:2: ( ( rule__Comparison__Group_3__0 ) )
                    {
                    // InternalFormDSL.g:349:2: ( ( rule__Comparison__Group_3__0 ) )
                    // InternalFormDSL.g:350:3: ( rule__Comparison__Group_3__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_3()); 
                    // InternalFormDSL.g:351:3: ( rule__Comparison__Group_3__0 )
                    // InternalFormDSL.g:351:4: rule__Comparison__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFormDSL.g:355:2: ( ( rule__Comparison__Group_4__0 ) )
                    {
                    // InternalFormDSL.g:355:2: ( ( rule__Comparison__Group_4__0 ) )
                    // InternalFormDSL.g:356:3: ( rule__Comparison__Group_4__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_4()); 
                    // InternalFormDSL.g:357:3: ( rule__Comparison__Group_4__0 )
                    // InternalFormDSL.g:357:4: rule__Comparison__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFormDSL.g:361:2: ( ( rule__Comparison__Group_5__0 ) )
                    {
                    // InternalFormDSL.g:361:2: ( ( rule__Comparison__Group_5__0 ) )
                    // InternalFormDSL.g:362:3: ( rule__Comparison__Group_5__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_5()); 
                    // InternalFormDSL.g:363:3: ( rule__Comparison__Group_5__0 )
                    // InternalFormDSL.g:363:4: rule__Comparison__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives"


    // $ANTLR start "rule__Form__Group__0"
    // InternalFormDSL.g:371:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:375:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalFormDSL.g:376:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalFormDSL.g:383:1: rule__Form__Group__0__Impl : ( () ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:387:1: ( ( () ) )
            // InternalFormDSL.g:388:1: ( () )
            {
            // InternalFormDSL.g:388:1: ( () )
            // InternalFormDSL.g:389:2: ()
            {
             before(grammarAccess.getFormAccess().getFormAction_0()); 
            // InternalFormDSL.g:390:2: ()
            // InternalFormDSL.g:390:3: 
            {
            }

             after(grammarAccess.getFormAccess().getFormAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalFormDSL.g:398:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:402:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalFormDSL.g:403:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalFormDSL.g:410:1: rule__Form__Group__1__Impl : ( 'form' ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:414:1: ( ( 'form' ) )
            // InternalFormDSL.g:415:1: ( 'form' )
            {
            // InternalFormDSL.g:415:1: ( 'form' )
            // InternalFormDSL.g:416:2: 'form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getFormKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalFormDSL.g:425:1: rule__Form__Group__2 : rule__Form__Group__2__Impl ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:429:1: ( rule__Form__Group__2__Impl )
            // InternalFormDSL.g:430:2: rule__Form__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalFormDSL.g:436:1: rule__Form__Group__2__Impl : ( ( rule__Form__ContentAssignment_2 )* ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:440:1: ( ( ( rule__Form__ContentAssignment_2 )* ) )
            // InternalFormDSL.g:441:1: ( ( rule__Form__ContentAssignment_2 )* )
            {
            // InternalFormDSL.g:441:1: ( ( rule__Form__ContentAssignment_2 )* )
            // InternalFormDSL.g:442:2: ( rule__Form__ContentAssignment_2 )*
            {
             before(grammarAccess.getFormAccess().getContentAssignment_2()); 
            // InternalFormDSL.g:443:2: ( rule__Form__ContentAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFormDSL.g:443:3: rule__Form__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Form__ContentAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFormAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalFormDSL.g:452:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:456:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalFormDSL.g:457:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalFormDSL.g:464:1: rule__Input__Group__0__Impl : ( ( rule__Input__TypeAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:468:1: ( ( ( rule__Input__TypeAssignment_0 ) ) )
            // InternalFormDSL.g:469:1: ( ( rule__Input__TypeAssignment_0 ) )
            {
            // InternalFormDSL.g:469:1: ( ( rule__Input__TypeAssignment_0 ) )
            // InternalFormDSL.g:470:2: ( rule__Input__TypeAssignment_0 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_0()); 
            // InternalFormDSL.g:471:2: ( rule__Input__TypeAssignment_0 )
            // InternalFormDSL.g:471:3: rule__Input__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Input__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalFormDSL.g:479:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:483:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalFormDSL.g:484:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalFormDSL.g:491:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:495:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // InternalFormDSL.g:496:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // InternalFormDSL.g:496:1: ( ( rule__Input__NameAssignment_1 ) )
            // InternalFormDSL.g:497:2: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // InternalFormDSL.g:498:2: ( rule__Input__NameAssignment_1 )
            // InternalFormDSL.g:498:3: rule__Input__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalFormDSL.g:506:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:510:1: ( rule__Input__Group__2__Impl )
            // InternalFormDSL.g:511:2: rule__Input__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalFormDSL.g:517:1: rule__Input__Group__2__Impl : ( ( rule__Input__ExpressionAssignment_2 )* ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:521:1: ( ( ( rule__Input__ExpressionAssignment_2 )* ) )
            // InternalFormDSL.g:522:1: ( ( rule__Input__ExpressionAssignment_2 )* )
            {
            // InternalFormDSL.g:522:1: ( ( rule__Input__ExpressionAssignment_2 )* )
            // InternalFormDSL.g:523:2: ( rule__Input__ExpressionAssignment_2 )*
            {
             before(grammarAccess.getInputAccess().getExpressionAssignment_2()); 
            // InternalFormDSL.g:524:2: ( rule__Input__ExpressionAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=25 && LA6_0<=28)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFormDSL.g:524:3: rule__Input__ExpressionAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Input__ExpressionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalFormDSL.g:533:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:537:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalFormDSL.g:538:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalFormDSL.g:545:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:549:1: ( ( () ) )
            // InternalFormDSL.g:550:1: ( () )
            {
            // InternalFormDSL.g:550:1: ( () )
            // InternalFormDSL.g:551:2: ()
            {
             before(grammarAccess.getTypeAccess().getShortTextAction_0_0()); 
            // InternalFormDSL.g:552:2: ()
            // InternalFormDSL.g:552:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getShortTextAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalFormDSL.g:560:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:564:1: ( rule__Type__Group_0__1__Impl )
            // InternalFormDSL.g:565:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalFormDSL.g:571:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__TextAssignment_0_1 ) ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:575:1: ( ( ( rule__Type__TextAssignment_0_1 ) ) )
            // InternalFormDSL.g:576:1: ( ( rule__Type__TextAssignment_0_1 ) )
            {
            // InternalFormDSL.g:576:1: ( ( rule__Type__TextAssignment_0_1 ) )
            // InternalFormDSL.g:577:2: ( rule__Type__TextAssignment_0_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_0_1()); 
            // InternalFormDSL.g:578:2: ( rule__Type__TextAssignment_0_1 )
            // InternalFormDSL.g:578:3: rule__Type__TextAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TextAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTextAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalFormDSL.g:587:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:591:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalFormDSL.g:592:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalFormDSL.g:599:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:603:1: ( ( () ) )
            // InternalFormDSL.g:604:1: ( () )
            {
            // InternalFormDSL.g:604:1: ( () )
            // InternalFormDSL.g:605:2: ()
            {
             before(grammarAccess.getTypeAccess().getGenericAction_1_0()); 
            // InternalFormDSL.g:606:2: ()
            // InternalFormDSL.g:606:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getGenericAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalFormDSL.g:614:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:618:1: ( rule__Type__Group_1__1__Impl )
            // InternalFormDSL.g:619:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalFormDSL.g:625:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__TextAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:629:1: ( ( ( rule__Type__TextAssignment_1_1 ) ) )
            // InternalFormDSL.g:630:1: ( ( rule__Type__TextAssignment_1_1 ) )
            {
            // InternalFormDSL.g:630:1: ( ( rule__Type__TextAssignment_1_1 ) )
            // InternalFormDSL.g:631:2: ( rule__Type__TextAssignment_1_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_1_1()); 
            // InternalFormDSL.g:632:2: ( rule__Type__TextAssignment_1_1 )
            // InternalFormDSL.g:632:3: rule__Type__TextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalFormDSL.g:641:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:645:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalFormDSL.g:646:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalFormDSL.g:653:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:657:1: ( ( () ) )
            // InternalFormDSL.g:658:1: ( () )
            {
            // InternalFormDSL.g:658:1: ( () )
            // InternalFormDSL.g:659:2: ()
            {
             before(grammarAccess.getTypeAccess().getGenericAction_2_0()); 
            // InternalFormDSL.g:660:2: ()
            // InternalFormDSL.g:660:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getGenericAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalFormDSL.g:668:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:672:1: ( rule__Type__Group_2__1__Impl )
            // InternalFormDSL.g:673:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalFormDSL.g:679:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__TextAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:683:1: ( ( ( rule__Type__TextAssignment_2_1 ) ) )
            // InternalFormDSL.g:684:1: ( ( rule__Type__TextAssignment_2_1 ) )
            {
            // InternalFormDSL.g:684:1: ( ( rule__Type__TextAssignment_2_1 ) )
            // InternalFormDSL.g:685:2: ( rule__Type__TextAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_2_1()); 
            // InternalFormDSL.g:686:2: ( rule__Type__TextAssignment_2_1 )
            // InternalFormDSL.g:686:3: rule__Type__TextAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTextAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_3__0"
    // InternalFormDSL.g:695:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:699:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalFormDSL.g:700:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Type__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0"


    // $ANTLR start "rule__Type__Group_3__0__Impl"
    // InternalFormDSL.g:707:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:711:1: ( ( () ) )
            // InternalFormDSL.g:712:1: ( () )
            {
            // InternalFormDSL.g:712:1: ( () )
            // InternalFormDSL.g:713:2: ()
            {
             before(grammarAccess.getTypeAccess().getMoneyAction_3_0()); 
            // InternalFormDSL.g:714:2: ()
            // InternalFormDSL.g:714:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getMoneyAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0__Impl"


    // $ANTLR start "rule__Type__Group_3__1"
    // InternalFormDSL.g:722:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:726:1: ( rule__Type__Group_3__1__Impl )
            // InternalFormDSL.g:727:2: rule__Type__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1"


    // $ANTLR start "rule__Type__Group_3__1__Impl"
    // InternalFormDSL.g:733:1: rule__Type__Group_3__1__Impl : ( ( rule__Type__TextAssignment_3_1 ) ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:737:1: ( ( ( rule__Type__TextAssignment_3_1 ) ) )
            // InternalFormDSL.g:738:1: ( ( rule__Type__TextAssignment_3_1 ) )
            {
            // InternalFormDSL.g:738:1: ( ( rule__Type__TextAssignment_3_1 ) )
            // InternalFormDSL.g:739:2: ( rule__Type__TextAssignment_3_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_3_1()); 
            // InternalFormDSL.g:740:2: ( rule__Type__TextAssignment_3_1 )
            // InternalFormDSL.g:740:3: rule__Type__TextAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTextAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1__Impl"


    // $ANTLR start "rule__Type__Group_4__0"
    // InternalFormDSL.g:749:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:753:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // InternalFormDSL.g:754:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0"


    // $ANTLR start "rule__Type__Group_4__0__Impl"
    // InternalFormDSL.g:761:1: rule__Type__Group_4__0__Impl : ( () ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:765:1: ( ( () ) )
            // InternalFormDSL.g:766:1: ( () )
            {
            // InternalFormDSL.g:766:1: ( () )
            // InternalFormDSL.g:767:2: ()
            {
             before(grammarAccess.getTypeAccess().getGenericAction_4_0()); 
            // InternalFormDSL.g:768:2: ()
            // InternalFormDSL.g:768:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getGenericAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0__Impl"


    // $ANTLR start "rule__Type__Group_4__1"
    // InternalFormDSL.g:776:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:780:1: ( rule__Type__Group_4__1__Impl )
            // InternalFormDSL.g:781:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1"


    // $ANTLR start "rule__Type__Group_4__1__Impl"
    // InternalFormDSL.g:787:1: rule__Type__Group_4__1__Impl : ( ( rule__Type__TextAssignment_4_1 ) ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:791:1: ( ( ( rule__Type__TextAssignment_4_1 ) ) )
            // InternalFormDSL.g:792:1: ( ( rule__Type__TextAssignment_4_1 ) )
            {
            // InternalFormDSL.g:792:1: ( ( rule__Type__TextAssignment_4_1 ) )
            // InternalFormDSL.g:793:2: ( rule__Type__TextAssignment_4_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_4_1()); 
            // InternalFormDSL.g:794:2: ( rule__Type__TextAssignment_4_1 )
            // InternalFormDSL.g:794:3: rule__Type__TextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1__Impl"


    // $ANTLR start "rule__Type__Group_5__0"
    // InternalFormDSL.g:803:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:807:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalFormDSL.g:808:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0"


    // $ANTLR start "rule__Type__Group_5__0__Impl"
    // InternalFormDSL.g:815:1: rule__Type__Group_5__0__Impl : ( () ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:819:1: ( ( () ) )
            // InternalFormDSL.g:820:1: ( () )
            {
            // InternalFormDSL.g:820:1: ( () )
            // InternalFormDSL.g:821:2: ()
            {
             before(grammarAccess.getTypeAccess().getLongTextAction_5_0()); 
            // InternalFormDSL.g:822:2: ()
            // InternalFormDSL.g:822:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getLongTextAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0__Impl"


    // $ANTLR start "rule__Type__Group_5__1"
    // InternalFormDSL.g:830:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:834:1: ( rule__Type__Group_5__1__Impl )
            // InternalFormDSL.g:835:2: rule__Type__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1"


    // $ANTLR start "rule__Type__Group_5__1__Impl"
    // InternalFormDSL.g:841:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__TextAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:845:1: ( ( ( rule__Type__TextAssignment_5_1 ) ) )
            // InternalFormDSL.g:846:1: ( ( rule__Type__TextAssignment_5_1 ) )
            {
            // InternalFormDSL.g:846:1: ( ( rule__Type__TextAssignment_5_1 ) )
            // InternalFormDSL.g:847:2: ( rule__Type__TextAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_5_1()); 
            // InternalFormDSL.g:848:2: ( rule__Type__TextAssignment_5_1 )
            // InternalFormDSL.g:848:3: rule__Type__TextAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TextAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTextAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1__Impl"


    // $ANTLR start "rule__Type__Group_6__0"
    // InternalFormDSL.g:857:1: rule__Type__Group_6__0 : rule__Type__Group_6__0__Impl rule__Type__Group_6__1 ;
    public final void rule__Type__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:861:1: ( rule__Type__Group_6__0__Impl rule__Type__Group_6__1 )
            // InternalFormDSL.g:862:2: rule__Type__Group_6__0__Impl rule__Type__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Type__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__0"


    // $ANTLR start "rule__Type__Group_6__0__Impl"
    // InternalFormDSL.g:869:1: rule__Type__Group_6__0__Impl : ( () ) ;
    public final void rule__Type__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:873:1: ( ( () ) )
            // InternalFormDSL.g:874:1: ( () )
            {
            // InternalFormDSL.g:874:1: ( () )
            // InternalFormDSL.g:875:2: ()
            {
             before(grammarAccess.getTypeAccess().getStringNumberAction_6_0()); 
            // InternalFormDSL.g:876:2: ()
            // InternalFormDSL.g:876:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getStringNumberAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__0__Impl"


    // $ANTLR start "rule__Type__Group_6__1"
    // InternalFormDSL.g:884:1: rule__Type__Group_6__1 : rule__Type__Group_6__1__Impl ;
    public final void rule__Type__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:888:1: ( rule__Type__Group_6__1__Impl )
            // InternalFormDSL.g:889:2: rule__Type__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__1"


    // $ANTLR start "rule__Type__Group_6__1__Impl"
    // InternalFormDSL.g:895:1: rule__Type__Group_6__1__Impl : ( ( rule__Type__TextAssignment_6_1 ) ) ;
    public final void rule__Type__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:899:1: ( ( ( rule__Type__TextAssignment_6_1 ) ) )
            // InternalFormDSL.g:900:1: ( ( rule__Type__TextAssignment_6_1 ) )
            {
            // InternalFormDSL.g:900:1: ( ( rule__Type__TextAssignment_6_1 ) )
            // InternalFormDSL.g:901:2: ( rule__Type__TextAssignment_6_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_6_1()); 
            // InternalFormDSL.g:902:2: ( rule__Type__TextAssignment_6_1 )
            // InternalFormDSL.g:902:3: rule__Type__TextAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TextAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTextAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalFormDSL.g:911:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:915:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalFormDSL.g:916:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalFormDSL.g:923:1: rule__Expression__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:927:1: ( ( () ) )
            // InternalFormDSL.g:928:1: ( () )
            {
            // InternalFormDSL.g:928:1: ( () )
            // InternalFormDSL.g:929:2: ()
            {
             before(grammarAccess.getExpressionAccess().getOptionalAction_0_0()); 
            // InternalFormDSL.g:930:2: ()
            // InternalFormDSL.g:930:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getOptionalAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalFormDSL.g:938:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:942:1: ( rule__Expression__Group_0__1__Impl )
            // InternalFormDSL.g:943:2: rule__Expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalFormDSL.g:949:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__TextAssignment_0_1 ) ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:953:1: ( ( ( rule__Expression__TextAssignment_0_1 ) ) )
            // InternalFormDSL.g:954:1: ( ( rule__Expression__TextAssignment_0_1 ) )
            {
            // InternalFormDSL.g:954:1: ( ( rule__Expression__TextAssignment_0_1 ) )
            // InternalFormDSL.g:955:2: ( rule__Expression__TextAssignment_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getTextAssignment_0_1()); 
            // InternalFormDSL.g:956:2: ( rule__Expression__TextAssignment_0_1 )
            // InternalFormDSL.g:956:3: rule__Expression__TextAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__TextAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getTextAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalFormDSL.g:965:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:969:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFormDSL.g:970:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalFormDSL.g:977:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:981:1: ( ( () ) )
            // InternalFormDSL.g:982:1: ( () )
            {
            // InternalFormDSL.g:982:1: ( () )
            // InternalFormDSL.g:983:2: ()
            {
             before(grammarAccess.getExpressionAccess().getFocusAction_1_0()); 
            // InternalFormDSL.g:984:2: ()
            // InternalFormDSL.g:984:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getFocusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalFormDSL.g:992:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:996:1: ( rule__Expression__Group_1__1__Impl )
            // InternalFormDSL.g:997:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalFormDSL.g:1003:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__TextAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1007:1: ( ( ( rule__Expression__TextAssignment_1_1 ) ) )
            // InternalFormDSL.g:1008:1: ( ( rule__Expression__TextAssignment_1_1 ) )
            {
            // InternalFormDSL.g:1008:1: ( ( rule__Expression__TextAssignment_1_1 ) )
            // InternalFormDSL.g:1009:2: ( rule__Expression__TextAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getTextAssignment_1_1()); 
            // InternalFormDSL.g:1010:2: ( rule__Expression__TextAssignment_1_1 )
            // InternalFormDSL.g:1010:3: rule__Expression__TextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getTextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalFormDSL.g:1019:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1023:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalFormDSL.g:1024:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalFormDSL.g:1031:1: rule__Exp__Group__0__Impl : ( ( rule__Exp__Alternatives_0 ) ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1035:1: ( ( ( rule__Exp__Alternatives_0 ) ) )
            // InternalFormDSL.g:1036:1: ( ( rule__Exp__Alternatives_0 ) )
            {
            // InternalFormDSL.g:1036:1: ( ( rule__Exp__Alternatives_0 ) )
            // InternalFormDSL.g:1037:2: ( rule__Exp__Alternatives_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_0()); 
            // InternalFormDSL.g:1038:2: ( rule__Exp__Alternatives_0 )
            // InternalFormDSL.g:1038:3: rule__Exp__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalFormDSL.g:1046:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl rule__Exp__Group__2 ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1050:1: ( rule__Exp__Group__1__Impl rule__Exp__Group__2 )
            // InternalFormDSL.g:1051:2: rule__Exp__Group__1__Impl rule__Exp__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Exp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalFormDSL.g:1058:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__CompAssignment_1 ) ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1062:1: ( ( ( rule__Exp__CompAssignment_1 ) ) )
            // InternalFormDSL.g:1063:1: ( ( rule__Exp__CompAssignment_1 ) )
            {
            // InternalFormDSL.g:1063:1: ( ( rule__Exp__CompAssignment_1 ) )
            // InternalFormDSL.g:1064:2: ( rule__Exp__CompAssignment_1 )
            {
             before(grammarAccess.getExpAccess().getCompAssignment_1()); 
            // InternalFormDSL.g:1065:2: ( rule__Exp__CompAssignment_1 )
            // InternalFormDSL.g:1065:3: rule__Exp__CompAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__CompAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getCompAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group__2"
    // InternalFormDSL.g:1073:1: rule__Exp__Group__2 : rule__Exp__Group__2__Impl ;
    public final void rule__Exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1077:1: ( rule__Exp__Group__2__Impl )
            // InternalFormDSL.g:1078:2: rule__Exp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__2"


    // $ANTLR start "rule__Exp__Group__2__Impl"
    // InternalFormDSL.g:1084:1: rule__Exp__Group__2__Impl : ( ( rule__Exp__ValueAssignment_2 ) ) ;
    public final void rule__Exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1088:1: ( ( ( rule__Exp__ValueAssignment_2 ) ) )
            // InternalFormDSL.g:1089:1: ( ( rule__Exp__ValueAssignment_2 ) )
            {
            // InternalFormDSL.g:1089:1: ( ( rule__Exp__ValueAssignment_2 ) )
            // InternalFormDSL.g:1090:2: ( rule__Exp__ValueAssignment_2 )
            {
             before(grammarAccess.getExpAccess().getValueAssignment_2()); 
            // InternalFormDSL.g:1091:2: ( rule__Exp__ValueAssignment_2 )
            // InternalFormDSL.g:1091:3: rule__Exp__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Exp__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__2__Impl"


    // $ANTLR start "rule__Exp__Group_0_0__0"
    // InternalFormDSL.g:1100:1: rule__Exp__Group_0_0__0 : rule__Exp__Group_0_0__0__Impl rule__Exp__Group_0_0__1 ;
    public final void rule__Exp__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1104:1: ( rule__Exp__Group_0_0__0__Impl rule__Exp__Group_0_0__1 )
            // InternalFormDSL.g:1105:2: rule__Exp__Group_0_0__0__Impl rule__Exp__Group_0_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Exp__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0_0__0"


    // $ANTLR start "rule__Exp__Group_0_0__0__Impl"
    // InternalFormDSL.g:1112:1: rule__Exp__Group_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1116:1: ( ( () ) )
            // InternalFormDSL.g:1117:1: ( () )
            {
            // InternalFormDSL.g:1117:1: ( () )
            // InternalFormDSL.g:1118:2: ()
            {
             before(grammarAccess.getExpAccess().getIsAction_0_0_0()); 
            // InternalFormDSL.g:1119:2: ()
            // InternalFormDSL.g:1119:3: 
            {
            }

             after(grammarAccess.getExpAccess().getIsAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_0_0__1"
    // InternalFormDSL.g:1127:1: rule__Exp__Group_0_0__1 : rule__Exp__Group_0_0__1__Impl ;
    public final void rule__Exp__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1131:1: ( rule__Exp__Group_0_0__1__Impl )
            // InternalFormDSL.g:1132:2: rule__Exp__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0_0__1"


    // $ANTLR start "rule__Exp__Group_0_0__1__Impl"
    // InternalFormDSL.g:1138:1: rule__Exp__Group_0_0__1__Impl : ( ( rule__Exp__TextAssignment_0_0_1 ) ) ;
    public final void rule__Exp__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1142:1: ( ( ( rule__Exp__TextAssignment_0_0_1 ) ) )
            // InternalFormDSL.g:1143:1: ( ( rule__Exp__TextAssignment_0_0_1 ) )
            {
            // InternalFormDSL.g:1143:1: ( ( rule__Exp__TextAssignment_0_0_1 ) )
            // InternalFormDSL.g:1144:2: ( rule__Exp__TextAssignment_0_0_1 )
            {
             before(grammarAccess.getExpAccess().getTextAssignment_0_0_1()); 
            // InternalFormDSL.g:1145:2: ( rule__Exp__TextAssignment_0_0_1 )
            // InternalFormDSL.g:1145:3: rule__Exp__TextAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__TextAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getTextAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_0_1__0"
    // InternalFormDSL.g:1154:1: rule__Exp__Group_0_1__0 : rule__Exp__Group_0_1__0__Impl rule__Exp__Group_0_1__1 ;
    public final void rule__Exp__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1158:1: ( rule__Exp__Group_0_1__0__Impl rule__Exp__Group_0_1__1 )
            // InternalFormDSL.g:1159:2: rule__Exp__Group_0_1__0__Impl rule__Exp__Group_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0_1__0"


    // $ANTLR start "rule__Exp__Group_0_1__0__Impl"
    // InternalFormDSL.g:1166:1: rule__Exp__Group_0_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1170:1: ( ( () ) )
            // InternalFormDSL.g:1171:1: ( () )
            {
            // InternalFormDSL.g:1171:1: ( () )
            // InternalFormDSL.g:1172:2: ()
            {
             before(grammarAccess.getExpAccess().getLengthAction_0_1_0()); 
            // InternalFormDSL.g:1173:2: ()
            // InternalFormDSL.g:1173:3: 
            {
            }

             after(grammarAccess.getExpAccess().getLengthAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_0_1__1"
    // InternalFormDSL.g:1181:1: rule__Exp__Group_0_1__1 : rule__Exp__Group_0_1__1__Impl ;
    public final void rule__Exp__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1185:1: ( rule__Exp__Group_0_1__1__Impl )
            // InternalFormDSL.g:1186:2: rule__Exp__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0_1__1"


    // $ANTLR start "rule__Exp__Group_0_1__1__Impl"
    // InternalFormDSL.g:1192:1: rule__Exp__Group_0_1__1__Impl : ( ( rule__Exp__TextAssignment_0_1_1 ) ) ;
    public final void rule__Exp__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1196:1: ( ( ( rule__Exp__TextAssignment_0_1_1 ) ) )
            // InternalFormDSL.g:1197:1: ( ( rule__Exp__TextAssignment_0_1_1 ) )
            {
            // InternalFormDSL.g:1197:1: ( ( rule__Exp__TextAssignment_0_1_1 ) )
            // InternalFormDSL.g:1198:2: ( rule__Exp__TextAssignment_0_1_1 )
            {
             before(grammarAccess.getExpAccess().getTextAssignment_0_1_1()); 
            // InternalFormDSL.g:1199:2: ( rule__Exp__TextAssignment_0_1_1 )
            // InternalFormDSL.g:1199:3: rule__Exp__TextAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__TextAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getTextAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_0__0"
    // InternalFormDSL.g:1208:1: rule__Comparison__Group_0__0 : rule__Comparison__Group_0__0__Impl rule__Comparison__Group_0__1 ;
    public final void rule__Comparison__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1212:1: ( rule__Comparison__Group_0__0__Impl rule__Comparison__Group_0__1 )
            // InternalFormDSL.g:1213:2: rule__Comparison__Group_0__0__Impl rule__Comparison__Group_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_0__0"


    // $ANTLR start "rule__Comparison__Group_0__0__Impl"
    // InternalFormDSL.g:1220:1: rule__Comparison__Group_0__0__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1224:1: ( ( '<' ) )
            // InternalFormDSL.g:1225:1: ( '<' )
            {
            // InternalFormDSL.g:1225:1: ( '<' )
            // InternalFormDSL.g:1226:2: '<'
            {
             before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_0__1"
    // InternalFormDSL.g:1235:1: rule__Comparison__Group_0__1 : rule__Comparison__Group_0__1__Impl ;
    public final void rule__Comparison__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1239:1: ( rule__Comparison__Group_0__1__Impl )
            // InternalFormDSL.g:1240:2: rule__Comparison__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_0__1"


    // $ANTLR start "rule__Comparison__Group_0__1__Impl"
    // InternalFormDSL.g:1246:1: rule__Comparison__Group_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1250:1: ( ( () ) )
            // InternalFormDSL.g:1251:1: ( () )
            {
            // InternalFormDSL.g:1251:1: ( () )
            // InternalFormDSL.g:1252:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanAction_0_1()); 
            // InternalFormDSL.g:1253:2: ()
            // InternalFormDSL.g:1253:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLessThanAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalFormDSL.g:1262:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1266:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalFormDSL.g:1267:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalFormDSL.g:1274:1: rule__Comparison__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1278:1: ( ( '>' ) )
            // InternalFormDSL.g:1279:1: ( '>' )
            {
            // InternalFormDSL.g:1279:1: ( '>' )
            // InternalFormDSL.g:1280:2: '>'
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalFormDSL.g:1289:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1293:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalFormDSL.g:1294:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalFormDSL.g:1300:1: rule__Comparison__Group_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1304:1: ( ( () ) )
            // InternalFormDSL.g:1305:1: ( () )
            {
            // InternalFormDSL.g:1305:1: ( () )
            // InternalFormDSL.g:1306:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanAction_1_1()); 
            // InternalFormDSL.g:1307:2: ()
            // InternalFormDSL.g:1307:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getGreaterThanAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_2__0"
    // InternalFormDSL.g:1316:1: rule__Comparison__Group_2__0 : rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1 ;
    public final void rule__Comparison__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1320:1: ( rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1 )
            // InternalFormDSL.g:1321:2: rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_2__0"


    // $ANTLR start "rule__Comparison__Group_2__0__Impl"
    // InternalFormDSL.g:1328:1: rule__Comparison__Group_2__0__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1332:1: ( ( '<=' ) )
            // InternalFormDSL.g:1333:1: ( '<=' )
            {
            // InternalFormDSL.g:1333:1: ( '<=' )
            // InternalFormDSL.g:1334:2: '<='
            {
             before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_2__1"
    // InternalFormDSL.g:1343:1: rule__Comparison__Group_2__1 : rule__Comparison__Group_2__1__Impl ;
    public final void rule__Comparison__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1347:1: ( rule__Comparison__Group_2__1__Impl )
            // InternalFormDSL.g:1348:2: rule__Comparison__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_2__1"


    // $ANTLR start "rule__Comparison__Group_2__1__Impl"
    // InternalFormDSL.g:1354:1: rule__Comparison__Group_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1358:1: ( ( () ) )
            // InternalFormDSL.g:1359:1: ( () )
            {
            // InternalFormDSL.g:1359:1: ( () )
            // InternalFormDSL.g:1360:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThaninclusiveAction_2_1()); 
            // InternalFormDSL.g:1361:2: ()
            // InternalFormDSL.g:1361:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLessThaninclusiveAction_2_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_2__1__Impl"


    // $ANTLR start "rule__Comparison__Group_3__0"
    // InternalFormDSL.g:1370:1: rule__Comparison__Group_3__0 : rule__Comparison__Group_3__0__Impl rule__Comparison__Group_3__1 ;
    public final void rule__Comparison__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1374:1: ( rule__Comparison__Group_3__0__Impl rule__Comparison__Group_3__1 )
            // InternalFormDSL.g:1375:2: rule__Comparison__Group_3__0__Impl rule__Comparison__Group_3__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_3__0"


    // $ANTLR start "rule__Comparison__Group_3__0__Impl"
    // InternalFormDSL.g:1382:1: rule__Comparison__Group_3__0__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1386:1: ( ( '>=' ) )
            // InternalFormDSL.g:1387:1: ( '>=' )
            {
            // InternalFormDSL.g:1387:1: ( '>=' )
            // InternalFormDSL.g:1388:2: '>='
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_3__0__Impl"


    // $ANTLR start "rule__Comparison__Group_3__1"
    // InternalFormDSL.g:1397:1: rule__Comparison__Group_3__1 : rule__Comparison__Group_3__1__Impl ;
    public final void rule__Comparison__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1401:1: ( rule__Comparison__Group_3__1__Impl )
            // InternalFormDSL.g:1402:2: rule__Comparison__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_3__1"


    // $ANTLR start "rule__Comparison__Group_3__1__Impl"
    // InternalFormDSL.g:1408:1: rule__Comparison__Group_3__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1412:1: ( ( () ) )
            // InternalFormDSL.g:1413:1: ( () )
            {
            // InternalFormDSL.g:1413:1: ( () )
            // InternalFormDSL.g:1414:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanInclusiveAction_3_1()); 
            // InternalFormDSL.g:1415:2: ()
            // InternalFormDSL.g:1415:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getGreaterThanInclusiveAction_3_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_3__1__Impl"


    // $ANTLR start "rule__Comparison__Group_4__0"
    // InternalFormDSL.g:1424:1: rule__Comparison__Group_4__0 : rule__Comparison__Group_4__0__Impl rule__Comparison__Group_4__1 ;
    public final void rule__Comparison__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1428:1: ( rule__Comparison__Group_4__0__Impl rule__Comparison__Group_4__1 )
            // InternalFormDSL.g:1429:2: rule__Comparison__Group_4__0__Impl rule__Comparison__Group_4__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_4__0"


    // $ANTLR start "rule__Comparison__Group_4__0__Impl"
    // InternalFormDSL.g:1436:1: rule__Comparison__Group_4__0__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1440:1: ( ( '==' ) )
            // InternalFormDSL.g:1441:1: ( '==' )
            {
            // InternalFormDSL.g:1441:1: ( '==' )
            // InternalFormDSL.g:1442:2: '=='
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_4__0__Impl"


    // $ANTLR start "rule__Comparison__Group_4__1"
    // InternalFormDSL.g:1451:1: rule__Comparison__Group_4__1 : rule__Comparison__Group_4__1__Impl ;
    public final void rule__Comparison__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1455:1: ( rule__Comparison__Group_4__1__Impl )
            // InternalFormDSL.g:1456:2: rule__Comparison__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_4__1"


    // $ANTLR start "rule__Comparison__Group_4__1__Impl"
    // InternalFormDSL.g:1462:1: rule__Comparison__Group_4__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1466:1: ( ( () ) )
            // InternalFormDSL.g:1467:1: ( () )
            {
            // InternalFormDSL.g:1467:1: ( () )
            // InternalFormDSL.g:1468:2: ()
            {
             before(grammarAccess.getComparisonAccess().getExactlyAction_4_1()); 
            // InternalFormDSL.g:1469:2: ()
            // InternalFormDSL.g:1469:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getExactlyAction_4_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_4__1__Impl"


    // $ANTLR start "rule__Comparison__Group_5__0"
    // InternalFormDSL.g:1478:1: rule__Comparison__Group_5__0 : rule__Comparison__Group_5__0__Impl rule__Comparison__Group_5__1 ;
    public final void rule__Comparison__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1482:1: ( rule__Comparison__Group_5__0__Impl rule__Comparison__Group_5__1 )
            // InternalFormDSL.g:1483:2: rule__Comparison__Group_5__0__Impl rule__Comparison__Group_5__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_5__0"


    // $ANTLR start "rule__Comparison__Group_5__0__Impl"
    // InternalFormDSL.g:1490:1: rule__Comparison__Group_5__0__Impl : ( '!=' ) ;
    public final void rule__Comparison__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1494:1: ( ( '!=' ) )
            // InternalFormDSL.g:1495:1: ( '!=' )
            {
            // InternalFormDSL.g:1495:1: ( '!=' )
            // InternalFormDSL.g:1496:2: '!='
            {
             before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_5__0__Impl"


    // $ANTLR start "rule__Comparison__Group_5__1"
    // InternalFormDSL.g:1505:1: rule__Comparison__Group_5__1 : rule__Comparison__Group_5__1__Impl ;
    public final void rule__Comparison__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1509:1: ( rule__Comparison__Group_5__1__Impl )
            // InternalFormDSL.g:1510:2: rule__Comparison__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_5__1"


    // $ANTLR start "rule__Comparison__Group_5__1__Impl"
    // InternalFormDSL.g:1516:1: rule__Comparison__Group_5__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1520:1: ( ( () ) )
            // InternalFormDSL.g:1521:1: ( () )
            {
            // InternalFormDSL.g:1521:1: ( () )
            // InternalFormDSL.g:1522:2: ()
            {
             before(grammarAccess.getComparisonAccess().getNotAction_5_1()); 
            // InternalFormDSL.g:1523:2: ()
            // InternalFormDSL.g:1523:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getNotAction_5_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_5__1__Impl"


    // $ANTLR start "rule__Form__ContentAssignment_2"
    // InternalFormDSL.g:1532:1: rule__Form__ContentAssignment_2 : ( ruleInput ) ;
    public final void rule__Form__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1536:1: ( ( ruleInput ) )
            // InternalFormDSL.g:1537:2: ( ruleInput )
            {
            // InternalFormDSL.g:1537:2: ( ruleInput )
            // InternalFormDSL.g:1538:3: ruleInput
            {
             before(grammarAccess.getFormAccess().getContentInputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getFormAccess().getContentInputParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__ContentAssignment_2"


    // $ANTLR start "rule__Input__TypeAssignment_0"
    // InternalFormDSL.g:1547:1: rule__Input__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Input__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1551:1: ( ( ruleType ) )
            // InternalFormDSL.g:1552:2: ( ruleType )
            {
            // InternalFormDSL.g:1552:2: ( ruleType )
            // InternalFormDSL.g:1553:3: ruleType
            {
             before(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TypeAssignment_0"


    // $ANTLR start "rule__Input__NameAssignment_1"
    // InternalFormDSL.g:1562:1: rule__Input__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1566:1: ( ( ruleName ) )
            // InternalFormDSL.g:1567:2: ( ruleName )
            {
            // InternalFormDSL.g:1567:2: ( ruleName )
            // InternalFormDSL.g:1568:3: ruleName
            {
             before(grammarAccess.getInputAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getInputAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NameAssignment_1"


    // $ANTLR start "rule__Input__ExpressionAssignment_2"
    // InternalFormDSL.g:1577:1: rule__Input__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Input__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1581:1: ( ( ruleExpression ) )
            // InternalFormDSL.g:1582:2: ( ruleExpression )
            {
            // InternalFormDSL.g:1582:2: ( ruleExpression )
            // InternalFormDSL.g:1583:3: ruleExpression
            {
             before(grammarAccess.getInputAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInputAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ExpressionAssignment_2"


    // $ANTLR start "rule__Type__TextAssignment_0_1"
    // InternalFormDSL.g:1592:1: rule__Type__TextAssignment_0_1 : ( ( 'shortText' ) ) ;
    public final void rule__Type__TextAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1596:1: ( ( ( 'shortText' ) ) )
            // InternalFormDSL.g:1597:2: ( ( 'shortText' ) )
            {
            // InternalFormDSL.g:1597:2: ( ( 'shortText' ) )
            // InternalFormDSL.g:1598:3: ( 'shortText' )
            {
             before(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_1_0()); 
            // InternalFormDSL.g:1599:3: ( 'shortText' )
            // InternalFormDSL.g:1600:4: 'shortText'
            {
             before(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_0_1"


    // $ANTLR start "rule__Type__TextAssignment_1_1"
    // InternalFormDSL.g:1611:1: rule__Type__TextAssignment_1_1 : ( ( 'date' ) ) ;
    public final void rule__Type__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1615:1: ( ( ( 'date' ) ) )
            // InternalFormDSL.g:1616:2: ( ( 'date' ) )
            {
            // InternalFormDSL.g:1616:2: ( ( 'date' ) )
            // InternalFormDSL.g:1617:3: ( 'date' )
            {
             before(grammarAccess.getTypeAccess().getTextDateKeyword_1_1_0()); 
            // InternalFormDSL.g:1618:3: ( 'date' )
            // InternalFormDSL.g:1619:4: 'date'
            {
             before(grammarAccess.getTypeAccess().getTextDateKeyword_1_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextDateKeyword_1_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextDateKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_1_1"


    // $ANTLR start "rule__Type__TextAssignment_2_1"
    // InternalFormDSL.g:1630:1: rule__Type__TextAssignment_2_1 : ( ( 'number' ) ) ;
    public final void rule__Type__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1634:1: ( ( ( 'number' ) ) )
            // InternalFormDSL.g:1635:2: ( ( 'number' ) )
            {
            // InternalFormDSL.g:1635:2: ( ( 'number' ) )
            // InternalFormDSL.g:1636:3: ( 'number' )
            {
             before(grammarAccess.getTypeAccess().getTextNumberKeyword_2_1_0()); 
            // InternalFormDSL.g:1637:3: ( 'number' )
            // InternalFormDSL.g:1638:4: 'number'
            {
             before(grammarAccess.getTypeAccess().getTextNumberKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextNumberKeyword_2_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextNumberKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_2_1"


    // $ANTLR start "rule__Type__TextAssignment_3_1"
    // InternalFormDSL.g:1649:1: rule__Type__TextAssignment_3_1 : ( ( 'money' ) ) ;
    public final void rule__Type__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1653:1: ( ( ( 'money' ) ) )
            // InternalFormDSL.g:1654:2: ( ( 'money' ) )
            {
            // InternalFormDSL.g:1654:2: ( ( 'money' ) )
            // InternalFormDSL.g:1655:3: ( 'money' )
            {
             before(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_1_0()); 
            // InternalFormDSL.g:1656:3: ( 'money' )
            // InternalFormDSL.g:1657:4: 'money'
            {
             before(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_3_1"


    // $ANTLR start "rule__Type__TextAssignment_4_1"
    // InternalFormDSL.g:1668:1: rule__Type__TextAssignment_4_1 : ( ( 'email' ) ) ;
    public final void rule__Type__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1672:1: ( ( ( 'email' ) ) )
            // InternalFormDSL.g:1673:2: ( ( 'email' ) )
            {
            // InternalFormDSL.g:1673:2: ( ( 'email' ) )
            // InternalFormDSL.g:1674:3: ( 'email' )
            {
             before(grammarAccess.getTypeAccess().getTextEmailKeyword_4_1_0()); 
            // InternalFormDSL.g:1675:3: ( 'email' )
            // InternalFormDSL.g:1676:4: 'email'
            {
             before(grammarAccess.getTypeAccess().getTextEmailKeyword_4_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextEmailKeyword_4_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextEmailKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_4_1"


    // $ANTLR start "rule__Type__TextAssignment_5_1"
    // InternalFormDSL.g:1687:1: rule__Type__TextAssignment_5_1 : ( ( 'longText' ) ) ;
    public final void rule__Type__TextAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1691:1: ( ( ( 'longText' ) ) )
            // InternalFormDSL.g:1692:2: ( ( 'longText' ) )
            {
            // InternalFormDSL.g:1692:2: ( ( 'longText' ) )
            // InternalFormDSL.g:1693:3: ( 'longText' )
            {
             before(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_1_0()); 
            // InternalFormDSL.g:1694:3: ( 'longText' )
            // InternalFormDSL.g:1695:4: 'longText'
            {
             before(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_5_1"


    // $ANTLR start "rule__Type__TextAssignment_6_1"
    // InternalFormDSL.g:1706:1: rule__Type__TextAssignment_6_1 : ( ( 'stringNumber' ) ) ;
    public final void rule__Type__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1710:1: ( ( ( 'stringNumber' ) ) )
            // InternalFormDSL.g:1711:2: ( ( 'stringNumber' ) )
            {
            // InternalFormDSL.g:1711:2: ( ( 'stringNumber' ) )
            // InternalFormDSL.g:1712:3: ( 'stringNumber' )
            {
             before(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_1_0()); 
            // InternalFormDSL.g:1713:3: ( 'stringNumber' )
            // InternalFormDSL.g:1714:4: 'stringNumber'
            {
             before(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_6_1"


    // $ANTLR start "rule__Name__TextAssignment"
    // InternalFormDSL.g:1725:1: rule__Name__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Name__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1729:1: ( ( RULE_STRING ) )
            // InternalFormDSL.g:1730:2: ( RULE_STRING )
            {
            // InternalFormDSL.g:1730:2: ( RULE_STRING )
            // InternalFormDSL.g:1731:3: RULE_STRING
            {
             before(grammarAccess.getNameAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__TextAssignment"


    // $ANTLR start "rule__Expression__TextAssignment_0_1"
    // InternalFormDSL.g:1740:1: rule__Expression__TextAssignment_0_1 : ( ( 'optional' ) ) ;
    public final void rule__Expression__TextAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1744:1: ( ( ( 'optional' ) ) )
            // InternalFormDSL.g:1745:2: ( ( 'optional' ) )
            {
            // InternalFormDSL.g:1745:2: ( ( 'optional' ) )
            // InternalFormDSL.g:1746:3: ( 'optional' )
            {
             before(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_1_0()); 
            // InternalFormDSL.g:1747:3: ( 'optional' )
            // InternalFormDSL.g:1748:4: 'optional'
            {
             before(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_1_0()); 

            }

             after(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TextAssignment_0_1"


    // $ANTLR start "rule__Expression__TextAssignment_1_1"
    // InternalFormDSL.g:1759:1: rule__Expression__TextAssignment_1_1 : ( ( 'focus' ) ) ;
    public final void rule__Expression__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1763:1: ( ( ( 'focus' ) ) )
            // InternalFormDSL.g:1764:2: ( ( 'focus' ) )
            {
            // InternalFormDSL.g:1764:2: ( ( 'focus' ) )
            // InternalFormDSL.g:1765:3: ( 'focus' )
            {
             before(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_1_0()); 
            // InternalFormDSL.g:1766:3: ( 'focus' )
            // InternalFormDSL.g:1767:4: 'focus'
            {
             before(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_1_0()); 

            }

             after(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TextAssignment_1_1"


    // $ANTLR start "rule__Exp__TextAssignment_0_0_1"
    // InternalFormDSL.g:1778:1: rule__Exp__TextAssignment_0_0_1 : ( ( 'is' ) ) ;
    public final void rule__Exp__TextAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1782:1: ( ( ( 'is' ) ) )
            // InternalFormDSL.g:1783:2: ( ( 'is' ) )
            {
            // InternalFormDSL.g:1783:2: ( ( 'is' ) )
            // InternalFormDSL.g:1784:3: ( 'is' )
            {
             before(grammarAccess.getExpAccess().getTextIsKeyword_0_0_1_0()); 
            // InternalFormDSL.g:1785:3: ( 'is' )
            // InternalFormDSL.g:1786:4: 'is'
            {
             before(grammarAccess.getExpAccess().getTextIsKeyword_0_0_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getTextIsKeyword_0_0_1_0()); 

            }

             after(grammarAccess.getExpAccess().getTextIsKeyword_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__TextAssignment_0_0_1"


    // $ANTLR start "rule__Exp__TextAssignment_0_1_1"
    // InternalFormDSL.g:1797:1: rule__Exp__TextAssignment_0_1_1 : ( ( 'length' ) ) ;
    public final void rule__Exp__TextAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1801:1: ( ( ( 'length' ) ) )
            // InternalFormDSL.g:1802:2: ( ( 'length' ) )
            {
            // InternalFormDSL.g:1802:2: ( ( 'length' ) )
            // InternalFormDSL.g:1803:3: ( 'length' )
            {
             before(grammarAccess.getExpAccess().getTextLengthKeyword_0_1_1_0()); 
            // InternalFormDSL.g:1804:3: ( 'length' )
            // InternalFormDSL.g:1805:4: 'length'
            {
             before(grammarAccess.getExpAccess().getTextLengthKeyword_0_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getTextLengthKeyword_0_1_1_0()); 

            }

             after(grammarAccess.getExpAccess().getTextLengthKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__TextAssignment_0_1_1"


    // $ANTLR start "rule__Exp__CompAssignment_1"
    // InternalFormDSL.g:1816:1: rule__Exp__CompAssignment_1 : ( ruleComparison ) ;
    public final void rule__Exp__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1820:1: ( ( ruleComparison ) )
            // InternalFormDSL.g:1821:2: ( ruleComparison )
            {
            // InternalFormDSL.g:1821:2: ( ruleComparison )
            // InternalFormDSL.g:1822:3: ruleComparison
            {
             before(grammarAccess.getExpAccess().getCompComparisonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getExpAccess().getCompComparisonParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__CompAssignment_1"


    // $ANTLR start "rule__Exp__ValueAssignment_2"
    // InternalFormDSL.g:1831:1: rule__Exp__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Exp__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1835:1: ( ( RULE_INT ) )
            // InternalFormDSL.g:1836:2: ( RULE_INT )
            {
            // InternalFormDSL.g:1836:2: ( RULE_INT )
            // InternalFormDSL.g:1837:3: RULE_INT
            {
             before(grammarAccess.getExpAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FC0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});

}