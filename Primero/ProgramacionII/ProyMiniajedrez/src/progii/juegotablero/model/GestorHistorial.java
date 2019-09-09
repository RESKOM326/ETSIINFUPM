package progii.juegotablero.model;

import progii.juegotablero.exceptions.MovimientoException;
import stacks.exceptions.EmptyStackException;
import stacks.Stack;
import anotacion.Programacion2;

@Programacion2 (
		nombreAutor1 = "Angelika",
		apellidoAutor1 = "Krolikowska",
		emailUPMAutor1 = "a.krolikowska@alumnos.upm.es",
		nombreAutor2 = "Mark",
		apellidoAutor2 = "Dervishaj Memi", 
		emailUPMAutor2 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public class GestorHistorial {
	
	//ATRIBUTOS
	private Stack<Movimiento> pilaDeshacer;
	private Stack<Movimiento> pilaRehacer;
	
	//CONSTRUCTOR
	public GestorHistorial() {
		pilaDeshacer=new Stack<Movimiento>();
		pilaRehacer=new Stack<Movimiento>();
	}
	
	//GUARDAR MOVIMIENTO
	public void guardarMovimiento (Movimiento movimiento) {
		if(!pilaRehacer.isEmpty()){
			pilaRehacer.makeEmpty();
		}
		pilaDeshacer.push(movimiento);
	}
	
	//DESHACER
	public Movimiento deshacer () throws MovimientoException {
		if(pilaDeshacer.isEmpty()){
			throw new MovimientoException("No se puede deshacer porque no hay movimientos que deshacer");
		}
		else{
			Movimiento movimiento=null;
			try{
				movimiento=pilaDeshacer.peek();
				pilaDeshacer.pop();
				pilaRehacer.push(movimiento);
			}
			catch (EmptyStackException excepcion){
				System.out.println("Pila vacía");
			}
			return movimiento;
		}	
	}
	
	//REHACER
	public Movimiento rehacer () throws MovimientoException {
		if(pilaRehacer.isEmpty()){
			throw new MovimientoException("No hay movimientos que rehacer");
		}
		else{
			Movimiento movimiento=null;
			try{
				movimiento=pilaRehacer.peek();
				pilaRehacer.pop();
				pilaDeshacer.push(movimiento);
			}
			catch (EmptyStackException excepcion){
				System.out.println("Pila vacía");
			}
			return movimiento;
		}
	}
	
}
