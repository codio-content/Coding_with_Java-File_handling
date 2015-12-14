#!/bin/bash

INPUT0="/home/codio/workspace/content/textfiles/parrot.txt"
INPUT1="/home/codio/workspace/content/textfiles/empty.txt"
INPUT2="parrot"
INPUT3="patriot"

file_input="parrot.txt"
file_output="empty.txt"
file_output_test="/home/codio/workspace/challenges/write-text-file/empty.txt"

> $INPUT1

echo "<h3>Program Output</h3>"

cd /home/codio/workspace/challenges/write-text-file

javac Challenge.java
if [ $? -ne 0 ]; then exit 1; fi

# 1
OUTPUT1=($(java Challenge $INPUT0 $INPUT1 $INPUT2 $INPUT3))
if [ $? -ne 0 ]; then exit 1; fi

for i in ${OUTPUT1[@]}; do
  echo $i
done

echo "Input: " 
echo $file_input
echo $file_output
echo $INPUT2
echo $INPUT3

if ! grep -qFxvf "$INPUT1" "$file_output_test"
then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Well done you passed the challenge!"
  exit 0
else
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputing the correct value"
  echo "Open the empty.txt file with the link below to check your result"
  exit 1
fi


