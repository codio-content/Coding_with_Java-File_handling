Fill in the **stubs** provided to complete the challenge. DO NOT forget what you have learned about splitting and joining strings and lists.

{Check It!|assessment}(test-2358046206)

To check your results, click the link below to open the file as specified in the file path:

[Open pipe.txt file](open_file challenges/variable-length/pipe.txt)

|||guidance
### Solution
```java
// Load the file system libraries
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;

public class Challenge {
  
  // Our helper functions

  //
  // Loads the file at filepath 
  // Returns a 2d array with the data
  // 
  public static String[][] load2dArrayFromFile(String filepath) throws IOException {
    // Your code goes here:
    File file = new File(filepath);
    FileInputStream fis = new FileInputStream(file); 
    byte[] data = new byte[(int) file.length()]; 
    fis.read(data); 
    fis.close(); 
    String fileContent = new String(data, "UTF-8");
    String[] records = fileContent.split("\n");
    String[][] recs = new String[records.length][];
    for(int i=0; i < records.length; i++){
      recs[i] = records[i].split("\\|");
    }
    return recs;
  }

  //
  // Searches the 2d array 'records' for firstname, lastname.
  // Returns the index of the record or -1 if no record exists
  // 
  public static int findIndex(String[][] records, String firstname, String lastname) {
    // Your code goes here:
    for(int i=0; i < records.length; i++) {
      if( records[i][0].equals(firstname) && records[i][1].equals(lastname) ) {
        return i;
      }
    }
    return -1;
  }

  // Sets the birthday of the record at the given index
  // Returns: nothing
  public static void setBirthday(String[][] records, int index, String newBirthday) {
    // Your code goes here:
    if(index >= 0 && index < records.length){
      records[index][2] = newBirthday;
    }
  }

  // Convert one record into a pipe-delimited string
  // Return the pipe-delimited string inside array
  public static String makeLineFromRecord(String[] record, String separator) {
    // Your code goes here:
    String newStr = "";
    for (int i = 0; i < record.length; i++) {
      if (i == record.length -1) {
        newStr += record[i];
      } else {
        newStr += record[i] + separator;
      }
    }
    return newStr;
  }

  // Convert the 2d array back into a string
  // Return the rull text of the 2d array
  public static String makeTextFrom2dArray(String[][] records){
    // Your code goes here:
    String[] lines = new String[records.length];
    for(int i=0; i < records.length; i++){
      lines[i] = makeLineFromRecord(records[i], "|");
    }
    return makeLineFromRecord(lines, "\n");
  }

  public static void main(String[] args) throws IOException {
    
    // Get the filepath from the command line
    String P = args[0];
    String F = args[1];
    String L = args[2];
    String B = args[3];
    String O = args[4];

    //  Our main code body, where we call our functions.
    //  
    // Load our records from the file into a 2d array
    String[][] records = load2dArrayFromFile(P);

    // Find out which index, if any, has the name we are hunting
    int indexWeAreHunting = findIndex(records, F, L);

    // Set the birthday record to the one we were passed
    setBirthday(records, indexWeAreHunting, B);

    // Convert the records into a text string
    String output = makeTextFrom2dArray(records);

    // Your code goes here
    // write the text string out to the file
    FileWriter fw = new FileWriter(O, false);
    fw.write(output);
    fw.close(); 
      
  }
    
}

```
|||