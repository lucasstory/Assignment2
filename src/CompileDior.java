import grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CompileDior extends diorBaseListener {
    private StringBuilder out = new StringBuilder();

    public String getCompilerCode() {
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
        this.out.append("add\n");
        System.out.println("add");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUnaryExpression(diorParser.UnaryExpressionContext ctx) {
        String value = "";

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
}
