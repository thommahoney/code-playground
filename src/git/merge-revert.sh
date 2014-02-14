#!/bin/sh

# find the merge hash, e.g. 84cd0d0092303d2f8a362a0d0bdd99b4157d03a7
# git log | less
# look for 84cd0d0092303d2f8a362a0d0bdd99b4157d03a7
# find the line which has two hashes, e.g.
# commit 84cd0d0092303d2f8a362a0d0bdd99b4157d03a7
# Merge: 1d1a654 2a8ce26
# The two hashes are the parent numbers, you need to revert to one of these mainlines, so...

# git revert 84cd0d0092303d2f8a362a0d0bdd99b4157d03a7 -m 1
# or
# git revert [merge check in number] -m [1st hash or 2nd hash]