#!/bin/bash

cd /home/codio/workspace/content/write_file

javac WriteFile.java
if [ $? -ne 0 ]; then exit 1; fi

java WriteFile
if [ $? -ne 0 ]; then exit 1; fi