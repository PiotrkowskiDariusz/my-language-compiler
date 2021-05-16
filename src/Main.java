import antlr.DemoLexer;
import antlr.DemoParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("test.x");

        DemoLexer lexer = new DemoLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DemoParser parser = new DemoParser(tokens);

        ParseTree tree = parser.start();

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }
}
