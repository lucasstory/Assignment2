
// Generated from C:/Users/lelia/OneDrive/Dokument/GitHub/Assignment2/src/grammar\dior.g4 by ANTLR 4.8

package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link diorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface diorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link diorParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(diorParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(diorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(diorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAssignment(diorParser.ExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementAssignment(diorParser.IncrementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrementAssignment}
	 * labeled alternative in {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementAssignment(diorParser.DecrementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(diorParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(diorParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(diorParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(diorParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#until_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_statement(diorParser.Until_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(diorParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualityExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualityExpression(diorParser.NotEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notLessThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotLessThanExpression(diorParser.NotLessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(diorParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryPlusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpression(diorParser.UnaryPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanOrEqualExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualExpression(diorParser.LessThanOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(diorParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(diorParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpression(diorParser.IncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanOrEqualExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualExpression(diorParser.GreaterThanOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(diorParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(diorParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(diorParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpression(diorParser.AtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(diorParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(diorParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(diorParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrementExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpression(diorParser.DecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(diorParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notGreaterThanExpression}
	 * labeled alternative in {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotGreaterThanExpression(diorParser.NotGreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAtom(diorParser.IntegerAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAtom(diorParser.FloatAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAtom(diorParser.BoolAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(diorParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(diorParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAtom}
	 * labeled alternative in {@link diorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtom(diorParser.ExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(diorParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(diorParser.BoolContext ctx);
}