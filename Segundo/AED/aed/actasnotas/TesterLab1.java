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

package aed.actasnotas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.util.Comparator;
import java.util.HashSet;
import java.util.ArrayList;

import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.positionlist.*;


@SuppressWarnings("unused")
public class TesterLab1 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";
  static ActaNotasAED actaNotasAED = null;

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
    // File generated at: 2017/9/22 -- 0:23:39
    // Seed: {1506,32617,86713}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_54(), results_sofar, "test_54", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_55(), results_sofar, "test_55", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_56(), results_sofar, "test_56", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_57(), results_sofar, "test_57", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_58(), results_sofar, "test_58", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_59(), results_sofar, "test_59", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_60(), results_sofar, "test_60", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_61(), results_sofar, "test_61", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_62(), results_sofar, "test_62", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_63(), results_sofar, "test_63", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_64(), results_sofar, "test_64", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_65(), results_sofar, "test_65", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_66(), results_sofar, "test_66", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_67(), results_sofar, "test_67", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_68(), results_sofar, "test_68", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_69(), results_sofar, "test_69", "actasnotas");

      if (results_ok_sofar(results_sofar,"actasnotas") && local_results_ok_sofar(results_sofar,"actasnotas"))
        results_sofar =
          combine_results(test_70(), results_sofar, "test_70", "actasnotas");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          System.exit(24);
      }


    report_results("TesterLab1",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      System.exit(0);
    else
      System.exit(24);
  }



  private static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      return ok_sofar ;
  }


  private static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      return ok_sofar ;
  }


  private static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Rodriguez Gonzalez","3333333",10,true) ;
      return ok_sofar ;
  }


  private static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",1,false) ;
      return ok_sofar ;
  }


  private static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Rodriguez","1111111",8,true) ;
      return ok_sofar ;
  }


  private static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Rodriguez","1111111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",3,true) ;
      return ok_sofar ;
  }


  private static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Perez","1111111",2,false) ;
      return ok_sofar ;
  }


  private static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111333",2,true) ;
      return ok_sofar ;
  }


  private static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Jose Iglesias",3) ;
      return ok_sofar ;
  }


  private static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      return ok_sofar ;
  }


  private static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      return ok_sofar ;
  }


  private static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      return ok_sofar ;
  }


  private static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",4,true) ;
      return ok_sofar ;
  }


  private static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",4,false) ;
      return ok_sofar ;
  }


  private static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Gonzalez","4444444",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Gonzalez","2222222",1,true) ;
      return ok_sofar ;
  }


  private static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Rodriguez Rodriguez","5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Fernandez","6666666",1,true) ;
      return ok_sofar ;
  }


  private static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111333",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111333","Jose Iglesias",2) ;
      return ok_sofar ;
  }


  private static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111333",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Jose Iglesias",3) ;
      return ok_sofar ;
  }


  private static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      return ok_sofar ;
  }


  private static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Sanchez","2222222",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      return ok_sofar ;
  }


  private static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Jose Iglesias",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Jose Iglesias",4) ;
      return ok_sofar ;
  }


  private static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez","1111111",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jorge Valdano","0000000",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Jorge Valdano","0000000",7)) ;
          argument.addLast(new Calificacion("Jose Iglesias","1111111",3)) ;
          argument.addLast(new Calificacion("Pablo Perez","2222222",5)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jorge Valdano","0000000",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Jose Iglesias","1111111",3)) ;
          argument.addLast(new Calificacion("Pablo Perez","2222222",5)) ;
          argument.addLast(new Calificacion("Jorge Valdano","0000000",7)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jorge Valdano","0000000",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(8,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jorge Valdano","0000000",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Jorge Valdano","0000000",7)) ;
          argument.addLast(new Calificacion("Pablo Perez","2222222",5)) ;
          argument.addLast(new Calificacion("Jose Iglesias","1111111",3)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jorge Valdano","0000000",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Jorge Valdano","0000000",7)) ;
          argument.addLast(new Calificacion("Pablo Perez","2222222",5)) ;
          ok_sofar = TesterLab1.getAprobados(5,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Rodriguez","3333333",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(2,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Perez Iglesias","5555555",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Fernandez Perez","1111111",8,true) ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Perez Iglesias","1111111",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Rodriguez","2222222",6,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(10,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Sanchez Gonzalez","6666666",1,true) ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Gonzalez","5555555",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Gonzalez Perez","5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Gonzalez","2222222",8,true) ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Perez Fernandez","1111111",2,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(9,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Iglesias Rodriguez","1111111",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Gonzalez","6666666",10,true) ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Iglesias Iglesias","2222222",5,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Iglesias Iglesias","2222222",5)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Iglesias Iglesias","2222222",5)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Gonzalez Sanchez","6666666",7,true) ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Adan","8888888",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Elena Rodriguez","9999999",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","4444444",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jorge Valdano","0000000",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Jose Iglesias","1111111",3)) ;
          argument.addLast(new Calificacion("Jose Iglesias","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Perez","2222222",5)) ;
          argument.addLast(new Calificacion("Elena Rodriguez","9999999",5)) ;
          argument.addLast(new Calificacion("Maria Adan","8888888",7)) ;
          argument.addLast(new Calificacion("Jorge Valdano","0000000",7)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Adan","8888888",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Elena Rodriguez","9999999",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jose Iglesias","4444444",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Jorge Valdano","0000000",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Jorge Valdano","0000000",7)) ;
          argument.addLast(new Calificacion("Elena Rodriguez","9999999",5)) ;
          argument.addLast(new Calificacion("Pablo Perez","2222222",5)) ;
          argument.addLast(new Calificacion("Maria Adan","8888888",7)) ;
          ok_sofar = TesterLab1.getAprobados(5,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",6,false) ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Sanchez Sanchez","6666666",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Gonzalez Perez","5555555",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Sanchez Sanchez","6666666",2)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Rodriguez","3333333",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Fernandez Fernandez","5555555",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Juan Fernandez Fernandez",9) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Fernandez Fernandez","5555555",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Iglesias","2222222",1,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Iglesias Iglesias","2222222",1)) ;
          argument.addLast(new Calificacion("Juan Fernandez Fernandez","5555555",9)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez Rodriguez","3333333",8,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Pablo Perez Rodriguez","3333333",8)) ;
          ok_sofar = TesterLab1.getAprobados(3,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Sanchez Gonzalez","4444444",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Perez","5555555",8,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Pablo Perez Rodriguez","3333333",8)) ;
          argument.addLast(new Calificacion("Clara Sanchez Gonzalez","4444444",2)) ;
          argument.addLast(new Calificacion("Paloma Gonzalez Perez","5555555",8)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Gonzalez","5555555",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Gonzalez Sanchez","6666666",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Perez","2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Rodriguez Rodriguez","3333333",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Paloma Gonzalez Gonzalez",4) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Gonzalez","1111111",8,true) ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Sanchez","5555555",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Sanchez Fernandez","1111111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Iglesias","5555555",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",8,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(4,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(2,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Iglesias","4444444",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Iglesias","5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Fernandez Fernandez","5555555",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Rodriguez Gonzalez","1111111",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",8,false) ;
      return ok_sofar ;
  }


  private static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(8,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Fernandez","5555555",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Perez","5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Rodriguez","6666666",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      return ok_sofar ;
  }


  private static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Gonzalez","2222222",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Gonzalez Perez","3333333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Fernandez Rodriguez","4444444",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Perez","2222222",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Juan Gonzalez Perez",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Francisco Fernandez Rodriguez",9) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Gonzalez Perez","3333333",3)) ;
          argument.addLast(new Calificacion("Dolores Fernandez Gonzalez","2222222",9)) ;
          argument.addLast(new Calificacion("Francisco Fernandez Rodriguez","4444444",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Juan Gonzalez Perez",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Sanchez Fernandez","5555555",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      return ok_sofar ;
  }


  private static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Perez Fernandez","1111111",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Fernandez","5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Sanchez","2222222",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Perez Sanchez","2222222",9)) ;
          ok_sofar = TesterLab1.getAprobados(9,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Fernandez","3333333",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Fernandez Fernandez","1111111",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Rodriguez","6666666",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      return ok_sofar ;
  }


  private static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",10,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(10,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Rodriguez","1111111",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Sanchez Iglesias","6666666",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Perez","2222222",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Sanchez Fernandez","5555555",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Sanchez","1111111",8,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(6,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",8,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(4,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Fernandez Fernandez","2222222",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Rodriguez","4444444",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Perez","5555555",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",8,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Iglesias Perez","5555555",2)) ;
          argument.addLast(new Calificacion("Paloma Iglesias Rodriguez","4444444",2)) ;
          argument.addLast(new Calificacion("Pablo Fernandez Fernandez","2222222",4)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Sanchez","2222222",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",5,true) ;
      return ok_sofar ;
  }


  private static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Rodriguez Iglesias","6666666",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Iglesias Fernandez","6666666",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("6666666","Juan Rodriguez Iglesias",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Iglesias","5555555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Iglesias","5555555",5,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Sanchez Iglesias","5555555",5)) ;
          argument.addLast(new Calificacion("Juan Rodriguez Iglesias","6666666",3)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Perez Iglesias","2222222",7,true) ;
      return ok_sofar ;
  }


  private static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Rodriguez Fernandez","4444444",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Maria Rodriguez Fernandez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Rodriguez","1111111",8,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Iglesias Rodriguez","1111111",8)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Fernandez","4444444",6)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Iglesias Gonzalez","4444444",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Iglesias Rodriguez","1111111",8)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Fernandez","4444444",7)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Iglesias","6666666",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Rodriguez Iglesias","6666666",7)) ;
          argument.addLast(new Calificacion("Julio Iglesias Rodriguez","1111111",8)) ;
          ok_sofar = TesterLab1.getAprobados(5,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      return ok_sofar ;
  }


  private static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Sanchez Gonzalez","4444444",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Gonzalez Iglesias","3333333",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Sanchez Sanchez","4444444",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Iglesias Sanchez","1111111",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Iglesias Gonzalez","3333333",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Pablo Gonzalez Iglesias",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Perez","4444444",6,true) ;
      return ok_sofar ;
  }


  private static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Gonzalez","4444444",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Gonzalez Iglesias","4444444",4,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Iglesias Gonzalez","4444444",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Rodriguez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Fernandez Fernandez","5555555",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Perez Gonzalez","3333333",8,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Perez Gonzalez","3333333",8)) ;
          argument.addLast(new Calificacion("Julio Iglesias Gonzalez","4444444",9)) ;
          ok_sofar = TesterLab1.getAprobados(8,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Julio Iglesias Gonzalez",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Perez Fernandez","1111111",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Francisco Perez Fernandez",8) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Julio Iglesias Gonzalez",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Fernandez","2222222",9,true) ;
      return ok_sofar ;
  }


  private static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Perez Gonzalez","3333333",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Perez","4444444",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Iglesias","1111111",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Fernandez Fernandez","4444444",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Fernandez Rodriguez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Gonzalez","5555555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Paloma Gonzalez Perez",8) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Paloma Gonzalez Perez",8) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Perez Gonzalez","3333333",5)) ;
          argument.addLast(new Calificacion("Maria Fernandez Rodriguez","2222222",5)) ;
          argument.addLast(new Calificacion("Julio Iglesias Gonzalez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Perez Iglesias","1111111",6)) ;
          argument.addLast(new Calificacion("Paloma Gonzalez Perez","4444444",8)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Iglesias Iglesias","4444444",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Fernandez Iglesias","5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Gonzalez Perez","4444444",2)) ;
          argument.addLast(new Calificacion("Julio Perez Gonzalez","3333333",5)) ;
          argument.addLast(new Calificacion("Maria Fernandez Rodriguez","2222222",5)) ;
          argument.addLast(new Calificacion("Julio Iglesias Gonzalez","5555555",5)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Iglesias Gonzalez","5555555",5)) ;
          argument.addLast(new Calificacion("Maria Fernandez Rodriguez","2222222",5)) ;
          argument.addLast(new Calificacion("Paloma Gonzalez Perez","4444444",2)) ;
          argument.addLast(new Calificacion("Julio Perez Gonzalez","3333333",5)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Fernandez Iglesias","4444444",8,false) ;
      return ok_sofar ;
  }


  private static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Rodriguez","6666666",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Rodriguez Sanchez","5555555",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Sanchez Gonzalez","1111111",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Rodriguez Perez","4444444",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Gonzalez Fernandez","3333333",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Sanchez Gonzalez","1111111",4)) ;
          argument.addLast(new Calificacion("Juan Gonzalez Fernandez","3333333",7)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Sanchez","5555555",3)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Rodriguez","6666666",7)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Rodriguez","6666666",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Iglesias Iglesias","3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(10,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Perez","1111111",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Gonzalez Sanchez","3333333",3,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Sanchez Perez","1111111",2)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Sanchez","5555555",3)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Rodriguez","6666666",7)) ;
          argument.addLast(new Calificacion("Juan Gonzalez Fernandez","3333333",7)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Iglesias","5555555",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Gonzalez Perez","5555555",6,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Gonzalez Fernandez","3333333",7)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Rodriguez","6666666",7)) ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Perez","6666666",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Perez Iglesias","2222222",4,true) ;
      return ok_sofar ;
  }


  private static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Iglesias Rodriguez","1111111",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Gonzalez","3333333",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Rodriguez","4444444",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",9,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Iglesias Rodriguez","1111111",8)) ;
          argument.addLast(new Calificacion("Clara Fernandez Gonzalez","3333333",6)) ;
          argument.addLast(new Calificacion("Paloma Gonzalez Rodriguez","4444444",6)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Sanchez","3333333",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Gonzalez Iglesias","3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Fernandez Gonzalez","3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Rodriguez Perez","3333333",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Sanchez Rodriguez","6666666",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Iglesias","6666666",5,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(8,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Gonzalez Fernandez","1111111",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Iglesias","1111111",2,true) ;
      return ok_sofar ;
  }


  private static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Sanchez Fernandez","4444444",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Perez","6666666",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Gonzalez","5555555",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Perez Sanchez","3333333",6,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Sanchez Fernandez","4444444",4)) ;
          argument.addLast(new Calificacion("Dolores Sanchez Gonzalez","5555555",4)) ;
          argument.addLast(new Calificacion("Paloma Fernandez Perez","6666666",5)) ;
          argument.addLast(new Calificacion("Juan Perez Sanchez","3333333",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Sanchez Sanchez","3333333",8,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Perez Sanchez","3333333",6)) ;
          argument.addLast(new Calificacion("Dolores Sanchez Gonzalez","5555555",4)) ;
          argument.addLast(new Calificacion("Paloma Fernandez Perez","6666666",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Fernandez","4444444",6)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Sanchez Gonzalez","5555555",4)) ;
          argument.addLast(new Calificacion("Paloma Fernandez Perez","6666666",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Fernandez","4444444",6)) ;
          argument.addLast(new Calificacion("Juan Perez Sanchez","3333333",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Perez Sanchez","3333333",6)) ;
          argument.addLast(new Calificacion("Dolores Sanchez Gonzalez","5555555",4)) ;
          argument.addLast(new Calificacion("Paloma Fernandez Perez","6666666",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Fernandez","4444444",6)) ;
          ok_sofar = TesterLab1.getAprobados(3,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Juan Perez Sanchez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Iglesias Perez","2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Fernandez","6666666",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Perez Iglesias","6666666",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Gonzalez","1111111",3,true) ;
      return ok_sofar ;
  }


  private static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",4,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(9,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Rodriguez Sanchez","3333333",8,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Rodriguez Sanchez","3333333",8)) ;
          ok_sofar = TesterLab1.getAprobados(4,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Rodriguez Sanchez","3333333",8)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Sanchez","1111111",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Iglesias","4444444",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Sanchez","4444444",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Iglesias","3333333",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",4,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Rodriguez Sanchez","3333333",8)) ;
          ok_sofar = TesterLab1.getAprobados(5,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Sanchez","2222222",2,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Rodriguez Sanchez","3333333",8)) ;
          ok_sofar = TesterLab1.getAprobados(6,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Sanchez","3333333",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Sanchez","6666666",5,true) ;
      return ok_sofar ;
  }


  private static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Rodriguez","1111111",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Perez","3333333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Julio Fernandez Rodriguez",9) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Rodriguez Perez","3333333",3)) ;
          argument.addLast(new Calificacion("Julio Fernandez Rodriguez","1111111",9)) ;
          ok_sofar = TesterLab1.getAprobados(3,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Fernandez Rodriguez","1111111",9)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Perez","3333333",3)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Perez","5555555",10,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Fernandez Rodriguez","1111111",9)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Perez","3333333",3)) ;
          argument.addLast(new Calificacion("Clara Fernandez Perez","5555555",10)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Iglesias","6666666",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Fernandez Fernandez","1111111",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Fernandez","4444444",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Gonzalez","4444444",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Gonzalez Gonzalez","5555555",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Gonzalez Sanchez","5555555",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Paloma Rodriguez Fernandez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",5,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Fernandez Rodriguez","1111111",5)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Fernandez","4444444",5)) ;
          argument.addLast(new Calificacion("Clara Fernandez Perez","5555555",10)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Iglesias","6666666",7)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Clara Fernandez Perez",10) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Rodriguez","2222222",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Julio Fernandez Rodriguez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Perez","3333333",7,true) ;
      return ok_sofar ;
  }


  private static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Fernandez","4444444",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Rodriguez Perez","6666666",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Iglesias Fernandez","2222222",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Perez Fernandez","4444444",9)) ;
          ok_sofar = TesterLab1.getAprobados(9,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Perez Fernandez","4444444",9)) ;
          argument.addLast(new Calificacion("Juan Rodriguez Perez","6666666",8)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Fernandez Fernandez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("6666666","Juan Rodriguez Perez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Fernandez","4444444",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Rodriguez","2222222",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Rodriguez Iglesias","1111111",5,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Rodriguez Iglesias","1111111",5)) ;
          argument.addLast(new Calificacion("Juan Rodriguez Perez","6666666",6)) ;
          argument.addLast(new Calificacion("Dolores Sanchez Rodriguez","2222222",6)) ;
          argument.addLast(new Calificacion("Paloma Perez Fernandez","4444444",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Gonzalez","2222222",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Gonzalez Fernandez","5555555",9,true) ;
      return ok_sofar ;
  }


  private static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Sanchez","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","1111111",3)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Iglesias","2222222",9,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","1111111",3)) ;
          argument.addLast(new Calificacion("Paloma Iglesias Iglesias","2222222",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Sanchez Perez","3333333",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Rodriguez Iglesias","1111111",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Iglesias","6666666",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Perez","5555555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Paloma Gonzalez Perez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Paloma Iglesias Iglesias",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Paloma Iglesias Iglesias",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Perez Sanchez","5555555",8,true) ;
      return ok_sofar ;
  }


  private static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Rodriguez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Fernandez","2222222",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Gonzalez Iglesias","4444444",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Sanchez Iglesias","5555555",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(6,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Perez Sanchez","2222222",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Fernandez Rodriguez","2222222",5)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Dolores Fernandez Rodriguez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",1,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Fernandez Rodriguez","2222222",5)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      return ok_sofar ;
  }


  private static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Sanchez","1111111",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Gonzalez Perez","1111111",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Rodriguez Rodriguez","6666666",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Iglesias Gonzalez","5555555",1,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Rodriguez Rodriguez","6666666",5)) ;
          argument.addLast(new Calificacion("Paloma Perez Sanchez","1111111",5)) ;
          ok_sofar = TesterLab1.getAprobados(5,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("6666666","Juan Rodriguez Rodriguez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Sanchez","1111111",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Iglesias Gonzalez","5555555",1)) ;
          argument.addLast(new Calificacion("Juan Rodriguez Rodriguez","6666666",5)) ;
          argument.addLast(new Calificacion("Paloma Perez Sanchez","1111111",6)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Perez Sanchez","4444444",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez Fernandez","2222222",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Gonzalez Sanchez","4444444",10,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Perez Sanchez","4444444",5)) ;
          argument.addLast(new Calificacion("Juan Rodriguez Rodriguez","6666666",5)) ;
          argument.addLast(new Calificacion("Paloma Perez Sanchez","1111111",6)) ;
          ok_sofar = TesterLab1.getAprobados(2,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Paloma Perez Sanchez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",9,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Pablo Perez Fernandez","2222222",9)) ;
          argument.addLast(new Calificacion("Maria Perez Sanchez","4444444",5)) ;
          argument.addLast(new Calificacion("Francisco Iglesias Gonzalez","5555555",1)) ;
          argument.addLast(new Calificacion("Juan Rodriguez Rodriguez","6666666",5)) ;
          argument.addLast(new Calificacion("Paloma Perez Sanchez","1111111",6)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Maria Perez Sanchez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Gonzalez Gonzalez","4444444",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",7,false) ;
      return ok_sofar ;
  }


  private static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Sanchez","5555555",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(9,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Perez","4444444",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Rodriguez","4444444",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Perez Sanchez","2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Perez Perez","3333333",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",10,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Perez Perez","3333333",4)) ;
          argument.addLast(new Calificacion("Clara Fernandez Perez","4444444",9)) ;
          ok_sofar = TesterLab1.getAprobados(3,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Sanchez","6666666",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Fernandez","3333333",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Rodriguez Rodriguez","5555555",3,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","6666666",10)) ;
          argument.addLast(new Calificacion("Dolores Perez Perez","3333333",4)) ;
          argument.addLast(new Calificacion("Clara Fernandez Perez","4444444",9)) ;
          ok_sofar = TesterLab1.getAprobados(4,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",9,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","6666666",10)) ;
          argument.addLast(new Calificacion("Clara Fernandez Perez","4444444",9)) ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Fernandez","4444444",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Fernandez","2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Sanchez","2222222",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Gonzalez","1111111",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Gonzalez","5555555",4,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Fernandez Gonzalez","1111111",8)) ;
          argument.addLast(new Calificacion("Paloma Gonzalez Fernandez","2222222",2)) ;
          argument.addLast(new Calificacion("Dolores Perez Perez","3333333",4)) ;
          argument.addLast(new Calificacion("Dolores Fernandez Fernandez","4444444",3)) ;
          argument.addLast(new Calificacion("Juan Rodriguez Rodriguez","5555555",3)) ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","6666666",10)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Gonzalez Fernandez","2222222",2)) ;
          argument.addLast(new Calificacion("Juan Rodriguez Rodriguez","5555555",3)) ;
          argument.addLast(new Calificacion("Dolores Fernandez Fernandez","4444444",3)) ;
          argument.addLast(new Calificacion("Paloma Fernandez Gonzalez","1111111",8)) ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","6666666",10)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Sanchez Iglesias","1111111",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Sanchez Rodriguez","5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Rodriguez Rodriguez","3333333",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Fernandez","5555555",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Iglesias","3333333",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Sanchez","1111111",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Fernandez","1111111",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez Sanchez","1111111",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Iglesias Iglesias","3333333",10)) ;
          argument.addLast(new Calificacion("Francisco Sanchez Iglesias","1111111",4)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Sanchez","4444444",2,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Perez Sanchez","4444444",2)) ;
          argument.addLast(new Calificacion("Francisco Sanchez Iglesias","1111111",4)) ;
          argument.addLast(new Calificacion("Dolores Iglesias Iglesias","3333333",10)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Iglesias Sanchez","2222222",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Sanchez Iglesias","1111111",4,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","2222222",3)) ;
          argument.addLast(new Calificacion("Paloma Perez Sanchez","4444444",2)) ;
          argument.addLast(new Calificacion("Dolores Iglesias Iglesias","3333333",10)) ;
          argument.addLast(new Calificacion("Francisco Sanchez Iglesias","1111111",4)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Perez Sanchez","4444444",2)) ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","2222222",3)) ;
          argument.addLast(new Calificacion("Francisco Sanchez Iglesias","1111111",4)) ;
          argument.addLast(new Calificacion("Dolores Iglesias Iglesias","3333333",10)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Iglesias Sanchez","2222222",3)) ;
          argument.addLast(new Calificacion("Paloma Perez Sanchez","4444444",2)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Iglesias","4444444",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Gonzalez","6666666",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      return ok_sofar ;
  }


  private static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Perez","6666666",2,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Iglesias Perez","6666666",2)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Perez","5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Sanchez Sanchez","3333333",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Fernandez","5555555",1,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(10,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Sanchez Sanchez","3333333",6)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Perez","5555555",1)) ;
          argument.addLast(new Calificacion("Dolores Iglesias Perez","6666666",2)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Iglesias Rodriguez","5555555",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez Rodriguez","1111111",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Perez Iglesias","5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Fernandez","3333333",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Gonzalez Fernandez","1111111",9,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Pablo Perez Rodriguez","1111111",5)) ;
          argument.addLast(new Calificacion("Maria Sanchez Sanchez","3333333",6)) ;
          ok_sofar = TesterLab1.getAprobados(4,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Gonzalez Fernandez","1111111",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Sanchez","6666666",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Pablo Perez Rodriguez",5) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Pablo Perez Rodriguez","1111111",5)) ;
          argument.addLast(new Calificacion("Maria Sanchez Sanchez","3333333",6)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Perez","5555555",1)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Sanchez","6666666",4)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Gonzalez Sanchez","5555555",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Gonzalez Gonzalez","4444444",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Rodriguez","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Perez","3333333",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez Sanchez","4444444",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Rodriguez Rodriguez","2222222",5)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Perez","3333333",2)) ;
          argument.addLast(new Calificacion("Pablo Gonzalez Gonzalez","4444444",3)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Perez","5555555",1)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Sanchez","6666666",1)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      return ok_sofar ;
  }


  private static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Rodriguez","1111111",9,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Iglesias Rodriguez","1111111",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Perez Rodriguez","1111111",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",9,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Iglesias Rodriguez","1111111",9)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Sanchez","5555555",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Perez Perez","4444444",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez Gonzalez","4444444",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Rodriguez","2222222",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Julio Rodriguez Rodriguez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Rodriguez Sanchez","1111111",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Clara Gonzalez Sanchez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",7,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Iglesias Rodriguez","1111111",1)) ;
          argument.addLast(new Calificacion("Julio Perez Perez","4444444",3)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Sanchez","5555555",6)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Rodriguez","2222222",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Sanchez Gonzalez","1111111",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Fernandez Perez","4444444",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Fernandez Iglesias","1111111",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Rodriguez","2222222",6)) ;
          argument.addLast(new Calificacion("Dolores Iglesias Rodriguez","1111111",7)) ;
          ok_sofar = TesterLab1.getAprobados(6,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Rodriguez Iglesias","4444444",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Julio Rodriguez Rodriguez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Gonzalez","4444444",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Gonzalez Gonzalez","6666666",1,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Rodriguez","2222222",6)) ;
          argument.addLast(new Calificacion("Julio Perez Perez","4444444",9)) ;
          argument.addLast(new Calificacion("Dolores Iglesias Rodriguez","1111111",7)) ;
          ok_sofar = TesterLab1.getAprobados(2,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Sanchez Iglesias","2222222",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",5,true) ;
      return ok_sofar ;
  }


  private static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Fernandez Gonzalez","5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Rodriguez Rodriguez","1111111",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Rodriguez Perez","2222222",9,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Fernandez Gonzalez","5555555",1)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Rodriguez","1111111",7)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Perez","2222222",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Rodriguez Fernandez","6666666",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("6666666","Francisco Rodriguez Fernandez",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Perez","4444444",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Maria Rodriguez Rodriguez",7) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Maria Rodriguez Rodriguez",7) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Perez Iglesias","2222222",1,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Iglesias Perez","4444444",10)) ;
          argument.addLast(new Calificacion("Francisco Rodriguez Fernandez","6666666",9)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Perez","2222222",9)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Rodriguez","1111111",7)) ;
          ok_sofar = TesterLab1.getAprobados(3,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("3333333") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Perez Rodriguez","6666666",3,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Iglesias Perez","4444444",10)) ;
          argument.addLast(new Calificacion("Francisco Rodriguez Fernandez","6666666",9)) ;
          ok_sofar = TesterLab1.getAprobados(9,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Gonzalez","3333333",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Rodriguez","5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Rodriguez Gonzalez","2222222",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Clara Gonzalez Gonzalez",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",5,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Rodriguez Rodriguez","1111111",7)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Perez","2222222",5)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Gonzalez","3333333",9)) ;
          argument.addLast(new Calificacion("Dolores Iglesias Perez","4444444",8)) ;
          argument.addLast(new Calificacion("Clara Perez Rodriguez","5555555",1)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Sanchez Sanchez","5555555",4,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Perez Rodriguez","5555555",1)) ;
          argument.addLast(new Calificacion("Clara Gonzalez Gonzalez","3333333",9)) ;
          argument.addLast(new Calificacion("Dolores Iglesias Perez","4444444",8)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Perez","2222222",5)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Rodriguez","1111111",7)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Sanchez Rodriguez","5555555",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Dolores Rodriguez Perez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Gonzalez Perez","2222222",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Fernandez Fernandez","2222222",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Sanchez","3333333",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      return ok_sofar ;
  }


  private static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Perez","6666666",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Fernandez","3333333",9,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          argument.addLast(new Calificacion("Paloma Perez Perez","6666666",10)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          argument.addLast(new Calificacion("Paloma Perez Perez","6666666",10)) ;
          ok_sofar = TesterLab1.getAprobados(5,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Iglesias Iglesias","4444444",2,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          argument.addLast(new Calificacion("Juan Iglesias Iglesias","4444444",2)) ;
          argument.addLast(new Calificacion("Paloma Perez Perez","6666666",10)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Gonzalez","3333333",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Perez","3333333",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",6,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.getAprobados(2,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Iglesias","2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Gonzalez Gonzalez","5555555",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Gonzalez Gonzalez","2222222",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Sanchez Perez","3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Fernandez Rodriguez","6666666",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Pablo Fernandez Rodriguez","6666666",7)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Rodriguez Iglesias","6666666",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Gonzalez Gonzalez","5555555",4)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Iglesias","2222222",5)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.getAprobados(4,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",9,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Iglesias","2222222",5)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          argument.addLast(new Calificacion("Julio Gonzalez Gonzalez","5555555",4)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Julio Rodriguez Fernandez",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Gonzalez Gonzalez","5555555",3)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("2222222") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",5,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Rodriguez Iglesias","6666666",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Perez Fernandez","3333333",10,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Rodriguez Iglesias","6666666",6)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Fernandez","3333333",9)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",9,false) ;
      return ok_sofar ;
  }


  private static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Rodriguez","2222222",6,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Perez Rodriguez","2222222",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Perez","4444444",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Gonzalez","3333333",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Gonzalez","3333333",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Fernandez Iglesias","2222222",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Clara Perez Rodriguez",2) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Fernandez Iglesias","6666666",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Fernandez Gonzalez","3333333",9)) ;
          ok_sofar = TesterLab1.getAprobados(8,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Iglesias Perez","1111111",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Gonzalez","2222222",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Juan Iglesias Perez",10) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Fernandez Sanchez","1111111",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Sanchez","1111111",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Gonzalez","3333333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Clara Perez Rodriguez",2) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Fernandez","5555555",5,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Iglesias Perez","1111111",10)) ;
          argument.addLast(new Calificacion("Clara Perez Rodriguez","2222222",2)) ;
          argument.addLast(new Calificacion("Paloma Gonzalez Gonzalez","3333333",3)) ;
          argument.addLast(new Calificacion("Clara Perez Perez","4444444",8)) ;
          argument.addLast(new Calificacion("Julio Fernandez Fernandez","5555555",5)) ;
          argument.addLast(new Calificacion("Juan Fernandez Iglesias","6666666",4)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Clara Perez Perez",8) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Rodriguez Iglesias","5555555",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Juan Iglesias Perez",10) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Sanchez Perez","4444444",5,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Gonzalez Gonzalez","3333333",3)) ;
          argument.addLast(new Calificacion("Julio Fernandez Fernandez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Perez","4444444",5)) ;
          argument.addLast(new Calificacion("Clara Perez Rodriguez","2222222",9)) ;
          argument.addLast(new Calificacion("Juan Iglesias Perez","1111111",10)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",9,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Juan Iglesias Perez","1111111",10)) ;
          argument.addLast(new Calificacion("Clara Perez Rodriguez","2222222",9)) ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Clara Sanchez Perez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Clara Perez Rodriguez",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Julio Fernandez Fernandez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Perez Fernandez","3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Gonzalez","6666666",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Iglesias","6666666",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Clara Perez Rodriguez",8) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Rodriguez","3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Iglesias","1111111",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Rodriguez Gonzalez","4444444",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Gonzalez","6666666",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Fernandez Iglesias","3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Gonzalez Sanchez","1111111",7,true) ;
      return ok_sofar ;
  }


  private static boolean test_68 ()
  {
      
      testName = "test_68" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Rodriguez Sanchez","6666666",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Sanchez","6666666",1)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Perez Fernandez","5555555",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Perez Perez","4444444",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",3,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(5,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Gonzalez","4444444",10,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Sanchez","6666666",3)) ;
          argument.addLast(new Calificacion("Juan Perez Fernandez","5555555",4)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Gonzalez","4444444",10)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Perez","6666666",6,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Rodriguez Sanchez","6666666",3)) ;
          argument.addLast(new Calificacion("Juan Perez Fernandez","5555555",4)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Gonzalez","4444444",10)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Rodriguez Sanchez","3333333",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Sanchez Gonzalez","1111111",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Perez","6666666",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Iglesias","2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Iglesias Rodriguez","5555555",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Perez","1111111",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Paloma Fernandez Iglesias",2) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Gonzalez Rodriguez","5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Rodriguez Fernandez","5555555",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Paloma Fernandez Iglesias",2) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",4,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Rodriguez Gonzalez","4444444",10)) ;
          ok_sofar = TesterLab1.getAprobados(8,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Iglesias Gonzalez","6666666",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Juan Perez Fernandez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Perez Perez","5555555",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Fernandez Iglesias","2222222",8,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Fernandez Iglesias","2222222",2)) ;
          argument.addLast(new Calificacion("Clara Rodriguez Sanchez","3333333",6)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Gonzalez","4444444",10)) ;
          argument.addLast(new Calificacion("Juan Perez Fernandez","5555555",1)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Sanchez","6666666",4)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("4444444","Paloma Rodriguez Gonzalez",10) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Fernandez Perez","3333333",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Sanchez","4444444",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Sanchez Fernandez","1111111",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Gonzalez","4444444",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Perez Gonzalez","3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Iglesias Gonzalez","5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Iglesias Rodriguez","2222222",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Rodriguez","2222222",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Rodriguez","2222222",7,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(10,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Clara Rodriguez Sanchez",6) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",6,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Iglesias Gonzalez","4444444",9)) ;
          argument.addLast(new Calificacion("Paloma Fernandez Iglesias","2222222",9)) ;
          argument.addLast(new Calificacion("Clara Rodriguez Sanchez","3333333",6)) ;
          argument.addLast(new Calificacion("Juan Perez Fernandez","5555555",6)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Sanchez","6666666",4)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Iglesias Gonzalez","4444444",9)) ;
          argument.addLast(new Calificacion("Paloma Fernandez Iglesias","2222222",9)) ;
          argument.addLast(new Calificacion("Clara Rodriguez Sanchez","3333333",6)) ;
          argument.addLast(new Calificacion("Juan Perez Fernandez","5555555",6)) ;
          argument.addLast(new Calificacion("Julio Rodriguez Sanchez","6666666",4)) ;
          ok_sofar = TesterLab1.getAprobados(4,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Rodriguez Perez","1111111",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      return ok_sofar ;
  }


  private static boolean test_69 ()
  {
      
      testName = "test_69" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Rodriguez Iglesias","2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Sanchez Sanchez","5555555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Rodriguez Fernandez","2222222",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Sanchez Sanchez","1111111",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Sanchez Fernandez","1111111",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Fernandez Perez","6666666",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Rodriguez Iglesias","2222222",2)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Francisco Fernandez Perez","6666666",7)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Pablo Sanchez Sanchez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Gonzalez Iglesias","6666666",2,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Fernandez Perez","6666666",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Francisco Fernandez Perez","6666666",3)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Fernandez Perez","6666666",3)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          ok_sofar = TesterLab1.getAprobados(2,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Rodriguez Gonzalez","3333333",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Rodriguez Sanchez","4444444",3,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(7,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("1111111","Clara Sanchez Sanchez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Sanchez Perez","3333333",1,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Pablo Sanchez Sanchez",5) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Perez Sanchez","2222222",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Fernandez","4444444",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Iglesias Iglesias","4444444",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Gonzalez Rodriguez","5555555",7,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Perez Sanchez","2222222",1)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          ok_sofar = TesterLab1.getAprobados(6,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Perez Sanchez","2222222",1)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Sanchez Sanchez","1111111",6,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Maria Perez Sanchez","2222222",1)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Gonzalez Sanchez","5555555",2,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Fernandez Perez","5555555",3,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("5555555","Pablo Sanchez Sanchez",5) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",3)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","1111111",5)) ;
          argument.addLast(new Calificacion("Pablo Rodriguez Gonzalez","3333333",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Gonzalez Gonzalez","3333333",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",5,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Gonzalez Gonzalez","3333333",10)) ;
          ok_sofar = TesterLab1.getAprobados(10,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          argument.addLast(new Calificacion("Dolores Rodriguez Sanchez","4444444",5)) ;
          argument.addLast(new Calificacion("Paloma Gonzalez Gonzalez","3333333",10)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Rodriguez Perez","5555555",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Sanchez Sanchez","3333333",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Rodriguez Sanchez","3333333",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Sanchez Perez","6666666",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("6666666","Maria Sanchez Perez",4) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Sanchez Rodriguez","3333333",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",7,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Sanchez Perez","6666666",7)) ;
          argument.addLast(new Calificacion("Paloma Rodriguez Sanchez","3333333",4)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          ok_sofar = TesterLab1.getAprobados(3,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Sanchez Gonzalez","3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Perez","3333333",6,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Sanchez Perez","6666666",7)) ;
          argument.addLast(new Calificacion("Pablo Sanchez Sanchez","5555555",5)) ;
          ok_sofar = TesterLab1.getAprobados(5,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Iglesias Perez","3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Fernandez","1111111",1,true) ;
      return ok_sofar ;
  }


  private static boolean test_70 ()
  {
      
      testName = "test_70" ;
      callSeq = "" ;
      actaNotasAED = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab1.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Sanchez Sanchez","3333333",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("1111111") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Gonzalez Iglesias","1111111",1,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Gonzalez Iglesias","1111111",1)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Clara Sanchez Sanchez",4) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Gonzalez Iglesias","1111111",1)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Gonzalez Iglesias","1111111",1)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Gonzalez Iglesias","1111111",1)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Gonzalez Sanchez","6666666",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Perez Perez","6666666",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Clara Sanchez Sanchez",4) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Iglesias Gonzalez","4444444",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Rodriguez Iglesias","3333333",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Perez Iglesias","4444444",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("5555555") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Rodriguez","2222222",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Fernandez Rodriguez","3333333",1,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Julio Fernandez Rodriguez","2222222",1)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("6666666") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Perez Fernandez","1111111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",9,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Perez Fernandez","1111111",1)) ;
          argument.addLast(new Calificacion("Julio Fernandez Rodriguez","2222222",1)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Perez Fernandez","1111111",1)) ;
          argument.addLast(new Calificacion("Julio Fernandez Rodriguez","2222222",1)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_fail("4444444") ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("2222222",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Rodriguez Iglesias","6666666",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("1111111",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Rodriguez Gonzalez","3333333",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Gonzalez Rodriguez","1111111",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Sanchez Fernandez","1111111",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Gonzalez Sanchez","1111111",7,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Rodriguez Iglesias","6666666",6)) ;
          argument.addLast(new Calificacion("Francisco Perez Fernandez","1111111",5)) ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          ok_sofar = TesterLab1.getAprobados(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Clara Sanchez Sanchez","3333333",4)) ;
          argument.addLast(new Calificacion("Francisco Perez Fernandez","1111111",5)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Iglesias","6666666",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Fernandez Gonzalez","4444444",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Maria Sanchez Perez","1111111",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Paloma Perez Iglesias","2222222",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Rodriguez Iglesias","2222222",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Clara Sanchez Sanchez",4) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("3333333",3,true) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(9,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Maria Fernandez Gonzalez","4444444",7)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Iglesias","6666666",6)) ;
          ok_sofar = TesterLab1.getAprobados(6,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Iglesias","4444444",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("5555555",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Fernandez Rodriguez","3333333",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("4444444",10,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          ok_sofar = TesterLab1.getAprobados(8,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("3333333","Clara Sanchez Sanchez",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Rodriguez Gonzalez","2222222",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("4444444",false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Paloma Perez Iglesias","2222222",3)) ;
          argument.addLast(new Calificacion("Francisco Perez Fernandez","1111111",5)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Iglesias","6666666",6)) ;
          ok_sofar = TesterLab1.sort(1,argument) ;
      }
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Perez Fernandez","1111111",5)) ;
          argument.addLast(new Calificacion("Paloma Perez Iglesias","2222222",3)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Iglesias","6666666",6)) ;
          ok_sofar = TesterLab1.sort(0,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Sanchez Perez","6666666",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Fernandez Perez","5555555",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Julio Fernandez Gonzalez","1111111",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.remove("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Clara Perez Sanchez","1111111",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Paloma Perez Iglesias",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Pablo Iglesias Gonzalez","5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Perez Perez","4444444",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Perez Iglesias","2222222",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.update("6666666",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.get_success("2222222","Paloma Perez Iglesias",3) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Francisco Perez Perez","4444444",8)) ;
          argument.addLast(new Calificacion("Juan Fernandez Perez","5555555",4)) ;
          argument.addLast(new Calificacion("Paloma Perez Iglesias","2222222",3)) ;
          argument.addLast(new Calificacion("Maria Rodriguez Iglesias","6666666",3)) ;
          argument.addLast(new Calificacion("Francisco Perez Fernandez","1111111",5)) ;
          ok_sofar = TesterLab1.getAprobados(2,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Dolores Iglesias Iglesias","3333333",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Juan Sanchez Perez","4444444",10,false) ;
      if (ok_sofar)
      {
          PositionList<Calificacion> argument = new NodePositionList<Calificacion>() ;
          argument.addLast(new Calificacion("Dolores Iglesias Iglesias","3333333",4)) ;
          argument.addLast(new Calificacion("Francisco Perez Perez","4444444",8)) ;
          argument.addLast(new Calificacion("Juan Fernandez Perez","5555555",4)) ;
          argument.addLast(new Calificacion("Francisco Perez Fernandez","1111111",5)) ;
          ok_sofar = TesterLab1.getAprobados(4,argument) ;
      }
      if (ok_sofar)
          ok_sofar = TesterLab1.add("Francisco Iglesias Iglesias","3333333",8,false) ;
      return ok_sofar ;
  }



  static boolean constructor() {
      boolean ok_sofar = true;

      callSeq += "\n  actaNotasAED = new ActaNotasAED();";

      try {
	  actaNotasAED = new ActaNotasAED();
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  //////////////////////////////////////////////////////////////////////

  static boolean get_fail(String matricula) {
      boolean ok_sofar = true;

      callSeq += "\n  actaNotasAED.getCalificacion(\""+matricula+"\");";

      try {
	  Calificacion cal = actaNotasAED.getCalificacion(matricula);
	  ok_sofar = false;
	  printError
	      (ExecutionTime.LAST,
	       "\nthe call to getCalificacion returned the value "+cal+
	       ", but should have raised the exception "+
	       "InvalidMatriculaException");
      } catch ( InvalidMatriculaException exc ) {
      } catch ( Throwable exc ) {
	  ok_sofar = false;
	  printCallException(exc);
      }

      return ok_sofar;
  }

  static boolean get_success(String matricula, String nombre, int nota) {
      boolean ok_sofar = true;

      callSeq += "\n  actaNotasAED.getCalificacion(\""+matricula+"\");";

      try {
	  Calificacion cal = actaNotasAED.getCalificacion(matricula);
	  if (!matricula.equals(cal.getMatricula())) {
	      ok_sofar = false;
	      printError
	      (ExecutionTime.LAST,
	       "\nthe call to getCalificacion returned the value "+cal+
	       ", but the matricula should have been "+matricula);
	  } else if (!nombre.equals(cal.getNombre())) {
	      ok_sofar = false;   
	      printError
	      (ExecutionTime.LAST,
	       "\nthe call to getCalificacion returned the value "+cal+
	       ", but the nombre should have been "+nombre);
	  } else if (nota != cal.getNota()) {
	      ok_sofar = false;   
	      printError
	      (ExecutionTime.LAST,
	       "\nthe call to getCalificacion returned the value "+cal+
	       ", but the nota should have been "+nota);
	  }
      } catch ( Throwable exc ) {
	  ok_sofar = false;
	  printCallException(exc);
      }

      return ok_sofar;
  }

  static boolean remove(String matricula,boolean expectedResult) {
      boolean ok_sofar = true;

      callSeq += "\n  actaNotasAED.deleteCalificacion(\""+matricula+"\");";

      try {
	  actaNotasAED.deleteCalificacion(matricula);
	  if (!expectedResult) {
	      ok_sofar = false;
	      printError
		  (ExecutionTime.LAST,
		   "\nthe call to deleteCalificacion returned normally"+
		   ", but should have raised the exception "+
		   "InvalidMatriculaException");
	  }
      } catch ( InvalidMatriculaException exc ) {
	  if (expectedResult) {
	      ok_sofar = false;
	      printCallException(exc);
	  }
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  static boolean update(String matricula,int nota,boolean expectedResult) {
      boolean ok_sofar = true;

      callSeq += "\n  actaNotasAED.updateNota(\""+matricula+"\","+nota+");";

      try {
	  actaNotasAED.updateNota(matricula,nota);
	  if (!expectedResult) {
	      ok_sofar = false;
	      printError
		  (ExecutionTime.LAST,
		   "\nthe call to updateNota returned normally"+
		   ", but should have raised the exception "+
		   "InvalidMatriculaException");
	  }
      } catch ( InvalidMatriculaException exc ) {
	  if (expectedResult) {
	      ok_sofar = false;
	      printCallException(exc);
	  }
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  static boolean add(String nombre, String matricula,int nota,boolean expectedResult) {
      boolean ok_sofar = true;

      callSeq += "\n  actaNotasAED.addCalificacion(\""+nombre+"\",\""+matricula+"\","+nota+");";

      try {
	  actaNotasAED.addCalificacion(nombre,matricula,nota);
	  if (!expectedResult) {
	      ok_sofar = false;
	      printError
		  (ExecutionTime.LAST,
		   "\nthe call to addCalificacion returned normally"+
		   ", but should have raised the exception "+
		   "CalificacionAlreadyExistsException");
	  }
      } catch ( CalificacionAlreadyExistsException exc ) {
	  if (expectedResult) {
	      ok_sofar = false;
	      printCallException(exc);
	  }
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  static boolean getAprobados(int notaMinima, PositionList<Calificacion> expected) {
      boolean ok_sofar = true;

      callSeq += "\n  actaNotasAED.getAprobados("+notaMinima+");";

      try {
	  IndexedList<Calificacion> result =
	      actaNotasAED.getAprobados(notaMinima);
	  if (result == null) {
	      ok_sofar = false;
	      printError
		  (ExecutionTime.LAST,
		   "\nthe call to getAprobados returned the value null");
	  }
	  if (ok_sofar)
	      ok_sofar = unique_matriculas(result,"actaNotasAED.getAprobados");
	  if (ok_sofar) {
	      HashSet<Calificacion> ts1 = new HashSet<Calificacion>();
	      HashSet<Calificacion> ts2 = new HashSet<Calificacion>();
	      for (Calificacion cal1 : result)
		  ts1.add(cal1);
	      for (Calificacion cal2 : expected)
		  ts2.add(cal2);

	      if (!ts1.equals(ts2)) {
		  ok_sofar = false;
		  printError
		      (ExecutionTime.LAST,
		       "\nthe call to getAprobados returned a list\n"+result+"\nwith some calificaciones extra/missing compared to the expected result\n"+expected);
		      return false;
	      }
	  }
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  static boolean unique_matriculas(IndexedList<Calificacion> l, String methodName) {
      for (int i=0; i<l.size(); i++) {
	  Calificacion cal = l.get(i);
	  if (cal == null) {
	      printError
		  (ExecutionTime.LAST,
		   "\nthe call to "+methodName+" returned an indexed list "+
		   " with null calificaciones inside:\n"+
		   l);
	      return false;
	  }
	  for (int j=i+1; j<l.size(); j++) {
	      Calificacion otherCal = l.get(j);
	      if (otherCal == null) {
		  printError
		      (ExecutionTime.LAST,
		       "\nthe call to "+methodName+" returned an indexed list "+
		       " with null calificaciones inside:\n"+
		       l);
		  return false;
	      }
	      String mat1 = cal.getMatricula();
	      if (mat1 == null) {
		  printError
		      (ExecutionTime.LAST,
		       "\nthe call to "+methodName+" returned an indexed list "+
		       " with calificaciones with a null matricula inside:\n"+
		       l);
		  return false;
	      }
	      if (mat1.equals(otherCal.getMatricula())) {
		  printError
		      (ExecutionTime.LAST,
		       "\nthe call to "+methodName+" returned an indexed list "+
		       " with calificaciones with identical matriculas:\n"+
		       l);
		  return false;
	      }
	  }
      }
      return true;
  }

  static boolean sort(int comparator, PositionList<Calificacion> expected) {
      boolean ok_sofar = true;

      String comparatorString = "";
      
      if (comparator == 0) {
	  comparatorString = "new MatriculaComparator()";
      } else if (comparator == 1) {
	  comparatorString = "new NotaComparator()";
      }
	  
      callSeq += "\n  actaNotasAED.getCalificaciones("+comparatorString+");";

      try {
	  Comparator<Calificacion> cmp = null;
	  
	  if (comparator == 0) {
	      cmp = new MatriculaComparator();
	  } else if (comparator == 1) {
	      cmp = new NotaComparator();
	  }
	  
	  IndexedList<Calificacion> result =
	      actaNotasAED.getCalificaciones(cmp);

	  if (result == null) {
	      ok_sofar = false;
	      printError
		  (ExecutionTime.LAST,
		   "\nthe call to getCalificaciones returned the value null");
	  }

	  if (ok_sofar)
	      ok_sofar = unique_matriculas(result,"actaNotasAED.getCalificaciones");

	  if (ok_sofar) {
	      ArrayList<Calificacion> ts1 = new ArrayList<Calificacion>();
	      ArrayList<Calificacion> ts2 = new ArrayList<Calificacion>();
	      for (Calificacion cal1 : result)
		  ts1.add(cal1);
	      for (Calificacion cal2 : expected)
		  ts2.add(cal2);

	      if (ts1.size() != ts2.size()) {
		  ok_sofar = false;
		  printError
		      (ExecutionTime.LAST,
		       "\nthe call to getCalificaciones returned a list\n"+result+"\nwith some calificaciones which is not equal to the expected result\n"+expected);
		      return false;
	      }

	      if (ok_sofar) {
		HashSet<Calificacion> ths1 = new HashSet<Calificacion>();
		HashSet<Calificacion> ths2 = new HashSet<Calificacion>();

		for (Calificacion cal1 : result)
		  ths1.add(cal1);
		for (Calificacion cal2 : expected)
		  ths2.add(cal2);

		if (!ths1.equals(ths2)) {
		  printError
		    (ExecutionTime.LAST,
		     "\nthe call to getCalificaciones returned a list\n"+result+
		     "\nwith does not contain the same calificaciones as the expected result\n"+expected);
		  ok_sofar = false;
		  return false;
		}
	      }

	      if (ok_sofar) {
		  int i = 0;
		  while (i<ts1.size()) {
		      Calificacion c1 = ts1.get(i);
		      if (c1 == null) {
			  printError
			      (ExecutionTime.LAST,
			       "\nthe call to getCalificaciones returned a list\n"+result+"\nwith some calificaciones which is not equal to the expected result\n"+expected);
			  return false;
		      }
		      boolean found = false;
		      int j = i;
		      while (j<ts2.size() && !found) {
			  Calificacion c2 = ts2.get(j);
			  if (c1.equals(c2)) {
			      found = true;
			      ts2.set(j,ts2.get(i));
			  }
			  if (!found) {
			      if (equal_comparator(comparator,c1,c2)) ++j;
			      else break;
			  }
		      }
		      if (!found) {
			  printError
			      (ExecutionTime.LAST,
			       "\nthe call to getCalificaciones returned a list\n"+result+" which is wrongly sorted\n");
			  return false;
		      }
		      ++i;
		  }
	      }
	  }
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  static boolean equal_comparator(int comparator, Calificacion c1, Calificacion c2) {
      if (comparator == 0) {
	  return c2.getMatricula().equals(c1.getMatricula());
      } else if (comparator == 1) {
	  return c1.getNota() == c2.getNota();
      } else return false;
  }

  static int test_type_to_index(String test_type) {
      if (test_type.equals("actasnotas")) return 0;
      System.out.println("*** Error: test "+test_type+" unknown.");
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
	  if (i==0) testName = "actanotas";

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
      System.out.println("\n*** Warning in "+TestName+":\n");
  }

  static void printError(String TestName) {
      System.out.println("\n*** Error in "+TestName+":\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error in "+testName+":\n");

      if (!callSeq.equals("")) {
	  System.out.print(callSeqString(time));
	  System.out.println();
	  System.out.println(callSeq);
      }

      switch (time) {
      case AFTER:
	  System.out.println("\nthe call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("\nthe exception "+exc+" was raised although it "+
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
      System.out.println("\n*** Error in "+testName+":\n");
      System.out.print(callSeqString(time));
      System.out.println();
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

  static String printArray(Object[] arr) {
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



