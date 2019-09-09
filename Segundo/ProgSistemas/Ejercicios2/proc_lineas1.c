#include <stdio.h>
#include <stdlib.h>

void incremento (int *pint);

int main(void) {
  
  FILE *ptr;
  char lineas[101];
  int n=1;
  ptr=fopen("fich_lineas1.txt", "r");
  if(ptr!=NULL) {
    while(fgets(lineas, 101, ptr)!=NULL) {
      printf("%d: %s", n, lineas);
      incremento(&n);
    }
    fclose(ptr);
  }
  else {
    fprintf(stderr, "ERROR en la lectura\n");
    exit(1);
  }
  return 0;
}
void incremento (int *pint) {
  (*pint)++;
}


