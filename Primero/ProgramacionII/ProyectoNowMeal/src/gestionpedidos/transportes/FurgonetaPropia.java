package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2;  

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

//Hereda de la superclase Furgoneta (que a su vez hereda de Transporte).
public class FurgonetaPropia extends Furgoneta {
	
	//ATRIBUTOS
	private double velocidadMedia;
	static final private double EUROSPHORA=40.0;
	
	//CONSTRUCTOR
	public FurgonetaPropia(String codigo, Mapa mapa, double tara){
		super(codigo,mapa,tara);
		velocidadMedia=30.0;
	}
	
	//GETTERS-SETTERS
	public double getVelocidadMedia(){
		return velocidadMedia;
	}
	
	public void setVelocidadMedia(double velocidadMedia){
		this.velocidadMedia=velocidadMedia;
	}
	//Implementación del método abstracto en la subclase correspondiente.
	public double coste(String codPosOrigen, String codPosDestino){
		if(getTara()<1000.0){
			return getMapa().distancia(codPosOrigen, codPosDestino)*EUROSPHORA/velocidadMedia;
		}
		else{
			return getMapa().distancia(codPosOrigen, codPosDestino)*EUROSPHORA/velocidadMedia*1.10;
		}
	}
	
}
