/* Programa con función factorial (dos versiones: iterativa y recursiva). */

#include <stdio.h>
#include <stdlib.h>

unsigned long int fact_ite( int n );

int main( int argc, char *argv[] ) {
  int numero;

  if ( ( argc < 2 ) || ( atoi(argv[1]) <= 0 ) ) {
    fprintf( stderr, "ERROR: es necesario introducir como argumento un entero positivo.");
    return 1;
  }
  else {
    numero = atoi(argv[1]);
    printf( "El factorial de %d es (versión iterativa): %lu\n", numero, fact_ite( numero ) );
    return 0;
  }
}


/* Factorial de n (versión recursiva). Se asume n > 0. */
unsigned long int fact_ite( int n ) {
  int i;
  unsigned long int res=1;
  for(i=n;(i>=1);i--){
    res=res*i;
  }
  return res;
}

/*
gcc -Wall -Wextra -o factorial_rec_arg_1 factorial_rec_arg_1.c
./factorial_rec_arg_1
*/
