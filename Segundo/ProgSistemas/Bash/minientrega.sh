#!/bin/bash

if test $# -ne $1; then
    echo "minientrega.sh: Error(EX_USAGE), uso incorrecto del mandato. \"Success\"" >&2
    echo "minientrega.sh+ Número de argumentos incorrecto" >&2
    exit 64
else
    if test $1 == "-h" || test $1 == "--help"; then
        echo "minientrega.sh: Uso: $1 {nombre_archivo} o -h/--help para la ayuda"
        echo "minientrega.sh: Copia ficheros a entregar de un directorio a otro de entrega"
        exit 0
    fi
fi

if ! test -r ${MINIENTREGA_CONF}; then
    echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
    echo "minientrega.sh+ no es accesible el directorio \"$MINIENTREGA_CONF\"" >&2
    exit 64
fi

function fileExists(){
    for fl in "ls ${MINIENTREGA_CONF}/*"; do
        if test $fl == ${MINIENTREGA_CONF}/$1; then
            return
        fi
    done
    echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
    echo "minientrega.sh+ no es accesible el fichero \"$fl\"" >&2
    exit 66
}

fileExists $1

source ${MINIENTREGA_CONF}/$1

if ! [[ $MINIENTREGA_FECHALIMITE =~ "[0-9]{4}-[0-1]{2}-[0-3]{2}" ]]; then
    echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
    echo "minientrega.sh+ fecha incorrecta \"$MINIENTREGA_FECHALIMITE\"" >&2
    exit 65
fi

al=${MINIENTREGA_FECHALIMITE:0:4} 
ml=${MINIENTREGA_FECHALIMITE:5:2}  
dl=${MINIENTREGA_FECHALIMITE:8:2}
a="date +%Y" 
m="date +%m" 
d="date +%d"   
if test $a -gt $al;then
    echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
    echo "minientrega.sh+ el plazo acabada en \"$MINIENTREGA_FECHALIMITE\"" >&2
    exit 65
elif test $a -eq $al; then  
    if test $m -gt $ml; then
        echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
        echo "minientrega.sh+ el plazo acabada en \"$MINIENTREGA_FECHALIMITE\"" >&2  
        exit 65
    elif test $m -eq $ml; then  
        if test $d -gt $dl; then 
            echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
            echo "minientrega.sh+ el plazo acabada en \"$MINIENTREGA_FECHALIMITE\"" >&2 
            exit 65
        fi
    fi
fi

for fil in ${MINIENTREGA_FICHEROS}; do
    if test -e ${PWD}/$fil; then
        if ! test -r ${PWD}/$fil; then
            echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
            echo "minientrega.sh+ no es accesible el fichero \"$fil\"" >&2
            exit 66
        fi
    else
        echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
        echo "minientrega.sh+ no es accesible el fichero \"$fil\"" >&2
        exit 66
    fi
done

if test -d ${MINIENTREGA_DESTINO}; then
    if ! test -w ${MINIENTREGA_DESTINO}; then
        echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
        echo "minientrega.sh+ no se pudo crear el subdirectorio de entrega \"$MINIENTREGA_DESTINO\"" >&2
        exit 73
    fi
else
    echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
    echo "minientrega.sh+ no se pudo crear el subdirectorio de entrega \"$MINIENTREGA_DESTINO\"" >&2
    exit 73
fi

if ! test -e ${MINIENTREGA_DESTINO}/${USER} && ! test -r ${MINIENTREGA_DESTINO}/${USER}/; then
        mkdir -p ${MINIENTREGA_DESTINO}/${USER}
fi

cp ${MINIENTREGA_FICHEROS} ${MINIENTREGA_DESTINO}/${USER}/.

exit 0
