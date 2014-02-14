#!/bin/sh

# $1 fastly API key
# $2 url without the protocol
curl -v -X POST -H "X-Fastly-Key: $1" https://api.fastly.com/purge/$2