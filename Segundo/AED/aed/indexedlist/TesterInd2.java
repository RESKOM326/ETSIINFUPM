/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the "entrega system".
 *
 */

package aed.indexedlist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import es.upm.aedlib.indexedlist.*;

@SuppressWarnings("unused")
public class TesterInd2 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    boolean[] results_sofar = {true};
    boolean general_results = true;
    boolean ok_sofar = true;
    


    //////////////////////////////////////////////////////////////////////
    //
    // File generated at: 2017/9/13 -- 18:58:33
    // Seed: {1505,321911,878547}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "deleteRepeated");

      if (results_ok_sofar(results_sofar,"deleteRepeated") && local_results_ok_sofar(results_sofar,"deleteRepeated"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "deleteRepeated");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          System.exit(24);
      }


    report_results("TesterInd2",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      System.exit(0);
    else
      System.exit(24);
  }



  private static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 5 },new int[] { 5 }) ;
      return ok_sofar ;
  }


  private static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 4 },new int[] { 4 }) ;
      return ok_sofar ;
  }


  private static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 1 },new int[] { 1 }) ;
      return ok_sofar ;
  }


  private static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 0 },new int[] { 0 }) ;
      return ok_sofar ;
  }


  private static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 3,3 },new int[] { 3 }) ;
      return ok_sofar ;
  }


  private static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 2,3 },new int[] { 2,3 }) ;
      return ok_sofar ;
  }


  private static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 1,1 },new int[] { 1 }) ;
      return ok_sofar ;
  }


  private static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 2,2,4 },new int[] { 2,4 }) ;
      return ok_sofar ;
  }


  private static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 3,1,1 },new int[] { 3,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 1,1,1 },new int[] { 1 }) ;
      return ok_sofar ;
  }


  private static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 0,0,1 },new int[] { 0,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 1,2,3 },new int[] { 1,2,3 }) ;
      return ok_sofar ;
  }


  private static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 100231,100231,100231 },new int[] { 100231 }) ;
      return ok_sofar ;
  }


  private static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 5,4,1,3 },new int[] { 5,4,1,3 }) ;
      return ok_sofar ;
  }


  private static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 5,2,5,1 },new int[] { 5,2,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 4,2,1,1 },new int[] { 4,2,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 2,2,1,1 },new int[] { 2,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 1,2,3,100231 },new int[] { 1,2,3,100231 }) ;
      return ok_sofar ;
  }


  private static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 2,2,3,2,3 },new int[] { 2,3 }) ;
      return ok_sofar ;
  }


  private static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 5,5,5,3,1 },new int[] { 5,3,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 2,5,1,4,5 },new int[] { 2,5,1,4 }) ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 4,4,1,3,5 },new int[] { 4,1,3,5 }) ;
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 2,1,2,2,5 },new int[] { 2,1,5 }) ;
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 2,5,5,2,5,1 },new int[] { 2,5,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 3,3,1,5,1,4 },new int[] { 3,1,5,4 }) ;
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 0,0,1,1,2,2 },new int[] { 0,1,2 }) ;
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 3,3,1,4,4,1,2 },new int[] { 3,1,4,2 }) ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 5,1,5,4,5,2,4 },new int[] { 5,1,4,2 }) ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 3,5,5,1,5,2,5 },new int[] { 3,5,1,2 }) ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 1,4,2,3,5,3,2 },new int[] { 1,4,2,3,5 }) ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 1,1,5,5,3,3,1,5 },new int[] { 1,5,3 }) ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 3,4,4,2,5,2,2,5 },new int[] { 3,4,2,5 }) ;
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 5,1,5,3,3,1,5,2,2 },new int[] { 5,1,3,2 }) ;
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 4,3,3,1,5,1,2,3,3,1 },new int[] { 4,3,1,5,2 }) ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 2,3,5,3,3,1,3,1,3,1 },new int[] { 2,3,5,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 0,1,2,3,4,0,1,2,3,4 },new int[] { 0,1,2,3,4 }) ;
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 5,5,2,4,3,1,5,1,3,3,5 },new int[] { 5,2,4,3,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 0,1,2,3,4,0,1,2,3,4,5 },new int[] { 0,1,2,3,4,5 }) ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 4,4,2,3,5,5,2,5,1,3,5,3 },new int[] { 4,2,3,5,1 }) ;
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd2.check_deleteRepeated(new int[] { 0,1,2,3,4,0,1,7,2,3,4,5 },new int[] { 0,1,2,3,4,7,5 }) ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("deleteRepeated")) return 0;
      throw new RuntimeException();
  }

  static boolean results_ok_sofar(boolean[] ok_sofar, String test_type) {
      return true;
  }

  static boolean local_results_ok_sofar(boolean[] results_sofar, String test_type) {
      int index = test_type_to_index(test_type);
      return results_sofar[index];
  }

  static boolean[] combine_results(boolean result, boolean results_sofar[], String id, String test_type) {
      int index = test_type_to_index(test_type);
      results_sofar[index] = results_sofar[index] && result;
      return results_sofar;
  }

  static boolean results_ok(boolean results_sofar[], boolean general_results) {
      int successes = 0;
      for (int i=0; i<results_sofar.length; i++) {
	  if (results_sofar[i])
	      ++successes;
      }
      return successes >= results_sofar.length;
  }

static void report_results(String tester, boolean results_sofar[], boolean general_results) {
      System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (int i=0; i<results_sofar.length; i++) {
	  String testName="";
	  if (i==0) testName = "deleteRepeated";

	  System.out.print("Testing results for "+testName+": ");
	  if (results_sofar[i])
	      System.out.println("succeeded");
	  else
	      System.out.println("failed");

      }

      System.out.println("\n------------------------------------------");
      if (results_ok(results_sofar,general_results))
	  System.out.println("\n"+tester+": Test finalizado correctamente.");
      else
	  System.out.println("\n"+tester+": errores detectados.\n");
  }


  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      System.out.println("\n*** Error in "+TestName+":");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error in "+testName+": ");

      if (!callSeq.equals("")) {
	  System.out.print(callSeqString(time));
	  System.out.println(callSeq);
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
      System.out.println("\n*** Warning for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      System.out.println(msg+"\n");
  }

    static void printError(ExecutionTime time, String msg) {
      System.out.println("\n*** Error in "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      System.out.println(msg+"\n");
  }

  static String callSeqString(ExecutionTime time) {
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

  static boolean check_deleteRepeated(int[] a, int[] expected) {
      boolean ok_sofar = true;
      String callString = "Utils.deleteRepeated("+printArray(a)+")";

      IndexedList<Integer> l = new ArrayIndexedList<Integer>();
      for (int k=0; k<a.length; k++)
	  l.add(k,new Integer(a[k]));
	  

      try {
	  IndexedList<Integer> result = Utils.deleteRepeated(l);
	  
	  if (result == null)
	      ok_sofar = false;
	  
	  if (ok_sofar && result.size() != expected.length) {
	      ok_sofar = false;
	  }

	  int i = 0;
	  while (ok_sofar && i<expected.length) {
	      Integer elem = result.get(i);
	      if (elem == null || elem.intValue() != expected[i]) {
		  ok_sofar = false;
	      } else i++;
	  }

	  if (!ok_sofar) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " returns the list "+result+
		   " instead of the correct list "+printArray(expected));
	      ok_sofar = false;
	      return false;
	  }

	  if (ok_sofar) {
	      if (l.size() != a.length) {
		  ok_sofar = false;
	      }

	      i = 0;
	      while (ok_sofar && i<a.length) {
		  Integer elem = l.get(i);
		  if (elem == null || elem.intValue() != a[i]) {
		      ok_sofar = false;
		  } else i++;
	      }

	      if (!ok_sofar) {
		  printError
		      (ExecutionTime.UNRELATED,
		       "the call "+callString+
		       " has modified the input list "+a+
		       "; it has now the elements "+l);
		  return false;
	      }
	  }

	  return ok_sofar;
	  
      } catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  return false;
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(" ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }
}



