Another way to store data is called a *variable length record*. Instead of using a set amount of space for fields and records, it stores only what is needed. This saves space and allows for storing much longer records, though it is slightly more complex to read.

Field Delimited Data
----
Since we do not use the “|” (pipe) character in normal sentences, it is a commonly used character to delimit fields in a variable length record. These are called “pipe delimited” files are they have the constraint that no pipe characters can occur in the data. Usually each record is one line long (newline delimited) and each field is separated by a pipe character.



Hints:
----
### Use Functions of Your Own
Working with files and records is a great time to use functions. The example program provided in the challenge has **stubs** (empty functions) for you to fill out to help.


### The String.split() function
There is a function named `split()` that you may find will help you.

```java
String text = "a:b:c:d"
String delimiter = ":";
String[] list = text.split(delimiter);
System.out.println(list);
```
{Run the split sample}(content/var_length/Split.sh)

Sample Program:
----
Now look at the sample provided that manages a simple pipe delimited string. It uses functions in the program. It also uses the `split()` function to convert pipe delimited strings into lists:
```java
public static String[] getListFromPipeDelimitedText(String data) {
  String delimiter = "\\|";
  String[] list = data.split(delimiter);
  return list;
}
```

Note the `"\\|"` delimiter. Because the `.split()` method uses Regular Expressions and the `|` character is a metacharacter, it must be _escaped_ using double back-slashes. 

{Run the Pipe Sample}(content/var_length/VarLength.sh)

These should help you with the next challenge.
