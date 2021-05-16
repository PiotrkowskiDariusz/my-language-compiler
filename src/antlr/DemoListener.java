package antlr;// Generated from Demo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DemoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DemoParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DemoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DemoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DemoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DemoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(DemoParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(DemoParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(DemoParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(DemoParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(DemoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(DemoParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single2}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle2(DemoParser.Single2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single2}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle2(DemoParser.Single2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(DemoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(DemoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(DemoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(DemoParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterDouble(DemoParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitDouble(DemoParser.DoubleContext ctx);
}