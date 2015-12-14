public class Challenge {

    public static void main(String[] args) {
      
        // input variables
        
      
        // Write your code below
        // Load the FileWriter
        File outputFile = new File(O);
        FileWriter fw = new FileWriter(outputFile, true);
      
        // Find the first occurance of S
        var positionS= filedata.indexOf(S)

        // If positionS is -1, we are done.
        while(positionS >= 0) {
          output+= filedata.substring(0, positionS) + T
          filedata= filedata.substring(positionS + S.length)
          positionS= filedata.indexOf(S)
        }
        output+= filedata

        // Write out the contents.
        fs.writeFileSync(O, output, 'utf8')
          
        String[] A = {"Wes", "Anderson", "00000000"};
        String[] B = {"Emily", "Valdez", "11111111"};
        for (int i = 0; i < A.length; i++) {
          int elementLength = A[i].length();
          element = A[i];
          String separator = "";
          if (i != A.length-1) {
            for (int j = 0; j < (recordLength - elementLength); j++) {
              separator += ".";
            }
          }
          fw.write(element+separator);
        }
        fw.close();
    }
}
