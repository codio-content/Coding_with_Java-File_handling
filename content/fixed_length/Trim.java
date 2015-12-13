public class Trim {

    public static void main(String[] args) {
      
      String text = "  Words   Other   Words\tTab   ";
      System.out.println(":" + text + ":");
      text= text.trim();
      System.out.println(":" + text + ":");
      
    }
}