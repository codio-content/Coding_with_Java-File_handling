#!/bin/bash

cd /home/codio/workspace/content/var_length

javac Split.java
if [ $? -ne 0 ]; then exit 1; fi

java Split
if [ $? -ne 0 ]; then exit 1; fi