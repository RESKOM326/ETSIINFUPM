package aed.individual3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.util.Arrays;

import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;


/**
 * @author Guillermo Roman
 *
 */

public class TesterInd3 {
  
  public static final String LAB_NAME = "Entrega Individual 3";
  
  public static void main(String[] args) {
    
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName()
	.split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
    boolean exception; 
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{});
      Integer [] output = {}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    {
      PositionList<Integer> input= null;
      Integer [] output = null; 
      exception = true;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{1});
      Integer [] output = {1}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{1,1,1,1,1});
      Integer [] output = {1}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{1,1,1,1,2});
      Integer [] output = {1,2}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{1,2,1,1,1});
      Integer [] output = {1,2,1}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{1,3,1,3,1});
      Integer [] output = {1,3,1,3,1}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{new Integer(1000),new Integer(1000)});
      Integer [] output = {new Integer(1000)}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{1000,999,1000,1000});
      Integer [] output = {1000,999,1000}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{-128,-200});
      Integer [] output = {-128,-200}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{2,1,1,1,1,2});
      Integer [] output = {2,1,2}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{2,new Integer(1),1,1,1,2});
      Integer [] output = {2,1,2}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{1,2,3,4,5,6});
      Integer [] output = {1,2,3,4,5,6}; 
      exception = false;
      do_check(input,output,exception);
    }		
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{3,3,3,1,1,1});
      Integer [] output = {3,1}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{3,3,null,1,1,1});
      Integer [] output = {3,null,1}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{null,3,3,null,1,1,1});
      Integer [] output = {null,3,null,1}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{null,null,3,3,null,1,1,1});
      Integer [] output = {null,3,null,1}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{null,null,3,3,null,null,1,1,1});
      Integer [] output = {null,3,null,1}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{null,null,null,null,1,1,1});
      Integer [] output = {null,1}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{null,null,null,null});
      Integer [] output = {null}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    {
      PositionList<Integer> input= new NodePositionList<Integer>(new Integer []{1,null,null});
      Integer [] output = {1,null}; 
      exception = false;
      do_check(input,output,exception);
    }	
    
    
    System.out.println("\n Tester  (" + LAB_NAME + "): Test finalizado correctamente.");
  }
  
  /**
   * Método que prueba el resultado obtenido al llamar a compactar
   * @param list Lista de entrada
   * @param esperado Resultado esperado
   * @param excepcion ¿debe lanzar una excepción?
   */
  static void do_check(PositionList<Integer> lista, Integer [] esperado, boolean excepcion) {
    
    OperacionCompactar checker = new OperacionCompactar();
    
    PositionList<Integer> result = null;
    
    try {
      result = checker.compactar(lista);
    } catch (IllegalArgumentException exc) {
      if (!excepcion) {
	System.out.println("\n*** Tester Error (" + LAB_NAME + "): NO se esperaba la excepcion: "+exc+"\n ");
	System.out.println("\nEl método fue invocado con "+printArray(esperado)+"\n\n");
	exc.printStackTrace();
	throw new Error("Error en test: resultado incorrecto");
      }
      else return;
    } catch (RuntimeException exc) {
      System.out.println("\n*** Tester Error (" + LAB_NAME + "): NO se esperaba la excepcion: "+exc+"\n ");
	System.out.println("\nEl método fue invocado con "+printArray(esperado)+"\n\n");
      exc.printStackTrace();
      throw new Error("Error en test: resultado incorrecto");
    } 

    if (excepcion) {
	System.out.println("\n*** Tester Error (" + LAB_NAME + "): el método devuelve "+ printArray(result) + " " +
			   "\n en lugar de lanzar la excepcion IllegalArgumentException" + " cuando se invoca con " + printArray(lista)+ "\n"); 
	throw new Error("Error en test: resultado incorrecto");		    
    }

    if (!excepcion) {
      if (result == null) {
	System.out.println("\n*** null devuelto\n"); 
	System.out.println("\nEl método fue invocado con "+printArray(esperado)+"\n\n");
	throw new Error("Error en test (" + LAB_NAME + ": resultado incorrecto");		    
      }
      
      if (result == lista) {
	System.out.println("\n*** La lista devuelta debe ser una nueva lista\n"); 
	System.out.println("\nEl método fue invocado con "+printArray(esperado)+"\n\n");
	throw new Error("Error en test (" + LAB_NAME + ": resultado incorrecto");		    
      }
      
      if (!Arrays.equals(result.toArray(), esperado)) {
	System.out.println("\n*** Tester Error (" + LAB_NAME + "): el método devuelve "+ printArray(result) + " " +
			   "\n en lugar de " + printArray(esperado) + " cuando se invoca con " + printArray(lista)+ "\n"); 
	throw new Error("Error en test: resultado incorrecto");		    
      }
    }
  }
  
  static <E> String printArray(PositionList<E> arr) {
    if (arr == null) return "null";
    else return printArray(arr.toArray());
  }

  static String printArray(Object[] arr) {
    if (arr == null) {
      return "'null'"; 
    }
    StringBuffer result = new StringBuffer();
    result.append("[");
    for (int i=0; i<arr.length; i++) {
      result.append(arr[i]);
      if (i<arr.length-1) {
	result.append(",");
      }
    }
    result.append("]");
    return result.toString();
  }
}
