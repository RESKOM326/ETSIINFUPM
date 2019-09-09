package gestionpedidos.pedido;

import anotacion.Programacion2; 

@Programacion2 (
		nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
	)

public class Cliente {
	private String codigo;
		
	public Cliente(String codigo) {
		this.codigo = codigo;		
	}
	
	public String getCodigo(){
		return codigo;
	}
}
