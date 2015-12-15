// Load the file system libraries
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;

public class Challenge {
  
  // Our helper functions

  //
  // Loads the file at filepath 
  // Returns a 2d array with the data
  // 
  public static String[][] load2dArrayFromFile(String filepath) throws IOException {
    // Your code goes here:
    
  }

  //
  // Searches the 2d array 'records' for firstname, lastname.
  // Returns the index of the record or -1 if no record exists
  // 
  public static int findIndex(String[][] records, String firstname, String lastname) {
    // Your code goes here:
    
  }

  // Sets the birthday of the record at the given index
  // Returns: nothing
  public static void setBirthday(String[][] records, int index, String newBirthday) {
    // Your code goes here:
    
  }

  // Convert one record into a pipe-delimited string
  // Return the pipe-delimited string inside array
  public static String makeLineFromRecord(String[] record, String separator) {
    // Your code goes here:
    
  }

  // Convert the 2d array back into a string
  // Return the rull text of the 2d array
  public static String makeTextFrom2dArray(String[][] records){
    // Your code goes here:
    
  }

  public static void main(String[] args) throws IOException {
    
    // Get the filepath from the command line
    String P = args[0];
    String F = args[1];
    String L = args[2];
    String B = args[3];
    String O = args[4];

    //  Our main code body, where we call our functions.
    //  
    // Load our records from the file into a 2d array
    String[][] records = load2dArrayFromFile(P);

    // Find out which index, if any, has the name we are hunting
    int indexWeAreHunting = findIndex(records, F, L);

    // Set the birthday record to the one we were passed
    setBirthday(records, indexWeAreHunting, B);

    // Convert the records into a text string
    String output = makeTextFrom2dArray(records);

    // Your code goes here
    // write the text string out to the file
    
      
  }
    
}
