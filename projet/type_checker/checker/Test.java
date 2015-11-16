package checker;

import java.util.List;
import java.util.Arrays;

import java.io.File;
import java.io.PushbackReader;
import java.io.BufferedReader;
import java.io.FileReader;

import checker.util.Tuple;
import checker.node.*;
import checker.lexer.Lexer;
import checker.parser.Parser;
import checker.typecheck.ClassTable;
import checker.model.*;
import checker.passes.BuildModel;
import checker.passes.FJException;

class Test {

    private static final String exmdir =
	"/home/remi/Desktop/MTOCPL/projet/type_checker/examples";

    private static List<String> testsOK = Arrays.asList(
	"Example1.fwj",
	"Example3.fwj",
	"ok1.fwj");

    private static List<Tuple<String,String>> testsKO = Arrays.asList(
  	      new Tuple<String,String>("Example2.fwj","[checker.typecheck.FJPathCycleException: Cycle in path: [ClassName: A]]"),
	      new Tuple<String,String>("nok2.fwj","[checker.passes.FJException: Constructor fields do not match parent class]"),
    	      new Tuple<String, String>("nok1.fwj","ClassName: ClassName: C  does not exist in classtable"));

    // Launch the typechecker on a given file, and return the error
    // message if any, and the empty string otherwise.
    public static String typeCheck(String filename) {

	try {
	    // Parse file
	    Lexer l = new Lexer (new PushbackReader (
				 new BufferedReader(
				 new FileReader(filename))));
	    Parser p = new Parser (l);
	    Start start = p.parse ();

	    // Build a Model from the code
	    BuildModel bm = new BuildModel();
	    start.apply(bm);
	    List<ClassDecl> classes = bm.getClasses();

	    ClassTable ct = new ClassTable();
	    for(ClassDecl cd : classes) {
		ct.addClassDefinition(cd);
	    }
	    // TypeCheck the class table
	    ct.validateClassTable();
	    return "";

	} catch(Throwable t) {
	    return t.getMessage();
	}
    }

    public static void main(String[] args) {
	for (String filename : testsOK) {
	    System.out.print(" * " + filename);
	    String result = Test.typeCheck(Test.exmdir + "/" + filename);
	    if (!result.equals(""))
	    	System.out.println(" "+result+" ");
	    System.out.println(" .");
	}
	for (Tuple<String,String> t : testsKO) {
	    String filename = t.getX();
	    System.out.print(" * " + filename);
	    String result = Test.typeCheck(Test.exmdir + "/" + filename);
	    if (result.equals(t.getY()))
		System.out.println(" .");
	    else {
		System.out.println(" Error is '" + result + "' and should be '" + t.getY() + "'");
	    }

	}
    }
}
