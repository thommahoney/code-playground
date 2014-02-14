#!/bin/sh

# curl with proxy, show Fastly usage
# $1 full Url without protcol
curl -v -x https://proxy:3128 -H "Accept: application/json" -H "X-Fastly-Key: $1" https://api.fastly.com/stats/usage
