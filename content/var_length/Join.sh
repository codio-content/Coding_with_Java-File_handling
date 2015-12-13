#!/bin/bash

cd /home/codio/workspace/content/var_length

javac Join.java
if [ $? -ne 0 ]; then exit 1; fi

java Join
if [ $? -ne 0 ]; then exit 1; fi