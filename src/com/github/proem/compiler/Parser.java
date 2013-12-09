
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Dec 09 07:59:09 CST 2013
//----------------------------------------------------

package compiler;

import compiler.lib.Attr;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.lang.Thread.State;
import java.awt.Dimension;
import java.awt.Point;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Dec 09 07:59:09 CST 2013
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\075\000\002\002\003\000\002\002\004\000\002\003" +
    "\003\000\002\003\002\000\002\004\004\000\002\004\003" +
    "\000\002\005\003\000\002\006\006\000\002\012\005\000" +
    "\002\012\003\000\002\013\005\000\002\013\003\000\002" +
    "\014\003\000\002\015\003\000\002\015\003\000\002\015" +
    "\003\000\002\015\003\000\002\015\003\000\002\007\006" +
    "\000\002\016\005\000\002\016\003\000\002\017\005\000" +
    "\002\017\003\000\002\020\005\000\002\020\005\000\002" +
    "\020\005\000\002\020\005\000\002\020\005\000\002\020" +
    "\005\000\002\020\003\000\002\021\005\000\002\021\005" +
    "\000\002\021\003\000\002\022\005\000\002\022\005\000" +
    "\002\022\003\000\002\023\003\000\002\023\005\000\002" +
    "\023\004\000\002\024\003\000\002\024\003\000\002\024" +
    "\003\000\002\024\003\000\002\024\003\000\002\025\003" +
    "\000\002\030\003\000\002\026\003\000\002\027\003\000" +
    "\002\010\007\000\002\031\003\000\002\031\002\000\002" +
    "\032\005\000\002\032\003\000\002\011\003\000\002\011" +
    "\003\000\002\011\003\000\002\034\011\000\002\035\013" +
    "\000\002\036\012\000\002\037\006\000\002\037\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\026\000\006\002\ufffe\014\013\001\002\000\006\016" +
    "\ufff5\047\ufff5\001\002\000\004\002\030\001\002\000\006" +
    "\002\ufffc\014\ufffc\001\002\000\006\016\ufff8\047\ufff8\001" +
    "\002\000\004\002\001\001\002\000\006\002\uffff\014\013" +
    "\001\002\000\006\002\ufffb\014\ufffb\001\002\000\006\016" +
    "\uffd5\047\uffd5\001\002\000\006\016\015\047\016\001\002" +
    "\000\004\014\013\001\002\000\014\004\023\005\024\006" +
    "\022\007\017\010\021\001\002\000\004\017\ufff3\001\002" +
    "\000\004\017\025\001\002\000\004\017\ufff4\001\002\000" +
    "\004\017\ufff2\001\002\000\004\017\ufff0\001\002\000\004" +
    "\017\ufff1\001\002\000\006\002\ufffa\014\ufffa\001\002\000" +
    "\006\016\ufff9\047\ufff9\001\002\000\006\002\ufffd\014\ufffd" +
    "\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\026\000\022\002\004\003\007\004\010\005\005\006" +
    "\011\012\013\014\006\025\003\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\005\026\006\011\012\013\014\006" +
    "\025\003\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\014\025\025\003\001\001\000\004" +
    "\015\017\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


 
        
        
        public LinkedList<compiler.lib.Error> errores=new LinkedList<>();
        
        
        public void report_error(String message, Object info){
                compiler.lib.Error e=new compiler.lib.Error(message,null,null);
                if(info instanceof java_cup.runtime.Symbol){
                        e.setSym((java_cup.runtime.Symbol)info);
                }
                errores.add(e);
        }
        public void report_fatal_error(String message,Object info){
                report_error(message,info);
                errores.getLast().println();
        }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {


   

  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // elseif ::= 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("elseif",29, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // elseif ::= ELSE LL1 body LL2 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("elseif",29, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // if ::= IF P1 expr P2 LL1 body LL2 elseif 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // for ::= FOR P1 id TO expr P2 LL1 body LL2 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("for",27, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // while ::= WHILE P1 expr P2 LL1 body LL2 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("while",26, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // control ::= if 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("control",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // control ::= for 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("control",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // control ::= while 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("control",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // param_list ::= expr 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("param_list",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // param_list ::= param_list COMA expr 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("param_list",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // params ::= 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("params",23, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // params ::= param_list 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("params",23, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // struct ::= id_list2 P1 params P2 PCOMA 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("struct",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // int ::= INT 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("int",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // string ::= STRING 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("string",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // boolean ::= BOOLEAN 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("boolean",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // id ::= ID 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("id",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // val ::= struct 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // val ::= int 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // val ::= string 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // val ::= boolean 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // val ::= id 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // expr5 ::= NOT expr 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr5",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // expr5 ::= P1 expr P2 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr5",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expr5 ::= val 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr5",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expr4 ::= expr5 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr4",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // expr4 ::= expr4 DIV expr5 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr4",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // expr4 ::= expr4 MULTI expr5 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr4",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expr3 ::= expr4 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr3",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expr3 ::= expr3 MINUS expr4 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr3",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expr3 ::= expr3 PLUS expr4 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr3",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expr2 ::= expr3 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr2",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expr2 ::= expr2 NEQUAL expr3 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr2",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expr2 ::= expr2 DEQUAL expr3 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr2",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expr2 ::= expr2 BTHAN expr3 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr2",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expr2 ::= expr2 LTHAN expr3 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr2",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expr2 ::= expr2 BETHAN expr3 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr2",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr2 ::= expr2 LETHAN expr3 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr2",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr1 ::= expr2 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr1",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr1 ::= expr1 AND expr2 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr1",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= expr1 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= expr OR expr1 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // asignacion ::= expr EQUAL id_list PCOMA 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("asignacion",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // tipo ::= KW_INT 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // tipo ::= KW_STRING 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // tipo ::= KW_BOOLEAN 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // tipo ::= KW_QUEUE 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // tipo ::= KW_LIST 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // id_list_item ::= id 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("id_list_item",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // id_list2 ::= id_list_item 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("id_list2",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // id_list2 ::= id_list2 PUNTO id_list_item 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("id_list2",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // id_list ::= id_list_item 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("id_list",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // id_list ::= id_list COMA id_list_item 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("id_list",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // declaracion ::= id_list IS tipo PCOMA 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= declaracion 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // list ::= stmt 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("list",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // list ::= list stmt 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("list",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // body ::= 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("body",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // body ::= list 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("body",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= begin EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Attr start_val = (Attr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // begin ::= body 
            {
              Attr RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("begin",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

