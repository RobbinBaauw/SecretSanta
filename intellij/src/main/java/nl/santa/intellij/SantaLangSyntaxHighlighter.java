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

/** A highlighter is really just a mapping from token type to
 *  some text attributes using {@link #getTokenHighlights(IElementType)}.
 *  The reason that it returns an array, TextAttributesKey[], is
 *  that you might want to mix the attributes of a few known highlighters.
 *  A {@link TextAttributesKey} is just a name for that a theme
 *  or IDE skin can set. For example, {@link com.intellij.openapi.editor.DefaultLanguageHighlighterColors#KEYWORD}
 *  is the key that maps to what identifiers look like in the editor.
 *  To change it, see dialog: Editor > Colors & Fonts > Language Defaults.
 *
 *  From <a href="http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support/syntax_highlighting_and_error_highlighting.html">doc</a>:
 *  "The mapping of the TextAttributesKey to specific attributes used
 *  in an editor is defined by the EditorColorsScheme class, and can
 *  be configured by the user if the plugin provides an appropriate
 *  configuration interface.
 *  ...
 *  The syntax highlighter returns the {@link TextAttributesKey}
 * instances for each token type which needs special highlighting.
 * For highlighting lexer errors, the standard TextAttributesKey
 * for bad characters HighlighterColors.BAD_CHARACTER can be used."
 */
public class SantaLangSyntaxHighlighter extends SyntaxHighlighterBase {
	private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
	public static final TextAttributesKey ID =
		createTextAttributesKey("SANTA_LANG_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
	public static final TextAttributesKey KEYWORD =
		createTextAttributesKey("SANTA_LANG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey STRING =
		createTextAttributesKey("SANTA_LANG_STRING", DefaultLanguageHighlighterColors.STRING);
	public static final TextAttributesKey LINE_COMMENT =
		createTextAttributesKey("SANTA_LANG_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey BLOCK_COMMENT =
		createTextAttributesKey("SANTA_LANG_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

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
		if ( !(tokenType instanceof TokenIElementType) ) return EMPTY_KEYS;
		TokenIElementType myType = (TokenIElementType)tokenType;
		int ttype = myType.getANTLRTokenType();
		TextAttributesKey attrKey;
		switch ( ttype ) {
			case SantaLangLexer.Var :
			case SantaLangLexer.While :
			case SantaLangLexer.If :
			case SantaLangLexer.Else :
			case SantaLangLexer.Return :
			case SantaLangLexer.For :
			case SantaLangLexer.Function :
			case SantaLangLexer.Case :
			case SantaLangLexer.Try :
			case SantaLangLexer.Catch :
			case SantaLangLexer.Export :
			case SantaLangLexer.Yield :
			case SantaLangLexer.BooleanLiteral :
				attrKey = KEYWORD;
				break;
			case SantaLangLexer.StringLiteral :
			case SantaLangLexer.TemplateStringLiteral :
				attrKey = STRING;
				break;
			case SantaLangLexer.SingleLineComment :
				attrKey = LINE_COMMENT;
				break;
			case SantaLangLexer.CDataComment :
			case SantaLangLexer.HtmlComment :
			case SantaLangLexer.MultiLineComment :
				attrKey = BLOCK_COMMENT;
				break;
			default :
				return EMPTY_KEYS;
		}
		return new TextAttributesKey[] {attrKey};
	}
}
