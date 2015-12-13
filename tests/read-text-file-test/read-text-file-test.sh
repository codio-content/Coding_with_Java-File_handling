#!/bin/bash

INPUT0="/home/codio/workspace/content/textfiles/challenge-file.txt"

echo "<h3>Program Output</h3>"

cd /home/codio/workspace/challenges/read-text-file

javac Challenge.java
if [ $? -ne 0 ]; then exit 1; fi

# 1
OUTPUT1=($(java Challenge $INPUT0))
if [ $? -ne 0 ]; then exit 1; fi

echo "Your output:"
for i in ${OUTPUT1[@]}; do
  echo $i
done

if [ ${#OUTPUT1[@]} != 1 ]; then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputing the expected number of values"
  exit 1
fi

arg=$(cat $INPUT0)

if [ "$arg" != "${OUTPUT1}" ]; then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputing the correct value"
  exit 1
fi

echo "<br/><hr/><h3>Challenge Feedback</h3>"
echo "Well done you passed the challenge!"
exit 0

