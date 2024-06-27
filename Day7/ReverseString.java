import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;
      int i;
      
      userInput = scnr.nextLine();
      
      while (!userInput.equalsIgnoreCase("Done") && !userInput.equals("d")) {
         for (i = userInput.length() - 1; i >=0; --i) {
            System.out.print(userInput.charAt(i));
         }
         System.out.println();
         userInput = scnr.nextLine();
      }
   }
}
