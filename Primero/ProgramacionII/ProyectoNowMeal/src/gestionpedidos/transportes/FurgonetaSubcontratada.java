package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2;  

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

//Hereda de Furgoneta que a su vez hereda de Transporte.
public class FurgonetaSubcontratada extends Furgoneta {
	
	//ATRIBUTOS
	private double eurosPKm;
	
	//CONSTRUCTOR
	public FurgonetaSubcontratada(String codigo, Mapa mapa, double tara){
		super(codigo,mapa,tara);
		this.eurosPKm=1;
	}
	
	//GETTERS-SETTERS
	public double getEurosPKm(){
		return eurosPKm;
	}
	
	public void setEurosPKm(double eurosPKm){
		this.eurosPKm=eurosPKm;
	}
	
	//Implementación del método abstracto coste en la subclase correspodiente.
	public double coste(String codPosOrigen, String codPosDestino){
		if(getTara()<1000){
			return getMapa().distancia(codPosOrigen, codPosDestino)*eurosPKm;
		}
		else{
			return getMapa().distancia(codPosOrigen, codPosDestino)*eurosPKm*1.10;
		}
	}
	
}
