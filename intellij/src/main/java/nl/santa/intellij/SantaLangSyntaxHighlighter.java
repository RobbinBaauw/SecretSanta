package nl.santa.intellij;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import nl.santa.grammar.SantaLangLexer;
import nl.santa.grammar.SantaLangParser;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * A highlighter is really just a mapping from token type to
 * some text attributes using {@link #getTokenHighlights(IElementType)}.
 * The reason that it returns an array, TextAttributesKey[], is
 * that you might want to mix the attributes of a few known highlighters.
 * A {@link TextAttributesKey} is just a name for that a theme
 * or IDE skin can set. For example, {@link com.intellij.openapi.editor.DefaultLanguageHighlighterColors#KEYWORD}
 * is the key that maps to what identifiers look like in the editor.
 * To change it, see dialog: Editor > Colors & Fonts > Language Defaults.
 * <p>
 * From <a href="http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support/syntax_highlighting_and_error_highlighting.html">doc</a>:
 * "The mapping of the TextAttributesKey to specific attributes used
 * in an editor is defined by the EditorColorsScheme class, and can
 * be configured by the user if the plugin provides an appropriate
 * configuration interface.
 * ...
 * The syntax highlighter returns the {@link TextAttributesKey}
 * instances for each token type which needs special highlighting.
 * For highlighting lexer errors, the standard TextAttributesKey
 * for bad characters HighlighterColors.BAD_CHARACTER can be used."
 */
public class SantaLangSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    public static final TextAttributesKey ID = createTextAttributesKey("SANTA_LANG_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("SANTA_LANG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING = createTextAttributesKey("SANTA_LANG_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("SANTA_LANG_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey OPERATION = createTextAttributesKey("SANTA_LANG_OPERATION", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("SANTA_LANG_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey DOT = createTextAttributesKey("SANTA_LANG_LINE_DOT", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey SEMICOLON = createTextAttributesKey("SANTA_LANG_LINE_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey BRACES = createTextAttributesKey("SANTA_LANG_LINE_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BRACKETS = createTextAttributesKey("SANTA_LANG_LINE_BRACES", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey PARENTHESES = createTextAttributesKey("SANTA_LANG_LINE_BRACES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey COMMA = createTextAttributesKey("SANTA_LANG_LINE_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey CONST = createTextAttributesKey("SANTA_LANG_LINE_CONST", DefaultLanguageHighlighterColors.CONSTANT);

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(SantaLangLanguage.INSTANCE,
                SantaLangParser.tokenNames,
                SantaLangParser.ruleNames);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        SantaLangLexer lexer = new SantaLangLexer(null);
        return new ANTLRLexerAdaptor(SantaLangLanguage.INSTANCE, lexer);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (!(tokenType instanceof TokenIElementType)) return EMPTY_KEYS;
        TokenIElementType myType = (TokenIElementType) tokenType;
        int ttype = myType.getANTLRTokenType();
        TextAttributesKey attrKey;
        switch (ttype) {
            case SantaLangLexer.While:
            case SantaLangLexer.If:
            case SantaLangLexer.Else:
            case SantaLangLexer.Return:
            case SantaLangLexer.For:
            case SantaLangLexer.Function:
            case SantaLangLexer.Case:
            case SantaLangLexer.Try:
            case SantaLangLexer.Catch:
            case SantaLangLexer.TrueLiteral:
            case SantaLangLexer.FalseLiteral:
            case SantaLangLexer.With:
            case SantaLangLexer.Switch:
            case SantaLangLexer.Async:
            case SantaLangLexer.Default:
            case SantaLangLexer.Finally:
            case SantaLangLexer.Await:
            case SantaLangLexer.Break:
            case SantaLangLexer.Throw:
            case SantaLangLexer.New:
            case SantaLangLexer.Continue:
            case SantaLangLexer.Const:
                attrKey = KEYWORD;
                break;
            case SantaLangLexer.StringLiteral:
                attrKey = STRING;
                break;
            case SantaLangLexer.DecimalLiteral:
            case SantaLangLexer.HexIntegerLiteral:
            case SantaLangLexer.OctalIntegerLiteral:
            case SantaLangLexer.OctalIntegerLiteral2:
            case SantaLangLexer.BinaryIntegerLiteral:
            case SantaLangLexer.BigHexIntegerLiteral:
            case SantaLangLexer.BigOctalIntegerLiteral:
            case SantaLangLexer.BigBinaryIntegerLiteral:
            case SantaLangLexer.BigDecimalIntegerLiteral:
                attrKey = NUMBER;
                break;
            case SantaLangLexer.Identifier:
                attrKey = ID;
                break;
            case SantaLangLexer.Dot:
                attrKey = DOT;
                break;
            case SantaLangLexer.SemiColon:
                attrKey = SEMICOLON;
                break;
            case SantaLangLexer.CloseBrace:
            case SantaLangLexer.OpenBrace:
                attrKey = BRACES;
                break;
            case SantaLangLexer.CloseBracket:
            case SantaLangLexer.OpenBracket:
                attrKey = BRACKETS;
                break;
            case SantaLangLexer.CloseParen:
            case SantaLangLexer.OpenParen:
                attrKey = PARENTHESES;
                break;
            case SantaLangLexer.Comma:
                attrKey = COMMA;
                break;
            case SantaLangLexer.Assign:
            case SantaLangLexer.Divide:
            case SantaLangLexer.Multiply:
            case SantaLangLexer.Minus:
            case SantaLangLexer.Plus:
                attrKey = OPERATION;
                break;
            case SantaLangLexer.Comment:
                attrKey = LINE_COMMENT;
                break;
            default:
                return EMPTY_KEYS;
        }
        return new TextAttributesKey[]{attrKey};
    }
}
