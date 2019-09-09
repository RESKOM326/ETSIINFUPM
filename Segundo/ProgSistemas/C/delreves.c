#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "auxiliar.h"

void incr (int *pint);

void invertir (char *texto);

int main (int argc, char *argv[]) {
    argv0="delreves";
    if(argc<2) {
        char ent[2049];
        while(fgets(ent, sizeof ent, stdin)!=NULL){
            invertir(ent);
            printf("%s", ent);
        }
        exit(0);
    }
    if(argc==2 && (strcmp(argv[1], "-h")==0 || strcmp(argv[1], "--help")==0)){
        fputs("delreves: Uso: delreves [ fichero... ]\n", stdout);
        fputs("delreves: Invierte el contenido de las lineas de los ficheros (o de la entrada).\n", stdout);
        exit(0);
    }
    int n=1;
    while(argv[n]!=NULL){
        FILE *ptr;
        char lineas[2049];
        ptr=fopen(argv[n], "r");
        if(ptr!=NULL) {
            while(fgets(lineas, sizeof lineas, ptr)!=NULL) {
                invertir(lineas);
                printf("%s", lineas);
            }
            fclose(ptr);
            incr(&n);
        }
        else {
            Error(EX_NOINPUT, "El fichero \"%s\" no puede ser leido.", argv[n]);
        }    
    }
    exit(0);
}
void incr (int *pint) {
    (*pint)++;
}
void invertir (char *texto){
    int inicio;
    int l=strlen(texto)-1;
    if(texto[l]=='\n'){
        l=strlen(texto)-2;
    }
    int size=strlen(texto)/2;
    char aux='\0';
    for(inicio=0; inicio<size; inicio++){
        aux=texto[inicio];
        texto[inicio]=texto[l];
        texto[l]=aux;
        l--;
    }
}
