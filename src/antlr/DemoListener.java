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
	 * Enter a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DemoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DemoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(DemoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(DemoParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(DemoParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(DemoParser.RepeatContext ctx);
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
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCall(DemoParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCall(DemoParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DemoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DemoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(DemoParser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(DemoParser.FparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFblock(DemoParser.FblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFblock(DemoParser.FblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void enterRepetitions(DemoParser.RepetitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void exitRepetitions(DemoParser.RepetitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(DemoParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(DemoParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(DemoParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(DemoParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAdd(DemoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAdd(DemoParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMult(DemoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMult(DemoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDouble(DemoParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDouble(DemoParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterId(DemoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitId(DemoParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInt(DemoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInt(DemoParser.IntContext ctx);
}