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
	 * Visit a parse tree produced by {@link diorParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(diorParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(diorParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(diorParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(diorParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(diorParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(diorParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(diorParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(diorParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(diorParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(diorParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(diorParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(diorParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(diorParser.ParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(diorParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithDefaultValue(diorParser.ParameterWithDefaultValueContext ctx);
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
}