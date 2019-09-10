package aed.actasnotas;

import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.indexedlist.ArrayIndexedList;
import java.util.Comparator;


public class ActaNotasAED implements ActaNotas {
  private IndexedList<Calificacion> actas;

  public ActaNotasAED() {
    this.actas = new ArrayIndexedList<Calificacion>();
  }
  
  //----------------------------------------------------------------------------------------------------------------------
  
  /**
   * Devuelve si la matricula recibida existe o no en la lista de actas
   * @param matricula
   * @return
   */
  
  private boolean buscar(String matricula) {
	  boolean existe=false;
	  int i=0;
	  while(i<actas.size()&&!existe) {
		  if(matricula.equals(actas.get(i).matricula)) {
			  existe=true;
		  }
		  else {
			  i++;
		  }
	  }
	  return existe;
  }
  
  /**
   * Devuelve la posicion en la lista de actas donde esta la matricula recibida (o -1 si no existe)
   * @param matricula
   * @return
   */
  
  private int posicion(String matricula) {
	  boolean existe=false;
	  int i=0;
	  while(i<actas.size()&&!existe) {
		  if(matricula.equals(actas.get(i).matricula)) {
			  existe=true;
		  }
		  else {
			  i++;
		  }
	  }
	  if(existe) {
		  return i;
	  }
	  else {
		  return -1;
	  }
  }
  
//----------------------------------------------------------------------------------------------------------------------
  
  public void addCalificacion(String nombre, String matricula, int nota) throws CalificacionAlreadyExistsException {
	  Calificacion c=new Calificacion(nombre, matricula, nota);
	  if(!(buscar(matricula))) {
		  actas.add(actas.size(), c);
	  }
	  else {
		  throw new CalificacionAlreadyExistsException();
	  }
  }
  
  public void updateNota(String matricula, int nota) throws InvalidMatriculaException {
	  if(buscar(matricula)) {
		  actas.get(posicion(matricula)).nota=nota;
	  }
	  else {
		  throw new InvalidMatriculaException();
	  }
  }
  
  public void deleteCalificacion(String matricula) throws InvalidMatriculaException {
	  if(buscar(matricula)) {
		  actas.removeElementAt(posicion(matricula));
	  }
	  else {
		  throw new InvalidMatriculaException();
	  }
  }
  
  public Calificacion getCalificacion(String matricula) throws InvalidMatriculaException {
	  if(buscar(matricula)) {
		  return actas.get(posicion(matricula));
	  }
	  else {
		  throw new InvalidMatriculaException();
	  }
  }
  
  public IndexedList<Calificacion> getCalificaciones(Comparator<Calificacion> cmp) {
	  IndexedList<Calificacion> sorted=new ArrayIndexedList<Calificacion>();
	  sorted=actas;
	  for(int i=0;i<sorted.size()-1;i++) {
		  for(int j=0;j<sorted.size()-i-1;j++) {
			  if(cmp.compare(sorted.get(j), sorted.get(j+1))>0) {
				  Calificacion aux=sorted.get(j);
				  sorted.removeElementAt(j);
				  sorted.add((j+1), aux);
			  }
		  }
	  }
	  return sorted;
  }
  
  public IndexedList<Calificacion> getAprobados(int notaMinima) {
	  IndexedList<Calificacion> aprob=new ArrayIndexedList<Calificacion>();
	  for(int i=0;i<actas.size();i++) {
		  if(actas.get(i).nota>=notaMinima) {
			  aprob.add(aprob.size(), actas.get(i));
		  }
	  }
	  return aprob;
  }

}
