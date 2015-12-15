#!/bin/bash

INPUT0="/home/codio/workspace/content/textfiles/pipe.txt"
INPUT1="Adam"
INPUT2="Smithers"
INPUT3="00000000"

file_output_test="/home/codio/workspace/challenges/variable-length/pipe.txt"
file_input_test="/home/codio/workspace/tests/variable-length-test/pipe.txt"

echo "<h3>Program Output</h3>"

cd /home/codio/workspace/challenges/variable-length

javac Challenge.java
if [ $? -ne 0 ]; then exit 1; fi

# 1
OUTPUT1=($(java Challenge $INPUT0 $INPUT1 $INPUT2 $INPUT3 $file_output_test))
if [ $? -ne 0 ]; then exit 1; fi

echo "Your output:"
for i in ${OUTPUT1[@]}; do
  echo $i
done

if ! grep -qFxvf "$file_output_test" "$file_input_test"
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

