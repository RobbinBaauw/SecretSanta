// Generated from src/main/java/nl/santa/grammar/SantaLangParser.g4 by ANTLR 4.7.1

    package nl.santa.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SantaLangParser}.
 */
public interface SantaLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SantaLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SantaLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(SantaLangParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(SantaLangParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SantaLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SantaLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SantaLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SantaLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(SantaLangParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(SantaLangParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SantaLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SantaLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(SantaLangParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(SantaLangParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(SantaLangParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(SantaLangParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SantaLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SantaLangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(SantaLangParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(SantaLangParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SantaLangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SantaLangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SantaLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SantaLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link SantaLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(SantaLangParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link SantaLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(SantaLangParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link SantaLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SantaLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link SantaLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SantaLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link SantaLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SantaLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link SantaLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SantaLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link SantaLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatement(SantaLangParser.ForOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link SantaLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatement(SantaLangParser.ForOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(SantaLangParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(SantaLangParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SantaLangParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SantaLangParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SantaLangParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SantaLangParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SantaLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SantaLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(SantaLangParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(SantaLangParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(SantaLangParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(SantaLangParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(SantaLangParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(SantaLangParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(SantaLangParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(SantaLangParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(SantaLangParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(SantaLangParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(SantaLangParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(SantaLangParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(SantaLangParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(SantaLangParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SantaLangParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SantaLangParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(SantaLangParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(SantaLangParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(SantaLangParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(SantaLangParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(SantaLangParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(SantaLangParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(SantaLangParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(SantaLangParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SantaLangParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SantaLangParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(SantaLangParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(SantaLangParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(SantaLangParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(SantaLangParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(SantaLangParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(SantaLangParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(SantaLangParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(SantaLangParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(SantaLangParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(SantaLangParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(SantaLangParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(SantaLangParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(SantaLangParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(SantaLangParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(SantaLangParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(SantaLangParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(SantaLangParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(SantaLangParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(SantaLangParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(SantaLangParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(SantaLangParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(SantaLangParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(SantaLangParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(SantaLangParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(SantaLangParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(SantaLangParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(SantaLangParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(SantaLangParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(SantaLangParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(SantaLangParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(SantaLangParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link SantaLangParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(SantaLangParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(SantaLangParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(SantaLangParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SantaLangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SantaLangParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SantaLangParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SantaLangParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(SantaLangParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(SantaLangParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(SantaLangParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(SantaLangParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(SantaLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(SantaLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(SantaLangParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(SantaLangParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(SantaLangParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(SantaLangParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(SantaLangParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(SantaLangParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMetaExpression(SantaLangParser.MetaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMetaExpression(SantaLangParser.MetaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(SantaLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(SantaLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SantaLangParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SantaLangParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(SantaLangParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(SantaLangParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(SantaLangParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(SantaLangParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(SantaLangParser.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(SantaLangParser.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(SantaLangParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(SantaLangParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(SantaLangParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(SantaLangParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(SantaLangParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(SantaLangParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(SantaLangParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(SantaLangParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(SantaLangParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(SantaLangParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(SantaLangParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(SantaLangParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(SantaLangParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(SantaLangParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(SantaLangParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(SantaLangParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(SantaLangParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(SantaLangParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SantaLangParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SantaLangParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(SantaLangParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(SantaLangParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SantaLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SantaLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(SantaLangParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(SantaLangParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SantaLangParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SantaLangParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SantaLangParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SantaLangParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SantaLangParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SantaLangParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(SantaLangParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(SantaLangParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(SantaLangParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(SantaLangParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(SantaLangParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(SantaLangParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(SantaLangParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(SantaLangParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(SantaLangParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(SantaLangParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(SantaLangParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(SantaLangParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(SantaLangParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(SantaLangParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(SantaLangParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(SantaLangParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(SantaLangParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(SantaLangParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(SantaLangParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(SantaLangParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(SantaLangParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(SantaLangParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesceExpression(SantaLangParser.CoalesceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link SantaLangParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesceExpression(SantaLangParser.CoalesceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(SantaLangParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(SantaLangParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link SantaLangParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(SantaLangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link SantaLangParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(SantaLangParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link SantaLangParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnoymousFunctionDecl(SantaLangParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link SantaLangParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnoymousFunctionDecl(SantaLangParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link SantaLangParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(SantaLangParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link SantaLangParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(SantaLangParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(SantaLangParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(SantaLangParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(SantaLangParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(SantaLangParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SantaLangParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SantaLangParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SantaLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SantaLangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SantaLangParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SantaLangParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SantaLangParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SantaLangParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBigintLiteral(SantaLangParser.BigintLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBigintLiteral(SantaLangParser.BigintLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(SantaLangParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(SantaLangParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(SantaLangParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(SantaLangParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SantaLangParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SantaLangParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(SantaLangParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(SantaLangParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(SantaLangParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(SantaLangParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SantaLangParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(SantaLangParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SantaLangParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(SantaLangParser.EosContext ctx);
}