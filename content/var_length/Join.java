public class Join {

    public static void main(String[] args) {
      
      String[] list = {"a", "b", "c"};
      String delimiter = ":";
      String abc = String.join(delimiter, list);
      System.out.println(abc);
      
    }
}