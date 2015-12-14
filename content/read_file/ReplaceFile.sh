#!/bin/bash

cd /home/codio/workspace/content/read_file

javac ReplaceFile.java
if [ $? -ne 0 ]; then exit 1; fi

java ReplaceFile
if [ $? -ne 0 ]; then exit 1; fi