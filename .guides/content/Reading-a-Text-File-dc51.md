We are now ready to start reading file data. Java provides a way to read an entire file at one time and store the contents into a variable. This allows us to skip most of the management of file descriptors and all the other complexities of reading files. 

```java
String fileContent = new String(data, "UTF-8");
```

{Run Sample Code}(content/read_file/ReadFile.sh)

A `FileInputStream` obtains input bytes from a file in a file system. Remember that bytes are data meant for computers to be read, while UTF-8 is meant for humans to be read.

While this shortcut will help us learn the basics of working with files, remember that many files will be too large to read into memory all at once and will have to be processed in small amounts at a time. But for now we will work with small files that we can load into memory all at once.

### Replacing file content
It is possible to replace content in a file by using the `.replaceAll()` method:

```java
String fileContent = new String(data, "UTF-8");
fileContent = fileContent.replaceAll("parrot", "toucan");
```

{Run Sample Code}(content/read_file/ReplaceFile.sh)