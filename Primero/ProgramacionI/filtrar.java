//FILTRAR
//MARK DERVISHAJ MEMI, PEDRO DE PABLOS GARC�A --- 1M-B
class filtrar{
  static int[] filtrarMultiplosDe11(int[]numeros){
    int[]filtrados=new int[numeros.length];
    int dondeloguardo=0;
    for(int i=0;i<numeros.length;i++){
      if(numeros[i]%11==0){
        filtrados[dondeloguardo]=numeros[i];
        dondeloguardo=dondeloguardo+1;
      }
    }
    return filtrados;
  }
  static int contarCeros(int[]filtrados){
    int cuenta=0;
    for(int i=0;i<filtrados.length;i++){
      if (filtrados[i]==0){
        cuenta=cuenta+1;
      }
    }
    return cuenta;
  }    
  static String verArray(int[]filtrados){
    String salida="{";
    for(int i=0;i<filtrados.length-1;i++){
      salida=salida+filtrados[i]+", ";
    }
    salida=salida+filtrados[filtrados.length-1]+"}";
    return salida;
  }
  public static void main(String[]args){
    int[]numeros={1,3,22,121,6,9,11};
    String salida1=verArray(filtrarMultiplosDe11(numeros));
    System.out.println(salida1);
  }
}
  