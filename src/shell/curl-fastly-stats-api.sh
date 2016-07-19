#!/bin/sh

# curl, show Fastly usage
# $1 full Url without protcol
curl -v -H "Accept: application/json" -H "Fastly-Key: $1" https://api.fastly.com/stats/usage

# with proxy
#curl -v -x https://proxy:3128 -H "Accept: application/json" -H "Fastly-Key: $1" https://api.fastly.com/stats/usage
