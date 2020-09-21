// Generated from C:/Users/vikto/Documents/GitHub/Assignment2/src/grammar\dior.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link diorParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(diorParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(diorParser.CodeContext ctx);
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
	 * Enter a parse tree produced by {@link diorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(diorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(diorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatment(diorParser.WhileStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatment(diorParser.WhileStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(diorParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(diorParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void enterForConditions(diorParser.ForConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void exitForConditions(diorParser.ForConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#varRef}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(diorParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#varRef}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(diorParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(diorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(diorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(diorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(diorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(diorParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(diorParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(diorParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(diorParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(diorParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(diorParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#printOut}.
	 * @param ctx the parse tree
	 */
	void enterPrintOut(diorParser.PrintOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#printOut}.
	 * @param ctx the parse tree
	 */
	void exitPrintOut(diorParser.PrintOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#maths}.
	 * @param ctx the parse tree
	 */
	void enterMaths(diorParser.MathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#maths}.
	 * @param ctx the parse tree
	 */
	void exitMaths(diorParser.MathsContext ctx);
}