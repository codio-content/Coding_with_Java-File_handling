#!/bin/bash

cd /home/codio/workspace/content/var_length

javac VarLength.java
if [ $? -ne 0 ]; then exit 1; fi

java VarLength
if [ $? -ne 0 ]; then exit 1; fi