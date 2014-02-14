#!/bin/sh

# $1 directory to look
# $2 search string, e.g. '*.scala'
# $3 name of zip file

find $1 -name $2 | xargs -s 20000 zip -r $3
