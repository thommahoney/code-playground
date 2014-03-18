#!/bin/bash

bucket=theguardian.com
filter=2014-03-18T08:00

declare -a arr=($(aws --profile=fastly-logs s3 ls s3://fastly-logs/$bucket/$filter | sed 's/^.* .* //g'))

for i in "${arr[@]}"
do
    aws --profile=fastly-logs s3 cp s3://fastly-logs/$bucket/$i ~/Downloads/
done
