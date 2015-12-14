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
    }
}
