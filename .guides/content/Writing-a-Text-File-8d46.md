We can write the contents of a variable out to a file all at once like this:

```java
String str = "Line 1";
fw.write(str);
```

This command will cause the `FileWriter` library to write out the contents of the variable `str` to the file in the path contained in `filepath`.

{Run the Sample Code}(content/write_file/WriteFile.sh)

To see the result of our code, click the link below to open the file as specified in the file path:

[Open write-file.txt file](open_file content/textfiles/write-file.txt)