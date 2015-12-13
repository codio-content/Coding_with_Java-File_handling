import java.io.File; // make file library available
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {
      
      File filepath = new File("../textfiles/write-file.txt");
      FileWriter fw = new FileWriter(filepath, true); // true for appending
      
      String str = "Line 1";
      fw.write(str);
      fw.write(System.lineSeparator()); //new line
      fw.write("Line 2");
      fw.write(System.lineSeparator()); //new line
      fw.write("Line 3");
      fw.close(); 
      
    }
}