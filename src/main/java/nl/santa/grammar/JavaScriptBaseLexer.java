package nl.santa.grammar;

import org.antlr.v4.runtime.*;

import java.util.Stack;

/**
 * All lexer methods that used in grammar (IsStrictMode)
 * should start with Upper Case Char similar to Lexer rules.
 */
public abstract class JavaScriptBaseLexer extends Lexer
{
    /**
     * Stores values of nested modes. By default mode is strict or
     * defined externally (useStrictDefault)
     */
    private Stack<Boolean> scopeStrictModes = new Stack<Boolean>();

    private Token lastToken = null;
    /**
     * Default value of strict mode
     * Can be defined externally by setUseStrictDefault
     */
    private boolean useStrictDefault = false;
    /**
     * Current value of strict mode
     * Can be defined during parsing, see StringFunctions.js and StringGlobal.js samples
     */
    private boolean useStrictCurrent = false;

    public JavaScriptBaseLexer(CharStream input) {
        super(input);
    }

    public boolean IsStartOfFile() {
        return lastToken == null;
    }

    public boolean getStrictDefault() {
        return useStrictDefault;
    }

    public void setUseStrictDefault(boolean value) {
        useStrictDefault = value;
        useStrictCurrent = value;
    }

    public boolean IsStrictMode() {
        return useStrictCurrent;
    }

    /**
     * Return the next token from the character stream and records this last
     * token in case it resides on the default channel. This recorded token
     * is used to determine when the lexer could possibly match a regex
     * literal. Also changes scopeStrictModes stack if tokenize special
     * string 'use strict';
     *
     * @return the next token from the character stream.
     */
    @Override
    public Token nextToken() {
        Token next = super.nextToken();

        if (next.getChannel() == Token.DEFAULT_CHANNEL) {
            // Keep track of the last token on the default channel.
            this.lastToken = next;
        }

        return next;
    }

    protected void ProcessOpenBrace()
    {
        useStrictCurrent = scopeStrictModes.size() > 0 && scopeStrictModes.peek() ? true : useStrictDefault;
        scopeStrictModes.push(useStrictCurrent);
    }

    protected void ProcessCloseBrace()
    {
        useStrictCurrent = scopeStrictModes.size() > 0 ? scopeStrictModes.pop() : useStrictDefault;
    }

    protected void ProcessStringLiteral()
    {
        if (lastToken == null || lastToken.getType() == JavaScriptLexer.OpenBrace)
        {
            String text = getText();
            if (text.equals("\"use strict\"") || text.equals("'use strict'"))
            {
                if (scopeStrictModes.size() > 0)
                    scopeStrictModes.pop();
                useStrictCurrent = true;
                scopeStrictModes.push(useStrictCurrent);
            }
        }
    }

    /**
     * Returns {@code true} if the lexer can match a regex literal.
     */
    protected boolean IsRegexPossible() {

        if (this.lastToken == null) {
            // No token has been produced yet: at the start of the input,
            // no division is possible, so a regex literal _is_ possible.
            return true;
        }

        switch (this.lastToken.getType()) {
            case JavaScriptLexer.Identifier:
            case JavaScriptLexer.NullLiteral:
            case JavaScriptLexer.BooleanLiteral:
            case JavaScriptLexer.This:
            case JavaScriptLexer.CloseBracket:
            case JavaScriptLexer.CloseParen:
            case JavaScriptLexer.OctalIntegerLiteral:
            case JavaScriptLexer.DecimalLiteral:
            case JavaScriptLexer.HexIntegerLiteral:
            case JavaScriptLexer.StringLiteral:
            case JavaScriptLexer.PlusPlus:
            case JavaScriptLexer.MinusMinus:
                // After any of the tokens above, no regex literal can follow.
                return false;
            default:
                // In all other cases, a regex literal _is_ possible.
                return true;
        }
    }
}
