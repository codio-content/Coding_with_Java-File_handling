#!/bin/bash

cd /home/codio/workspace/content/file_descriptor

javac Filedescriptor.java
if [ $? -ne 0 ]; then exit 1; fi

java Filedescriptor
if [ $? -ne 0 ]; then exit 1; fi