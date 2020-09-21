// Generated from C:/Users/lelia/OneDrive/Dokument/GitHub/Assignment2/src/grammar\dior.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link diorParser}.
 */
public interface diorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link diorParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(diorParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(diorParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(diorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(diorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(diorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(diorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssignment(diorParser.ExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssignment(diorParser.ExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterIncrementAssignment(diorParser.IncrementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitIncrementAssignment(diorParser.IncrementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrementAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDecrementAssignment(diorParser.DecrementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrementAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDecrementAssignment(diorParser.DecrementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(diorParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(diorParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(diorParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(diorParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(diorParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(diorParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(diorParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(diorParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#until_statement}.
	 * @param ctx the parse tree
	 */
	void enterUntil_statement(diorParser.Until_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#until_statement}.
	 * @param ctx the parse tree
	 */
	void exitUntil_statement(diorParser.Until_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(diorParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(diorParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualityExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualityExpression(diorParser.NotEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualityExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualityExpression(diorParser.NotEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notLessThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotLessThanExpression(diorParser.NotLessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notLessThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotLessThanExpression(diorParser.NotLessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(diorParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(diorParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPlusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(diorParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPlusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(diorParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanOrEqualExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpression(diorParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanOrEqualExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpression(diorParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(diorParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(diorParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(diorParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(diorParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpression(diorParser.IncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpression(diorParser.IncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanOrEqualExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpression(diorParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanOrEqualExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpression(diorParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(diorParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(diorParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(diorParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(diorParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(diorParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(diorParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpression(diorParser.AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpression(diorParser.AtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(diorParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(diorParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(diorParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(diorParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(diorParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(diorParser.PlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrementExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpression(diorParser.DecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrementExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpression(diorParser.DecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(diorParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(diorParser.DivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notGreaterThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotGreaterThanExpression(diorParser.NotGreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notGreaterThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotGreaterThanExpression(diorParser.NotGreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAtom(diorParser.IntegerAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAtom(diorParser.IntegerAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFloatAtom(diorParser.FloatAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFloatAtom(diorParser.FloatAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBoolAtom(diorParser.BoolAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBoolAtom(diorParser.BoolAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(diorParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(diorParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(diorParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(diorParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtom(diorParser.ExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtom(diorParser.ExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(diorParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(diorParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(diorParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(diorParser.BoolContext ctx);
}