import grammar.diorLexer;
import grammar.diorParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class RunCompiler {
    public static void main(String[] args) {
        String infile;
        String outfile;
        CompileDior compiler = new CompileDior();

        System.out.println("Vilket program vill du kompilera");
        Scanner scanner = new Scanner(System.in);
        infile = scanner.nextLine();

        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infile));

            diorLexer lexer = new diorLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            diorParser parser = new diorParser(tokens);
            ParseTree tree = parser.file();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new CompileDior(), tree);

            System.out.println("Vad ska den kompilerade filen heta?");
            scanner = new Scanner(System.in);
            outfile = scanner.nextLine();

            Writer w = new OutputStreamWriter(new FileOutputStream(outfile));
            w.write(compiler.getCompilerCode());
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}