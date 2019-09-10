/**
 * @author Angelika Krolikowska (z170042), Mark Dervishaj Memi (z170296)
 */

// TODO : importar estructuras de datos, si os hace falta
import org.jcsp.lang.Alternative;
import org.jcsp.lang.Any2OneChannel;
import org.jcsp.lang.CSProcess;
import org.jcsp.lang.ProcessManager;
import org.jcsp.lang.Channel;
import org.jcsp.lang.Guard;
import org.jcsp.lang.One2OneChannel;
import java.util.ArrayList;

/**
 * Implementation using CSP (Mixed).
 * Técnica de peticiones aplazadas
 * excepto en las ops. de aviso (no bloqueantes)
 *
 * @author rul0
 */
public class EnclavamientoCSP implements CSProcess, Enclavamiento {

  /** WRAPPER IMPLEMENTATION */
  //** Channels for receiving external requests
  // Un canal por op. del recurso
  private final Any2OneChannel chAvisarPresencia     = Channel.any2one();
  private final Any2OneChannel chLeerCambioBarrera   = Channel.any2one();
  private final Any2OneChannel chLeerCambioFreno     = Channel.any2one();
  private final Any2OneChannel chLeerCambioSemaforo  = Channel.any2one();
  private final Any2OneChannel chAvisarPasoPorBaliza = Channel.any2one();

  /** 
   * Elementos del recurso 
   */
  boolean actualPresencia = false;
  int[] seg = {0, 0, 0, 0};
  Control.Color[] sem = {null, Control.Color.VERDE, Control.Color.VERDE, Control.Color.VERDE};

  public EnclavamientoCSP() {
    new ProcessManager(this).start();
  }

  // Clases auxiliares para las peticiones que se envían al servidor
  public static class PeticionLeerCambioBarrera{
    protected One2OneChannel channel;
    protected boolean value;

    public PeticionLeerCambioBarrera(One2OneChannel channel, boolean value) {
      this.channel = channel;
      this.value = value;
    }
  }

  public static class PeticionLeerCambioFreno{
    protected One2OneChannel channel;
    protected boolean value;

    public PeticionLeerCambioFreno(One2OneChannel channel, boolean value) {
      this.channel = channel;
      this.value = value;
    }
  }

  public static class PeticionLeerCambioSemaforo{
    protected One2OneChannel channel;
    protected Control.Color color;
    protected int index;

    public PeticionLeerCambioSemaforo(One2OneChannel channel,
                                      Control.Color color,
                                      int index) {
      this.channel = channel;
      this.color = color;
      this.index = index;
    }
  }

  // Implementación de la interfaz Enclavamiento
  @Override
  public void avisarPresencia(boolean presencia) {
    chAvisarPresencia.out().write(presencia);
  }

  @Override
  public boolean leerCambioBarrera(boolean abierta) {
    One2OneChannel ch = Channel.one2one();
    chLeerCambioBarrera.out().write(new PeticionLeerCambioBarrera(ch, abierta));

    return (Boolean) ch.in().read();
  }

  @Override
  public boolean leerCambioFreno(boolean accionado) {
    One2OneChannel ch = Channel.one2one();
    chLeerCambioFreno.out().write(new PeticionLeerCambioFreno(ch, accionado));

    return (Boolean) ch.in().read();
  }

  /** notice that exceptions can be thrown outside the server */
  @Override
  public Control.Color leerCambioSemaforo(int i, Control.Color color) {
    if (i == 0 )
      throw new PreconditionFailedException("Semaforo 0 no existe");

    One2OneChannel ch = Channel.one2one();
    chLeerCambioSemaforo.out().write(new PeticionLeerCambioSemaforo(ch, color, i));

    return (Control.Color) ch.in().read();
  }

  @Override
  public void avisarPasoPorBaliza(int i) {
    if (i == 0 )
      throw new PreconditionFailedException("Baliza 0 no existe");

    chAvisarPasoPorBaliza.out().write(i);
  }


  /** SERVER IMPLEMENTATION */
  static final int AVISAR_PRESENCIA = 0;
  static final int LEER_CAMBIO_BARRERA = 1;
  static final int LEER_CAMBIO_FRENO  = 2;
  static final int LEER_CAMBIO_SEMAFORO  = 3;
  static final int AVISAR_PASO_POR_BALIZA = 4;

  @Override
  public void run() {
    // TODO : Declarar aquí el estado del recurso:
    //        presencia, tren y color
    //
    // TODO : inicialización del estado del recurso
    //
    //

    // TODO : Declarar estructuras auxiliares para guardar
    //        las peticiones aplazadas en el servidor
    //
    ArrayList<PeticionLeerCambioBarrera> cmbBarr = new ArrayList<PeticionLeerCambioBarrera>();
    ArrayList<PeticionLeerCambioFreno> cmbFreno = new ArrayList<PeticionLeerCambioFreno>();
    ArrayList<PeticionLeerCambioSemaforo> cmbSem = new ArrayList<PeticionLeerCambioSemaforo>();

    // Construcción de la recepción alternativa
    Guard[] inputs = {
        chAvisarPresencia.in(),
        chLeerCambioBarrera.in(),
        chLeerCambioFreno.in(),
        chLeerCambioSemaforo.in(),
        chAvisarPasoPorBaliza.in()
    };

    Alternative services = new Alternative(inputs);
    int chosenService = 0;

    // Bucle de servicio
    while (true){
      chosenService = services.fairSelect();

      switch (chosenService) {

      case AVISAR_PRESENCIA:
        //@ assume pre && cpre
        // TODO : leer petición del canal
        // TODO : actualizar estado del recurso
        actualPresencia = (Boolean) chAvisarPresencia.in().read();
        coloresCorrectos();
        //
        break;

      case LEER_CAMBIO_BARRERA:
        //@ assume pre
        // TODO : leer petición del canal
        // TODO : guardar la petición tal cual
        cmbBarr.add((PeticionLeerCambioBarrera) chLeerCambioBarrera.in().read());
        break;

      case LEER_CAMBIO_FRENO:
        //@ assume pre
        // TODO : leer petición del canal
        // TODO : guardar la petición tal cual
        cmbFreno.add((PeticionLeerCambioFreno) chLeerCambioFreno.in().read());
        break;

      case LEER_CAMBIO_SEMAFORO:
        //@ assume pre
        // TODO : leer petición del canal
        // TODO : guardar la petición tal cual
        cmbSem.add((PeticionLeerCambioSemaforo) chLeerCambioSemaforo.in().read());
        break;

      case AVISAR_PASO_POR_BALIZA:
        //@ assume pre && cpre
        // TODO : leer petición del canal
        int i = (Integer) chAvisarPasoPorBaliza.in().read();
        // TODO : actualizar estado del recurso
        //
        seg[i-1]--;
        seg[i]++;
        coloresCorrectos();

        break;
      } // switch

      // Código de desbloqueo
      // TODO : código que recorre vuestras peticiones aplazadas
      //        procesando aquellas cuya CPRE se cumple,
      //        hasta que no quede ninguna
      //
      
      int b=0;
      while(b<cmbBarr.size()){
        if(cmbBarr.get(b).value != (seg[1] + seg[2] == 0)){
          cmbBarr.get(b).channel.out().write(seg[1] + seg[2] == 0);
          cmbBarr.remove(b--);
        }
        b++;
      }

      int f=0;
      while(f<cmbFreno.size()){
        if(cmbFreno.get(f).value != (seg[1] > 1 || seg[2] > 1 || seg[2] == 1 && actualPresencia)){
          cmbFreno.get(f).channel.out().write(seg[1] > 1 || seg[2] > 1 || seg[2] == 1 && actualPresencia);
          cmbFreno.remove(f--);
        }
        f++;
      }

      int s=0;
      while(s<cmbSem.size()){
        if(!cmbSem.get(s).color.equals(sem[cmbSem.get(s).index])){
          cmbSem.get(s).channel.out().write(sem[cmbSem.get(s).index]);
          cmbSem.remove(s--);
        }
        s++;
      }
      
      //
    } // end bucle servicio
  } // end run method

  // TODO : meted aquí vuestros métodos auxiliares para
  //        ajustar luces, cálculo de CPREs, etc.
  //
  private void coloresCorrectos(){
		
		if(seg[1]>0) {
			sem[1]=Control.Color.ROJO;
		}
		if(seg[1]==0 && (seg[2]>0 || actualPresencia)) {
			sem[1]=Control.Color.AMARILLO;
		}
		if(seg[1]==0 && seg[2]==0 && !actualPresencia) {
			sem[1]=Control.Color.VERDE;			
		}
		if(seg[2]>0 || actualPresencia) {
			sem[2]=Control.Color.ROJO;	
		}
		if(seg[2]==0 && !actualPresencia) {
			sem[2]=Control.Color.VERDE;
		}
		sem[3]=Control.Color.VERDE;
  }
 
} // end CLASS
