/* Programa con función factorial (dos versiones: iterativa y recursiva). */

#include <stdio.h>
#include <stdlib.h>
#include <fact_rec.h>

int main( int argc, char *argv[] ) {
  int numero;

  if ( ( argc < 2 ) || ( atoi(argv[1]) <= 0 ) ) {
    fprintf( stderr, "ERROR: es necesario introducir como argumento un entero positivo.");
    return 1;
  }
  else {
    numero = atoi(argv[1]);
    printf( "El factorial de %d es (versión recursiva): %lu\n", numero, fact_rec( numero ) );
    return 0;
  }
}

/*
gcc -Wall -Wextra -o factorial_rec_arg_1 factorial_rec_arg_1.c
./factorial_rec_arg_1
*/
