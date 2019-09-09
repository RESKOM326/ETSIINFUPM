//TAREA 3
//MARK DERVISHAJ MEMI --- 1M-B

class tarea3{
  //ENUNCIADO 1:
  static boolean pertenece(int n,int[]arr){
    boolean res=false;
    int i=0;
    while(i<arr.length&&!res){
      if(arr[i]==n){
        res=true;
      }
      else{
        i++;
      }
    }
    return res;
  }
  
  //ENUNCIADO 2:
  static int ocurrenciasN(int n,int[]arr){
    int cuenta=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==n){
        cuenta++;
      }
    }
    return cuenta;
  }
  
  //ENUNCIADO 3:
  static int ocurrenciasChar(char c,char[]arrchar){
    int cuenta=0;
    for(int i=0;i<arrchar.length;i++){
      if(arrchar[i]==c){
        cuenta++;
      }
    }
    return cuenta;
  }
  
  //ENUNCIADO 4:
  static int ocurrenciasString(String s,String[]arrstring){
    int cuenta=0;
    for(int i=0;i<arrstring.length;i++){
      if(arrstring[i].equals(s)){
        cuenta++;
      }
    }
    return cuenta;
  }
  
  //ENUNCIADO 5:
  static String invertirString(String s){
    if ((s==null)||(s.length()<=1)){
      return s;
    }
    return invertirString(s.substring(1)) + s.charAt(0);
  }
  
  //ENUNCIADO 6:
  static boolean esPalindromo(String s){
    boolean res=true;
    int i=0;
    while(i<(s.length())/2&&res){
      if(s.charAt(i)!=s.charAt(s.length()-1-i)){
        res=false;
      }
      else{
        i++;
      }
    }
    return res;
  }
   
  //ENUNCIADO 7:
  static boolean esSimetrico(int[]arr){
    boolean res=true;
    int i=0;
    while(i<(arr.length)/2&&res){
      if(arr[i]!=arr[arr.length-1-i]){
        res=false;
      }
      else{
        i++;
      }
    }
    return res;
  }
  
  //MOSTRAR EL ARRAY:
  static String mostrararray(int[]arr){
    String salida="[";
    for(int i=0;i<arr.length-1;i++){
      salida=salida+arr[i]+",";
    }
    salida=salida+arr[arr.length-1]+"]";
    return salida;
  }
  static String mostrararraychar(char[]arrchar){
    String salida="[";
    for(int i=0;i<arrchar.length-1;i++){
      salida=salida+arrchar[i]+",";
    }
    salida=salida+arrchar[arrchar.length-1]+"]";
    return salida;
  }
  static String mostrararraystring(String[]arrstring){
    String salida="[";
    for(int i=0;i<arrstring.length-1;i++){
      salida=salida+arrstring[i]+",";
    }
    salida=salida+arrstring[arrstring.length-1]+"]";
    return salida;
  }
  
  //PRUEBAS EN EL MAIN:
  public static void main(String[]args){
    int n=6;
    char c='f';
    String s="Hidrogeno";
    //String s="abcdedcba";   //String de prueba para esPalindromo y verificar el correcto funciomaniento
    int[]arr={1,7,6,3,0};
    //int[]arr={1,2,3,2,1};   //Array de enteros de prueba para esSimetrico y verificar el correcto funcionamiento
    char[]arrchar={'a','f','l','r','f'};
    String[]arrstring={"Helio","Hidrogeno","Oxigeno","Hidrogeno","Hidrogeno"};
    String array1=mostrararray(arr);
    String array2=mostrararraychar(arrchar);
    String array3=mostrararraystring(arrstring);

    //ENUNCIADO 1:
    boolean pertenecearr=pertenece(n,arr);
    System.out.println("¿Pertenece el número "+n+" al array "+array1+"?: "+pertenecearr);
    System.out.println(" ");
    
    //ENUNCIADO 2:
    int ocurrencias=ocurrenciasN(n,arr);
    System.out.println("El número de ocurrencias del número "+n+" en el array "+array1+" es: "+ocurrencias);
    System.out.println(" ");
    
    //ENUNCIADO 3:
    int ocurrenciaschar=ocurrenciasChar(c,arrchar);
    System.out.println("El número de ocurrencias de "+"'"+c+"'"+" en el array "+array2+" es: "+ocurrenciaschar);
    System.out.println(" ");
    
    //ENUNCIADO 4:
    int ocurrenciastring=ocurrenciasString(s,arrstring);
    System.out.println("El número de ocurrencias de la palabra "+"'"+s+"'"+" en el array "+array3+" es: "+ocurrenciastring);
    System.out.println(" ");
    
    //ENUNCIADO 5:
    String invertido=invertirString(s);
    System.out.println("La palabra invertida de "+"'"+s+"'"+" es "+"'"+invertido+"'");
    System.out.println(" "); 
    
    //ENUNCIADO 6:
    boolean palindromo=esPalindromo(s);
    System.out.println("¿Es la palabra "+"'"+s+"'"+" un palíndromo?: "+palindromo);
    System.out.println(" ");
    
    //ENUNCIADO 7:
    boolean simetrico=esSimetrico(arr);
    System.out.println("¿Es el array "+array1+" simétrico?: "+simetrico);
  }
}
  