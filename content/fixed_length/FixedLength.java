import java.util.ArrayList;

public class FixedLength {

    public static void main(String[] args) {
      
      // sample data with records <= 6 characters long
      String data = "   100  1000     1999999   700";
      System.out.println(data);

      int recordLength = 6;
      int start = 0;
      ArrayList<String> records = new ArrayList<String>();

      // use the substring function to read all the records
      while( (data.length() - start) >= recordLength ) {
        String record = data.substring(start, (start + recordLength));
        records.add(record);
        start += recordLength;
      }

      // print out all of our records
      for(int i=0; i < records.size(); i++) {
        System.out.println("Record "+i+": ("+records.get(i)+")");
      }
      
    }
}