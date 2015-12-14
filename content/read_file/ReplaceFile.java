import java.io.File; // make file library available
import java.io.FileInputStream;
import java.io.IOException;

public class ReplaceFile {

    public static void main(String[] args) throws IOException {
      
      File file = new File("../textfiles/parrot.txt");
      FileInputStream fis = new FileInputStream(file);
      
      byte[] data = new byte[(int) file.length()]; 
      
      fis.read(data);
      fis.close();

      String fileContent = new String(data, "UTF-8");
      
      fileContent = fileContent.replaceAll("parrot", "toucan");
      
      System.out.println(fileContent);
      
    }
}