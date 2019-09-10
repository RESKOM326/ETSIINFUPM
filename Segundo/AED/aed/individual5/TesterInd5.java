
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2018/10/19 -- 12:25:5
// Seed: {1539,944704,392363}
//
//////////////////////////////////////////////////////////////////////



package aed.individual5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.positionlist.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;


@SuppressWarnings("unused")
public class TesterInd5 {

  public static void main(String[] args) {
    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    ResultsHandler.init();

    // Permit executing individual tests: 
    // the first argument should be the test number
    if ((args.length == 1) && !args[0].equals("--nota-as-exit-code")) {
	try {
	    int testNumber = Integer.parseInt(args[0]);
	    String testName = "test_"+testNumber;
	    java.lang.reflect.Method testMethod = null;
	    try {
		testMethod = Tests.class.getDeclaredMethod(testName);
		testMethod.setAccessible(true);
	    } catch (SecurityException exc) {
		System.out.println("\n*** Error: test "+testName+" is not accessible");
		System.exit(24);
	    } catch (NoSuchMethodException exc) {
		System.out.println("\n*** Error: test "+testName+" does not exist");
		System.exit(24);
	    }

	    Object result = null;

	    try {
		result = testMethod.invoke(null);
	    } catch (IllegalAccessException exc) {
		System.out.println("\n*** Error: not permitted to access "+testName);
		System.exit(24);
	    } catch (InvocationTargetException exc) {
		System.out.println("\n*** Error: cannot invoke "+testName);
		System.exit(24);
	    }
	    
	    if (result instanceof Boolean) {
		Boolean booleanResult = (Boolean) result;
		if (booleanResult)
		    System.out.println("\n*** Test "+testName+" succeeded.");
		else
		    System.out.println("\n*** Error: test "+testName+" failed.");

		System.exit(booleanResult ? 0 : 24);
	    }
	} catch (NumberFormatException exc) {
	    System.out.println("\n*** Error: argument should be an integer but is "+args[0]);
	    System.exit(24);
	}
    } else {
      Tests.runTests();

      // Check if the option --nota-as-exit-code is set --
      // if so exit with the nota as the exit code
      if (args.length == 1) {
	System.exit(ResultsHandler.get_nota());
      } else {
	// Standard exit codes
	if (ResultsHandler.results_ok()) System.exit(0);
	else System.exit(24);
      }
    }
  }
}    
    

class Tests {

  static String tester = "TesterInd5";

  static boolean runTests() {
    ResultsHandler.init();

    if (ResultsHandler.local_results_ok_sofar("recursionCheck"))
      ResultsHandler.add_result("recursionCheck",test_1());

    if (ResultsHandler.local_results_ok_sofar("recursionCheck"))
      ResultsHandler.add_result("recursionCheck",test_2());

    if (ResultsHandler.local_results_ok_sofar("recursionCheck"))
      ResultsHandler.add_result("recursionCheck",test_3());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_4());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_5());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_6());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_7());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_8());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_9());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_10());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_11());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_12());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_13());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_14());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_15());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_16());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_17());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_18());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_19());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_20());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_21());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_22());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_23());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_24());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_25());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_26());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_27());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_28());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_29());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_30());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_31());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_32());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_33());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_34());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_35());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_36());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_37());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_38());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_39());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_40());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_41());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_42());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_43());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_44());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_45());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_46());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_47());

    if (ResultsHandler.local_results_ok_sofar("babylonRoot"))
      ResultsHandler.add_result("babylonRoot",test_48());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_49());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_50());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_51());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_52());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_53());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_54());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_55());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_56());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_57());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_58());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_59());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_60());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_61());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_62());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_63());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_64());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_65());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_66());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_67());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_68());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_69());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_70());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_71());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_72());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_73());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_74());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_75());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_76());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_77());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_78());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_79());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_80());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_81());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_82());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_83());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_84());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_85());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_86());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_87());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_88());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_89());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_90());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_91());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_92());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_93());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_94());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_95());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_96());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_97());

    if (ResultsHandler.local_results_ok_sofar("allEven"))
      ResultsHandler.add_result("allEven",test_98());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_99());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_100());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_101());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_102());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_103());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_104());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_105());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_106());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_107());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_108());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_109());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_110());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_111());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_112());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_113());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_114());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_115());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_116());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_117());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_118());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_119());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_120());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_121());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_122());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_123());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_124());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_125());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_126());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_127());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_128());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_129());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_130());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_131());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_132());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_133());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_134());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_135());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_136());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_137());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_138());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_139());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_140());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_141());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_142());

    if (ResultsHandler.local_results_ok_sofar("sumEven"))
      ResultsHandler.add_result("sumEven",test_143());


    ResultsHandler.report_results();


    if (ResultsHandler.results_ok())
      return true;
    else
      return false;
  }



  static boolean test_1 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_1") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.RecursionCheck(new String("allEven"),1).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_2 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_2") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.RecursionCheck(new String("babylonRoot"),1).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_3 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_3") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.RecursionCheck(new String("sumEven"),1).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_4 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_4") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.00000000000000000000e+00).doCall().checkResult(1.00000000000000000000e+00) ;
    return ok_sofar ;
  }



  static boolean test_5 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_5") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(2.00000000000000000000e+00).doCall().checkResult(1.41421356237309514547e+00) ;
    return ok_sofar ;
  }



  static boolean test_6 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_6") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.00000000000000000000e+00).doCall().checkResult(1.73205080756887719318e+00) ;
    return ok_sofar ;
  }



  static boolean test_7 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_7") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(9.00000000000000000000e+00).doCall().checkResult(3.00000000000000000000e+00) ;
    return ok_sofar ;
  }



  static boolean test_8 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_8") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.60000000000000000000e+01).doCall().checkResult(4.00000000000000000000e+00) ;
    return ok_sofar ;
  }



  static boolean test_9 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_9") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.66666666666666628771e+02).doCall().checkResult(1.91485421551267620544e+01) ;
    return ok_sofar ;
  }



  static boolean test_10 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_10") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.30480000000000000000e+04).doCall().checkResult(1.14227842490349090099e+02) ;
    return ok_sofar ;
  }



  static boolean test_11 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_11") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.44300000000000000000e+04).doCall().checkResult(1.20124934963561997847e+02) ;
    return ok_sofar ;
  }



  static boolean test_12 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_12") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.49517500000000000000e+04).doCall().checkResult(1.22277348679140075660e+02) ;
    return ok_sofar ;
  }



  static boolean test_13 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_13") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(2.08603333333333321207e+04).doCall().checkResult(1.44431067756675304281e+02) ;
    return ok_sofar ;
  }



  static boolean test_14 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_14") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(2.72850000000000000000e+04).doCall().checkResult(1.65181718116745599900e+02) ;
    return ok_sofar ;
  }



  static boolean test_15 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_15") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.16020000000000000000e+04).doCall().checkResult(1.77769513696809099201e+02) ;
    return ok_sofar ;
  }



  static boolean test_16 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_16") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.16470000000000036380e+04).doCall().checkResult(1.77896037055354327094e+02) ;
    return ok_sofar ;
  }



  static boolean test_17 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_17") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.26460000000000000000e+04).doCall().checkResult(1.80682041166243180896e+02) ;
    return ok_sofar ;
  }



  static boolean test_18 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_18") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.26987999999999992724e+04).doCall().checkResult(1.80828095162228578374e+02) ;
    return ok_sofar ;
  }



  static boolean test_19 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_19") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.35720000000000000000e+04).doCall().checkResult(1.83226635618296512575e+02) ;
    return ok_sofar ;
  }



  static boolean test_20 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_20") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.46213333333333284827e+04).doCall().checkResult(1.86068087896160562877e+02) ;
    return ok_sofar ;
  }



  static boolean test_21 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_21") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.46340000000000000000e+04).doCall().checkResult(1.86102122502673239524e+02) ;
    return ok_sofar ;
  }



  static boolean test_22 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_22") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.61390000000000000000e+04).doCall().checkResult(1.90102603874854906962e+02) ;
    return ok_sofar ;
  }



  static boolean test_23 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_23") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.81810000000000000000e+04).doCall().checkResult(1.95399590582989702625e+02) ;
    return ok_sofar ;
  }



  static boolean test_24 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_24") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.94864166666666715173e+04).doCall().checkResult(1.98711893621561245027e+02) ;
    return ok_sofar ;
  }



  static boolean test_25 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_25") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(4.02510000000000000000e+04).doCall().checkResult(2.00626518685840721901e+02) ;
    return ok_sofar ;
  }



  static boolean test_26 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_26") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(4.03871999999999970896e+04).doCall().checkResult(2.00965668709856998930e+02) ;
    return ok_sofar ;
  }



  static boolean test_27 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_27") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(4.15044000000000014552e+04).doCall().checkResult(2.03726286963661124219e+02) ;
    return ok_sofar ;
  }



  static boolean test_28 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_28") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(4.41900000000000000000e+04).doCall().checkResult(2.10214176496258204452e+02) ;
    return ok_sofar ;
  }



  static boolean test_29 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_29") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(4.54368750000000000000e+04).doCall().checkResult(2.13159271438049358949e+02) ;
    return ok_sofar ;
  }



  static boolean test_30 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_30") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(4.69467272727272720658e+04).doCall().checkResult(2.16671934667892031712e+02) ;
    return ok_sofar ;
  }



  static boolean test_31 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_31") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(4.78005000000000000000e+04).doCall().checkResult(2.18633254561148589801e+02) ;
    return ok_sofar ;
  }



  static boolean test_32 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_32") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(5.14960000000000000000e+04).doCall().checkResult(2.26927301134085666945e+02) ;
    return ok_sofar ;
  }



  static boolean test_33 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_33") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(5.40810000000000000000e+04).doCall().checkResult(2.32553219715401922940e+02) ;
    return ok_sofar ;
  }



  static boolean test_34 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_34") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(5.50840000000000000000e+04).doCall().checkResult(2.34699808265792995599e+02) ;
    return ok_sofar ;
  }



  static boolean test_35 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_35") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(7.32280000000000000000e+04).doCall().checkResult(2.70606725710947557673e+02) ;
    return ok_sofar ;
  }



  static boolean test_36 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_36") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(7.49013333333333284827e+04).doCall().checkResult(2.73681079604223498336e+02) ;
    return ok_sofar ;
  }



  static boolean test_37 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_37") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(8.12080000000000000000e+04).doCall().checkResult(2.84970173877899014769e+02) ;
    return ok_sofar ;
  }



  static boolean test_38 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_38") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(8.18720000000000000000e+04).doCall().checkResult(2.86132836284128700299e+02) ;
    return ok_sofar ;
  }



  static boolean test_39 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_39") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(9.18287500000000000000e+04).doCall().checkResult(3.03032589006529121889e+02) ;
    return ok_sofar ;
  }



  static boolean test_40 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_40") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(9.26160000000000000000e+04).doCall().checkResult(3.04328769589731678025e+02) ;
    return ok_sofar ;
  }



  static boolean test_41 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_41") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(9.41640000000000000000e+04).doCall().checkResult(3.06861532291031892328e+02) ;
    return ok_sofar ;
  }



  static boolean test_42 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_42") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.11902000000000000000e+05).doCall().checkResult(3.34517563066575007724e+02) ;
    return ok_sofar ;
  }



  static boolean test_43 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_43") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.15956000000000000000e+05).doCall().checkResult(3.40523126967905056972e+02) ;
    return ok_sofar ;
  }



  static boolean test_44 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_44") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.37045000000000000000e+05).doCall().checkResult(3.70195894088521754384e+02) ;
    return ok_sofar ;
  }



  static boolean test_45 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_45") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(1.84946000000000000000e+05).doCall().checkResult(4.30053485045755678584e+02) ;
    return ok_sofar ;
  }



  static boolean test_46 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_46") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(2.74340000000000000000e+05).doCall().checkResult(5.23774760751222174804e+02) ;
    return ok_sofar ;
  }



  static boolean test_47 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_47") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(3.82914000000000000000e+05).doCall().checkResult(6.18800452488522296335e+02) ;
    return ok_sofar ;
  }



  static boolean test_48 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_48") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.BabylonRoot(4.91470000000000000000e+05).doCall().checkResult(7.01049213679039780800e+02) ;
    return ok_sofar ;
  }



  static boolean test_49 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_49") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_50 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_50") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] {  }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_51 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_51") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] {  }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_52 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_52") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 0 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_53 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_53") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 1 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_54 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_54") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 2 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_55 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_55") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { null }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_56 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_56") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 1 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_57 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_57") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 2 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_58 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_58") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 3 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_59 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_59") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 4 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_60 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_60") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 5 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_61 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_61") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 6 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_62 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_62") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 7 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_63 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_63") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 8 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_64 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_64") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 9 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_65 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_65") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 1,2 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_66 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_66") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 2,1 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_67 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_67") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 2,null }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_68 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_68") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 1,4 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_69 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_69") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 1,5 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_70 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_70") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 1,8 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_71 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_71") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 1,9 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_72 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_72") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 2,4 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_73 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_73") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 3,1 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_74 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_74") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 4,6 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_75 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_75") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 5,9 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_76 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_76") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 8,3 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_77 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_77") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 8,4 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_78 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_78") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 8,6 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_79 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_79") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 8,7 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_80 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_80") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 8,10 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_81 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_81") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 9,6 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_82 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_82") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 10,3 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_83 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_83") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 10,8 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_84 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_84") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 10,10 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_85 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_85") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { null,2 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_86 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_86") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 2,4,1 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_87 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_87") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 1,1,4 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_88 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_88") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 3,6,5 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_89 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_89") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 5,10,1 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_90 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_90") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 8,4,6 }).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_91 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_91") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 10,10,5 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_92 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_92") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 4,7,1,8 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_93 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_93") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 6,3,10,5 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_94 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_94") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 7,5,1,1 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_95 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_95") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 8,2,1,6 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_96 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_96") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 9,10,7,10 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_97 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_97") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 3,10,1,null,3 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_98 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_98") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.AllEven(new java.lang.Integer[] { 5,5,5,10,5 }).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_99 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_99") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_100 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_100") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] {  }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_101 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_101") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] {  }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_102 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_102") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 1 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_103 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_103") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 2 }).doCall().checkResult(2) ;
    return ok_sofar ;
  }



  static boolean test_104 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_104") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 1 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_105 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_105") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 2 }).doCall().checkResult(2) ;
    return ok_sofar ;
  }



  static boolean test_106 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_106") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 3 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_107 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_107") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 4 }).doCall().checkResult(4) ;
    return ok_sofar ;
  }



  static boolean test_108 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_108") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 5 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_109 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_109") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 6 }).doCall().checkResult(6) ;
    return ok_sofar ;
  }



  static boolean test_110 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_110") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 7 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_111 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_111") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 8 }).doCall().checkResult(8) ;
    return ok_sofar ;
  }



  static boolean test_112 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_112") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 9 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_113 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_113") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 10 }).doCall().checkResult(10) ;
    return ok_sofar ;
  }



  static boolean test_114 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_114") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { null }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_115 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_115") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 1,2 }).doCall().checkResult(2) ;
    return ok_sofar ;
  }



  static boolean test_116 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_116") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 1,null }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_117 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_117") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 2,4 }).doCall().checkResult(6) ;
    return ok_sofar ;
  }



  static boolean test_118 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_118") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 2,6 }).doCall().checkResult(8) ;
    return ok_sofar ;
  }



  static boolean test_119 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_119") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 3,4 }).doCall().checkResult(4) ;
    return ok_sofar ;
  }



  static boolean test_120 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_120") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 4,10 }).doCall().checkResult(14) ;
    return ok_sofar ;
  }



  static boolean test_121 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_121") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 5,3 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_122 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_122") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 8,1 }).doCall().checkResult(8) ;
    return ok_sofar ;
  }



  static boolean test_123 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_123") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 8,8 }).doCall().checkResult(16) ;
    return ok_sofar ;
  }



  static boolean test_124 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_124") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 9,2 }).doCall().checkResult(2) ;
    return ok_sofar ;
  }



  static boolean test_125 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_125") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 9,9 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_126 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_126") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 10,2 }).doCall().checkResult(12) ;
    return ok_sofar ;
  }



  static boolean test_127 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_127") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 10,3 }).doCall().checkResult(10) ;
    return ok_sofar ;
  }



  static boolean test_128 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_128") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 10,10 }).doCall().checkResult(20) ;
    return ok_sofar ;
  }



  static boolean test_129 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_129") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { null,3 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_130 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_130") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 2,1,2 }).doCall().checkResult(4) ;
    return ok_sofar ;
  }



  static boolean test_131 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_131") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 1,6,1 }).doCall().checkResult(6) ;
    return ok_sofar ;
  }



  static boolean test_132 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_132") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 5,7,7 }).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_133 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_133") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 6,9,4 }).doCall().checkResult(10) ;
    return ok_sofar ;
  }



  static boolean test_134 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_134") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 7,4,1 }).doCall().checkResult(4) ;
    return ok_sofar ;
  }



  static boolean test_135 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_135") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 5,null,2,7 }).doCall().checkResult(2) ;
    return ok_sofar ;
  }



  static boolean test_136 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_136") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 8,4,4,7 }).doCall().checkResult(16) ;
    return ok_sofar ;
  }



  static boolean test_137 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_137") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 9,3,10,7 }).doCall().checkResult(10) ;
    return ok_sofar ;
  }



  static boolean test_138 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_138") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 9,null,3,8 }).doCall().checkResult(8) ;
    return ok_sofar ;
  }



  static boolean test_139 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_139") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 10,6,null,7 }).doCall().checkResult(16) ;
    return ok_sofar ;
  }



  static boolean test_140 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_140") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 2,1,2,3,2 }).doCall().checkResult(6) ;
    return ok_sofar ;
  }



  static boolean test_141 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_141") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 4,null,4,9,2 }).doCall().checkResult(10) ;
    return ok_sofar ;
  }



  static boolean test_142 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_142") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 7,4,null,3,9 }).doCall().checkResult(4) ;
    return ok_sofar ;
  }



  static boolean test_143 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_143") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual5.SumEven(new java.lang.Integer[] { 8,3,10,9,4 }).doCall().checkResult(22) ;
    return ok_sofar ;
  }

}













class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestName+":");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestData.testName+": ");

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
	  System.out.println(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  System.out.println("the call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("the exception "+exc+" was raised although it "+
			     "should not have been\n");
	  break;
      }
      exc.printStackTrace();
    }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    System.out.println("\n\n***********************************************");
    if (TestData.testName != "") {
      System.out.println("\n*** Warning for "+TestData.testName+": ");
    } else
      System.out.println("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
        System.out.println(TestData.getTrace());
      }
    }
    
    System.out.println(msg+"\n");
  }

  static void printError(ExecutionTime time, String msg) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestData.testName+": ");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
        System.out.println(TestData.getTrace());
      }
    }
      
    System.out.println(msg+"\n");
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  // Try to determine whether the starterName method is recursive.
  // If the bcel library is not available, fail with a message
  // indicating that no analysis was done. 
    @SuppressWarnings({"unchecked","rawtypes"}) 
    static boolean checkRecursive(Class cl, String packageName, String className, String starterName, int arity) {
    try {
      ClassLoader loader = 
	cl.getClassLoader();
      String classLocation = 
	loader.getResource
        (new String(packageName+"."+className).replace('.','/')+".class")
        .getFile();
    
      java.lang.Class classParserClass =
	java.lang.Class.forName("org.apache.bcel.classfile.ClassParser");
      java.lang.reflect.Constructor classParserConstructor =
	classParserClass.getConstructor(classLocation.getClass());
      java.lang.reflect.Method parse =
	classParserClass.getMethod("parse");

      Object cp = null;
      Object jc = null;
    
      cp = classParserConstructor.newInstance(classLocation);
      jc = parse.invoke(cp);

      Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>> calls =
        new Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>>();

      java.lang.Class ccfgClass =
	java.lang.Class.forName(packageName+".ClassCFG");
      java.lang.reflect.Constructor ccfgConstructor =
	ccfgClass.getConstructor(jc.getClass(), calls.getClass());

      Object ccfg = ccfgConstructor.newInstance(jc, calls);
      java.lang.reflect.Method start = ccfgClass.getMethod("start");
      start.invoke(ccfg);

      boolean result = 
        isRecursive
        (new Pair<String,Integer>
         (packageName+"."+className+"."+starterName,arity),
         new HashSet<Pair<String,Integer>>(),
         calls);
      
      if (!result)
	System.out.println
	  ("\nWARNING: La implementacion de "+starterName+
	   " no parece recursivo aunque es OBLIGATORIO "+
	   "-- compruebalo manualmente!\n");

      try {
        java.lang.Class rhClass =
          java.lang.Class.forName(packageName+".ResultsHandler");
        java.lang.reflect.Field completedAnalysis =
          rhClass.getField("completedAnalysis");
        completedAnalysis.setBoolean(null,true);
      } catch (Throwable texc) { };

      return result;
    } catch (Throwable exc) {
        /*
          System.out.println
          ("\nnot checking recursion: cannot read RecursiveMethods classfile");
          exc.printStackTrace();
        */
      return true;
    }
  }

  static boolean isRecursive(Pair<String,Integer> current,
			     HashSet<Pair<String,Integer>> seen,
			     Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>> calls) {
    if (seen.contains(current)) {
      return true;
    }
    
    HashSet<Pair<String,Integer>> nexts = calls.get(current);
    seen.add(current);
    
    if (nexts == null) return false;
    else {
      for (Pair<String,Integer> next : nexts)
	if (isRecursive(next,seen,calls)) return true;
    }
    
    return false;
  }

  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = new NodePositionList<E>();

    try {
      Iterator<E> it = i.iterator();
      while (it.hasNext()) {
        l.addLast(it.next());
      }
    } catch (Throwable exc) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc);
      exc.printStackTrace();
      return null;
    }
    return l;
  }

  static <E> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an iterable with the elements "+l+
         " but should have returned the elements "+printArray(original));
      return false;
    } else return true;
  }

  static <E> boolean unChanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.UNRELATED,
	       "the call "+callString+
	       " has modified the input list "+printArray(original)+
	       "; it has now the elements "+l);
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }
  
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      System.out.println("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      System.out.println("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    if (isException())
      return getCall() + " -> " + getException();
    else
      return getCall() + " -> " + getValue();      
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      TestUtils.printCallException(result.getException());
      return false;
    }

    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception, "+
         "but returned the value "+result.getValue());
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception);
      exception.printStackTrace();
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n"+obj1+
         "\nwhich is the same as an argument object; "+
         "a FRESH object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unChanged(Object obj1, Object obj2) {
    if (!(obj1.equals(obj2))) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " changed an object parameter \n"+obj2+
         "\nwhich should not have been changed\n");
      return false;
    } else return true;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      System.out.println("Cannot iterate over expected value "+expected);
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      System.out.println("Cannot iterate over result value "+value);
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+value+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  boolean valuesMatch(Object expected) {
    if (!noException())
      return false;

    if (result.isException()) {
      TestUtils.printCallException(result.getException());
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      if (expected != null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned null, "+
           "but should have returned "+expected);
        return false;
      }
      else return true;
    }

    if (!value.equals(expected)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" returned "+value+
         ", but should have returned "+expected);
      return false;
    }

    return true;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

 




class BabylonRoot extends TestCall<Double,Double> {
  private Double n;
  
  public BabylonRoot(Double n) {
    this.n = n;
  }

  @Override
  public String toString() {
    return "Recursion.babylonRoot("+n+")";
  }

  @Override
  public Double call() {
    return Recursion.babylonRoot(n);
  }

  @Override
  public boolean checkResult(Double expected) {
    if (!noException())
      return false;

    if (Math.abs(expected-result.getValue()) > 0.5) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have returned a value close to "+
         expected+" but returned "+result.getValue());
      return false;
    } else return true;
  }
}

class AllEven extends TestCall<Boolean,Boolean> {
  private PositionList<Integer> l;

  public AllEven(Integer[] elements) {
    l = TestUtils.toPositionList(elements);
  }
    
  @Override
  public String toString() {
    return "Recursion.allEven("+l+")";
  }

  @Override
  public Boolean call() {
    return Recursion.allEven(l);
  }

  @Override
  public boolean checkResult(Boolean expected) {
    return valuesMatch(expected);
  }
}

class RecursionCheck extends TestCall<Boolean,Boolean> {
  private String methodName;
  private int arity;

  public RecursionCheck(String methodName, int arity) {
    this.methodName = methodName;
    this.arity = arity;
  }
  
  @Override
  public String toString() {
    return "RecursionCheck.isRecursive(\""+methodName+","+arity+"\")";
  }

  @Override
  public Boolean call() {
    return TestUtils.checkRecursive
      (TesterInd5.class,"aed.individual5","Recursion",methodName,arity);
  }

  @Override
  public boolean checkResult(Boolean expected) {
    if (!noException()) return false;
    if (result.getValue() != true) {
        TestUtils.printWarning
          (TestUtils.ExecutionTime.UNRELATED,
           "\nCould not detect recursion in the implementation of "+methodName);
        return false;
    }
    return true;
  }
}

class SumEven extends TestCall<Integer,Integer> {
  private IndexedList<Integer> l;

  public SumEven(Integer[] elements) {
    this.l = TestUtils.toIndexedList(elements);
  }

  @Override
  public String toString() {
    return "Recursion.sumEven("+l+")";
  }

  @Override
  public Integer call() {
    return Recursion.sumEven(l);
  }

  @Override
  public boolean checkResult(Integer expected) {
    return valuesMatch(expected);
  }
}






class BaseResultsHandler {

  static LinkedHashMap<String,Boolean> results_sofar;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName))
        System.out.println("Gloria a Terra");
      else
        System.out.println("Manchado por las garras del Caos");
    }

    System.out.println("\n------------------------------------------");
    if (results_ok())
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente. Sello de pureza concedido");
    else
      System.out.println("\n"+Tests.tester+": errores detectados. EXCOMMUNICATE TRAITORIS\n");
  }
}




class TestData {
  static String testName = "";
  static ArrayList<String> trace;

  public static void initTrace() {
    trace = new ArrayList<String>();
  }

  public static void addCallToTrace(String callString) {
    trace.add(callString);
  }

  public static int numCommands() {
    return trace.size();
  }

  public static String getTrace() {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<trace.size(); i++) {
      if (i > 0) sb.append("\n");
      sb.append("  "+trace.get(i)+";");
    }
    return sb.toString();
  }
}

class ResultsHandler extends BaseResultsHandler {
  private static boolean success = true;
  public static boolean completedAnalysis = false;

  public static void add_result(String test_type, boolean result) {
    if (test_type.equals("recursionCheck"))
      success = success && result;
    else
      BaseResultsHandler.add_result(test_type, result);
  }

  static int get_nota() {
    if (results_ok()) 
      return
	(results_sofar.get("babylonRoot") ? 3 : 0)
	+ (results_sofar.get("sumEven") ? 4 : 0)
	+ (results_sofar.get("allEven") ? 4 : 0);
    else
      return 0;
  }

  static boolean results_ok() {
    int numCorrect = 0;
    
    for (String key : results_sofar.keySet())
      if (results_sofar.get(key))
        ++numCorrect;

    return numCorrect >= 2;
  }

  static void report_results() {
    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName))
        System.out.println("Gloria a Terra");
      else
        System.out.println("Manchado por las garras del Caos");
    }

    System.out.println("\n------------------------------------------");
    if (results_ok())
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente. Sello de pureza concedido");
    else
      System.out.println("\n"+Tests.tester+": errores detectados. EXCOMMUNICATE TRAITORIS\n");

      if (!completedAnalysis) {
        System.out.println
          ("\nADVERTENCIA: no se podia comprobar que "+
           "los métodos son recursivos\n");
      }

    if (!success) {
      System.out.println
        ("\nADVERTENCIA: no se detecto uso de recursion en "+
         "algunos metodos.\n");
    }
  }
}

