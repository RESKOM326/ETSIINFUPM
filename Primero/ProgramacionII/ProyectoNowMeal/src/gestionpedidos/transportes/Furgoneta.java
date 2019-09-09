package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2;  

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

//Es a su vez subclase de Transporte y superclase de ambos tipos de furgoneta, por tanto aquí no se implementa el coste abstracto aún y la clase tambíen será abstracta.
public abstract class Furgoneta extends Transporte {
	
	//ATRIBUTOS
	private double tara;
	
	//CONSTRUCTOR
	public Furgoneta(String codigo, Mapa mapa, double tara){
		super(codigo,mapa);
		this.tara=tara;
	}
	
	//GETTERS-SETTERS
	public double getTara(){
		return tara;
	}
	
	//Método abstracto a implementar por las subclases.
	abstract public double coste(String codPosOrigen, String codPosDestino);
}
