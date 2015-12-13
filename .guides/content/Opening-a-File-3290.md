Most systems have more than one program running at a time. In order to ensure that multiple programs do not “run into each other” while attempting to use a single file, a program must “open” the file first. This allows the system to restrict access to this file.

```java
FileInputStream fileInputStreamA = new FileInputStream(pathA); // open file A
FileInputStream fileInputStreamB = new FileInputStream(pathB); // open file B
```

{Run the code}(content/file_descriptor/Filedescriptor.sh)

We hang on to the file input stream `FileInputStream` so that we can use it later. This creates an object that can be used to read from the file, write to the file, and eventually close the file when we are done with it.

The arguments to the `new FileInputStream(pathA)` function include the path to the file (which includes the filename).