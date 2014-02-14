#!/bin/sh

# curl, show Fastly usage
# $1 full Url without protcol
curl -v -H "Accept: application/json" -H "X-Fastly-Key: $1" https://api.fastly.com/stats/usage
