import java.util.Scanner;

public class RemoveNonAlphaCharacters {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      String input = scnr.nextLine();
      String result = input.replaceAll("[^a-zA-Z]", "");
      System.out.println(result);
   }
}
