import java.util.Arrays;

public class VarLength {
  
    public static String[] getListFromPipeDelimitedText(String data) {
      String delimiter = "\\|";
      String[] list = data.split(delimiter);
      return list;
    }
  
    public static String printRecords(String[] records) {
      for (int i=0; i < records.length; i++) {
        System.out.println("Record "+i+": ("+records[i]+")");
      }
      return null;
    }

    public static void main(String[] args) {
      
      // Main section
      String data = "100|1000|1|999999|700";            // sample data
      System.out.println(data);                         // print data

      String[] records = getListFromPipeDelimitedText(data);  // create records
      printRecords(records);                            // and print them
      
    }
}

