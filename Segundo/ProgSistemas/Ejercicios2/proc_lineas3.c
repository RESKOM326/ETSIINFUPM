#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (int argc, char *argv[]) {
  if((argc<2)||(argv[1]==NULL)) {
    fprintf(stderr, "No se ha introducido ningun archivo como argumento");
    exit(1);
  }
  else {
    FILE *ptr;
    char lineas[101];
    ptr=fopen(argv[1], "r");
    if(ptr!=NULL) {
      while(fgets(lineas, 101, ptr)!=NULL) {
        size_t ln=strlen(lineas);
        if(ln>0 && lineas[ln-1]=='\n') {
          lineas[--ln]='\0';
        }
        printf("%s", lineas);
      }
      fclose(ptr);
    }
    else {
      fprintf(stderr, "ERROR: No se ha podido leer el archivo");
      exit(2);
    }
    return 0;
  }
}
