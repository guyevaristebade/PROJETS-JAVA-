#!/bin/bash

# Écrire un script Bash qui affiche le nombre de fichiers dans un répertoire donné.


if [[ $# -lt 1 || $# -gt 1 ]]
    then echo "  2 > $# ou $# > 2"
fi

if [[ -d "$1" ]]
    ls $1 | wc -l
else  
    echo "$1 n'est pas un repertoire"
fi

