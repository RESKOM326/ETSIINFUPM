/* Programa con función factorial (dos versiones: iterativa y recursiva). */

#include <stdio.h>
#include <stdlib.h>

void fact_ite_proc( int n, unsigned long int res );

int main( int argc, char *argv[] ) {
  int numero;
  unsigned long int resultado=1;

  if ( ( argc < 2 ) || ( atoi(argv[1]) <= 0 ) ) {
    fprintf( stderr, "ERROR: es necesario introducir como argumento un entero positivo.");
    return 1;
  }
  else {
    numero = atoi(argv[1]);
    fact_ite_proc(numero, resultado);
    return 0;
  }
}


/* Factorial de n (versión recursiva). Se asume n > 0. */
void fact_ite_proc(int n, unsigned long int res) {
  int i;
  for(i=n;(i>=1);i--){
    res=res*i;
  }
  printf("El factorial de %d es (versión iterativa con procedimiento): %lu\n", n, res);
}
/*
gcc -Wall -Wextra -o factorial_rec_arg_1 factorial_rec_arg_1.c
./factorial_rec_arg_1
*/
