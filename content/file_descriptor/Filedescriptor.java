import java.io.File; // make file library available
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filedescriptor {

    public static void main(String[] args) throws IOException {

      File pathA = new File("../textfiles/poem.txt");   // declare File type variables with paths
      File pathB = new File("../textfiles/cheese.txt"); // to files
      File pathC = new File("../textfiles/empty.txt");

      FileInputStream fileInputStreamA = new FileInputStream(pathA); // open file A
      FileDescriptor fileDescriptorA = fileInputStreamA.getFD();

      FileInputStream fileInputStreamB = new FileInputStream(pathB); // open file B
      FileDescriptor fileDescriptorB = fileInputStreamB.getFD();

      System.out.println("File Desc A: "+ fileDescriptorA.hashCode()); // print file desc A   
      System.out.println("File Desc B: "+ fileDescriptorB.hashCode()); // print file desc B

      fileInputStreamA.close();                  // close file desc A
      System.out.println("Closed A ["+fileDescriptorA.hashCode()+"]");

      FileInputStream fileInputStreamC = new FileInputStream(pathC);
      FileDescriptor fileDescriptorC = fileInputStreamC.getFD(); // open file C

      System.out.println("File Desc C: "+ fileDescriptorC.hashCode()); // print file desc C

      fileInputStreamB.close(); // close file desc B
      fileInputStreamC.close(); // close file desc C

    }
}