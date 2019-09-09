#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void incr (int *pint);

int main (int argc, char *argv[]) {

    if(argc<2) {
        fprintf(stderr, "No se ha introducido ningun archivo como argumento");
        exit(1);
    }
    else {
        int n=1;
        while(argv[n]!=NULL){
            FILE *ptr;
            char lineas[501];
            ptr=fopen(argv[n], "r");
            if(ptr!=NULL) {
                while(fgets(lineas, 501, ptr)!=NULL) {
                    size_t ln=strlen(lineas);
                    if(ln>0 && lineas[ln-1]=='\n') {
                        lineas[--ln]='\0';
                    }
                    printf("%s", lineas);
                }
                printf(" ");
                fclose(ptr);
                incr(&n);
            }
            else {
                fprintf(stderr, "ERROR: No se ha podido leer el archivo");
                exit(2);
            }
            
        }
        return 0;
    }
}
void incr (int *pint) {
    (*pint)++;
}