// Generated from src/main/java/nl/santa/grammar/SantaLangParser.g4 by ANTLR 4.7.1

    package nl.santa.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SantaLangParser extends SantaLangBaseParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IllegalKeyword=1, TransformedKeyword=2, OrigNullLiteral=3, OrigTrueLiteral=4, 
		OrigFalseLiteral=5, OrigPlusLiteral=6, OrigMinusLiteral=7, OrigMultiplyLiteral=8, 
		OrigDivideLiteral=9, OrigConst=10, OrigAssign=11, OrigBreak=12, OrigContinue=13, 
		DeletedKeyword=14, HashBangLine=15, MultiLineComment=16, SingleLineComment=17, 
		Var=18, Void=19, Class=20, Enum=21, Extends=22, Super=23, Export=24, Import=25, 
		Implements=26, Let=27, Private=28, Public=29, Interface=30, Package=31, 
		Protected=32, Static=33, Yield=34, As=35, From=36, TemplateStringLiteral=37, 
		HtmlComment=38, CDataComment=39, RegularExpressionLiteral=40, Comment=41, 
		OpenBracket=42, CloseBracket=43, OpenParen=44, CloseParen=45, OpenBrace=46, 
		CloseBrace=47, SemiColon=48, Comma=49, Assign=50, QuestionMark=51, Colon=52, 
		Ellipsis=53, Dot=54, PlusPlus=55, MinusMinus=56, Plus=57, Minus=58, BitNot=59, 
		Not=60, Multiply=61, Divide=62, Modulus=63, Power=64, NullCoalesce=65, 
		Hashtag=66, RightShiftArithmetic=67, LeftShiftArithmetic=68, RightShiftLogical=69, 
		LessThan=70, MoreThan=71, LessThanEquals=72, GreaterThanEquals=73, Equals_=74, 
		NotEquals=75, IdentityEquals=76, IdentityNotEquals=77, BitAnd=78, BitXOr=79, 
		BitOr=80, And=81, Or=82, MultiplyAssign=83, DivideAssign=84, ModulusAssign=85, 
		PlusAssign=86, MinusAssign=87, LeftShiftArithmeticAssign=88, RightShiftArithmeticAssign=89, 
		RightShiftLogicalAssign=90, BitAndAssign=91, BitXorAssign=92, BitOrAssign=93, 
		PowerAssign=94, ARROW=95, NullLiteral=96, TrueLiteral=97, FalseLiteral=98, 
		DecimalLiteral=99, HexIntegerLiteral=100, OctalIntegerLiteral=101, OctalIntegerLiteral2=102, 
		BinaryIntegerLiteral=103, BigHexIntegerLiteral=104, BigOctalIntegerLiteral=105, 
		BigBinaryIntegerLiteral=106, BigDecimalIntegerLiteral=107, Break=108, 
		Do=109, Instanceof=110, Typeof=111, Case=112, Else=113, New=114, Catch=115, 
		Finally=116, Return=117, Continue=118, For=119, Switch=120, While=121, 
		Debugger=122, Function=123, This=124, With=125, Default=126, If=127, Throw=128, 
		Delete=129, In=130, Try=131, Const=132, Async=133, Await=134, Identifier=135, 
		StringLiteral=136, WhiteSpaces=137, LineTerminator=138, UnexpectedCharacter=139;
	public static final int
		RULE_program = 0, RULE_sourceElement = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_statementList = 4, RULE_declaration = 5, RULE_variableStatement = 6, 
		RULE_variableDeclarationList = 7, RULE_variableDeclaration = 8, RULE_emptyStatement = 9, 
		RULE_expressionStatement = 10, RULE_ifStatement = 11, RULE_iterationStatement = 12, 
		RULE_varModifier = 13, RULE_continueStatement = 14, RULE_breakStatement = 15, 
		RULE_returnStatement = 16, RULE_withStatement = 17, RULE_switchStatement = 18, 
		RULE_caseBlock = 19, RULE_caseClauses = 20, RULE_caseClause = 21, RULE_defaultClause = 22, 
		RULE_labelledStatement = 23, RULE_throwStatement = 24, RULE_tryStatement = 25, 
		RULE_catchProduction = 26, RULE_finallyProduction = 27, RULE_debuggerStatement = 28, 
		RULE_functionDeclaration = 29, RULE_methodDefinition = 30, RULE_formalParameterList = 31, 
		RULE_formalParameterArg = 32, RULE_lastFormalParameterArg = 33, RULE_functionBody = 34, 
		RULE_sourceElements = 35, RULE_arrayLiteral = 36, RULE_elementList = 37, 
		RULE_arrayElement = 38, RULE_objectLiteral = 39, RULE_propertyAssignment = 40, 
		RULE_propertyName = 41, RULE_arguments = 42, RULE_argument = 43, RULE_expressionSequence = 44, 
		RULE_singleExpression = 45, RULE_assignable = 46, RULE_anoymousFunction = 47, 
		RULE_arrowFunctionParameters = 48, RULE_arrowFunctionBody = 49, RULE_assignmentOperator = 50, 
		RULE_literal = 51, RULE_booleanLiteral = 52, RULE_numericLiteral = 53, 
		RULE_bigintLiteral = 54, RULE_identifierName = 55, RULE_reservedWord = 56, 
		RULE_keyword = 57, RULE_getter = 58, RULE_setter = 59, RULE_eos = 60;
	public static final String[] ruleNames = {
		"program", "sourceElement", "statement", "block", "statementList", "declaration", 
		"variableStatement", "variableDeclarationList", "variableDeclaration", 
		"emptyStatement", "expressionStatement", "ifStatement", "iterationStatement", 
		"varModifier", "continueStatement", "breakStatement", "returnStatement", 
		"withStatement", "switchStatement", "caseBlock", "caseClauses", "caseClause", 
		"defaultClause", "labelledStatement", "throwStatement", "tryStatement", 
		"catchProduction", "finallyProduction", "debuggerStatement", "functionDeclaration", 
		"methodDefinition", "formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
		"functionBody", "sourceElements", "arrayLiteral", "elementList", "arrayElement", 
		"objectLiteral", "propertyAssignment", "propertyName", "arguments", "argument", 
		"expressionSequence", "singleExpression", "assignable", "anoymousFunction", 
		"arrowFunctionParameters", "arrowFunctionBody", "assignmentOperator", 
		"literal", "booleanLiteral", "numericLiteral", "bigintLiteral", "identifierName", 
		"reservedWord", "keyword", "getter", "setter", "eos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'null'", "'true'", "'false'", "'+'", "'-'", "'*'", 
		"'/'", "'const'", "'='", "'break'", "'continue'", null, null, null, null, 
		"'var'", "'void'", "'class'", "'enum'", "'extends'", "'super'", "'export'", 
		"'import'", "'implements'", "'let'", "'private'", "'public'", "'interface'", 
		"'package'", "'protected'", "'static'", "'yield'", "'as'", "'from'", null, 
		null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", 
		"','", "'is'", "'?'", "':'", "'...'", "'.'", "'++'", "'--'", "'keer'", 
		"'deel'", "'~'", "'!'", "'plus'", "'min'", "'%'", "'**'", "'??'", "'#'", 
		"'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
		"'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", 
		"'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", 
		"'**='", "'=>'", "'niks'", "'onwaar'", "'waar'", null, null, null, null, 
		null, null, null, null, null, "'hohoho'", "'do'", "'instanceof'", "'typeof'", 
		"'case'", "'else'", "'new'", "'catch'", "'finally'", "'return'", "'vlieg'", 
		"'for'", "'switch'", "'while'", "'debugger'", "'function'", "'this'", 
		"'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", "'try'", 
		"'stille'", "'async'", "'await'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IllegalKeyword", "TransformedKeyword", "OrigNullLiteral", "OrigTrueLiteral", 
		"OrigFalseLiteral", "OrigPlusLiteral", "OrigMinusLiteral", "OrigMultiplyLiteral", 
		"OrigDivideLiteral", "OrigConst", "OrigAssign", "OrigBreak", "OrigContinue", 
		"DeletedKeyword", "HashBangLine", "MultiLineComment", "SingleLineComment", 
		"Var", "Void", "Class", "Enum", "Extends", "Super", "Export", "Import", 
		"Implements", "Let", "Private", "Public", "Interface", "Package", "Protected", 
		"Static", "Yield", "As", "From", "TemplateStringLiteral", "HtmlComment", 
		"CDataComment", "RegularExpressionLiteral", "Comment", "OpenBracket", 
		"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
		"SemiColon", "Comma", "Assign", "QuestionMark", "Colon", "Ellipsis", "Dot", 
		"PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
		"Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", "RightShiftArithmetic", 
		"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", 
		"GreaterThanEquals", "Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
		"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
		"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
		"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
		"BitXorAssign", "BitOrAssign", "PowerAssign", "ARROW", "NullLiteral", 
		"TrueLiteral", "FalseLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral", 
		"BigHexIntegerLiteral", "BigOctalIntegerLiteral", "BigBinaryIntegerLiteral", 
		"BigDecimalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case", 
		"Else", "New", "Catch", "Finally", "Return", "Continue", "For", "Switch", 
		"While", "Debugger", "Function", "This", "With", "Default", "If", "Throw", 
		"Delete", "In", "Try", "Const", "Async", "Await", "Identifier", "StringLiteral", 
		"WhiteSpaces", "LineTerminator", "UnexpectedCharacter"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SantaLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SantaLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SantaLangParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(122);
				sourceElements();
				}
				break;
			}
			setState(125);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitSourceElement(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				emptyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				iterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(137);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				withStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(139);
				labelledStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(140);
				switchStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(141);
				throwStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(142);
				tryStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(143);
				debuggerStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(144);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(OpenBrace);
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(148);
				statementList();
				}
				break;
			}
			setState(151);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				variableStatement();
				}
				break;
			case Function:
			case Async:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				functionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			varModifier();
			setState(163);
			variableDeclarationList();
			setState(164);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			variableDeclaration();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					match(Comma);
					setState(168);
					variableDeclaration();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			assignable();
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(175);
				match(Assign);
				setState(176);
				singleExpression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(SantaLangParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			if (!(this.notOpenBraceAndNotFunction())) throw new FailedPredicateException(this, "this.notOpenBraceAndNotFunction()");
			setState(182);
			expressionSequence();
			setState(183);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SantaLangParser.If, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SantaLangParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(If);
			setState(186);
			match(OpenParen);
			setState(187);
			expressionSequence();
			setState(188);
			match(CloseParen);
			setState(189);
			statement();
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(190);
				match(Else);
				setState(191);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(SantaLangParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(SantaLangParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitDoStatement(this);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(SantaLangParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitWhileStatement(this);
		}
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SantaLangParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitForStatement(this);
		}
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SantaLangParser.For, 0); }
		public TerminalNode In() { return getToken(SantaLangParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitForInStatement(this);
		}
	}
	public static class ForOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SantaLangParser.For, 0); }
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public TerminalNode Await() { return getToken(SantaLangParser.Await, 0); }
		public ForOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterForOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitForOfStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iterationStatement);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(Do);
				setState(195);
				statement();
				setState(196);
				match(While);
				setState(197);
				match(OpenParen);
				setState(198);
				expressionSequence();
				setState(199);
				match(CloseParen);
				setState(200);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(While);
				setState(203);
				match(OpenParen);
				setState(204);
				expressionSequence();
				setState(205);
				match(CloseParen);
				setState(206);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(For);
				setState(209);
				match(OpenParen);
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case PlusPlus:
				case MinusMinus:
				case Plus:
				case Minus:
				case BitNot:
				case Not:
				case NullLiteral:
				case TrueLiteral:
				case FalseLiteral:
				case DecimalLiteral:
				case HexIntegerLiteral:
				case OctalIntegerLiteral:
				case OctalIntegerLiteral2:
				case BinaryIntegerLiteral:
				case BigHexIntegerLiteral:
				case BigOctalIntegerLiteral:
				case BigBinaryIntegerLiteral:
				case BigDecimalIntegerLiteral:
				case Typeof:
				case New:
				case Function:
				case This:
				case Delete:
				case Async:
				case Await:
				case Identifier:
				case StringLiteral:
					{
					setState(210);
					expressionSequence();
					}
					break;
				case Const:
					{
					setState(211);
					variableStatement();
					}
					break;
				case SemiColon:
					break;
				default:
					break;
				}
				setState(214);
				match(SemiColon);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NullLiteral - 96)) | (1L << (TrueLiteral - 96)) | (1L << (FalseLiteral - 96)) | (1L << (DecimalLiteral - 96)) | (1L << (HexIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral2 - 96)) | (1L << (BinaryIntegerLiteral - 96)) | (1L << (BigHexIntegerLiteral - 96)) | (1L << (BigOctalIntegerLiteral - 96)) | (1L << (BigBinaryIntegerLiteral - 96)) | (1L << (BigDecimalIntegerLiteral - 96)) | (1L << (Typeof - 96)) | (1L << (New - 96)) | (1L << (Function - 96)) | (1L << (This - 96)) | (1L << (Delete - 96)) | (1L << (Async - 96)) | (1L << (Await - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteral - 96)))) != 0)) {
					{
					setState(215);
					expressionSequence();
					}
				}

				setState(218);
				match(SemiColon);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NullLiteral - 96)) | (1L << (TrueLiteral - 96)) | (1L << (FalseLiteral - 96)) | (1L << (DecimalLiteral - 96)) | (1L << (HexIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral2 - 96)) | (1L << (BinaryIntegerLiteral - 96)) | (1L << (BigHexIntegerLiteral - 96)) | (1L << (BigOctalIntegerLiteral - 96)) | (1L << (BigBinaryIntegerLiteral - 96)) | (1L << (BigDecimalIntegerLiteral - 96)) | (1L << (Typeof - 96)) | (1L << (New - 96)) | (1L << (Function - 96)) | (1L << (This - 96)) | (1L << (Delete - 96)) | (1L << (Async - 96)) | (1L << (Await - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteral - 96)))) != 0)) {
					{
					setState(219);
					expressionSequence();
					}
				}

				setState(222);
				match(CloseParen);
				setState(223);
				statement();
				}
				break;
			case 4:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(For);
				setState(225);
				match(OpenParen);
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case PlusPlus:
				case MinusMinus:
				case Plus:
				case Minus:
				case BitNot:
				case Not:
				case NullLiteral:
				case TrueLiteral:
				case FalseLiteral:
				case DecimalLiteral:
				case HexIntegerLiteral:
				case OctalIntegerLiteral:
				case OctalIntegerLiteral2:
				case BinaryIntegerLiteral:
				case BigHexIntegerLiteral:
				case BigOctalIntegerLiteral:
				case BigBinaryIntegerLiteral:
				case BigDecimalIntegerLiteral:
				case Typeof:
				case New:
				case Function:
				case This:
				case Delete:
				case Async:
				case Await:
				case Identifier:
				case StringLiteral:
					{
					setState(226);
					singleExpression(0);
					}
					break;
				case Const:
					{
					setState(227);
					variableStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230);
				match(In);
				setState(231);
				expressionSequence();
				setState(232);
				match(CloseParen);
				setState(233);
				statement();
				}
				break;
			case 5:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(For);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Await) {
					{
					setState(236);
					match(Await);
					}
				}

				setState(239);
				match(OpenParen);
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case PlusPlus:
				case MinusMinus:
				case Plus:
				case Minus:
				case BitNot:
				case Not:
				case NullLiteral:
				case TrueLiteral:
				case FalseLiteral:
				case DecimalLiteral:
				case HexIntegerLiteral:
				case OctalIntegerLiteral:
				case OctalIntegerLiteral2:
				case BinaryIntegerLiteral:
				case BigHexIntegerLiteral:
				case BigOctalIntegerLiteral:
				case BigBinaryIntegerLiteral:
				case BigDecimalIntegerLiteral:
				case Typeof:
				case New:
				case Function:
				case This:
				case Delete:
				case Async:
				case Await:
				case Identifier:
				case StringLiteral:
					{
					setState(240);
					singleExpression(0);
					}
					break;
				case Const:
					{
					setState(241);
					variableStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244);
				match(Identifier);
				setState(245);
				if (!(this.p("of"))) throw new FailedPredicateException(this, "this.p(\"of\")");
				setState(246);
				expressionSequence();
				setState(247);
				match(CloseParen);
				setState(248);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(SantaLangParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitVarModifier(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(Const);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(SantaLangParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(Continue);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(255);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(256);
				match(Identifier);
				}
				break;
			}
			setState(259);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SantaLangParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(Break);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(262);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(263);
				match(Identifier);
				}
				break;
			}
			setState(266);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SantaLangParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(Return);
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(269);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(270);
				expressionSequence();
				}
				break;
			}
			setState(273);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(SantaLangParser.With, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitWithStatement(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(With);
			setState(276);
			match(OpenParen);
			setState(277);
			expressionSequence();
			setState(278);
			match(CloseParen);
			setState(279);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(SantaLangParser.Switch, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Switch);
			setState(282);
			match(OpenParen);
			setState(283);
			expressionSequence();
			setState(284);
			match(CloseParen);
			setState(285);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitCaseBlock(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(OpenBrace);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(288);
				caseClauses();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(291);
				defaultClause();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(292);
					caseClauses();
					}
				}

				}
			}

			setState(297);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitCaseClauses(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				caseClause();
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(SantaLangParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(Case);
			setState(305);
			expressionSequence();
			setState(306);
			match(Colon);
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(307);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(SantaLangParser.Default, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitDefaultClause(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Default);
			setState(311);
			match(Colon);
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(312);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitLabelledStatement(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(Identifier);
			setState(316);
			match(Colon);
			setState(317);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(SantaLangParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(Throw);
			setState(320);
			if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
			setState(321);
			expressionSequence();
			setState(322);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(SantaLangParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(Try);
			setState(325);
			block();
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(326);
				catchProduction();
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(327);
					finallyProduction();
					}
					break;
				}
				}
				break;
			case Finally:
				{
				setState(330);
				finallyProduction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(SantaLangParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitCatchProduction(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_catchProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(Catch);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(334);
				match(OpenParen);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || _la==Identifier) {
					{
					setState(335);
					assignable();
					}
				}

				setState(338);
				match(CloseParen);
				}
			}

			setState(341);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(SantaLangParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitFinallyProduction(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Finally);
			setState(344);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(SantaLangParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterDebuggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitDebuggerStatement(this);
		}
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(Debugger);
			setState(347);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(SantaLangParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(SantaLangParser.Async, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(349);
				match(Async);
				}
			}

			setState(352);
			match(Function);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OrigMultiplyLiteral) {
				{
				setState(353);
				match(OrigMultiplyLiteral);
				}
			}

			setState(356);
			match(Identifier);
			setState(357);
			match(OpenParen);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
				{
				setState(358);
				formalParameterList();
				}
			}

			setState(361);
			match(CloseParen);
			setState(362);
			match(OpenBrace);
			setState(363);
			functionBody();
			setState(364);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitMethodDefinition(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodDefinition);
		int _la;
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OrigMultiplyLiteral) {
					{
					setState(366);
					match(OrigMultiplyLiteral);
					}
				}

				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hashtag) {
					{
					setState(369);
					match(Hashtag);
					}
				}

				setState(372);
				propertyName();
				setState(373);
				match(OpenParen);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(374);
					formalParameterList();
					}
				}

				setState(377);
				match(CloseParen);
				setState(378);
				match(OpenBrace);
				setState(379);
				functionBody();
				setState(380);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OrigMultiplyLiteral) {
					{
					setState(382);
					match(OrigMultiplyLiteral);
					}
				}

				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hashtag) {
					{
					setState(385);
					match(Hashtag);
					}
				}

				setState(388);
				getter();
				setState(389);
				match(OpenParen);
				setState(390);
				match(CloseParen);
				setState(391);
				match(OpenBrace);
				setState(392);
				functionBody();
				setState(393);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OrigMultiplyLiteral) {
					{
					setState(395);
					match(OrigMultiplyLiteral);
					}
				}

				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hashtag) {
					{
					setState(398);
					match(Hashtag);
					}
				}

				setState(401);
				setter();
				setState(402);
				match(OpenParen);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(403);
					formalParameterList();
					}
				}

				setState(406);
				match(CloseParen);
				setState(407);
				match(OpenBrace);
				setState(408);
				functionBody();
				setState(409);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				formalParameterArg();
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(414);
						match(Comma);
						setState(415);
						formalParameterArg();
						}
						} 
					}
					setState(420);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(421);
					match(Comma);
					setState(422);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				lastFormalParameterArg();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterArgContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitFormalParameterArg(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			assignable();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(429);
				match(Assign);
				setState(430);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(SantaLangParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterLastFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitLastFormalParameterArg(this);
		}
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(Ellipsis);
			setState(434);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(436);
				sourceElements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitSourceElements(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sourceElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(439);
					sourceElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(442); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(444);
			match(OpenBracket);
			setState(445);
			elementList();
			setState(446);
			match(CloseBracket);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					match(Comma);
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NullLiteral - 96)) | (1L << (TrueLiteral - 96)) | (1L << (FalseLiteral - 96)) | (1L << (DecimalLiteral - 96)) | (1L << (HexIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral2 - 96)) | (1L << (BinaryIntegerLiteral - 96)) | (1L << (BigHexIntegerLiteral - 96)) | (1L << (BigOctalIntegerLiteral - 96)) | (1L << (BigBinaryIntegerLiteral - 96)) | (1L << (BigDecimalIntegerLiteral - 96)) | (1L << (Typeof - 96)) | (1L << (New - 96)) | (1L << (Function - 96)) | (1L << (This - 96)) | (1L << (Delete - 96)) | (1L << (Async - 96)) | (1L << (Await - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteral - 96)))) != 0)) {
				{
				setState(454);
				arrayElement();
				}
			}

			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(457);
						match(Comma);
						}
						}
						setState(460); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(462);
					arrayElement();
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(468);
				match(Comma);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(SantaLangParser.Ellipsis, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArrayElement(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(474);
				match(Ellipsis);
				}
			}

			setState(477);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(OpenBrace);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OrigMultiplyLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NullLiteral - 96)) | (1L << (TrueLiteral - 96)) | (1L << (FalseLiteral - 96)) | (1L << (DecimalLiteral - 96)) | (1L << (HexIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral2 - 96)) | (1L << (BinaryIntegerLiteral - 96)) | (1L << (BigHexIntegerLiteral - 96)) | (1L << (BigOctalIntegerLiteral - 96)) | (1L << (BigBinaryIntegerLiteral - 96)) | (1L << (BigDecimalIntegerLiteral - 96)) | (1L << (Break - 96)) | (1L << (Do - 96)) | (1L << (Instanceof - 96)) | (1L << (Typeof - 96)) | (1L << (Case - 96)) | (1L << (Else - 96)) | (1L << (New - 96)) | (1L << (Catch - 96)) | (1L << (Finally - 96)) | (1L << (Return - 96)) | (1L << (Continue - 96)) | (1L << (For - 96)) | (1L << (Switch - 96)) | (1L << (While - 96)) | (1L << (Debugger - 96)) | (1L << (Function - 96)) | (1L << (This - 96)) | (1L << (With - 96)) | (1L << (If - 96)) | (1L << (Throw - 96)) | (1L << (Delete - 96)) | (1L << (In - 96)) | (1L << (Try - 96)) | (1L << (Const - 96)) | (1L << (Async - 96)) | (1L << (Await - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteral - 96)))) != 0)) {
				{
				setState(480);
				propertyAssignment();
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(481);
						match(Comma);
						setState(482);
						propertyAssignment();
						}
						} 
					}
					setState(487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				}
			}

			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(490);
				match(Comma);
				}
			}

			setState(493);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPropertyExpressionAssignment(this);
		}
	}
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterComputedPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitComputedPropertyExpressionAssignment(this);
		}
	}
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(SantaLangParser.Ellipsis, 0); }
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPropertyShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPropertyShorthand(this);
		}
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public FormalParameterArgContext formalParameterArg() {
			return getRuleContext(FormalParameterArgContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPropertySetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPropertySetter(this);
		}
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPropertyGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPropertyGetter(this);
		}
	}
	public static class FunctionPropertyContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(SantaLangParser.Async, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterFunctionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitFunctionProperty(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_propertyAssignment);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				propertyName();
				setState(496);
				match(Colon);
				setState(497);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(OpenBracket);
				setState(500);
				singleExpression(0);
				setState(501);
				match(CloseBracket);
				setState(502);
				match(Colon);
				setState(503);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(505);
					match(Async);
					}
					break;
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OrigMultiplyLiteral) {
					{
					setState(508);
					match(OrigMultiplyLiteral);
					}
				}

				setState(511);
				propertyName();
				setState(512);
				match(OpenParen);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(513);
					formalParameterList();
					}
				}

				setState(516);
				match(CloseParen);
				setState(517);
				match(OpenBrace);
				setState(518);
				functionBody();
				setState(519);
				match(CloseBrace);
				}
				break;
			case 4:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				getter();
				setState(522);
				match(OpenParen);
				setState(523);
				match(CloseParen);
				setState(524);
				match(OpenBrace);
				setState(525);
				functionBody();
				setState(526);
				match(CloseBrace);
				}
				break;
			case 5:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				setter();
				setState(529);
				match(OpenParen);
				setState(530);
				formalParameterArg();
				setState(531);
				match(CloseParen);
				setState(532);
				match(OpenBrace);
				setState(533);
				functionBody();
				setState(534);
				match(CloseBrace);
				}
				break;
			case 6:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(536);
					match(Ellipsis);
					}
				}

				setState(539);
				singleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SantaLangParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_propertyName);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case TrueLiteral:
			case FalseLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Catch:
			case Finally:
			case Return:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Const:
			case Async:
			case Await:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				numericLiteral();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				match(OpenBracket);
				setState(546);
				singleExpression(0);
				setState(547);
				match(CloseBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(OpenParen);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NullLiteral - 96)) | (1L << (TrueLiteral - 96)) | (1L << (FalseLiteral - 96)) | (1L << (DecimalLiteral - 96)) | (1L << (HexIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral - 96)) | (1L << (OctalIntegerLiteral2 - 96)) | (1L << (BinaryIntegerLiteral - 96)) | (1L << (BigHexIntegerLiteral - 96)) | (1L << (BigOctalIntegerLiteral - 96)) | (1L << (BigBinaryIntegerLiteral - 96)) | (1L << (BigDecimalIntegerLiteral - 96)) | (1L << (Typeof - 96)) | (1L << (New - 96)) | (1L << (Function - 96)) | (1L << (This - 96)) | (1L << (Delete - 96)) | (1L << (Async - 96)) | (1L << (Await - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteral - 96)))) != 0)) {
				{
				setState(552);
				argument();
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(553);
						match(Comma);
						setState(554);
						argument();
						}
						} 
					}
					setState(559);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(560);
					match(Comma);
					}
				}

				}
			}

			setState(565);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public TerminalNode Ellipsis() { return getToken(SantaLangParser.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(567);
				match(Ellipsis);
				}
			}

			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(570);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(571);
				match(Identifier);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitExpressionSequence(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			singleExpression(0);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(575);
					match(Comma);
					setState(576);
					singleExpression(0);
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitTernaryExpression(this);
		}
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitLogicalAndExpression(this);
		}
	}
	public static class PowerExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public PowerExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPowerExpression(this);
		}
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPreIncrementExpression(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitObjectLiteralExpression(this);
		}
	}
	public static class MetaExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(SantaLangParser.New, 0); }
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public MetaExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterMetaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitMetaExpression(this);
		}
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(SantaLangParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitInExpression(this);
		}
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitLogicalOrExpression(this);
		}
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitNotExpression(this);
		}
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPreDecreaseExpression(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArgumentsExpression(this);
		}
	}
	public static class AwaitExpressionContext extends SingleExpressionContext {
		public TerminalNode Await() { return getToken(SantaLangParser.Await, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AwaitExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitAwaitExpression(this);
		}
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(SantaLangParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitThisExpression(this);
		}
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public AnoymousFunctionContext anoymousFunction() {
			return getRuleContext(AnoymousFunctionContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitFunctionExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitAssignmentExpression(this);
		}
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPostDecreaseExpression(this);
		}
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(SantaLangParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitTypeofExpression(this);
		}
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(SantaLangParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterInstanceofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitInstanceofExpression(this);
		}
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitUnaryPlusExpression(this);
		}
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(SantaLangParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitDeleteExpression(this);
		}
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitEqualityExpression(this);
		}
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBitXOrExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitMultiplicativeExpression(this);
		}
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBitShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBitShiftExpression(this);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitRelationalExpression(this);
		}
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitPostIncrementExpression(this);
		}
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBitNotExpression(this);
		}
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(SantaLangParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitNewExpression(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitLiteralExpression(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArrayLiteralExpression(this);
		}
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitMemberDotExpression(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitMemberIndexExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBitAndExpression(this);
		}
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBitOrExpression(this);
		}
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitAssignmentOperatorExpression(this);
		}
	}
	public static class CoalesceExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public CoalesceExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterCoalesceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitCoalesceExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(583);
				anoymousFunction();
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(584);
				match(New);
				setState(585);
				singleExpression(0);
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(586);
					arguments();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new MetaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(589);
				match(New);
				setState(590);
				match(Dot);
				setState(591);
				match(Identifier);
				}
				break;
			case 4:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(592);
				match(Delete);
				setState(593);
				singleExpression(32);
				}
				break;
			case 5:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(594);
				match(Typeof);
				setState(595);
				singleExpression(31);
				}
				break;
			case 6:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(596);
				match(PlusPlus);
				setState(597);
				singleExpression(30);
				}
				break;
			case 7:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(598);
				match(MinusMinus);
				setState(599);
				singleExpression(29);
				}
				break;
			case 8:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(600);
				match(Plus);
				setState(601);
				singleExpression(28);
				}
				break;
			case 9:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(602);
				match(Minus);
				setState(603);
				singleExpression(27);
				}
				break;
			case 10:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(604);
				match(BitNot);
				setState(605);
				singleExpression(26);
				}
				break;
			case 11:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(606);
				match(Not);
				setState(607);
				singleExpression(25);
				}
				break;
			case 12:
				{
				_localctx = new AwaitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(608);
				match(Await);
				setState(609);
				singleExpression(24);
				}
				break;
			case 13:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(610);
				match(This);
				}
				break;
			case 14:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(611);
				match(Identifier);
				}
				break;
			case 15:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(612);
				literal();
				}
				break;
			case 16:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(613);
				arrayLiteral();
				}
				break;
			case 17:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(614);
				objectLiteral();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(615);
				match(OpenParen);
				setState(616);
				expressionSequence();
				setState(617);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(698);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(621);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(622);
						match(Power);
						setState(623);
						singleExpression(23);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(624);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(625);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(626);
						singleExpression(23);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(627);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(628);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(629);
						singleExpression(22);
						}
						break;
					case 4:
						{
						_localctx = new CoalesceExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(630);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(631);
						match(NullCoalesce);
						setState(632);
						singleExpression(21);
						}
						break;
					case 5:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(633);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(634);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (RightShiftArithmetic - 67)) | (1L << (LeftShiftArithmetic - 67)) | (1L << (RightShiftLogical - 67)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(635);
						singleExpression(20);
						}
						break;
					case 6:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(636);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(637);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LessThan - 70)) | (1L << (MoreThan - 70)) | (1L << (LessThanEquals - 70)) | (1L << (GreaterThanEquals - 70)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(638);
						singleExpression(19);
						}
						break;
					case 7:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(639);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(640);
						match(Instanceof);
						setState(641);
						singleExpression(18);
						}
						break;
					case 8:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(642);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(643);
						match(In);
						setState(644);
						singleExpression(17);
						}
						break;
					case 9:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(645);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(646);
						_la = _input.LA(1);
						if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Equals_ - 74)) | (1L << (NotEquals - 74)) | (1L << (IdentityEquals - 74)) | (1L << (IdentityNotEquals - 74)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(647);
						singleExpression(16);
						}
						break;
					case 10:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(648);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(649);
						match(BitAnd);
						setState(650);
						singleExpression(15);
						}
						break;
					case 11:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(651);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(652);
						match(BitXOr);
						setState(653);
						singleExpression(14);
						}
						break;
					case 12:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(654);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(655);
						match(BitOr);
						setState(656);
						singleExpression(13);
						}
						break;
					case 13:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(657);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(658);
						match(And);
						setState(659);
						singleExpression(12);
						}
						break;
					case 14:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(660);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(661);
						match(Or);
						setState(662);
						singleExpression(11);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(663);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(664);
						match(QuestionMark);
						setState(665);
						singleExpression(0);
						setState(666);
						match(Colon);
						setState(667);
						singleExpression(10);
						}
						break;
					case 16:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(669);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(670);
						match(Assign);
						setState(671);
						singleExpression(8);
						}
						break;
					case 17:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(672);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(673);
						assignmentOperator();
						setState(674);
						singleExpression(7);
						}
						break;
					case 18:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(676);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(677);
						match(OpenBracket);
						setState(678);
						expressionSequence();
						setState(679);
						match(CloseBracket);
						}
						break;
					case 19:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(681);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(683);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(682);
							match(QuestionMark);
							}
						}

						setState(685);
						match(Dot);
						setState(687);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(686);
							match(Hashtag);
							}
						}

						setState(689);
						identifierName();
						}
						break;
					case 20:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(690);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(691);
						arguments();
						}
						break;
					case 21:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(692);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(693);
						if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
						setState(694);
						match(PlusPlus);
						}
						break;
					case 22:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(695);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(696);
						if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
						setState(697);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitAssignable(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_assignable);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(Identifier);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnoymousFunctionContext extends ParserRuleContext {
		public AnoymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anoymousFunction; }
	 
		public AnoymousFunctionContext() { }
		public void copyFrom(AnoymousFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnoymousFunctionDeclContext extends AnoymousFunctionContext {
		public TerminalNode Function() { return getToken(SantaLangParser.Function, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(SantaLangParser.Async, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public AnoymousFunctionDeclContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterAnoymousFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitAnoymousFunctionDecl(this);
		}
	}
	public static class ArrowFunctionContext extends AnoymousFunctionContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(SantaLangParser.Async, 0); }
		public ArrowFunctionContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArrowFunction(this);
		}
	}
	public static class FunctionDeclContext extends AnoymousFunctionContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitFunctionDecl(this);
		}
	}

	public final AnoymousFunctionContext anoymousFunction() throws RecognitionException {
		AnoymousFunctionContext _localctx = new AnoymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_anoymousFunction);
		int _la;
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new AnoymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(709);
					match(Async);
					}
				}

				setState(712);
				match(Function);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OrigMultiplyLiteral) {
					{
					setState(713);
					match(OrigMultiplyLiteral);
					}
				}

				setState(716);
				match(OpenParen);
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(717);
					formalParameterList();
					}
				}

				setState(720);
				match(CloseParen);
				setState(721);
				match(OpenBrace);
				setState(722);
				functionBody();
				setState(723);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(725);
					match(Async);
					}
				}

				setState(728);
				arrowFunctionParameters();
				setState(729);
				match(ARROW);
				setState(730);
				arrowFunctionBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArrowFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArrowFunctionParameters(this);
		}
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(Identifier);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(OpenParen);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la==Identifier) {
					{
					setState(736);
					formalParameterList();
					}
				}

				setState(739);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterArrowFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitArrowFunctionBody(this);
		}
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrowFunctionBody);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(OpenBrace);
				setState(744);
				functionBody();
				setState(745);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MultiplyAssign - 83)) | (1L << (DivideAssign - 83)) | (1L << (ModulusAssign - 83)) | (1L << (PlusAssign - 83)) | (1L << (MinusAssign - 83)) | (1L << (LeftShiftArithmeticAssign - 83)) | (1L << (RightShiftArithmeticAssign - 83)) | (1L << (RightShiftLogicalAssign - 83)) | (1L << (BitAndAssign - 83)) | (1L << (BitXorAssign - 83)) | (1L << (BitOrAssign - 83)) | (1L << (PowerAssign - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(SantaLangParser.NullLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SantaLangParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BigintLiteralContext bigintLiteral() {
			return getRuleContext(BigintLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(NullLiteral);
				}
				break;
			case TrueLiteral:
			case FalseLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				booleanLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
				numericLiteral();
				}
				break;
			case BigHexIntegerLiteral:
			case BigOctalIntegerLiteral:
			case BigBinaryIntegerLiteral:
			case BigDecimalIntegerLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(755);
				bigintLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TrueLiteral() { return getToken(SantaLangParser.TrueLiteral, 0); }
		public TerminalNode FalseLiteral() { return getToken(SantaLangParser.FalseLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_la = _input.LA(1);
			if ( !(_la==TrueLiteral || _la==FalseLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(SantaLangParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(SantaLangParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(SantaLangParser.OctalIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral2() { return getToken(SantaLangParser.OctalIntegerLiteral2, 0); }
		public TerminalNode BinaryIntegerLiteral() { return getToken(SantaLangParser.BinaryIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (DecimalLiteral - 99)) | (1L << (HexIntegerLiteral - 99)) | (1L << (OctalIntegerLiteral - 99)) | (1L << (OctalIntegerLiteral2 - 99)) | (1L << (BinaryIntegerLiteral - 99)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BigintLiteralContext extends ParserRuleContext {
		public TerminalNode BigDecimalIntegerLiteral() { return getToken(SantaLangParser.BigDecimalIntegerLiteral, 0); }
		public TerminalNode BigHexIntegerLiteral() { return getToken(SantaLangParser.BigHexIntegerLiteral, 0); }
		public TerminalNode BigOctalIntegerLiteral() { return getToken(SantaLangParser.BigOctalIntegerLiteral, 0); }
		public TerminalNode BigBinaryIntegerLiteral() { return getToken(SantaLangParser.BigBinaryIntegerLiteral, 0); }
		public BigintLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigintLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterBigintLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitBigintLiteral(this);
		}
	}

	public final BigintLiteralContext bigintLiteral() throws RecognitionException {
		BigintLiteralContext _localctx = new BigintLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bigintLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (BigHexIntegerLiteral - 104)) | (1L << (BigOctalIntegerLiteral - 104)) | (1L << (BigBinaryIntegerLiteral - 104)) | (1L << (BigDecimalIntegerLiteral - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitIdentifierName(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierName);
		try {
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(Identifier);
				}
				break;
			case NullLiteral:
			case TrueLiteral:
			case FalseLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Catch:
			case Finally:
			case Return:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Const:
			case Async:
			case Await:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				reservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(SantaLangParser.NullLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitReservedWord(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_reservedWord);
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Catch:
			case Finally:
			case Return:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Const:
			case Async:
			case Await:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				keyword();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(NullLiteral);
				}
				break;
			case TrueLiteral:
			case FalseLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				booleanLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SantaLangParser.Break, 0); }
		public TerminalNode Do() { return getToken(SantaLangParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(SantaLangParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(SantaLangParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(SantaLangParser.Case, 0); }
		public TerminalNode Else() { return getToken(SantaLangParser.Else, 0); }
		public TerminalNode New() { return getToken(SantaLangParser.New, 0); }
		public TerminalNode Catch() { return getToken(SantaLangParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(SantaLangParser.Finally, 0); }
		public TerminalNode Return() { return getToken(SantaLangParser.Return, 0); }
		public TerminalNode Continue() { return getToken(SantaLangParser.Continue, 0); }
		public TerminalNode For() { return getToken(SantaLangParser.For, 0); }
		public TerminalNode Switch() { return getToken(SantaLangParser.Switch, 0); }
		public TerminalNode While() { return getToken(SantaLangParser.While, 0); }
		public TerminalNode Debugger() { return getToken(SantaLangParser.Debugger, 0); }
		public TerminalNode Function() { return getToken(SantaLangParser.Function, 0); }
		public TerminalNode This() { return getToken(SantaLangParser.This, 0); }
		public TerminalNode With() { return getToken(SantaLangParser.With, 0); }
		public TerminalNode If() { return getToken(SantaLangParser.If, 0); }
		public TerminalNode Throw() { return getToken(SantaLangParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(SantaLangParser.Delete, 0); }
		public TerminalNode In() { return getToken(SantaLangParser.In, 0); }
		public TerminalNode Try() { return getToken(SantaLangParser.Try, 0); }
		public TerminalNode Const() { return getToken(SantaLangParser.Const, 0); }
		public TerminalNode Async() { return getToken(SantaLangParser.Async, 0); }
		public TerminalNode Await() { return getToken(SantaLangParser.Await, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Break - 108)) | (1L << (Do - 108)) | (1L << (Instanceof - 108)) | (1L << (Typeof - 108)) | (1L << (Case - 108)) | (1L << (Else - 108)) | (1L << (New - 108)) | (1L << (Catch - 108)) | (1L << (Finally - 108)) | (1L << (Return - 108)) | (1L << (Continue - 108)) | (1L << (For - 108)) | (1L << (Switch - 108)) | (1L << (While - 108)) | (1L << (Debugger - 108)) | (1L << (Function - 108)) | (1L << (This - 108)) | (1L << (With - 108)) | (1L << (If - 108)) | (1L << (Throw - 108)) | (1L << (Delete - 108)) | (1L << (In - 108)) | (1L << (Try - 108)) | (1L << (Const - 108)) | (1L << (Async - 108)) | (1L << (Await - 108)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitGetter(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(Identifier);
			setState(776);
			if (!(this.p("get"))) throw new FailedPredicateException(this, "this.p(\"get\")");
			setState(777);
			propertyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SantaLangParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitSetter(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(Identifier);
			setState(780);
			if (!(this.p("set"))) throw new FailedPredicateException(this, "this.p(\"set\")");
			setState(781);
			propertyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(SantaLangParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(SantaLangParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SantaLangParserListener ) ((SantaLangParserListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_eos);
		try {
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				if (!(this.closeBrace())) throw new FailedPredicateException(this, "this.closeBrace()");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		case 12:
			return iterationStatement_sempred((IterationStatementContext)_localctx, predIndex);
		case 14:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 15:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 16:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 24:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 45:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 58:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 59:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 60:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.notOpenBraceAndNotFunction();
		}
		return true;
	}
	private boolean iterationStatement_sempred(IterationStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return this.p("of");
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 23);
		case 7:
			return precpred(_ctx, 22);
		case 8:
			return precpred(_ctx, 21);
		case 9:
			return precpred(_ctx, 20);
		case 10:
			return precpred(_ctx, 19);
		case 11:
			return precpred(_ctx, 18);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 16);
		case 14:
			return precpred(_ctx, 15);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 13);
		case 17:
			return precpred(_ctx, 12);
		case 18:
			return precpred(_ctx, 11);
		case 19:
			return precpred(_ctx, 10);
		case 20:
			return precpred(_ctx, 9);
		case 21:
			return precpred(_ctx, 8);
		case 22:
			return precpred(_ctx, 7);
		case 23:
			return precpred(_ctx, 39);
		case 24:
			return precpred(_ctx, 38);
		case 25:
			return precpred(_ctx, 37);
		case 26:
			return precpred(_ctx, 34);
		case 27:
			return this.notLineTerminator();
		case 28:
			return precpred(_ctx, 33);
		case 29:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return this.p("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return this.p("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return this.lineTerminatorAhead();
		case 33:
			return this.closeBrace();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008d\u0318\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\5\2~\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0094\n\4\3\5\3\5\5\5\u0098\n\5\3\5"+
		"\3\5\3\6\6\6\u009d\n\6\r\6\16\6\u009e\3\7\3\7\5\7\u00a3\n\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\n\3\n\3\n\5\n\u00b4"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c3\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00d7\n\16\3\16\3\16\5\16\u00db\n\16\3\16"+
		"\3\16\5\16\u00df\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e7\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f0\n\16\3\16\3\16\3\16\5\16"+
		"\u00f5\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fd\n\16\3\17\3\17\3"+
		"\20\3\20\3\20\5\20\u0104\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u010b\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u0112\n\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0124\n\25\3\25"+
		"\3\25\5\25\u0128\n\25\5\25\u012a\n\25\3\25\3\25\3\26\6\26\u012f\n\26\r"+
		"\26\16\26\u0130\3\27\3\27\3\27\3\27\5\27\u0137\n\27\3\30\3\30\3\30\5\30"+
		"\u013c\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\5\33\u014b\n\33\3\33\5\33\u014e\n\33\3\34\3\34\3\34\5\34\u0153\n"+
		"\34\3\34\5\34\u0156\n\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\5\37\u0161\n\37\3\37\3\37\5\37\u0165\n\37\3\37\3\37\3\37\5\37\u016a\n"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \5 \u0172\n \3 \5 \u0175\n \3 \3 \3 \5"+
		" \u017a\n \3 \3 \3 \3 \3 \3 \5 \u0182\n \3 \5 \u0185\n \3 \3 \3 \3 \3"+
		" \3 \3 \3 \5 \u018f\n \3 \5 \u0192\n \3 \3 \3 \5 \u0197\n \3 \3 \3 \3"+
		" \3 \5 \u019e\n \3!\3!\3!\7!\u01a3\n!\f!\16!\u01a6\13!\3!\3!\5!\u01aa"+
		"\n!\3!\5!\u01ad\n!\3\"\3\"\3\"\5\"\u01b2\n\"\3#\3#\3#\3$\5$\u01b8\n$\3"+
		"%\6%\u01bb\n%\r%\16%\u01bc\3&\3&\3&\3&\3\'\7\'\u01c4\n\'\f\'\16\'\u01c7"+
		"\13\'\3\'\5\'\u01ca\n\'\3\'\6\'\u01cd\n\'\r\'\16\'\u01ce\3\'\7\'\u01d2"+
		"\n\'\f\'\16\'\u01d5\13\'\3\'\7\'\u01d8\n\'\f\'\16\'\u01db\13\'\3(\5(\u01de"+
		"\n(\3(\3(\3)\3)\3)\3)\7)\u01e6\n)\f)\16)\u01e9\13)\5)\u01eb\n)\3)\5)\u01ee"+
		"\n)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01fd\n*\3*\5*\u0200\n*"+
		"\3*\3*\3*\5*\u0205\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\5*\u021c\n*\3*\5*\u021f\n*\3+\3+\3+\3+\3+\3+\3+\5+\u0228"+
		"\n+\3,\3,\3,\3,\7,\u022e\n,\f,\16,\u0231\13,\3,\5,\u0234\n,\5,\u0236\n"+
		",\3,\3,\3-\5-\u023b\n-\3-\3-\5-\u023f\n-\3.\3.\3.\7.\u0244\n.\f.\16.\u0247"+
		"\13.\3/\3/\3/\3/\3/\5/\u024e\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u026e\n/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02ae\n/\3/\3/\5/\u02b2"+
		"\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u02bd\n/\f/\16/\u02c0\13/\3\60\3\60"+
		"\3\60\5\60\u02c5\n\60\3\61\3\61\5\61\u02c9\n\61\3\61\3\61\5\61\u02cd\n"+
		"\61\3\61\3\61\5\61\u02d1\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02d9"+
		"\n\61\3\61\3\61\3\61\3\61\5\61\u02df\n\61\3\62\3\62\3\62\5\62\u02e4\n"+
		"\62\3\62\5\62\u02e7\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u02ee\n\63\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u02f7\n\65\3\66\3\66\3\67\3\67\38"+
		"\38\39\39\59\u0301\n9\3:\3:\3:\5:\u0306\n:\3;\3;\3<\3<\3<\3<\3=\3=\3="+
		"\3=\3>\3>\3>\3>\5>\u0316\n>\3>\2\3\\?\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\f\3\2"+
		"?A\3\2;<\3\2EG\3\2HK\3\2LO\3\2U`\3\2cd\3\2ei\3\2jm\4\2n\177\u0081\u0088"+
		"\2\u0375\2}\3\2\2\2\4\u0081\3\2\2\2\6\u0093\3\2\2\2\b\u0095\3\2\2\2\n"+
		"\u009c\3\2\2\2\f\u00a2\3\2\2\2\16\u00a4\3\2\2\2\20\u00a8\3\2\2\2\22\u00b0"+
		"\3\2\2\2\24\u00b5\3\2\2\2\26\u00b7\3\2\2\2\30\u00bb\3\2\2\2\32\u00fc\3"+
		"\2\2\2\34\u00fe\3\2\2\2\36\u0100\3\2\2\2 \u0107\3\2\2\2\"\u010e\3\2\2"+
		"\2$\u0115\3\2\2\2&\u011b\3\2\2\2(\u0121\3\2\2\2*\u012e\3\2\2\2,\u0132"+
		"\3\2\2\2.\u0138\3\2\2\2\60\u013d\3\2\2\2\62\u0141\3\2\2\2\64\u0146\3\2"+
		"\2\2\66\u014f\3\2\2\28\u0159\3\2\2\2:\u015c\3\2\2\2<\u0160\3\2\2\2>\u019d"+
		"\3\2\2\2@\u01ac\3\2\2\2B\u01ae\3\2\2\2D\u01b3\3\2\2\2F\u01b7\3\2\2\2H"+
		"\u01ba\3\2\2\2J\u01be\3\2\2\2L\u01c5\3\2\2\2N\u01dd\3\2\2\2P\u01e1\3\2"+
		"\2\2R\u021e\3\2\2\2T\u0227\3\2\2\2V\u0229\3\2\2\2X\u023a\3\2\2\2Z\u0240"+
		"\3\2\2\2\\\u026d\3\2\2\2^\u02c4\3\2\2\2`\u02de\3\2\2\2b\u02e6\3\2\2\2"+
		"d\u02ed\3\2\2\2f\u02ef\3\2\2\2h\u02f6\3\2\2\2j\u02f8\3\2\2\2l\u02fa\3"+
		"\2\2\2n\u02fc\3\2\2\2p\u0300\3\2\2\2r\u0305\3\2\2\2t\u0307\3\2\2\2v\u0309"+
		"\3\2\2\2x\u030d\3\2\2\2z\u0315\3\2\2\2|~\5H%\2}|\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7\2\2\3\u0080\3\3\2\2\2\u0081\u0082\5\6\4\2\u0082\5"+
		"\3\2\2\2\u0083\u0094\5\b\5\2\u0084\u0094\5\16\b\2\u0085\u0094\5\24\13"+
		"\2\u0086\u0094\5\26\f\2\u0087\u0094\5\30\r\2\u0088\u0094\5\32\16\2\u0089"+
		"\u0094\5\36\20\2\u008a\u0094\5 \21\2\u008b\u0094\5\"\22\2\u008c\u0094"+
		"\5$\23\2\u008d\u0094\5\60\31\2\u008e\u0094\5&\24\2\u008f\u0094\5\62\32"+
		"\2\u0090\u0094\5\64\33\2\u0091\u0094\5:\36\2\u0092\u0094\5<\37\2\u0093"+
		"\u0083\3\2\2\2\u0093\u0084\3\2\2\2\u0093\u0085\3\2\2\2\u0093\u0086\3\2"+
		"\2\2\u0093\u0087\3\2\2\2\u0093\u0088\3\2\2\2\u0093\u0089\3\2\2\2\u0093"+
		"\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008d\3\2"+
		"\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\7\3\2\2\2\u0095\u0097\7\60\2"+
		"\2\u0096\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009a\7\61\2\2\u009a\t\3\2\2\2\u009b\u009d\5\6\4\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\13\3\2\2\2\u00a0\u00a3\5\16\b\2\u00a1\u00a3\5<\37\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\r\3\2\2\2\u00a4\u00a5\5\34\17\2\u00a5"+
		"\u00a6\5\20\t\2\u00a6\u00a7\5z>\2\u00a7\17\3\2\2\2\u00a8\u00ad\5\22\n"+
		"\2\u00a9\u00aa\7\63\2\2\u00aa\u00ac\5\22\n\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\21\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\5^\60\2\u00b1\u00b2\7\64\2\2\u00b2"+
		"\u00b4\5\\/\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\23\3\2\2\2"+
		"\u00b5\u00b6\7\62\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\6\f\2\2\u00b8\u00b9"+
		"\5Z.\2\u00b9\u00ba\5z>\2\u00ba\27\3\2\2\2\u00bb\u00bc\7\u0081\2\2\u00bc"+
		"\u00bd\7.\2\2\u00bd\u00be\5Z.\2\u00be\u00bf\7/\2\2\u00bf\u00c2\5\6\4\2"+
		"\u00c0\u00c1\7s\2\2\u00c1\u00c3\5\6\4\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\5\6\4\2\u00c6"+
		"\u00c7\7{\2\2\u00c7\u00c8\7.\2\2\u00c8\u00c9\5Z.\2\u00c9\u00ca\7/\2\2"+
		"\u00ca\u00cb\5z>\2\u00cb\u00fd\3\2\2\2\u00cc\u00cd\7{\2\2\u00cd\u00ce"+
		"\7.\2\2\u00ce\u00cf\5Z.\2\u00cf\u00d0\7/\2\2\u00d0\u00d1\5\6\4\2\u00d1"+
		"\u00fd\3\2\2\2\u00d2\u00d3\7y\2\2\u00d3\u00d6\7.\2\2\u00d4\u00d7\5Z.\2"+
		"\u00d5\u00d7\5\16\b\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\7\62\2\2\u00d9\u00db\5Z.\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\7\62"+
		"\2\2\u00dd\u00df\5Z.\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1\u00fd\5\6\4\2\u00e2\u00e3\7y\2\2\u00e3"+
		"\u00e6\7.\2\2\u00e4\u00e7\5\\/\2\u00e5\u00e7\5\16\b\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\u0084\2\2\u00e9"+
		"\u00ea\5Z.\2\u00ea\u00eb\7/\2\2\u00eb\u00ec\5\6\4\2\u00ec\u00fd\3\2\2"+
		"\2\u00ed\u00ef\7y\2\2\u00ee\u00f0\7\u0088\2\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\7.\2\2\u00f2\u00f5\5\\"+
		"/\2\u00f3\u00f5\5\16\b\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\7\u0089\2\2\u00f7\u00f8\6\16\3\2\u00f8\u00f9"+
		"\5Z.\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\5\6\4\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00c4\3\2\2\2\u00fc\u00cc\3\2\2\2\u00fc\u00d2\3\2\2\2\u00fc\u00e2\3\2"+
		"\2\2\u00fc\u00ed\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u00ff\7\u0086\2\2\u00ff"+
		"\35\3\2\2\2\u0100\u0103\7x\2\2\u0101\u0102\6\20\4\2\u0102\u0104\7\u0089"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\5z>\2\u0106\37\3\2\2\2\u0107\u010a\7n\2\2\u0108\u0109\6\21\5\2"+
		"\u0109\u010b\7\u0089\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\5z>\2\u010d!\3\2\2\2\u010e\u0111\7w\2\2\u010f"+
		"\u0110\6\22\6\2\u0110\u0112\5Z.\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5z>\2\u0114#\3\2\2\2\u0115\u0116"+
		"\7\177\2\2\u0116\u0117\7.\2\2\u0117\u0118\5Z.\2\u0118\u0119\7/\2\2\u0119"+
		"\u011a\5\6\4\2\u011a%\3\2\2\2\u011b\u011c\7z\2\2\u011c\u011d\7.\2\2\u011d"+
		"\u011e\5Z.\2\u011e\u011f\7/\2\2\u011f\u0120\5(\25\2\u0120\'\3\2\2\2\u0121"+
		"\u0123\7\60\2\2\u0122\u0124\5*\26\2\u0123\u0122\3\2\2\2\u0123\u0124\3"+
		"\2\2\2\u0124\u0129\3\2\2\2\u0125\u0127\5.\30\2\u0126\u0128\5*\26\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\61\2\2\u012c"+
		")\3\2\2\2\u012d\u012f\5,\27\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131+\3\2\2\2\u0132\u0133\7"+
		"r\2\2\u0133\u0134\5Z.\2\u0134\u0136\7\66\2\2\u0135\u0137\5\n\6\2\u0136"+
		"\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137-\3\2\2\2\u0138\u0139\7\u0080"+
		"\2\2\u0139\u013b\7\66\2\2\u013a\u013c\5\n\6\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c/\3\2\2\2\u013d\u013e\7\u0089\2\2\u013e\u013f\7\66"+
		"\2\2\u013f\u0140\5\6\4\2\u0140\61\3\2\2\2\u0141\u0142\7\u0082\2\2\u0142"+
		"\u0143\6\32\7\2\u0143\u0144\5Z.\2\u0144\u0145\5z>\2\u0145\63\3\2\2\2\u0146"+
		"\u0147\7\u0085\2\2\u0147\u014d\5\b\5\2\u0148\u014a\5\66\34\2\u0149\u014b"+
		"\58\35\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014e\58\35\2\u014d\u0148\3\2\2\2\u014d\u014c\3\2\2\2\u014e\65\3\2\2"+
		"\2\u014f\u0155\7u\2\2\u0150\u0152\7.\2\2\u0151\u0153\5^\60\2\u0152\u0151"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\7/\2\2\u0155"+
		"\u0150\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\5\b"+
		"\5\2\u0158\67\3\2\2\2\u0159\u015a\7v\2\2\u015a\u015b\5\b\5\2\u015b9\3"+
		"\2\2\2\u015c\u015d\7|\2\2\u015d\u015e\5z>\2\u015e;\3\2\2\2\u015f\u0161"+
		"\7\u0087\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2"+
		"\2\u0162\u0164\7}\2\2\u0163\u0165\7\n\2\2\u0164\u0163\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7\u0089\2\2\u0167\u0169\7.\2"+
		"\2\u0168\u016a\5@!\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016c\7/\2\2\u016c\u016d\7\60\2\2\u016d\u016e\5F$\2\u016e"+
		"\u016f\7\61\2\2\u016f=\3\2\2\2\u0170\u0172\7\n\2\2\u0171\u0170\3\2\2\2"+
		"\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0175\7D\2\2\u0174\u0173"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5T+\2\u0177"+
		"\u0179\7.\2\2\u0178\u017a\5@!\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2"+
		"\2\u017a\u017b\3\2\2\2\u017b\u017c\7/\2\2\u017c\u017d\7\60\2\2\u017d\u017e"+
		"\5F$\2\u017e\u017f\7\61\2\2\u017f\u019e\3\2\2\2\u0180\u0182\7\n\2\2\u0181"+
		"\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0185\7D"+
		"\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\5v<\2\u0187\u0188\7.\2\2\u0188\u0189\7/\2\2\u0189\u018a\7\60\2"+
		"\2\u018a\u018b\5F$\2\u018b\u018c\7\61\2\2\u018c\u019e\3\2\2\2\u018d\u018f"+
		"\7\n\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u0192\7D\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\5x=\2\u0194\u0196\7.\2\2\u0195\u0197\5@!\2\u0196\u0195"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7/\2\2\u0199"+
		"\u019a\7\60\2\2\u019a\u019b\5F$\2\u019b\u019c\7\61\2\2\u019c\u019e\3\2"+
		"\2\2\u019d\u0171\3\2\2\2\u019d\u0181\3\2\2\2\u019d\u018e\3\2\2\2\u019e"+
		"?\3\2\2\2\u019f\u01a4\5B\"\2\u01a0\u01a1\7\63\2\2\u01a1\u01a3\5B\"\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7\63\2\2\u01a8"+
		"\u01aa\5D#\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2\2"+
		"\2\u01ab\u01ad\5D#\2\u01ac\u019f\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adA\3"+
		"\2\2\2\u01ae\u01b1\5^\60\2\u01af\u01b0\7\64\2\2\u01b0\u01b2\5\\/\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2C\3\2\2\2\u01b3\u01b4\7\67\2\2"+
		"\u01b4\u01b5\5\\/\2\u01b5E\3\2\2\2\u01b6\u01b8\5H%\2\u01b7\u01b6\3\2\2"+
		"\2\u01b7\u01b8\3\2\2\2\u01b8G\3\2\2\2\u01b9\u01bb\5\4\3\2\u01ba\u01b9"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"I\3\2\2\2\u01be\u01bf\7,\2\2\u01bf\u01c0\5L\'\2\u01c0\u01c1\7-\2\2\u01c1"+
		"K\3\2\2\2\u01c2\u01c4\7\63\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2"+
		"\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c8\u01ca\5N(\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01d3\3\2\2\2\u01cb\u01cd\7\63\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3"+
		"\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d2\5N(\2\u01d1\u01cc\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2"+
		"\2\u01d3\u01d4\3\2\2\2\u01d4\u01d9\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8"+
		"\7\63\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01daM\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\7"+
		"\67\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\5\\/\2\u01e0O\3\2\2\2\u01e1\u01ea\7\60\2\2\u01e2\u01e7\5R*\2\u01e3"+
		"\u01e4\7\63\2\2\u01e4\u01e6\5R*\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2"+
		"\2\2\u01ec\u01ee\7\63\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f0\7\61\2\2\u01f0Q\3\2\2\2\u01f1\u01f2\5T+\2\u01f2"+
		"\u01f3\7\66\2\2\u01f3\u01f4\5\\/\2\u01f4\u021f\3\2\2\2\u01f5\u01f6\7,"+
		"\2\2\u01f6\u01f7\5\\/\2\u01f7\u01f8\7-\2\2\u01f8\u01f9\7\66\2\2\u01f9"+
		"\u01fa\5\\/\2\u01fa\u021f\3\2\2\2\u01fb\u01fd\7\u0087\2\2\u01fc\u01fb"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u0200\7\n\2\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5T"+
		"+\2\u0202\u0204\7.\2\2\u0203\u0205\5@!\2\u0204\u0203\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7/\2\2\u0207\u0208\7\60\2\2\u0208"+
		"\u0209\5F$\2\u0209\u020a\7\61\2\2\u020a\u021f\3\2\2\2\u020b\u020c\5v<"+
		"\2\u020c\u020d\7.\2\2\u020d\u020e\7/\2\2\u020e\u020f\7\60\2\2\u020f\u0210"+
		"\5F$\2\u0210\u0211\7\61\2\2\u0211\u021f\3\2\2\2\u0212\u0213\5x=\2\u0213"+
		"\u0214\7.\2\2\u0214\u0215\5B\"\2\u0215\u0216\7/\2\2\u0216\u0217\7\60\2"+
		"\2\u0217\u0218\5F$\2\u0218\u0219\7\61\2\2\u0219\u021f\3\2\2\2\u021a\u021c"+
		"\7\67\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2"+
		"\u021d\u021f\5\\/\2\u021e\u01f1\3\2\2\2\u021e\u01f5\3\2\2\2\u021e\u01fc"+
		"\3\2\2\2\u021e\u020b\3\2\2\2\u021e\u0212\3\2\2\2\u021e\u021b\3\2\2\2\u021f"+
		"S\3\2\2\2\u0220\u0228\5p9\2\u0221\u0228\7\u008a\2\2\u0222\u0228\5l\67"+
		"\2\u0223\u0224\7,\2\2\u0224\u0225\5\\/\2\u0225\u0226\7-\2\2\u0226\u0228"+
		"\3\2\2\2\u0227\u0220\3\2\2\2\u0227\u0221\3\2\2\2\u0227\u0222\3\2\2\2\u0227"+
		"\u0223\3\2\2\2\u0228U\3\2\2\2\u0229\u0235\7.\2\2\u022a\u022f\5X-\2\u022b"+
		"\u022c\7\63\2\2\u022c\u022e\5X-\2\u022d\u022b\3\2\2\2\u022e\u0231\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0234\7\63\2\2\u0233\u0232\3\2\2\2\u0233\u0234\3"+
		"\2\2\2\u0234\u0236\3\2\2\2\u0235\u022a\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0238\7/\2\2\u0238W\3\2\2\2\u0239\u023b\7\67\2\2"+
		"\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023f"+
		"\5\\/\2\u023d\u023f\7\u0089\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2"+
		"\2\u023fY\3\2\2\2\u0240\u0245\5\\/\2\u0241\u0242\7\63\2\2\u0242\u0244"+
		"\5\\/\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246[\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\b/\1\2\u0249"+
		"\u026e\5`\61\2\u024a\u024b\7t\2\2\u024b\u024d\5\\/\2\u024c\u024e\5V,\2"+
		"\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u026e\3\2\2\2\u024f\u0250"+
		"\7t\2\2\u0250\u0251\78\2\2\u0251\u026e\7\u0089\2\2\u0252\u0253\7\u0083"+
		"\2\2\u0253\u026e\5\\/\"\u0254\u0255\7q\2\2\u0255\u026e\5\\/!\u0256\u0257"+
		"\79\2\2\u0257\u026e\5\\/ \u0258\u0259\7:\2\2\u0259\u026e\5\\/\37\u025a"+
		"\u025b\7;\2\2\u025b\u026e\5\\/\36\u025c\u025d\7<\2\2\u025d\u026e\5\\/"+
		"\35\u025e\u025f\7=\2\2\u025f\u026e\5\\/\34\u0260\u0261\7>\2\2\u0261\u026e"+
		"\5\\/\33\u0262\u0263\7\u0088\2\2\u0263\u026e\5\\/\32\u0264\u026e\7~\2"+
		"\2\u0265\u026e\7\u0089\2\2\u0266\u026e\5h\65\2\u0267\u026e\5J&\2\u0268"+
		"\u026e\5P)\2\u0269\u026a\7.\2\2\u026a\u026b\5Z.\2\u026b\u026c\7/\2\2\u026c"+
		"\u026e\3\2\2\2\u026d\u0248\3\2\2\2\u026d\u024a\3\2\2\2\u026d\u024f\3\2"+
		"\2\2\u026d\u0252\3\2\2\2\u026d\u0254\3\2\2\2\u026d\u0256\3\2\2\2\u026d"+
		"\u0258\3\2\2\2\u026d\u025a\3\2\2\2\u026d\u025c\3\2\2\2\u026d\u025e\3\2"+
		"\2\2\u026d\u0260\3\2\2\2\u026d\u0262\3\2\2\2\u026d\u0264\3\2\2\2\u026d"+
		"\u0265\3\2\2\2\u026d\u0266\3\2\2\2\u026d\u0267\3\2\2\2\u026d\u0268\3\2"+
		"\2\2\u026d\u0269\3\2\2\2\u026e\u02be\3\2\2\2\u026f\u0270\f\31\2\2\u0270"+
		"\u0271\7B\2\2\u0271\u02bd\5\\/\31\u0272\u0273\f\30\2\2\u0273\u0274\t\2"+
		"\2\2\u0274\u02bd\5\\/\31\u0275\u0276\f\27\2\2\u0276\u0277\t\3\2\2\u0277"+
		"\u02bd\5\\/\30\u0278\u0279\f\26\2\2\u0279\u027a\7C\2\2\u027a\u02bd\5\\"+
		"/\27\u027b\u027c\f\25\2\2\u027c\u027d\t\4\2\2\u027d\u02bd\5\\/\26\u027e"+
		"\u027f\f\24\2\2\u027f\u0280\t\5\2\2\u0280\u02bd\5\\/\25\u0281\u0282\f"+
		"\23\2\2\u0282\u0283\7p\2\2\u0283\u02bd\5\\/\24\u0284\u0285\f\22\2\2\u0285"+
		"\u0286\7\u0084\2\2\u0286\u02bd\5\\/\23\u0287\u0288\f\21\2\2\u0288\u0289"+
		"\t\6\2\2\u0289\u02bd\5\\/\22\u028a\u028b\f\20\2\2\u028b\u028c\7P\2\2\u028c"+
		"\u02bd\5\\/\21\u028d\u028e\f\17\2\2\u028e\u028f\7Q\2\2\u028f\u02bd\5\\"+
		"/\20\u0290\u0291\f\16\2\2\u0291\u0292\7R\2\2\u0292\u02bd\5\\/\17\u0293"+
		"\u0294\f\r\2\2\u0294\u0295\7S\2\2\u0295\u02bd\5\\/\16\u0296\u0297\f\f"+
		"\2\2\u0297\u0298\7T\2\2\u0298\u02bd\5\\/\r\u0299\u029a\f\13\2\2\u029a"+
		"\u029b\7\65\2\2\u029b\u029c\5\\/\2\u029c\u029d\7\66\2\2\u029d\u029e\5"+
		"\\/\f\u029e\u02bd\3\2\2\2\u029f\u02a0\f\n\2\2\u02a0\u02a1\7\64\2\2\u02a1"+
		"\u02bd\5\\/\n\u02a2\u02a3\f\t\2\2\u02a3\u02a4\5f\64\2\u02a4\u02a5\5\\"+
		"/\t\u02a5\u02bd\3\2\2\2\u02a6\u02a7\f)\2\2\u02a7\u02a8\7,\2\2\u02a8\u02a9"+
		"\5Z.\2\u02a9\u02aa\7-\2\2\u02aa\u02bd\3\2\2\2\u02ab\u02ad\f(\2\2\u02ac"+
		"\u02ae\7\65\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3"+
		"\2\2\2\u02af\u02b1\78\2\2\u02b0\u02b2\7D\2\2\u02b1\u02b0\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02bd\5p9\2\u02b4\u02b5\f\'\2"+
		"\2\u02b5\u02bd\5V,\2\u02b6\u02b7\f$\2\2\u02b7\u02b8\6/\35\2\u02b8\u02bd"+
		"\79\2\2\u02b9\u02ba\f#\2\2\u02ba\u02bb\6/\37\2\u02bb\u02bd\7:\2\2\u02bc"+
		"\u026f\3\2\2\2\u02bc\u0272\3\2\2\2\u02bc\u0275\3\2\2\2\u02bc\u0278\3\2"+
		"\2\2\u02bc\u027b\3\2\2\2\u02bc\u027e\3\2\2\2\u02bc\u0281\3\2\2\2\u02bc"+
		"\u0284\3\2\2\2\u02bc\u0287\3\2\2\2\u02bc\u028a\3\2\2\2\u02bc\u028d\3\2"+
		"\2\2\u02bc\u0290\3\2\2\2\u02bc\u0293\3\2\2\2\u02bc\u0296\3\2\2\2\u02bc"+
		"\u0299\3\2\2\2\u02bc\u029f\3\2\2\2\u02bc\u02a2\3\2\2\2\u02bc\u02a6\3\2"+
		"\2\2\u02bc\u02ab\3\2\2\2\u02bc\u02b4\3\2\2\2\u02bc\u02b6\3\2\2\2\u02bc"+
		"\u02b9\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2"+
		"\2\2\u02bf]\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c5\7\u0089\2\2\u02c2"+
		"\u02c5\5J&\2\u02c3\u02c5\5P)\2\u02c4\u02c1\3\2\2\2\u02c4\u02c2\3\2\2\2"+
		"\u02c4\u02c3\3\2\2\2\u02c5_\3\2\2\2\u02c6\u02df\5<\37\2\u02c7\u02c9\7"+
		"\u0087\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2"+
		"\u02ca\u02cc\7}\2\2\u02cb\u02cd\7\n\2\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\7.\2\2\u02cf\u02d1\5@!\2\u02d0"+
		"\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7/"+
		"\2\2\u02d3\u02d4\7\60\2\2\u02d4\u02d5\5F$\2\u02d5\u02d6\7\61\2\2\u02d6"+
		"\u02df\3\2\2\2\u02d7\u02d9\7\u0087\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\5b\62\2\u02db\u02dc\7a\2\2\u02dc"+
		"\u02dd\5d\63\2\u02dd\u02df\3\2\2\2\u02de\u02c6\3\2\2\2\u02de\u02c8\3\2"+
		"\2\2\u02de\u02d8\3\2\2\2\u02dfa\3\2\2\2\u02e0\u02e7\7\u0089\2\2\u02e1"+
		"\u02e3\7.\2\2\u02e2\u02e4\5@!\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2"+
		"\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\7/\2\2\u02e6\u02e0\3\2\2\2\u02e6\u02e1"+
		"\3\2\2\2\u02e7c\3\2\2\2\u02e8\u02ee\5\\/\2\u02e9\u02ea\7\60\2\2\u02ea"+
		"\u02eb\5F$\2\u02eb\u02ec\7\61\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02e8\3\2"+
		"\2\2\u02ed\u02e9\3\2\2\2\u02eee\3\2\2\2\u02ef\u02f0\t\7\2\2\u02f0g\3\2"+
		"\2\2\u02f1\u02f7\7b\2\2\u02f2\u02f7\5j\66\2\u02f3\u02f7\7\u008a\2\2\u02f4"+
		"\u02f7\5l\67\2\u02f5\u02f7\5n8\2\u02f6\u02f1\3\2\2\2\u02f6\u02f2\3\2\2"+
		"\2\u02f6\u02f3\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7i"+
		"\3\2\2\2\u02f8\u02f9\t\b\2\2\u02f9k\3\2\2\2\u02fa\u02fb\t\t\2\2\u02fb"+
		"m\3\2\2\2\u02fc\u02fd\t\n\2\2\u02fdo\3\2\2\2\u02fe\u0301\7\u0089\2\2\u02ff"+
		"\u0301\5r:\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2\2\u0301q\3\2\2\2\u0302"+
		"\u0306\5t;\2\u0303\u0306\7b\2\2\u0304\u0306\5j\66\2\u0305\u0302\3\2\2"+
		"\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306s\3\2\2\2\u0307\u0308"+
		"\t\13\2\2\u0308u\3\2\2\2\u0309\u030a\7\u0089\2\2\u030a\u030b\6< \2\u030b"+
		"\u030c\5T+\2\u030cw\3\2\2\2\u030d\u030e\7\u0089\2\2\u030e\u030f\6=!\2"+
		"\u030f\u0310\5T+\2\u0310y\3\2\2\2\u0311\u0316\7\62\2\2\u0312\u0316\7\2"+
		"\2\3\u0313\u0316\6>\"\2\u0314\u0316\6>#\2\u0315\u0311\3\2\2\2\u0315\u0312"+
		"\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0314\3\2\2\2\u0316{\3\2\2\2X}\u0093"+
		"\u0097\u009e\u00a2\u00ad\u00b3\u00c2\u00d6\u00da\u00de\u00e6\u00ef\u00f4"+
		"\u00fc\u0103\u010a\u0111\u0123\u0127\u0129\u0130\u0136\u013b\u014a\u014d"+
		"\u0152\u0155\u0160\u0164\u0169\u0171\u0174\u0179\u0181\u0184\u018e\u0191"+
		"\u0196\u019d\u01a4\u01a9\u01ac\u01b1\u01b7\u01bc\u01c5\u01c9\u01ce\u01d3"+
		"\u01d9\u01dd\u01e7\u01ea\u01ed\u01fc\u01ff\u0204\u021b\u021e\u0227\u022f"+
		"\u0233\u0235\u023a\u023e\u0245\u024d\u026d\u02ad\u02b1\u02bc\u02be\u02c4"+
		"\u02c8\u02cc\u02d0\u02d8\u02de\u02e3\u02e6\u02ed\u02f6\u0300\u0305\u0315";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}