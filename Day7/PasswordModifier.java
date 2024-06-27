import java.util.Scanner;

public class PasswordModifier {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      String input = scnr.next();
      char character;
      String message = "";
      for (int i = 0; i < input.length(); i++) {
         character = input.charAt(i);
         if (character == 'i') {
            character = '1';
         } else if (character == 'a') {
            character = '@';
         } else if (character == 'm') {
            character = 'M';
         } else if (character == 'B') {
            character = '8';
         } else if (character == 's') {
            character = '$';
         } else {
            character = character;
         }
         message += character;
      }
      message += '!';
      System.out.println(message);
   }
}
