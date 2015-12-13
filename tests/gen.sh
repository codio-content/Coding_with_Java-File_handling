#!/bin/bash

for file in $(ls)
do
  fl=$( sed -e "s@.sh@@g" <<< "$file" )
  mkdir $fl
  cd $fl
  cp "../test.sh" "$fl.sh"
  find . "$fl.sh" -exec sed -i "s@new_array@$fl@g" {} \;
  cd ..
done