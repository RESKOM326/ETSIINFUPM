package aed.actasnotas;

public class MainExample {

	public static void main(String[] args) throws CalificacionAlreadyExistsException, InvalidMatriculaException {
		ActaNotas actaNotasAED;

		// Poner aqui el codigo devuelto por el tester
		
		actaNotasAED = new ActaNotasAED();
		actaNotasAED.addCalificacion("Paloma Rodriguez Iglesias","3333333",4);
		actaNotasAED.getAprobados(1);
		
	}


}
