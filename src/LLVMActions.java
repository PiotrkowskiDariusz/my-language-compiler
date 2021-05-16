import antlr.DemoBaseListener;
import antlr.DemoParser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

enum VarType{ INT, DOUBLE, ID, UNKNOWN }

class Value{ 
	public String name;
	public VarType type;
	public Value( String name, VarType type ){
		this.name = name;
		this.type = type;
	}
}

public class LLVMActions extends DemoBaseListener {

    HashMap<String, VarType> globals = new HashMap<String, VarType>();
    HashMap<String, VarType> locals = new HashMap<String, VarType>();
    HashSet<String> funcs = new HashSet<String>();
    Stack<Value> stack = new Stack<Value>();
    Boolean glob;
    String value;
    String function;

    /*@Override
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
    }*/

    @Override
    public void enterStart(DemoParser.StartContext ctx) {
        glob = true;
    }

    @Override
    public void exitStart(DemoParser.StartContext ctx) {
        LLVMGenerator.close_main();
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
    public void exitId(DemoParser.IdContext ctx) {
        if( ctx.ID() != null ){
            String ID = ctx.ID().getText();

            if( locals.containsKey(ID) ) {
                LLVMGenerator.load_i32( "%"+ID );
            } else if( globals.containsKey(ID) ) {
                LLVMGenerator.load_i32( "@"+ID );
            } else if( funcs.contains(ID) ) {
                LLVMGenerator.call(ID);
            } else {
                error(ctx.getStart().getLine(), "Unknown "+ID+ ": local > global > function");
            }
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.ID) );
        }
    }

    @Override
    public void exitAssign(DemoParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();

        if( v.type == VarType.INT ){
            LLVMGenerator.assign_i32(set_variable(ID, v.type), v.name);
        }
        if( v.type == VarType.DOUBLE ){
            LLVMGenerator.assign_double(set_variable(ID, v.type), v.name);
        }
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

    /*@Override
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
    }*/

    @Override
    public void exitPrint(DemoParser.PrintContext ctx) {
        String ID = ctx.ID().getText();
        VarType type;
        if( glob ){
            type = globals.get(ID);
        } else {
            type = locals.get(ID);
        }

        if( type != null ) {
            if( type == VarType.INT ){
                LLVMGenerator.printf_i32(set_variable(ID, type));
            }
            if( type == VarType.DOUBLE ){
                LLVMGenerator.printf_double(set_variable(ID, type));
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable "+ID);
        }
    }

    /*@Override
    public void exitRead(DemoParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if( type == null) {
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT));
            LLVMGenerator.declare_i32(ID);
        }
        LLVMGenerator.scanf(ID);
    }*/

    @Override
    public void exitRead(DemoParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        LLVMGenerator.scanf(set_variable(ID, VarType.INT));
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

    /*@Override
    public void exitEqual(DemoParser.EqualContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.expr().getText();
        if( variables.containsKey(ID) ) {
            LLVMGenerator.icmp( ID, INT );
        } else {
            ctx.getStart().getLine();
            System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
        }
    }*/

    @Override
    public void exitEqual(DemoParser.EqualContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.INT().getText();
        LLVMGenerator.icmp( set_variable(ID, VarType.INT), INT );
    }

    /*@Override
    public void exitRepetitions(DemoParser.RepetitionsContext ctx) {
        LLVMGenerator.repeatstart(value);
    }*/

    @Override
    public void exitRepetitions(DemoParser.RepetitionsContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.repeatstart(v.name, glob);
    }

    @Override
    public void exitBlock(DemoParser.BlockContext ctx) {
        if( ctx.getParent() instanceof DemoParser.RepeatContext ){
            LLVMGenerator.repeatend();
        }
    }

    @Override
    public void exitFparam(DemoParser.FparamContext ctx) {
        String ID = ctx.ID().getText();
        funcs.add(ID);
        function = ID;
        LLVMGenerator.functionstart(ID);
    }

    @Override
    public void enterFblock(DemoParser.FblockContext ctx) {
        glob = false;
    }

    @Override
    public void exitFblock(DemoParser.FblockContext ctx) {
        if( ! locals.containsKey(function) ){
            LLVMGenerator.assign_i32(set_variable(function, VarType.INT), "0");
        }
        LLVMGenerator.load_i32( "%"+function );
        LLVMGenerator.functionend();
        locals = new HashMap<String, VarType>();
        glob = true;
    }

    @Override
    public void exitCall(DemoParser.CallContext ctx) {
        LLVMGenerator.call(ctx.ID().getText());
    }

    public String set_variable(String ID, VarType TYPE){
        String id;
        if( glob ){
            if( ! globals.containsKey(ID) ) {
                globals.put(ID, TYPE);
                if( TYPE == VarType.INT ){
                    LLVMGenerator.declare_i32(ID, true);
                }
                if( TYPE == VarType.DOUBLE ){
                    LLVMGenerator.declare_double(ID, true);
                }
            }
            id = "@"+ID;
        } else {
            if( ! locals.containsKey(ID) ) {
                locals.put(ID, TYPE);
                if( TYPE == VarType.INT ){
                    LLVMGenerator.declare_i32(ID, false);
                }
                if( TYPE == VarType.DOUBLE ){
                    LLVMGenerator.declare_double(ID, false);
                }
            }
            id = "%"+ID;
        }
        return id;
    }

   void error(int line, String msg){
       System.err.println("Error, line "+line+", "+msg);
       System.exit(1);
   } 
       
}
