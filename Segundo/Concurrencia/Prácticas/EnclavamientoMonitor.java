// Grupo : Angelika Krolikowska (170042), Mark Dervishaj Memi (170296)

import Control.Color;
import es.upm.babel.cclib.Monitor;
import es.upm.babel.cclib.Monitor.Cond;

public class EnclavamientoMonitor implements Enclavamiento {
	
	public EnclavamientoMonitor() {
		for(int i=0; i<4; i++) {
			leerCmbSem[i] = mutex.newCond();
		}
	}
	
	Monitor mutex = new Monitor();
  
	Cond leerCmbBarr = mutex.newCond();
	boolean actualBarrera=false;
	Cond leerCmbFreno = mutex.newCond();
	boolean actualFreno=false;
	Cond[] leerCmbSem = new Cond[4];
	
	static Control.Color[] sem = {null, Control.Color.VERDE, Control.Color.VERDE, Control.Color.VERDE};
	static Control.Color colorActual = Control.Color.VERDE;
	static int semActual = 0;
	static int[] seg=new int[4];
	static int segActual = 0;
	static boolean presenciaActual=true;
  
	// Desbloqueos
	private void desbloqueos() {
		
		if(actualBarrera != (seg[1]+seg[2]==0) && leerCmbBarr.waiting()>0) {
	    	leerCmbBarr.signal();
	    }
		if(actualFreno!=(seg[1]>1 || seg[2]==1 || presenciaActual) && leerCmbFreno.waiting()>0) {
	    	leerCmbFreno.signal();
	    }
		if(!colorActual.equals(sem[semActual]) && leerCmbSem[semActual].waiting()>0) {
			leerCmbSem[semActual].signal();
		}
	}
  
  
	// Funciones auxiliares
	private void coloresCorrectos(){
		if(seg[1]>0) {
			sem[1]=Control.Color.ROJO;
		}
		else if(seg[1]==0 && (seg[2]>0 || presenciaActual)) {
			sem[1]=Control.Color.AMARILLO;
		}
		else if(seg[1]==0 && seg[2]==0 && !presenciaActual) {
			sem[1]=Control.Color.VERDE;
		}
		if(seg[2]>0 || presenciaActual) {
			sem[2]=Control.Color.ROJO;
		}
		else if(seg[2]==0 && !presenciaActual) {
			sem[2]=Control.Color.VERDE;
		}
		sem[3]=Control.Color.VERDE;
	}
  
  
	@Override
	/**
	 * PRE: cierta
	 * CPRE: cierta. No existe posible bloqueo.
	 * POST: existe presencia y tren está en su estado anterior y los colores son correctos.
	 */
	public void avisarPresencia(boolean presencia) {
		mutex.enter();
    
		// implementacion de la POST
		presenciaActual=presencia;
		coloresCorrectos();
    
    
		// codigo de desbloqueo
		mutex.leave();
	}

	@Override
	/*
	 * PRE: cierto.
	 * CPRE: hay almenos un tren en el seg1 � seg2.
	 * POST: no hay ning�n tren en seg1 y seg2.
	 */
  
	public boolean leerCambioBarrera(boolean actual) {
		mutex.enter();
			
		// chequeo de la CPRE y posible bloqueo
		if(actual == (seg[1]+seg[2]==0)) {
			actualBarrera=actual;
			leerCmbBarr.await();
		}
		boolean esperado=(seg[1]+seg[2]==0);
    
		//desbloqueo
		desbloqueos();
		mutex.leave();
		return esperado;
	}

	@Override
	/*
	 * PRE: cierto.
	 * CPRE: en seg1 no puede haber m�s de un tren � en el seg2 distinto a uno � no hay presencia.
	 * POST: en seg1 hay m�s de un tren � en seg2 hay un tren � hay presencia.
	 */
  
	public boolean leerCambioFreno(boolean actual) {
		mutex.enter();
		// chequeo de la CPRE y posible bloqueo
		if(actual==(seg[1]>1 || seg[2]==1 || presenciaActual)) {
    	actualFreno=actual;
    	leerCmbFreno.await();
		}
		// implementacion de la POST
		boolean esperado=(seg[1]>1 || seg[2]==1 || presenciaActual);
		// codigo de desbloqueo
		desbloqueos();
		mutex.leave();
		return esperado;
	}

  @Override
  /*
   * PRE: i distinto de 0.
   * CPRE: el color actual es distinto al color del semaforo actual
   * POST: actualizar semaforo
   */
  public Control.Color leerCambioSemaforo(int i, Control.Color actual) {
    mutex.enter();
    if(i==0) {
    	throw new PreconditionFailedException();
    }

	if(actual.equals(sem[i])) {
		semActual = i;
		colorActual = actual;
		leerCmbSem[i].await();
	}
	Control.Color esperado = actual;
    
	desbloqueos();
	
    mutex.leave();
    return esperado;
  }
  
  /*
   * PRE: i distinto de 0
   * CPRE: cierto
   * POST: tren es igual al tren antes de ejeutar, sumando 1 o restando 1 segun la i
   */
  @Override
  public void avisarPasoPorBaliza(int i) {
    mutex.enter();
    if(i==0) {
    	throw new PreconditionFailedException();
    }
    
    seg[i-1]=seg[i-1]-1;
    seg[i]=seg[i]+1;

    coloresCorrectos();
    
    mutex.leave();
  }
  
}