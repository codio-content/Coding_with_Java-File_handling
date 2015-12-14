{Check It!|assessment}(test-1456892332)

You can open the file at any moment by clicking this link:

[Open empty.txt file](open_file challenges/fixed-length-record/empty.txt)

|||guidance
### Solution
```java
import java.io.File; // make file library available
import java.io.FileWriter;
import java.io.IOException;

public class Challenge {

    public static void main(String[] args) throws IOException {
      
        // Input variables
        File filepath = new File(args[0]);
        FileWriter fw = new FileWriter(filepath, true);
        String[][] data = new String[][]{
          {args[1], args[2], args[3]},
          {args[4], args[5], args[6]}, 
          {args[7], args[8], args[9]}
        };
        
        // Write your code below
        
        // Set record length
        int recordLength = 12;
        
        // Define empty element to be written
        String element;
        // Begin 2d array loop
        for (int row = 0; row < data.length; row++) {
          // Begin column loop
          for (int column = 0; column < data[row].length; column++) {
            // Define empty separator
            String separator = "";
            // Define element length 
            int elementLength = data[row][column].length();
            // Save column to element variable
            element = data[row][column];
            // Check if is last element in row
            if (column < (data[row].length-1)) {
              // Set separator
              for (int i = 0; i < (recordLength - elementLength); i++) {
                separator += ".";
              }
            }
            // Concat element + separator
            fw.write(element+separator);
          }
          fw.write(System.lineSeparator()); //new line
        }
        // Don't forget to close the file
        fw.close();

    }
}

```
