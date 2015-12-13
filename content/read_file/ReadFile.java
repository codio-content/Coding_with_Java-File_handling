import java.io.File; // make file library available
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
      
      File file = new File("../textfiles/parrot.txt");
      FileInputStream fis = new FileInputStream(file); // Pass in the file
      
      System.out.println(file.length()); // 319 chars long
      
      byte[] data = new byte[(int) file.length()]; // stored in bytes
      
      fis.read(data); // so we can read them with the FileInputStream .read() method
      fis.close(); // close the file for other programs to use it

      // transform the byte data into 
      // human readable text with UTF-8 encoding
      String fileContent = new String(data, "UTF-8"); 
      
      System.out.println(fileContent); // print the file content
      
    }
}