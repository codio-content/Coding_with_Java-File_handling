#!/bin/bash

cd /home/codio/workspace/content/fixed_length

javac FixedLength.java
if [ $? -ne 0 ]; then exit 1; fi

java FixedLength
if [ $? -ne 0 ]; then exit 1; fi