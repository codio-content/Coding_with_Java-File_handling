To let the system know we are done with a file that we have opened, we need to close it. This signals that it is okay for other programs to use the file now.

```java
fileInputStreamA.close();  // close file desc A
```

This also tells the operating system that the file descriptor that was being used can be reused.

The code example here illustrates this process. First, two files are opened:
```java
FileInputStream fileInputStreamA = new FileInputStream(pathA); // open file A
FileInputStream fileInputStreamB = new FileInputStream(pathB); // open file B
```
And the numbers assigned as file descriptors are printed out:
```java
System.out.println("File Desc A: "+ fileDescriptorA.hashCode()); // print file desc A   
System.out.println("File Desc B: "+ fileDescriptorB.hashCode()); // print file desc B
```

{Run Sample Code}(content/file_descriptor/Filedescriptor.sh)

If we do not close files when we finish using them, there may be problems accessing the file later, or the system may run out of file resources.

```java
fileInputStreamA.close(); // close file desc A
fileInputStreamB.close(); // close file desc B
fileInputStreamC.close(); // close file desc C
```

