import java.util.Arrays;

public class Split {

    public static void main(String[] args) {
      
      String text = "a:b:c:d";
      String delimiter = ":";
      String[] list = text.split(delimiter);
      System.out.println(Arrays.asList(list));
      
    }
}