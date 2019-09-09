#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include "auxiliar.h"

void incr (int *pint);

int esNumero(char *param);

void imprimirSecuencia(double hasta, double desde, double paso);

int main(int argc, char *argv[]){
    argv0="secuencia";
    if(argc==2 && (strcmp(argv[1], "-h")==0 || strcmp(argv[1], "--help")==0)){
        fputs("secuencia: Uso: secuencia [ hasta [ desde [ paso ]]]\n", stdout);
        fputs("secuencia: Genera la secuencia de números en el intervalo y paso indicados.\n", stdout);
        exit(0);
    }
    if(argc>4){
        Error(EX_USAGE, "El número de argumentos no es correcto.");
    }
    if(argc>=1&&argc<=4){
        int n=1;
        double datos[3]={10, 1, 1};
        while(argv[n]!=NULL){
            int valido=esNumero(argv[n]);
            if(valido==0){
                if(n==1){
                    Error(EX_USAGE, "El parámetro \"hasta\" no es un número real válido.");
                }
                else if(n==2){
                    Error(EX_USAGE, "El parámetro \"desde\" no es un número real válido.");
                }
                else if(n==3){
                    Error(EX_USAGE, "El parámetro \"paso\" no es un número real válido.");
                }
            }
            char *ptr;
            datos[n-1]=strtod(argv[n], &ptr);
            incr(&n);
        }
        double hasta=datos[0];
        double desde=datos[1];
        double paso=datos[2];
        if(paso==0){
            Error(EX_USAGE, "El parámetro \"paso\" no puede valer 0.");
        }
        else if((desde<hasta && paso<0) || (hasta<desde && paso>0)){
            Error(EX_USAGE, "El signo de \"paso\" no permite recorrer el intervalo en el sentido \"desde\" a \"hasta\".");
        }
        imprimirSecuencia(hasta, desde, paso);
    }
    exit(0);
    
}
void incr (int *pint) {
    (*pint)++;
}
int esNumero(char *param){
    if(param==NULL || *param=='\0' || isspace(*param)){
        return 0;
    }
    char *p;
    strtod(param, &p);
    return *p=='\0';
}
void imprimirSecuencia(double hasta, double desde, double paso){
    int counter=1;
    long int maxout;
    char *max=getenv("MAX_OUTPUT");
    if(max==NULL){
        maxout=100;
    }
    else{
        char *ptr;
        maxout=strtol(max, &ptr, 10);
        if(max[0]=='\0' || ptr[0]!='\0'){
            maxout=100;
        }
        else{
            if(maxout<0){
                maxout=100;
            }
        } 
    } 
    while((desde<=hasta && paso>0) || (desde>=hasta && paso<0)){
        if(counter>maxout){
            Error(EX_NOPERM, "Se intentó superar el lı́mite de salida establecido por MAX OUTPUT.");
        }
        printf("\t%g\n", desde);
        desde+=paso;
        counter++;
    }

}
