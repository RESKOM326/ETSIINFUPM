#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void incr (int *pint);
int main (int argc, char *argv[]) {

    if(argc<2) {
        char ent[101];
        printf("Introduce argumento o Enter para finalizar \n");
        while(fgets(ent, sizeof ent, stdin)!=NULL && ent[0]!='\n'){
            printf("%s", ent);
        }
        exit(0);
    }
    else {
        int n=1;
        while(argv[n]!=NULL){
            FILE *ptr;
            char lineas[501];
            ptr=fopen(argv[n], "r");
            if(ptr!=NULL) {
                while(fgets(lineas, sizeof lineas, ptr)!=NULL) {
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