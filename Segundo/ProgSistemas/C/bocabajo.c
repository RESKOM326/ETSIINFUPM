#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "auxiliar.h"

void incr (int *pint);

int main(int argc, char *argv[]){
    argv0="bocabajo";
    char lineas[2049];
    char **linptr;
    int n=0;
    if(argc<2){
        linptr=malloc(sizeof(char *));
        while(fgets(lineas, sizeof lineas, stdin)!=NULL){
            incr(&n);
            linptr=realloc(linptr, (sizeof(char *))*(n+1));
            if(linptr==NULL){
                Error(EX_OSERR, "No se pudo ubicar la memoria dinámica necesaria.");
            }
            linptr[n]=strdup(lineas);
        }
        while(n>=1){
            printf("%s", linptr[n]);
            n--;
        }
        free(linptr);
        exit(0);
    }
    else if(argc==2 && (strcmp(argv[1], "-h")==0 || strcmp(argv[1], "--help")==0)){
        fputs("bocabajo: Uso: bocabajo [ fichero... ]\n", stdout);
        fputs("bocabajo: Invierte el orden de las lı́neas de los ficheros (o de la entrada).\n", stdout);
        exit(0);
    }
    int arg=1;
    linptr=malloc(sizeof(char *)*(n+1));
    while(argv[arg]!=NULL){
        FILE *ptr;
        char lineas[2049];
        ptr=fopen(argv[arg], "r");
        if(ptr!=NULL){
            while(fgets(lineas, sizeof lineas, ptr)!=NULL){
                incr(&n);
                linptr=realloc(linptr, (sizeof(char *))*(n+1));
                if(linptr==NULL){
                    Error(EX_OSERR, "No se pudo ubicar la memoria dinámica necesaria.");
                }
                linptr[n]=strdup(lineas);
            }
            fclose(ptr);
            incr(&arg);
        }
        else{
            Error(EX_NOINPUT, "El fichero \"%s\" no puede ser leido.", argv[arg]);
        }
    }
    while(n>=1){
        printf("%s", linptr[n]);
        char *aux=linptr[n];
        if(aux[strlen(aux)-1]!='\n'){
            printf("\n");
        }
        n--;
    }
    free(linptr);
    exit(0);
}
void incr (int *pint) {
    (*pint)++;
}