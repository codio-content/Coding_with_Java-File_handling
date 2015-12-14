{Check It!|assessment}(test-808628205)

Click on the link below to open the output file `O` and check your results:

[Open empty.txt file](open_file content/textfiles/empty.txt)

|||guidance
### Solution
```java
// Load the file system library
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;

public class Challenge {

    public static void main(String[] args) throws IOException {
      
        // Get the filepath from the command line
        String I= args[0];
        String O= args[1];
        String S= args[2];
        String T= args[3];

        // Your code goes here

        // Load the data from the input path
        File inputFile = new File(I);
        FileInputStream fis = new FileInputStream(inputFile);
        byte[] data = new byte[(int) inputFile.length()];
        fis.read(data);
        fis.close();
        
        // Create a variable to hold our output while we build it
        String output = new String(data, "UTF-8");
        // Replace S with T 
        output = output.replaceAll(S, T);
        
        // Load output file and the FileWriter library
        File outputFile = new File(O);
        FileWriter fw = new FileWriter(outputFile, true);
        
        // Write to the output file
        fw.write(output);
      
        // Don't forget to close it
        fw.close();
      
        
    }
}

```
|||