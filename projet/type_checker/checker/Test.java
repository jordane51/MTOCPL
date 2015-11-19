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
	"Example14.fwj",
	"Example17.fwj",
	"Example18.fwj",
	"Example19.fwj");

    private static List<Tuple<String,String>> testsKO = Arrays.asList(
      new Tuple<String,String>("Example2.fwj","[checker.typecheck.FJPathCycleException: Cycle in path: [ClassName: A]]"),
      new Tuple<String,String>("Example5.fwj","Invoking a method with an argument that is not a subtype"),
      new Tuple<String,String>("Example6.fwj","[checker.typecheck.FJUnknownClassNameException: Unknown class name: ClassName: PPPPair]"),
      new Tuple<String,String>("Example7.fwj","Duplicate definition for class: A"),
      new Tuple<String,String>("Example8.fwj","[1,14] expecting: 'extends'"),
      new Tuple<String,String>("Example9.fwj","Trying to define class Object"),
      new Tuple<String,String>("Example10.fwj","ClassName: ClassName: A  does not exist in classtable"),
      new Tuple<String,String>("Example11.fwj","Invoking new with an argument that is not of the right type"),
      new Tuple<String,String>("Example12.fwj","Variable: checker.model.ArgumentName@6e03f5ad is unknown"),
      new Tuple<String,String>("Example13.fwj","checker.passes.FJException: Looking up a field that doesn't exist!"),
      new Tuple<String,String>("Example15.fwj","Can't find method in ClassName: Pair"),
      new Tuple<String,String>("Example16.fwj","Invoking a method with incorrect number of arguments"),
      new Tuple<String,String>("Example19.fwj",""),
      new Tuple<String,String>("Example4.fwj","'new' with wrong number of arguments for the constructor"));

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
	    Test.typeCheck(Test.exmdir + "/" + filename);
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
