package gestionpedidos;

import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.transportes.Transporte;
import anotacion.Programacion2; 

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public class GestionReparto {
	// CÓDIGO DE APOYO
	private GestionRepartoLocal[] gestoresLocales;
	private Mapa mapa;
	
	//Constructor de GestoresLocales y mapa. GestoresLocales Es un array de 4 debido a que el mapa se divide en 4 zonas (localidades).
	public GestionReparto(Mapa mapa){
		this.gestoresLocales=new GestionRepartoLocal[4];
		gestoresLocales[0]=new GestionRepartoLocal();
		gestoresLocales[1]=new GestionRepartoLocal();
		gestoresLocales[2]=new GestionRepartoLocal();
		gestoresLocales[3]=new GestionRepartoLocal();
		this.mapa=mapa;
	}
	
	//CÓDIGO DE APOYO
	public Mapa getMapa() {
		return mapa;
	}
	
	// CÓDIGO DE APOYO
	public String getEstadoGestorLocal(int i){
		return this.gestoresLocales[i].getDisponibles() + this.gestoresLocales[i].getEsperando();
	}
	
	// CÓDIGO DE APOYO
	public String getEstadoGestorLocalNum(int i){
		return this.gestoresLocales[i].getCodMotosDisponibles().size() + ";" +
				this.gestoresLocales[i].getCodFurgoDisponibles().size() + ";" +
				this.gestoresLocales[i].getCodEsperandoMoto().size() + ";" +
				this.gestoresLocales[i].getCodEsperandoFurgo().size() ;
	}
	

	//Añade el transporte a su gestor según su posición y en que localidad está. Para ello, se sacan las coordenadas de transporte y se comparan con los intervalos
	//cerrados de cada localidad. Si se cumple que la posición está en los límites de cierta zona, se añade a su correspondiente gestor (metodo add de GestionRepartoLocal).
	public void addTransporteLocalidad(Transporte transporte) {
		String codTransporte=transporte.getCodigo();
		PosicionXY posTransporte=mapa.getPosicion(codTransporte);
		
		int transX=posTransporte.getX();
		int transY=posTransporte.getY();
		
		if(0<=transX&&transX<=mapa.getMaxCoordX()/2&&0<=transY&&transY<=mapa.getMaxCoordY()/2){
			gestoresLocales[0].add(transporte);
		}
		else if(mapa.getMaxCoordX()/2 +1<=transX&&transX<=mapa.getMaxCoordX()&&0<=transY&&transY<=mapa.getMaxCoordY()/2){
			gestoresLocales[1].add(transporte);
		}
		else if(0<=transX&&transX<=mapa.getMaxCoordX()/2&&mapa.getMaxCoordY()/2 +1<=transY&&transY<=mapa.getMaxCoordY()){
			gestoresLocales[2].add(transporte);
		}
		else if(mapa.getMaxCoordX()/2 +1<=transX&&transX<=mapa.getMaxCoordX()&&mapa.getMaxCoordY()/2 +1<=transY&&transY<=mapa.getMaxCoordY()){
			gestoresLocales[3].add(transporte);
		}
	}
		
	//Se hace de la misma manera que addTransporteLocalidad, pero ahora dado que consideramos el pedido, hay que tener en cuenta las coordenadas de cliente o bien
	//restaurante, las cuales son fijas en el mapa (un cliente solo puede pedir en restaurantes de la misma localidad y viceversa). Se asigna a su correspondiente
	//gestor usando el método asignarPedido de GestionRepartoLocal.
	public void asignarPedido(Pedido pedido){
		String codCliente=pedido.getCliente().getCodigo();
		PosicionXY posCliente=mapa.getPosicion(codCliente);
		
		int cliX=posCliente.getX();
		int cliY=posCliente.getY();
		
		if(0<=cliX&&cliX<=mapa.getMaxCoordX()/2&&0<=cliY&&cliY<=mapa.getMaxCoordY()/2){
			gestoresLocales[0].asignarPedido(pedido);
		}
		else if(mapa.getMaxCoordX()/2 +1<=cliX&&cliX<=mapa.getMaxCoordX()&&0<=cliY&&cliY<=mapa.getMaxCoordY()/2){
			gestoresLocales[1].asignarPedido(pedido);
		}
		else if(0<=cliX&&cliX<=mapa.getMaxCoordX()/2&&mapa.getMaxCoordY()/2 +1<=cliY&&cliY<=mapa.getMaxCoordY()){
			gestoresLocales[2].asignarPedido(pedido);
		}
		else if(mapa.getMaxCoordX()/2 +1<=cliX&&cliX<=mapa.getMaxCoordX()&&mapa.getMaxCoordY()/2 +1<=cliY&&cliY<=mapa.getMaxCoordY()){
			gestoresLocales[3].asignarPedido(pedido);
		}
	}
	
	//Mismo funcionamiento que el método de arriba. Se vuelven a usar las coordenadas de cliente por el mismo motivo (aunque las de restaurante serían válidas).
	//Se notifica usando el método correspondiente de la clase GestionRepartoLocal.
	public void notificarEntregaPedido(Pedido pedido){
		String codCliente=pedido.getCliente().getCodigo();
		PosicionXY posCliente=mapa.getPosicion(codCliente);
		
		int cliX=posCliente.getX();
		int cliY=posCliente.getY();
		
		if(0<=cliX&&cliX<=mapa.getMaxCoordX()/2&&0<=cliY&&cliY<=mapa.getMaxCoordY()/2){
			gestoresLocales[0].notificarEntregaPedido(pedido);
		}
		else if(mapa.getMaxCoordX()/2 +1<=cliX&&cliX<=mapa.getMaxCoordX()&&0<=cliY&&cliY<=mapa.getMaxCoordY()/2){
			gestoresLocales[1].notificarEntregaPedido(pedido);
		}
		else if(0<=cliX&&cliX<=mapa.getMaxCoordX()/2&&mapa.getMaxCoordY()/2 +1<=cliY&&cliY<=mapa.getMaxCoordY()){
			gestoresLocales[2].notificarEntregaPedido(pedido);
		}
		else if(mapa.getMaxCoordX()/2 +1<=cliX&&cliX<=mapa.getMaxCoordX()&&mapa.getMaxCoordY()/2 +1<=cliY&&cliY<=mapa.getMaxCoordY()){
			gestoresLocales[3].notificarEntregaPedido(pedido);
		}
	}
	
}
