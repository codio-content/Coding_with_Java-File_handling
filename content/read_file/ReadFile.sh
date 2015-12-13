#!/bin/bash

cd /home/codio/workspace/content/read_file

javac ReadFile.java
if [ $? -ne 0 ]; then exit 1; fi

java ReadFile
if [ $? -ne 0 ]; then exit 1; fi