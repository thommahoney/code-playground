#!/bin/sh

# curl GET method, just show the headers
# $1 full Url with protcol
curl -v -o /dev/null $1

# curl HEAD method (-i), just show the headers
# $1 full Url with protcol
# curl -iv -o /dev/null $1

