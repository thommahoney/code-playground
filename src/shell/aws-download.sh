#!/bin/bash

bucket=guardian.co.uk
filter=2014-02-27T15:

declare -a arr=($(aws --profile=fastly-logs s3 ls s3://fastly-logs/$bucket/$filter | sed 's/^.* .* //g'))

for i in "${arr[@]}"
do
    aws --profile=fastly-logs s3 cp s3://fastly-logs/$bucket/$i ~/Downloads/
done