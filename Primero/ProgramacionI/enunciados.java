//NOMBRE Y APELLIDOS: MARK DERVISHAJ MEMI

class enunciados{
  
  //ENUNCIADO 1:
  
  static int sumaDigitosEnArray(char[]a){
    int suma=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>='0'&&a[i]<='9'){
        int i2=a[i]-'0';
        suma=suma+i2;
      }
    }
    return suma;
  }
  
  //ENUNCIADO 2:
  
  static int construyeEntero(char[]a){
    int numero=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>='0'&&a[i]<='9'){
        int i2=a[i]-'0';
        numero=numero+i2*(int)Math.pow(10,a.length-i-1);
      }
      else{
        numero=numero/10;
      }
    }
    return numero;
  }
  
  //ENUNCIADO 3:
  
  static int cifras(int numero1){
    int nocifras=0;
    for(int i=numero1;i>0;i=i/10){
      nocifras++;
    }
    return nocifras;
  }
  static int[] deconstruyeInt(int numero1){
    int[]array=new int[cifras(numero1)];
    for(int i=array.length-1;i>=0;i--){
      array[i]=numero1%10;
      numero1=numero1/10;
    }
    return array;
  }
  static void verarray(int[]array){
    for(int i=0;i<array.length;i++){
      if(i!=array.length-1){
        System.out.print(array[i]+",");
      }
      else{
        System.out.print(array[i]);
      }
    }
  }
       
  //ENUNCIADO 4:
  
  static int reconstruyeInt(char[]p){
    int num=0;
    for(int i=0;i<p.length;i++){
      int i2=p[i]-'0';
      num=num+i2*(int)Math.pow(10,p.length-i-1);
      }
    return num;
    }
  
  public static void main(String[]args){
    char[]a={'1','h','5','d','7'};
    char[]p={'2','6','9','3','1'};
    int numero1=364;
    int sum=sumaDigitosEnArray(a);
    int n=construyeEntero(a);
    int no=reconstruyeInt(p);
    System.out.println(sum);
    System.out.println(n);
    System.out.print("{");
    verarray(deconstruyeInt(numero1));
    System.out.print("}");
  }
}