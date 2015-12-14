#!/bin/bash

INPUT0="/home/codio/workspace/challenges/fixed-length-record/empty.txt"
INPUT1="Wes"
INPUT2="Haupteniami"
INPUT3="17082000"
INPUT4="Emily"
INPUT5="Val"
INPUT6="01051864"
INPUT7="Element"
INPUT8="Johnson"
INPUT9="26121989"

file_output_test="/home/codio/workspace/tests/fixed-length-record-test/empty.txt"

echo "<h3>Program Output</h3>"

cd /home/codio/workspace/challenges/fixed-length-record

javac Challenge.java
if [ $? -ne 0 ]; then exit 1; fi

# 1
OUTPUT1=($(java Challenge $INPUT0 $INPUT1 $INPUT2 $INPUT3 $INPUT4 $INPUT5 $INPUT6 $INPUT7 $INPUT8 $INPUT9))
if [ $? -ne 0 ]; then exit 1; fi

for i in ${OUTPUT1[@]}; do
  echo $i
done

if ! grep -qFxvf "$INPUT0" "$file_output_test"
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

