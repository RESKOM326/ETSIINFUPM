package test;

import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.Rule;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import list.ArrayList;
import progii.juegotablero.exceptions.PartidaException;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.ajedrez.PartidaAjedrez;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TableroAjedrez;

public class TestPiezas extends PartidaAjedrez {

	@Rule // Se establece un time out general para todos los tests. Se debe
			// comentar esta línea y la de abajo para depurar
	public TestRule globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100
																				// milisegundos
																				// máximos
																				// por
																				// test

	private final String workingDir=  System.getProperty("user.dir")+"//partidas//";

	protected void cargarPartidaTest(String nombre){
		try {
			this.cargar(workingDir+nombre);
		} catch (PartidaException e) {
			fail ("Error al cargar el archivo "+workingDir+nombre);
			e.printStackTrace();
		}
	}
	

	/**
	 * Este método comprueba los datos de escenario con la partida cargada acualmente
	 * En el caso de que la comprobación falle se retorna falso. Datos tendrá
	 * el mensaje actualizado
	 * 
	 * @param datos contiene la clase con la información de prueba
	 */
	protected boolean testMovimientos(DatosPrueba datos) {
		PiezaAjedrez pieza = ((TableroAjedrez) this.tablero).getPieza(datos.getFilaPieza(), datos.getColumnaPieza());
		if (pieza == null) {
			fail("La pieza no puede ser nula, verifioque el escenario de pruebas");
		} else {// No es null
			ArrayList<Casilla> res = pieza.movimientosValidos();
			if (res == null) {
				fail("mvimeintosValidos nunca retorna null. Esto ha pasdo con la pieza: " + pieza);
			}
			return datos.mismasCasillas(res);
		} // else
		return false;
	}



	protected PiezaAjedrez nucnaHayPieza(Integer fila, Character columna) {
		return null;
	}


	protected PiezaAjedrez hayPiezaTablero(Integer fila, Character columna) {
		return this.hayPiezaTablero(fila, columna);
	}
	
	
	/**
	 * Se define una clase auxiliar para la realización de los test. Esta clase constará de:
	 * -Un string que indica posición de la pieza en el tablero y las posibles posiciones que debería poder vistar la pieza
	 * -El mensaje que se va a mostrar si los movimeintos popsibles que da la pieza no coinciden 
	 * con los movimientos que se presuponen debería dar
	 * @author agonzalez
	 *
	 */
	protected class DatosPrueba {
		private Integer filaPieza;
		private Character columnaPieza;
		private ArrayList<Casilla> casillas;
		private StringBuilder mensaje;
		
		/**
		 * 
		 * @param datos contiene la secuencia de casillas separadas por comas de la siguente forna filaColumna,filaColumna ... 
		 * la primera posición hace referencia a la pieza que se va a evaluar y el resto a las posiciones que podría visitar la pieza.
		 *  Ejemplo: "2a,3a,4a" Represemtaría al peon blanco que está a la izquierda del tablero y que podría visitar según el estado
		 *  del tablero. 
		 *  @param mensaje: Mensaje de error que se dará si la prueba que usa estos datos no funciona
		 * 
		 */
		public DatosPrueba (String datos, String mensaje){
			StringTokenizer posCasillas = new StringTokenizer (datos,",");
			String actual = posCasillas.nextToken();
			filaPieza = Character.digit(actual.charAt(0), 10);
			columnaPieza = actual.charAt(1);
			this.casillas = new ArrayList<>();
			while (posCasillas.hasMoreTokens()){//W
				actual = posCasillas.nextToken();
				int fila = Character.digit(actual.charAt(0),10);
				char columna = actual.charAt(1);
				//Se convierte la forma de numerar del ajedrez al modelo interno
				this.casillas.add(casillas.size(), new Casilla(8-fila,(int)(columna-'a')));
			}//W
			this.mensaje = new StringBuilder(mensaje);
		}

		public Integer getFilaPieza() {
			return filaPieza;
		}

		public Character getColumnaPieza() {
			return columnaPieza;
		}

		public String getMensaje() {
			return mensaje.toString();
		}
		
		/**
		 * Este método verifica que todas las casillas que hay en casillas estén en verificar y que en verificar no existan más casillas de las 
		 * que hay en estos datos de prueba. Este método sólo se puede usar una vez por instancia ya que destrulle la información del atributo casillas
		 *  y actualiza el contenido de mensaje 
		 * @param verificar ArrayList de casillas que se quiere verificar. Este parámero será modificado y se iran eliminando las casillas
		 * que se vayan en contrando en el resultado esperado
		 * @return retorna cierto si ambos arrays (atributo y parámetro) contienen las mismas casillas tanto verificar como this.casillas terminarán vacios.
		 *  Falso e.o.c. y en verificar y/o this.casillas quedarán en el punto en el que se encontró la discrepancia
		 */
		public boolean mismasCasillas (ArrayList<Casilla> verificar){//mismasCasillas
			boolean correcto = true;
			Casilla buscar = null;
			while (verificar.size() >0 && correcto){
				buscar = verificar.get(0);
				correcto = casillas.remove(buscar);
				if (correcto){
					verificar.removeElementAt(0);
				}
			}
			
			if (!correcto){ //En buscar se encuentra una casilla que no corresponde
				mensaje.append(" No se encontró la casialla ("+(8-buscar.getX())
						+", "+(char) ('a'+buscar.getY())+") en la lista de movimientos esperadas");
			} else if (casillas.size()!=0){
				mensaje.append(" No se han optenido todas las casillas esperadas. Faltan: "+casillasToString());
				correcto = false;
			}
			return correcto;
		}//mismasCasillas
		
		/**
		 * Pasa todas las casillas que falten a un strimg con el formato de nomenclatura de fila y columna del ajedrez
		 * @return
		 */
		private String casillasToString(){
			StringBuilder res = new StringBuilder();
			for (int i=0; i < casillas.size();i++){
				Casilla tmp = casillas.get(i);
				res.append("("+(8-tmp.getX())
						+", "+(char) ('a'+tmp.getY())+") ");
			}
			
			return res.toString();
		}
	}
}
