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
	 * Enter a parse tree produced by {@link diorParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(diorParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(diorParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(diorParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(diorParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(diorParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(diorParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(diorParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(diorParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(diorParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(diorParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(diorParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(diorParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(diorParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(diorParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(diorParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(diorParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(diorParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(diorParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(diorParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(diorParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(diorParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(diorParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(diorParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(diorParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(diorParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(diorParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(diorParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(diorParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithDefaultValue(diorParser.ParameterWithDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithDefaultValue(diorParser.ParameterWithDefaultValueContext ctx);
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
}