// Generated from C:/Users/vikto/Documents/GitHub/Assignment2/src/grammar\dior.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link diorParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(diorParser.CodeContext ctx);
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
	 * Visit a parse tree produced by {@link diorParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(diorParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#whileStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatment(diorParser.WhileStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(diorParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(diorParser.ForConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(diorParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(diorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(diorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(diorParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(diorParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(diorParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#printOut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintOut(diorParser.PrintOutContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#maths}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaths(diorParser.MathsContext ctx);
}