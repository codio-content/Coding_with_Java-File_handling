import java.io.File; // make file library available
import java.io.FileWriter;
import java.io.IOException;

public class Experiment {

    public static void main(String[] args) throws IOException {
      
        // Write your experimental code below
        System.out.println("Your experiemental code goes here.");
        
        String[][] data = new String[][]{
          {"Name", "Lastname", "DDMMYYYY"},
          {"Name", "Lastname", "DDMMYYYY"},
          {"Name", "Lastname", "DDMMYYYY"}
        };

        File filepath = new File("/home/codio/workspace/content/textfiles/write-file.txt");
        FileWriter fw = new FileWriter(filepath, true);
        
        int recordLength = 12;
        String element;
      
        for (int row = 0; row < data.length; row++) {
          for (int column = 0; column < data[row].length; column++) {
            String separator = "";
            int elementLength = data[row][column].length();
            element = data[row][column];
            if (column < (data[row].length-1)) {
              for (int i = 0; i < (recordLength - elementLength); i++) {
                separator += ".";
              }
            }
            fw.write(element+separator);
          }
          fw.write(System.lineSeparator()); //new line
        }
        fw.close();
        
        

    }
}