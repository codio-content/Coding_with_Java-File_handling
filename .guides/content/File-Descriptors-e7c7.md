Because the handling of files can be different on different systems or types of storage, the programming language provides us with a generic file handling mechanism which abstracts away the details so that we can focus on using the data in the file. 

Most operating systems manage files through a **file descriptor** which controls low level file access. By accessing this **file descriptor** through an abstract interface, we do not have to learn the details of how the operating system manages the file itself, and the interface will remain the same, even if the underlying system is different when our program is run on another system.

For Java, we will use a group of helper libraries to provide an abstract file interface. To access a library, we load the library using the `import` command. The sample code provided loaded the following libraries: (*We will explain all of this sample program as we go.*) 

```java
import java.io.File; // make file library available
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
```

Now, the file system Java utilities can be used to access the file library. Note the way we access the functions by using the `.` operator as in `fileInputStreamA.getFD()` in the example:

```java
FileInputStream fileInputStreamA = new FileInputStream(pathA);
FileDescriptor fileDescriptorA = fileInputStreamA.getFD();
```

{Run Sample Code}(content/file_descriptor/Filedescriptor.sh)