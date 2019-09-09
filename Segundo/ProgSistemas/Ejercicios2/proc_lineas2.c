#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {

  FILE *ptr;
  char lineas[101];
  ptr=fopen("fich_lineas1.txt", "r");
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
    fprintf(stderr, "ERROR en la lectura\n");
    exit(1);
  }
  return 0;
}
