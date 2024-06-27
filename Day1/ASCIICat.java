import java.util.Scanner;

public class ASCIICat {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String catName = scnr.nextLine();
      
      System.out.println("      /\\_/\\");
      System.out.println(" /\\  / o o \\");
      
      System.out.println("//\\\\ \\~(*)~/");
      System.out.println("`  \\/   ^ /");
      
      System.out.println("   | \\|| ||");
      System.out.println("   \\ '|| ||");
      System.out.println("    \\)()-())");
      
      System.out.println("My cat " + catName);
   }
}
