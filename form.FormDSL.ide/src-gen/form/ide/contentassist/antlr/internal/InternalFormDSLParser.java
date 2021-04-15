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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'shortText'", "'date'", "'number'", "'email'", "'longText'", "'optional'", "'focus'", "'is'", "'length'"
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
    // InternalFormDSL.g:227:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:231:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) )
            int alt1=5;
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
    // InternalFormDSL.g:266:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ruleExp ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:270:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ruleExp ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
            case 26:
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
                    // InternalFormDSL.g:271:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalFormDSL.g:271:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalFormDSL.g:272:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalFormDSL.g:273:3: ( rule__Expression__Group_0__0 )
                    // InternalFormDSL.g:273:4: rule__Expression__Group_0__0
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
                    // InternalFormDSL.g:277:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalFormDSL.g:277:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalFormDSL.g:278:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalFormDSL.g:279:3: ( rule__Expression__Group_1__0 )
                    // InternalFormDSL.g:279:4: rule__Expression__Group_1__0
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
                    // InternalFormDSL.g:283:2: ( ruleExp )
                    {
                    // InternalFormDSL.g:283:2: ( ruleExp )
                    // InternalFormDSL.g:284:3: ruleExp
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
    // InternalFormDSL.g:293:1: rule__Exp__Alternatives_0 : ( ( ( rule__Exp__Group_0_0__0 ) ) | ( ( rule__Exp__Group_0_1__0 ) ) );
    public final void rule__Exp__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:297:1: ( ( ( rule__Exp__Group_0_0__0 ) ) | ( ( rule__Exp__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFormDSL.g:298:2: ( ( rule__Exp__Group_0_0__0 ) )
                    {
                    // InternalFormDSL.g:298:2: ( ( rule__Exp__Group_0_0__0 ) )
                    // InternalFormDSL.g:299:3: ( rule__Exp__Group_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_0_0()); 
                    // InternalFormDSL.g:300:3: ( rule__Exp__Group_0_0__0 )
                    // InternalFormDSL.g:300:4: rule__Exp__Group_0_0__0
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
                    // InternalFormDSL.g:304:2: ( ( rule__Exp__Group_0_1__0 ) )
                    {
                    // InternalFormDSL.g:304:2: ( ( rule__Exp__Group_0_1__0 ) )
                    // InternalFormDSL.g:305:3: ( rule__Exp__Group_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_0_1()); 
                    // InternalFormDSL.g:306:3: ( rule__Exp__Group_0_1__0 )
                    // InternalFormDSL.g:306:4: rule__Exp__Group_0_1__0
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
    // InternalFormDSL.g:314:1: rule__Comparison__Alternatives : ( ( ( rule__Comparison__Group_0__0 ) ) | ( ( rule__Comparison__Group_1__0 ) ) | ( ( rule__Comparison__Group_2__0 ) ) | ( ( rule__Comparison__Group_3__0 ) ) | ( ( rule__Comparison__Group_4__0 ) ) | ( ( rule__Comparison__Group_5__0 ) ) );
    public final void rule__Comparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:318:1: ( ( ( rule__Comparison__Group_0__0 ) ) | ( ( rule__Comparison__Group_1__0 ) ) | ( ( rule__Comparison__Group_2__0 ) ) | ( ( rule__Comparison__Group_3__0 ) ) | ( ( rule__Comparison__Group_4__0 ) ) | ( ( rule__Comparison__Group_5__0 ) ) )
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
                    // InternalFormDSL.g:319:2: ( ( rule__Comparison__Group_0__0 ) )
                    {
                    // InternalFormDSL.g:319:2: ( ( rule__Comparison__Group_0__0 ) )
                    // InternalFormDSL.g:320:3: ( rule__Comparison__Group_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_0()); 
                    // InternalFormDSL.g:321:3: ( rule__Comparison__Group_0__0 )
                    // InternalFormDSL.g:321:4: rule__Comparison__Group_0__0
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
                    // InternalFormDSL.g:325:2: ( ( rule__Comparison__Group_1__0 ) )
                    {
                    // InternalFormDSL.g:325:2: ( ( rule__Comparison__Group_1__0 ) )
                    // InternalFormDSL.g:326:3: ( rule__Comparison__Group_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1()); 
                    // InternalFormDSL.g:327:3: ( rule__Comparison__Group_1__0 )
                    // InternalFormDSL.g:327:4: rule__Comparison__Group_1__0
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
                    // InternalFormDSL.g:331:2: ( ( rule__Comparison__Group_2__0 ) )
                    {
                    // InternalFormDSL.g:331:2: ( ( rule__Comparison__Group_2__0 ) )
                    // InternalFormDSL.g:332:3: ( rule__Comparison__Group_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_2()); 
                    // InternalFormDSL.g:333:3: ( rule__Comparison__Group_2__0 )
                    // InternalFormDSL.g:333:4: rule__Comparison__Group_2__0
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
                    // InternalFormDSL.g:337:2: ( ( rule__Comparison__Group_3__0 ) )
                    {
                    // InternalFormDSL.g:337:2: ( ( rule__Comparison__Group_3__0 ) )
                    // InternalFormDSL.g:338:3: ( rule__Comparison__Group_3__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_3()); 
                    // InternalFormDSL.g:339:3: ( rule__Comparison__Group_3__0 )
                    // InternalFormDSL.g:339:4: rule__Comparison__Group_3__0
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
                    // InternalFormDSL.g:343:2: ( ( rule__Comparison__Group_4__0 ) )
                    {
                    // InternalFormDSL.g:343:2: ( ( rule__Comparison__Group_4__0 ) )
                    // InternalFormDSL.g:344:3: ( rule__Comparison__Group_4__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_4()); 
                    // InternalFormDSL.g:345:3: ( rule__Comparison__Group_4__0 )
                    // InternalFormDSL.g:345:4: rule__Comparison__Group_4__0
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
                    // InternalFormDSL.g:349:2: ( ( rule__Comparison__Group_5__0 ) )
                    {
                    // InternalFormDSL.g:349:2: ( ( rule__Comparison__Group_5__0 ) )
                    // InternalFormDSL.g:350:3: ( rule__Comparison__Group_5__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_5()); 
                    // InternalFormDSL.g:351:3: ( rule__Comparison__Group_5__0 )
                    // InternalFormDSL.g:351:4: rule__Comparison__Group_5__0
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
    // InternalFormDSL.g:359:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:363:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalFormDSL.g:364:2: rule__Form__Group__0__Impl rule__Form__Group__1
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
    // InternalFormDSL.g:371:1: rule__Form__Group__0__Impl : ( () ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:375:1: ( ( () ) )
            // InternalFormDSL.g:376:1: ( () )
            {
            // InternalFormDSL.g:376:1: ( () )
            // InternalFormDSL.g:377:2: ()
            {
             before(grammarAccess.getFormAccess().getFormAction_0()); 
            // InternalFormDSL.g:378:2: ()
            // InternalFormDSL.g:378:3: 
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
    // InternalFormDSL.g:386:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:390:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalFormDSL.g:391:2: rule__Form__Group__1__Impl rule__Form__Group__2
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
    // InternalFormDSL.g:398:1: rule__Form__Group__1__Impl : ( 'form' ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:402:1: ( ( 'form' ) )
            // InternalFormDSL.g:403:1: ( 'form' )
            {
            // InternalFormDSL.g:403:1: ( 'form' )
            // InternalFormDSL.g:404:2: 'form'
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
    // InternalFormDSL.g:413:1: rule__Form__Group__2 : rule__Form__Group__2__Impl ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:417:1: ( rule__Form__Group__2__Impl )
            // InternalFormDSL.g:418:2: rule__Form__Group__2__Impl
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
    // InternalFormDSL.g:424:1: rule__Form__Group__2__Impl : ( ( rule__Form__ContentAssignment_2 )* ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:428:1: ( ( ( rule__Form__ContentAssignment_2 )* ) )
            // InternalFormDSL.g:429:1: ( ( rule__Form__ContentAssignment_2 )* )
            {
            // InternalFormDSL.g:429:1: ( ( rule__Form__ContentAssignment_2 )* )
            // InternalFormDSL.g:430:2: ( rule__Form__ContentAssignment_2 )*
            {
             before(grammarAccess.getFormAccess().getContentAssignment_2()); 
            // InternalFormDSL.g:431:2: ( rule__Form__ContentAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFormDSL.g:431:3: rule__Form__ContentAssignment_2
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
    // InternalFormDSL.g:440:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:444:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalFormDSL.g:445:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalFormDSL.g:452:1: rule__Input__Group__0__Impl : ( ( rule__Input__TypeAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:456:1: ( ( ( rule__Input__TypeAssignment_0 ) ) )
            // InternalFormDSL.g:457:1: ( ( rule__Input__TypeAssignment_0 ) )
            {
            // InternalFormDSL.g:457:1: ( ( rule__Input__TypeAssignment_0 ) )
            // InternalFormDSL.g:458:2: ( rule__Input__TypeAssignment_0 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_0()); 
            // InternalFormDSL.g:459:2: ( rule__Input__TypeAssignment_0 )
            // InternalFormDSL.g:459:3: rule__Input__TypeAssignment_0
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
    // InternalFormDSL.g:467:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:471:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalFormDSL.g:472:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalFormDSL.g:479:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:483:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // InternalFormDSL.g:484:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // InternalFormDSL.g:484:1: ( ( rule__Input__NameAssignment_1 ) )
            // InternalFormDSL.g:485:2: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // InternalFormDSL.g:486:2: ( rule__Input__NameAssignment_1 )
            // InternalFormDSL.g:486:3: rule__Input__NameAssignment_1
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
    // InternalFormDSL.g:494:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:498:1: ( rule__Input__Group__2__Impl )
            // InternalFormDSL.g:499:2: rule__Input__Group__2__Impl
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
    // InternalFormDSL.g:505:1: rule__Input__Group__2__Impl : ( ( rule__Input__ExpressionAssignment_2 )* ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:509:1: ( ( ( rule__Input__ExpressionAssignment_2 )* ) )
            // InternalFormDSL.g:510:1: ( ( rule__Input__ExpressionAssignment_2 )* )
            {
            // InternalFormDSL.g:510:1: ( ( rule__Input__ExpressionAssignment_2 )* )
            // InternalFormDSL.g:511:2: ( rule__Input__ExpressionAssignment_2 )*
            {
             before(grammarAccess.getInputAccess().getExpressionAssignment_2()); 
            // InternalFormDSL.g:512:2: ( rule__Input__ExpressionAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=23 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFormDSL.g:512:3: rule__Input__ExpressionAssignment_2
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
    // InternalFormDSL.g:521:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:525:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalFormDSL.g:526:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
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
    // InternalFormDSL.g:533:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:537:1: ( ( () ) )
            // InternalFormDSL.g:538:1: ( () )
            {
            // InternalFormDSL.g:538:1: ( () )
            // InternalFormDSL.g:539:2: ()
            {
             before(grammarAccess.getTypeAccess().getShortTextAction_0_0()); 
            // InternalFormDSL.g:540:2: ()
            // InternalFormDSL.g:540:3: 
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
    // InternalFormDSL.g:548:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:552:1: ( rule__Type__Group_0__1__Impl )
            // InternalFormDSL.g:553:2: rule__Type__Group_0__1__Impl
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
    // InternalFormDSL.g:559:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__TextAssignment_0_1 ) ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:563:1: ( ( ( rule__Type__TextAssignment_0_1 ) ) )
            // InternalFormDSL.g:564:1: ( ( rule__Type__TextAssignment_0_1 ) )
            {
            // InternalFormDSL.g:564:1: ( ( rule__Type__TextAssignment_0_1 ) )
            // InternalFormDSL.g:565:2: ( rule__Type__TextAssignment_0_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_0_1()); 
            // InternalFormDSL.g:566:2: ( rule__Type__TextAssignment_0_1 )
            // InternalFormDSL.g:566:3: rule__Type__TextAssignment_0_1
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
    // InternalFormDSL.g:575:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:579:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalFormDSL.g:580:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
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
    // InternalFormDSL.g:587:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:591:1: ( ( () ) )
            // InternalFormDSL.g:592:1: ( () )
            {
            // InternalFormDSL.g:592:1: ( () )
            // InternalFormDSL.g:593:2: ()
            {
             before(grammarAccess.getTypeAccess().getGenericAction_1_0()); 
            // InternalFormDSL.g:594:2: ()
            // InternalFormDSL.g:594:3: 
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
    // InternalFormDSL.g:602:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:606:1: ( rule__Type__Group_1__1__Impl )
            // InternalFormDSL.g:607:2: rule__Type__Group_1__1__Impl
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
    // InternalFormDSL.g:613:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__TextAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:617:1: ( ( ( rule__Type__TextAssignment_1_1 ) ) )
            // InternalFormDSL.g:618:1: ( ( rule__Type__TextAssignment_1_1 ) )
            {
            // InternalFormDSL.g:618:1: ( ( rule__Type__TextAssignment_1_1 ) )
            // InternalFormDSL.g:619:2: ( rule__Type__TextAssignment_1_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_1_1()); 
            // InternalFormDSL.g:620:2: ( rule__Type__TextAssignment_1_1 )
            // InternalFormDSL.g:620:3: rule__Type__TextAssignment_1_1
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
    // InternalFormDSL.g:629:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:633:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalFormDSL.g:634:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalFormDSL.g:641:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:645:1: ( ( () ) )
            // InternalFormDSL.g:646:1: ( () )
            {
            // InternalFormDSL.g:646:1: ( () )
            // InternalFormDSL.g:647:2: ()
            {
             before(grammarAccess.getTypeAccess().getGenericAction_2_0()); 
            // InternalFormDSL.g:648:2: ()
            // InternalFormDSL.g:648:3: 
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
    // InternalFormDSL.g:656:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:660:1: ( rule__Type__Group_2__1__Impl )
            // InternalFormDSL.g:661:2: rule__Type__Group_2__1__Impl
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
    // InternalFormDSL.g:667:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__TextAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:671:1: ( ( ( rule__Type__TextAssignment_2_1 ) ) )
            // InternalFormDSL.g:672:1: ( ( rule__Type__TextAssignment_2_1 ) )
            {
            // InternalFormDSL.g:672:1: ( ( rule__Type__TextAssignment_2_1 ) )
            // InternalFormDSL.g:673:2: ( rule__Type__TextAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_2_1()); 
            // InternalFormDSL.g:674:2: ( rule__Type__TextAssignment_2_1 )
            // InternalFormDSL.g:674:3: rule__Type__TextAssignment_2_1
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
    // InternalFormDSL.g:683:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:687:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalFormDSL.g:688:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
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
    // InternalFormDSL.g:695:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:699:1: ( ( () ) )
            // InternalFormDSL.g:700:1: ( () )
            {
            // InternalFormDSL.g:700:1: ( () )
            // InternalFormDSL.g:701:2: ()
            {
             before(grammarAccess.getTypeAccess().getGenericAction_3_0()); 
            // InternalFormDSL.g:702:2: ()
            // InternalFormDSL.g:702:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getGenericAction_3_0()); 

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
    // InternalFormDSL.g:710:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:714:1: ( rule__Type__Group_3__1__Impl )
            // InternalFormDSL.g:715:2: rule__Type__Group_3__1__Impl
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
    // InternalFormDSL.g:721:1: rule__Type__Group_3__1__Impl : ( ( rule__Type__TextAssignment_3_1 ) ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:725:1: ( ( ( rule__Type__TextAssignment_3_1 ) ) )
            // InternalFormDSL.g:726:1: ( ( rule__Type__TextAssignment_3_1 ) )
            {
            // InternalFormDSL.g:726:1: ( ( rule__Type__TextAssignment_3_1 ) )
            // InternalFormDSL.g:727:2: ( rule__Type__TextAssignment_3_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_3_1()); 
            // InternalFormDSL.g:728:2: ( rule__Type__TextAssignment_3_1 )
            // InternalFormDSL.g:728:3: rule__Type__TextAssignment_3_1
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
    // InternalFormDSL.g:737:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:741:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // InternalFormDSL.g:742:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalFormDSL.g:749:1: rule__Type__Group_4__0__Impl : ( () ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:753:1: ( ( () ) )
            // InternalFormDSL.g:754:1: ( () )
            {
            // InternalFormDSL.g:754:1: ( () )
            // InternalFormDSL.g:755:2: ()
            {
             before(grammarAccess.getTypeAccess().getLongTextAction_4_0()); 
            // InternalFormDSL.g:756:2: ()
            // InternalFormDSL.g:756:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getLongTextAction_4_0()); 

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
    // InternalFormDSL.g:764:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:768:1: ( rule__Type__Group_4__1__Impl )
            // InternalFormDSL.g:769:2: rule__Type__Group_4__1__Impl
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
    // InternalFormDSL.g:775:1: rule__Type__Group_4__1__Impl : ( ( rule__Type__TextAssignment_4_1 ) ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:779:1: ( ( ( rule__Type__TextAssignment_4_1 ) ) )
            // InternalFormDSL.g:780:1: ( ( rule__Type__TextAssignment_4_1 ) )
            {
            // InternalFormDSL.g:780:1: ( ( rule__Type__TextAssignment_4_1 ) )
            // InternalFormDSL.g:781:2: ( rule__Type__TextAssignment_4_1 )
            {
             before(grammarAccess.getTypeAccess().getTextAssignment_4_1()); 
            // InternalFormDSL.g:782:2: ( rule__Type__TextAssignment_4_1 )
            // InternalFormDSL.g:782:3: rule__Type__TextAssignment_4_1
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


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalFormDSL.g:791:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:795:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalFormDSL.g:796:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalFormDSL.g:803:1: rule__Expression__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:807:1: ( ( () ) )
            // InternalFormDSL.g:808:1: ( () )
            {
            // InternalFormDSL.g:808:1: ( () )
            // InternalFormDSL.g:809:2: ()
            {
             before(grammarAccess.getExpressionAccess().getOptionalAction_0_0()); 
            // InternalFormDSL.g:810:2: ()
            // InternalFormDSL.g:810:3: 
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
    // InternalFormDSL.g:818:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:822:1: ( rule__Expression__Group_0__1__Impl )
            // InternalFormDSL.g:823:2: rule__Expression__Group_0__1__Impl
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
    // InternalFormDSL.g:829:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__TextAssignment_0_1 ) ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:833:1: ( ( ( rule__Expression__TextAssignment_0_1 ) ) )
            // InternalFormDSL.g:834:1: ( ( rule__Expression__TextAssignment_0_1 ) )
            {
            // InternalFormDSL.g:834:1: ( ( rule__Expression__TextAssignment_0_1 ) )
            // InternalFormDSL.g:835:2: ( rule__Expression__TextAssignment_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getTextAssignment_0_1()); 
            // InternalFormDSL.g:836:2: ( rule__Expression__TextAssignment_0_1 )
            // InternalFormDSL.g:836:3: rule__Expression__TextAssignment_0_1
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
    // InternalFormDSL.g:845:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:849:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFormDSL.g:850:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalFormDSL.g:857:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:861:1: ( ( () ) )
            // InternalFormDSL.g:862:1: ( () )
            {
            // InternalFormDSL.g:862:1: ( () )
            // InternalFormDSL.g:863:2: ()
            {
             before(grammarAccess.getExpressionAccess().getFocusAction_1_0()); 
            // InternalFormDSL.g:864:2: ()
            // InternalFormDSL.g:864:3: 
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
    // InternalFormDSL.g:872:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:876:1: ( rule__Expression__Group_1__1__Impl )
            // InternalFormDSL.g:877:2: rule__Expression__Group_1__1__Impl
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
    // InternalFormDSL.g:883:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__TextAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:887:1: ( ( ( rule__Expression__TextAssignment_1_1 ) ) )
            // InternalFormDSL.g:888:1: ( ( rule__Expression__TextAssignment_1_1 ) )
            {
            // InternalFormDSL.g:888:1: ( ( rule__Expression__TextAssignment_1_1 ) )
            // InternalFormDSL.g:889:2: ( rule__Expression__TextAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getTextAssignment_1_1()); 
            // InternalFormDSL.g:890:2: ( rule__Expression__TextAssignment_1_1 )
            // InternalFormDSL.g:890:3: rule__Expression__TextAssignment_1_1
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
    // InternalFormDSL.g:899:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:903:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalFormDSL.g:904:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalFormDSL.g:911:1: rule__Exp__Group__0__Impl : ( ( rule__Exp__Alternatives_0 ) ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:915:1: ( ( ( rule__Exp__Alternatives_0 ) ) )
            // InternalFormDSL.g:916:1: ( ( rule__Exp__Alternatives_0 ) )
            {
            // InternalFormDSL.g:916:1: ( ( rule__Exp__Alternatives_0 ) )
            // InternalFormDSL.g:917:2: ( rule__Exp__Alternatives_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_0()); 
            // InternalFormDSL.g:918:2: ( rule__Exp__Alternatives_0 )
            // InternalFormDSL.g:918:3: rule__Exp__Alternatives_0
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
    // InternalFormDSL.g:926:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl rule__Exp__Group__2 ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:930:1: ( rule__Exp__Group__1__Impl rule__Exp__Group__2 )
            // InternalFormDSL.g:931:2: rule__Exp__Group__1__Impl rule__Exp__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalFormDSL.g:938:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__CompAssignment_1 ) ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:942:1: ( ( ( rule__Exp__CompAssignment_1 ) ) )
            // InternalFormDSL.g:943:1: ( ( rule__Exp__CompAssignment_1 ) )
            {
            // InternalFormDSL.g:943:1: ( ( rule__Exp__CompAssignment_1 ) )
            // InternalFormDSL.g:944:2: ( rule__Exp__CompAssignment_1 )
            {
             before(grammarAccess.getExpAccess().getCompAssignment_1()); 
            // InternalFormDSL.g:945:2: ( rule__Exp__CompAssignment_1 )
            // InternalFormDSL.g:945:3: rule__Exp__CompAssignment_1
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
    // InternalFormDSL.g:953:1: rule__Exp__Group__2 : rule__Exp__Group__2__Impl ;
    public final void rule__Exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:957:1: ( rule__Exp__Group__2__Impl )
            // InternalFormDSL.g:958:2: rule__Exp__Group__2__Impl
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
    // InternalFormDSL.g:964:1: rule__Exp__Group__2__Impl : ( ( rule__Exp__ValueAssignment_2 ) ) ;
    public final void rule__Exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:968:1: ( ( ( rule__Exp__ValueAssignment_2 ) ) )
            // InternalFormDSL.g:969:1: ( ( rule__Exp__ValueAssignment_2 ) )
            {
            // InternalFormDSL.g:969:1: ( ( rule__Exp__ValueAssignment_2 ) )
            // InternalFormDSL.g:970:2: ( rule__Exp__ValueAssignment_2 )
            {
             before(grammarAccess.getExpAccess().getValueAssignment_2()); 
            // InternalFormDSL.g:971:2: ( rule__Exp__ValueAssignment_2 )
            // InternalFormDSL.g:971:3: rule__Exp__ValueAssignment_2
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
    // InternalFormDSL.g:980:1: rule__Exp__Group_0_0__0 : rule__Exp__Group_0_0__0__Impl rule__Exp__Group_0_0__1 ;
    public final void rule__Exp__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:984:1: ( rule__Exp__Group_0_0__0__Impl rule__Exp__Group_0_0__1 )
            // InternalFormDSL.g:985:2: rule__Exp__Group_0_0__0__Impl rule__Exp__Group_0_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFormDSL.g:992:1: rule__Exp__Group_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:996:1: ( ( () ) )
            // InternalFormDSL.g:997:1: ( () )
            {
            // InternalFormDSL.g:997:1: ( () )
            // InternalFormDSL.g:998:2: ()
            {
             before(grammarAccess.getExpAccess().getIsAction_0_0_0()); 
            // InternalFormDSL.g:999:2: ()
            // InternalFormDSL.g:999:3: 
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
    // InternalFormDSL.g:1007:1: rule__Exp__Group_0_0__1 : rule__Exp__Group_0_0__1__Impl ;
    public final void rule__Exp__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1011:1: ( rule__Exp__Group_0_0__1__Impl )
            // InternalFormDSL.g:1012:2: rule__Exp__Group_0_0__1__Impl
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
    // InternalFormDSL.g:1018:1: rule__Exp__Group_0_0__1__Impl : ( ( rule__Exp__TextAssignment_0_0_1 ) ) ;
    public final void rule__Exp__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1022:1: ( ( ( rule__Exp__TextAssignment_0_0_1 ) ) )
            // InternalFormDSL.g:1023:1: ( ( rule__Exp__TextAssignment_0_0_1 ) )
            {
            // InternalFormDSL.g:1023:1: ( ( rule__Exp__TextAssignment_0_0_1 ) )
            // InternalFormDSL.g:1024:2: ( rule__Exp__TextAssignment_0_0_1 )
            {
             before(grammarAccess.getExpAccess().getTextAssignment_0_0_1()); 
            // InternalFormDSL.g:1025:2: ( rule__Exp__TextAssignment_0_0_1 )
            // InternalFormDSL.g:1025:3: rule__Exp__TextAssignment_0_0_1
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
    // InternalFormDSL.g:1034:1: rule__Exp__Group_0_1__0 : rule__Exp__Group_0_1__0__Impl rule__Exp__Group_0_1__1 ;
    public final void rule__Exp__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1038:1: ( rule__Exp__Group_0_1__0__Impl rule__Exp__Group_0_1__1 )
            // InternalFormDSL.g:1039:2: rule__Exp__Group_0_1__0__Impl rule__Exp__Group_0_1__1
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
    // InternalFormDSL.g:1046:1: rule__Exp__Group_0_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1050:1: ( ( () ) )
            // InternalFormDSL.g:1051:1: ( () )
            {
            // InternalFormDSL.g:1051:1: ( () )
            // InternalFormDSL.g:1052:2: ()
            {
             before(grammarAccess.getExpAccess().getLengthAction_0_1_0()); 
            // InternalFormDSL.g:1053:2: ()
            // InternalFormDSL.g:1053:3: 
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
    // InternalFormDSL.g:1061:1: rule__Exp__Group_0_1__1 : rule__Exp__Group_0_1__1__Impl ;
    public final void rule__Exp__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1065:1: ( rule__Exp__Group_0_1__1__Impl )
            // InternalFormDSL.g:1066:2: rule__Exp__Group_0_1__1__Impl
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
    // InternalFormDSL.g:1072:1: rule__Exp__Group_0_1__1__Impl : ( ( rule__Exp__TextAssignment_0_1_1 ) ) ;
    public final void rule__Exp__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1076:1: ( ( ( rule__Exp__TextAssignment_0_1_1 ) ) )
            // InternalFormDSL.g:1077:1: ( ( rule__Exp__TextAssignment_0_1_1 ) )
            {
            // InternalFormDSL.g:1077:1: ( ( rule__Exp__TextAssignment_0_1_1 ) )
            // InternalFormDSL.g:1078:2: ( rule__Exp__TextAssignment_0_1_1 )
            {
             before(grammarAccess.getExpAccess().getTextAssignment_0_1_1()); 
            // InternalFormDSL.g:1079:2: ( rule__Exp__TextAssignment_0_1_1 )
            // InternalFormDSL.g:1079:3: rule__Exp__TextAssignment_0_1_1
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
    // InternalFormDSL.g:1088:1: rule__Comparison__Group_0__0 : rule__Comparison__Group_0__0__Impl rule__Comparison__Group_0__1 ;
    public final void rule__Comparison__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1092:1: ( rule__Comparison__Group_0__0__Impl rule__Comparison__Group_0__1 )
            // InternalFormDSL.g:1093:2: rule__Comparison__Group_0__0__Impl rule__Comparison__Group_0__1
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
    // InternalFormDSL.g:1100:1: rule__Comparison__Group_0__0__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1104:1: ( ( '<' ) )
            // InternalFormDSL.g:1105:1: ( '<' )
            {
            // InternalFormDSL.g:1105:1: ( '<' )
            // InternalFormDSL.g:1106:2: '<'
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
    // InternalFormDSL.g:1115:1: rule__Comparison__Group_0__1 : rule__Comparison__Group_0__1__Impl ;
    public final void rule__Comparison__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1119:1: ( rule__Comparison__Group_0__1__Impl )
            // InternalFormDSL.g:1120:2: rule__Comparison__Group_0__1__Impl
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
    // InternalFormDSL.g:1126:1: rule__Comparison__Group_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1130:1: ( ( () ) )
            // InternalFormDSL.g:1131:1: ( () )
            {
            // InternalFormDSL.g:1131:1: ( () )
            // InternalFormDSL.g:1132:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanAction_0_1()); 
            // InternalFormDSL.g:1133:2: ()
            // InternalFormDSL.g:1133:3: 
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
    // InternalFormDSL.g:1142:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1146:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalFormDSL.g:1147:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalFormDSL.g:1154:1: rule__Comparison__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1158:1: ( ( '>' ) )
            // InternalFormDSL.g:1159:1: ( '>' )
            {
            // InternalFormDSL.g:1159:1: ( '>' )
            // InternalFormDSL.g:1160:2: '>'
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
    // InternalFormDSL.g:1169:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1173:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalFormDSL.g:1174:2: rule__Comparison__Group_1__1__Impl
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
    // InternalFormDSL.g:1180:1: rule__Comparison__Group_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1184:1: ( ( () ) )
            // InternalFormDSL.g:1185:1: ( () )
            {
            // InternalFormDSL.g:1185:1: ( () )
            // InternalFormDSL.g:1186:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanAction_1_1()); 
            // InternalFormDSL.g:1187:2: ()
            // InternalFormDSL.g:1187:3: 
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
    // InternalFormDSL.g:1196:1: rule__Comparison__Group_2__0 : rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1 ;
    public final void rule__Comparison__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1200:1: ( rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1 )
            // InternalFormDSL.g:1201:2: rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1
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
    // InternalFormDSL.g:1208:1: rule__Comparison__Group_2__0__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1212:1: ( ( '<=' ) )
            // InternalFormDSL.g:1213:1: ( '<=' )
            {
            // InternalFormDSL.g:1213:1: ( '<=' )
            // InternalFormDSL.g:1214:2: '<='
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
    // InternalFormDSL.g:1223:1: rule__Comparison__Group_2__1 : rule__Comparison__Group_2__1__Impl ;
    public final void rule__Comparison__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1227:1: ( rule__Comparison__Group_2__1__Impl )
            // InternalFormDSL.g:1228:2: rule__Comparison__Group_2__1__Impl
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
    // InternalFormDSL.g:1234:1: rule__Comparison__Group_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1238:1: ( ( () ) )
            // InternalFormDSL.g:1239:1: ( () )
            {
            // InternalFormDSL.g:1239:1: ( () )
            // InternalFormDSL.g:1240:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanInclusiveAction_2_1()); 
            // InternalFormDSL.g:1241:2: ()
            // InternalFormDSL.g:1241:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLessThanInclusiveAction_2_1()); 

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
    // InternalFormDSL.g:1250:1: rule__Comparison__Group_3__0 : rule__Comparison__Group_3__0__Impl rule__Comparison__Group_3__1 ;
    public final void rule__Comparison__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1254:1: ( rule__Comparison__Group_3__0__Impl rule__Comparison__Group_3__1 )
            // InternalFormDSL.g:1255:2: rule__Comparison__Group_3__0__Impl rule__Comparison__Group_3__1
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
    // InternalFormDSL.g:1262:1: rule__Comparison__Group_3__0__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1266:1: ( ( '>=' ) )
            // InternalFormDSL.g:1267:1: ( '>=' )
            {
            // InternalFormDSL.g:1267:1: ( '>=' )
            // InternalFormDSL.g:1268:2: '>='
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
    // InternalFormDSL.g:1277:1: rule__Comparison__Group_3__1 : rule__Comparison__Group_3__1__Impl ;
    public final void rule__Comparison__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1281:1: ( rule__Comparison__Group_3__1__Impl )
            // InternalFormDSL.g:1282:2: rule__Comparison__Group_3__1__Impl
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
    // InternalFormDSL.g:1288:1: rule__Comparison__Group_3__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1292:1: ( ( () ) )
            // InternalFormDSL.g:1293:1: ( () )
            {
            // InternalFormDSL.g:1293:1: ( () )
            // InternalFormDSL.g:1294:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanInclusiveAction_3_1()); 
            // InternalFormDSL.g:1295:2: ()
            // InternalFormDSL.g:1295:3: 
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
    // InternalFormDSL.g:1304:1: rule__Comparison__Group_4__0 : rule__Comparison__Group_4__0__Impl rule__Comparison__Group_4__1 ;
    public final void rule__Comparison__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1308:1: ( rule__Comparison__Group_4__0__Impl rule__Comparison__Group_4__1 )
            // InternalFormDSL.g:1309:2: rule__Comparison__Group_4__0__Impl rule__Comparison__Group_4__1
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
    // InternalFormDSL.g:1316:1: rule__Comparison__Group_4__0__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1320:1: ( ( '==' ) )
            // InternalFormDSL.g:1321:1: ( '==' )
            {
            // InternalFormDSL.g:1321:1: ( '==' )
            // InternalFormDSL.g:1322:2: '=='
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
    // InternalFormDSL.g:1331:1: rule__Comparison__Group_4__1 : rule__Comparison__Group_4__1__Impl ;
    public final void rule__Comparison__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1335:1: ( rule__Comparison__Group_4__1__Impl )
            // InternalFormDSL.g:1336:2: rule__Comparison__Group_4__1__Impl
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
    // InternalFormDSL.g:1342:1: rule__Comparison__Group_4__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1346:1: ( ( () ) )
            // InternalFormDSL.g:1347:1: ( () )
            {
            // InternalFormDSL.g:1347:1: ( () )
            // InternalFormDSL.g:1348:2: ()
            {
             before(grammarAccess.getComparisonAccess().getExactlyAction_4_1()); 
            // InternalFormDSL.g:1349:2: ()
            // InternalFormDSL.g:1349:3: 
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
    // InternalFormDSL.g:1358:1: rule__Comparison__Group_5__0 : rule__Comparison__Group_5__0__Impl rule__Comparison__Group_5__1 ;
    public final void rule__Comparison__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1362:1: ( rule__Comparison__Group_5__0__Impl rule__Comparison__Group_5__1 )
            // InternalFormDSL.g:1363:2: rule__Comparison__Group_5__0__Impl rule__Comparison__Group_5__1
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
    // InternalFormDSL.g:1370:1: rule__Comparison__Group_5__0__Impl : ( '!=' ) ;
    public final void rule__Comparison__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1374:1: ( ( '!=' ) )
            // InternalFormDSL.g:1375:1: ( '!=' )
            {
            // InternalFormDSL.g:1375:1: ( '!=' )
            // InternalFormDSL.g:1376:2: '!='
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
    // InternalFormDSL.g:1385:1: rule__Comparison__Group_5__1 : rule__Comparison__Group_5__1__Impl ;
    public final void rule__Comparison__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1389:1: ( rule__Comparison__Group_5__1__Impl )
            // InternalFormDSL.g:1390:2: rule__Comparison__Group_5__1__Impl
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
    // InternalFormDSL.g:1396:1: rule__Comparison__Group_5__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1400:1: ( ( () ) )
            // InternalFormDSL.g:1401:1: ( () )
            {
            // InternalFormDSL.g:1401:1: ( () )
            // InternalFormDSL.g:1402:2: ()
            {
             before(grammarAccess.getComparisonAccess().getNotAction_5_1()); 
            // InternalFormDSL.g:1403:2: ()
            // InternalFormDSL.g:1403:3: 
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
    // InternalFormDSL.g:1412:1: rule__Form__ContentAssignment_2 : ( ruleInput ) ;
    public final void rule__Form__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1416:1: ( ( ruleInput ) )
            // InternalFormDSL.g:1417:2: ( ruleInput )
            {
            // InternalFormDSL.g:1417:2: ( ruleInput )
            // InternalFormDSL.g:1418:3: ruleInput
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
    // InternalFormDSL.g:1427:1: rule__Input__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Input__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1431:1: ( ( ruleType ) )
            // InternalFormDSL.g:1432:2: ( ruleType )
            {
            // InternalFormDSL.g:1432:2: ( ruleType )
            // InternalFormDSL.g:1433:3: ruleType
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
    // InternalFormDSL.g:1442:1: rule__Input__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1446:1: ( ( ruleName ) )
            // InternalFormDSL.g:1447:2: ( ruleName )
            {
            // InternalFormDSL.g:1447:2: ( ruleName )
            // InternalFormDSL.g:1448:3: ruleName
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
    // InternalFormDSL.g:1457:1: rule__Input__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Input__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1461:1: ( ( ruleExpression ) )
            // InternalFormDSL.g:1462:2: ( ruleExpression )
            {
            // InternalFormDSL.g:1462:2: ( ruleExpression )
            // InternalFormDSL.g:1463:3: ruleExpression
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
    // InternalFormDSL.g:1472:1: rule__Type__TextAssignment_0_1 : ( ( 'shortText' ) ) ;
    public final void rule__Type__TextAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1476:1: ( ( ( 'shortText' ) ) )
            // InternalFormDSL.g:1477:2: ( ( 'shortText' ) )
            {
            // InternalFormDSL.g:1477:2: ( ( 'shortText' ) )
            // InternalFormDSL.g:1478:3: ( 'shortText' )
            {
             before(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_1_0()); 
            // InternalFormDSL.g:1479:3: ( 'shortText' )
            // InternalFormDSL.g:1480:4: 'shortText'
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
    // InternalFormDSL.g:1491:1: rule__Type__TextAssignment_1_1 : ( ( 'date' ) ) ;
    public final void rule__Type__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1495:1: ( ( ( 'date' ) ) )
            // InternalFormDSL.g:1496:2: ( ( 'date' ) )
            {
            // InternalFormDSL.g:1496:2: ( ( 'date' ) )
            // InternalFormDSL.g:1497:3: ( 'date' )
            {
             before(grammarAccess.getTypeAccess().getTextDateKeyword_1_1_0()); 
            // InternalFormDSL.g:1498:3: ( 'date' )
            // InternalFormDSL.g:1499:4: 'date'
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
    // InternalFormDSL.g:1510:1: rule__Type__TextAssignment_2_1 : ( ( 'number' ) ) ;
    public final void rule__Type__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1514:1: ( ( ( 'number' ) ) )
            // InternalFormDSL.g:1515:2: ( ( 'number' ) )
            {
            // InternalFormDSL.g:1515:2: ( ( 'number' ) )
            // InternalFormDSL.g:1516:3: ( 'number' )
            {
             before(grammarAccess.getTypeAccess().getTextNumberKeyword_2_1_0()); 
            // InternalFormDSL.g:1517:3: ( 'number' )
            // InternalFormDSL.g:1518:4: 'number'
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
    // InternalFormDSL.g:1529:1: rule__Type__TextAssignment_3_1 : ( ( 'email' ) ) ;
    public final void rule__Type__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1533:1: ( ( ( 'email' ) ) )
            // InternalFormDSL.g:1534:2: ( ( 'email' ) )
            {
            // InternalFormDSL.g:1534:2: ( ( 'email' ) )
            // InternalFormDSL.g:1535:3: ( 'email' )
            {
             before(grammarAccess.getTypeAccess().getTextEmailKeyword_3_1_0()); 
            // InternalFormDSL.g:1536:3: ( 'email' )
            // InternalFormDSL.g:1537:4: 'email'
            {
             before(grammarAccess.getTypeAccess().getTextEmailKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextEmailKeyword_3_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextEmailKeyword_3_1_0()); 

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
    // InternalFormDSL.g:1548:1: rule__Type__TextAssignment_4_1 : ( ( 'longText' ) ) ;
    public final void rule__Type__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1552:1: ( ( ( 'longText' ) ) )
            // InternalFormDSL.g:1553:2: ( ( 'longText' ) )
            {
            // InternalFormDSL.g:1553:2: ( ( 'longText' ) )
            // InternalFormDSL.g:1554:3: ( 'longText' )
            {
             before(grammarAccess.getTypeAccess().getTextLongTextKeyword_4_1_0()); 
            // InternalFormDSL.g:1555:3: ( 'longText' )
            // InternalFormDSL.g:1556:4: 'longText'
            {
             before(grammarAccess.getTypeAccess().getTextLongTextKeyword_4_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextLongTextKeyword_4_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextLongTextKeyword_4_1_0()); 

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


    // $ANTLR start "rule__Name__TextAssignment"
    // InternalFormDSL.g:1567:1: rule__Name__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Name__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1571:1: ( ( RULE_STRING ) )
            // InternalFormDSL.g:1572:2: ( RULE_STRING )
            {
            // InternalFormDSL.g:1572:2: ( RULE_STRING )
            // InternalFormDSL.g:1573:3: RULE_STRING
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
    // InternalFormDSL.g:1582:1: rule__Expression__TextAssignment_0_1 : ( ( 'optional' ) ) ;
    public final void rule__Expression__TextAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1586:1: ( ( ( 'optional' ) ) )
            // InternalFormDSL.g:1587:2: ( ( 'optional' ) )
            {
            // InternalFormDSL.g:1587:2: ( ( 'optional' ) )
            // InternalFormDSL.g:1588:3: ( 'optional' )
            {
             before(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_1_0()); 
            // InternalFormDSL.g:1589:3: ( 'optional' )
            // InternalFormDSL.g:1590:4: 'optional'
            {
             before(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFormDSL.g:1601:1: rule__Expression__TextAssignment_1_1 : ( ( 'focus' ) ) ;
    public final void rule__Expression__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1605:1: ( ( ( 'focus' ) ) )
            // InternalFormDSL.g:1606:2: ( ( 'focus' ) )
            {
            // InternalFormDSL.g:1606:2: ( ( 'focus' ) )
            // InternalFormDSL.g:1607:3: ( 'focus' )
            {
             before(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_1_0()); 
            // InternalFormDSL.g:1608:3: ( 'focus' )
            // InternalFormDSL.g:1609:4: 'focus'
            {
             before(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFormDSL.g:1620:1: rule__Exp__TextAssignment_0_0_1 : ( ( 'is' ) ) ;
    public final void rule__Exp__TextAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1624:1: ( ( ( 'is' ) ) )
            // InternalFormDSL.g:1625:2: ( ( 'is' ) )
            {
            // InternalFormDSL.g:1625:2: ( ( 'is' ) )
            // InternalFormDSL.g:1626:3: ( 'is' )
            {
             before(grammarAccess.getExpAccess().getTextIsKeyword_0_0_1_0()); 
            // InternalFormDSL.g:1627:3: ( 'is' )
            // InternalFormDSL.g:1628:4: 'is'
            {
             before(grammarAccess.getExpAccess().getTextIsKeyword_0_0_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFormDSL.g:1639:1: rule__Exp__TextAssignment_0_1_1 : ( ( 'length' ) ) ;
    public final void rule__Exp__TextAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1643:1: ( ( ( 'length' ) ) )
            // InternalFormDSL.g:1644:2: ( ( 'length' ) )
            {
            // InternalFormDSL.g:1644:2: ( ( 'length' ) )
            // InternalFormDSL.g:1645:3: ( 'length' )
            {
             before(grammarAccess.getExpAccess().getTextLengthKeyword_0_1_1_0()); 
            // InternalFormDSL.g:1646:3: ( 'length' )
            // InternalFormDSL.g:1647:4: 'length'
            {
             before(grammarAccess.getExpAccess().getTextLengthKeyword_0_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFormDSL.g:1658:1: rule__Exp__CompAssignment_1 : ( ruleComparison ) ;
    public final void rule__Exp__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1662:1: ( ( ruleComparison ) )
            // InternalFormDSL.g:1663:2: ( ruleComparison )
            {
            // InternalFormDSL.g:1663:2: ( ruleComparison )
            // InternalFormDSL.g:1664:3: ruleComparison
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
    // InternalFormDSL.g:1673:1: rule__Exp__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Exp__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:1677:1: ( ( RULE_INT ) )
            // InternalFormDSL.g:1678:2: ( RULE_INT )
            {
            // InternalFormDSL.g:1678:2: ( RULE_INT )
            // InternalFormDSL.g:1679:3: RULE_INT
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007C0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});

}