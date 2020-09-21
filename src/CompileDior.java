import grammar.*;

public class CompileDior extends diorBaseListener {
    private static StringBuilder out = new StringBuilder();

    String getCompilerCode() {
        return out.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssignment(diorParser.AssignmentContext ctx) {
        String row = "pop " + ctx.ID().getText();
        this.out.append(row).append("\n");
        System.out.println(row);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAddExpression(diorParser.AddExpressionContext ctx) {
        this.out.append("Add ").append(ctx.getText());
        System.out.println("Add " + ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUnaryExpression(diorParser.UnaryExpressionContext ctx) {
        String value;

        if (ctx.ID() == null)
            value = ctx.INT().getText();
        else
            value = ctx.ID().getText();

        this.out.append("push ").append(value).append("\n");
        System.out.println("Push " + value);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrintOut(diorParser.PrintOutContext ctx) {
        this.out.append("print ").append(ctx.ID().getText()).append("\n");
        System.out.println("print " + ctx.ID().getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterForStatement(diorParser.ForStatementContext ctx) {
        System.out.println();
        int x = Integer.parseInt(ctx.forConditions().endExpr.getText());
        for (int i = Integer.parseInt(ctx.forConditions().startExpr.getText()); i <= x; i++) {
            this.out.append("Start loop: ").append(ctx.forConditions().startExpr.getText()).append("\n");
            this.out.append("Iterator: ").append(ctx.forConditions().iterator.ID().getText()).append("\n");
            System.out.println("Start loop: " + ctx.forConditions().startExpr.getText());
            System.out.println("i " + i);
            System.out.println("Iterator: " + ctx.forConditions().iterator.ID().getText());
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitForStatement(diorParser.ForStatementContext ctx) {
        this.out.append("End loop: ").append(ctx.forConditions().endExpr.getText()).append("\n");
        System.out.println();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhileStatment(diorParser.WhileStatmentContext ctx) {
        System.out.println();
        System.out.println("Enter while");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhileStatment(diorParser.WhileStatmentContext ctx) {
        System.out.println("Exit while");
        System.out.println();
    }
}
