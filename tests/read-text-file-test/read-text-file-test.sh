#!/bin/bash

INPUT0=1

echo "<h3>Program Output</h3>"

cd /home/codio/workspace/challenges/read-text-file-test

javac Challenge.java
if [ $? -ne 0 ]; then exit 1; fi

# 1
OUTPUT1=($(java Challenge $INPUT0))
if [ $? -ne 0 ]; then exit 1; fi

echo "Input: " $INPUT0
echo "Your output:"
for i in ${OUTPUT1[@]}; do
  echo $i
done

if [ ${#OUTPUT1[@]} != 5 ]; then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputing the expected number of values"
  exit 1
fi

COUNT=0
ARR[0]=$INPUT0

if [ "$arg" != "${OUTPUT1}" ]; then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputing the correct value"
  exit 1
fi

echo "<br/><hr/><h3>Challenge Feedback</h3>"
echo "Well done you passed the challenge!"
exit 0

