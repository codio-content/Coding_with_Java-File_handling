#!/bin/bash

cd /home/codio/workspace/content/fixed_length

javac Trim.java
if [ $? -ne 0 ]; then exit 1; fi

java Trim
if [ $? -ne 0 ]; then exit 1; fi