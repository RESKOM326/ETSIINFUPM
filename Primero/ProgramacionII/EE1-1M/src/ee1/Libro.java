package ee1;

import fecha.Fecha;
import anotacion.Programacion2;

@Programacion2 (
        nombreAutor1 = "Mark",
		apellidoAutor1 = "Dervishaj Memi",
		emailUPMAutor1 = "mark.dervishaj.memi@alumnos.upm.es"
)

public class Libro {
	
	//ATRIBUTOS
	private String titulo;
	private String autor;
	private Fecha fechaPublicacion;
	private int nVecesPrestado;
	
	//CONSTRUCTOR
	public Libro(String titulo, String autor, Fecha fechaPublicacion){
		this.titulo=titulo;
		this.autor=autor;
		this.fechaPublicacion=fechaPublicacion;
	}
	
	//GETTERS
	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}
	
	public Fecha getFechaPublicacion() {
		return fechaPublicacion;
	}
	
	public int getNVecesPrestado() {
		return nVecesPrestado;
	}
	
	//PRESTADO
	public void prestado() {
		this.nVecesPrestado = this.nVecesPrestado+1;
	}
	
	//ESIGUAL
	public boolean esIgual(Libro libro2){
		boolean res=false;
		if(this.titulo.equals(libro2.titulo)&&this.autor.equals(libro2.autor)&&this.fechaPublicacion.equals(libro2.fechaPublicacion)){
			res=true;
		}
		return res;
	}
	
	//TOSTRING
	public String toString(){
		String salida="'"+this.titulo+"', '"+this.autor+"' , '"+this.nVecesPrestado;
		return salida;
	}	
}