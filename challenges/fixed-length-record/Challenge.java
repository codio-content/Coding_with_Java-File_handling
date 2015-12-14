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
        

    }
}