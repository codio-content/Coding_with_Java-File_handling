{Check It!|assessment}(test-3353555413)

|||guidance
### Solution
```java
// Load the fs library
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Challenge {

    public static void main(String[] args) throws IOException {

      // Load our command line arguments
      String P = args[0];

      // Write your code below
      // Create new file passing the path P
      File file = new File(P); 
      // Create fis for reading file content
      FileInputStream fis = new FileInputStream(file);
      // File content into byte data
      byte[] data = new byte[(int) file.length()];
      
      // Read file content
      fis.read(data);
      // Close file
      fis.close();
      // Save file content into variable
      String fileContent = new String(data, "UTF-8");
     
      // Print file content
      System.out.println(fileContent);

    }
}

```
|||