Once we know the format of a file, how to do we load and read it? There are many file formats and reading many of them is beyond the scope of this Unit. But we will learn about some common methods for organizing files.

One simple way to organize files is to establish an exact length for a record, which allows us to know how much data to read and write for each record. 

The sample on the left shows a single variable containing records that are 6 or less characters long. The program splits up and prints out each number.

{Run the sample}(content/fixed_length/FixedLength.sh)


### The `String.trim()` Function
----
You might find the `trim()` function helpful. It removes whitespace from the front and end of a string.

```java
String text = "  Words   Other   Words\tTab   ";
System.out.println(":" + text + ":");
text = text.trim();
System.out.println(":" + text + ":");
```

{Run the trim example code}(content/fixed_length/Trim.sh)

