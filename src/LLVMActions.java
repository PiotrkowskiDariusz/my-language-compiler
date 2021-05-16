import antlr.DemoBaseListener;
import antlr.DemoParser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

enum VarType{ INT, DOUBLE, UNKNOWN }

class Value{ 
	public String name;
	public VarType type;
	public Value( String name, VarType type ){
		this.name = name;
		this.type = type;
	}
}

public class LLVMActions extends DemoBaseListener {
    
    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();
    String value;

    @Override
    public void exitAssign(DemoParser.AssignContext ctx) {
       String ID = ctx.ID().getText();
       Value v = stack.pop();
       variables.put(ID, v.type);
       if( v.type == VarType.INT ){
         LLVMGenerator.declare_i32(ID);
         LLVMGenerator.assign_i32(ID, v.name);
       } 
       if( v.type == VarType.DOUBLE ){
         LLVMGenerator.declare_double(ID);
         LLVMGenerator.assign_double(ID, v.name);
       } 
    }

    @Override 
    public void exitStart(DemoParser.StartContext ctx) {
        try {
            FileWriter writer = new FileWriter("test.ll");
            writer.write(LLVMGenerator.generate());
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( LLVMGenerator.generate() );
    }

    @Override 
    public void exitInt(DemoParser.IntContext ctx) { 
         stack.push( new Value(ctx.INT().getText(), VarType.INT) );       
    } 

    @Override 
    public void exitDouble(DemoParser.DoubleContext ctx) {
         stack.push( new Value(ctx.DOUBLE().getText(), VarType.DOUBLE) );
    } 

    @Override 
    public void exitAdd(DemoParser.AddContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.add_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.DOUBLE ){
             LLVMGenerator.add_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DOUBLE) );
         }
       } else {
          error(ctx.getStart().getLine(), "add type mismatch");
       }
    }

    @Override 
    public void exitMult(DemoParser.MultContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.mult_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.DOUBLE ){
             LLVMGenerator.mult_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DOUBLE) );
         }
       } else {
          error(ctx.getStart().getLine(), "mult type mismatch");
       }
    }

    /*@Override
    public void exitToint(DemoParser.TointContext ctx) {
       Value v = stack.pop();
       LLVMGenerator.fptosi( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
    }

    @Override
    public void exitToreal(DemoParser.TorealContext ctx) {
       Value v = stack.pop();
       LLVMGenerator.sitofp( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
    }*/

    @Override
    public void exitPrint(DemoParser.PrintContext ctx) {
       String ID = ctx.ID().getText();
       VarType type = variables.get(ID);
       if( type != null ) {
          if( type == VarType.INT ){
            LLVMGenerator.printf_i32( ID );
          }
          if( type == VarType.DOUBLE ){
            LLVMGenerator.printf_double( ID );
          }
       } else {
          error(ctx.getStart().getLine(), "unknown variable "+ID);
       }
    }

    @Override
    public void exitRead(DemoParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if( type == null) {
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT));
            LLVMGenerator.declare_i32(ID);
        }
        LLVMGenerator.scanf(ID);
    }

    @Override
    public void exitIf(DemoParser.IfContext ctx) {
    }

    @Override
    public void enterBlockif(DemoParser.BlockifContext ctx) {
        LLVMGenerator.ifstart();
    }

    @Override
    public void exitBlockif(DemoParser.BlockifContext ctx) {
        LLVMGenerator.ifend();
    }

    @Override
    public void exitEqual(DemoParser.EqualContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.expr().getText();
        if( variables.containsKey(ID) ) {
            LLVMGenerator.icmp( ID, INT );
        } else {
            ctx.getStart().getLine();
            System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
        }
    }

    /*@Override
    public void exitRepetitions(DemoParser.RepetitionsContext ctx) {
        LLVMGenerator.repeatstart(value);
    }*/

    @Override
    public void exitRepetitions(DemoParser.RepetitionsContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.repeatstart(v.name);
    }

    @Override
    public void exitBlock(DemoParser.BlockContext ctx) {
        if( ctx.getParent() instanceof DemoParser.RepeatContext ){
            LLVMGenerator.repeatend();
        }
    }

   void error(int line, String msg){
       System.err.println("Error, line "+line+", "+msg);
       System.exit(1);
   } 
       
}
