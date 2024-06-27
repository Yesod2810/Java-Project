import java.util.Scanner; 

public class IntegerChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
      char userChar;
      int count = 0;
      // Add more variables as needed

      userString = scnr.next();
      /* Type your code here. */
      for (int i = 0; i < userString.length(); i++) {
         userChar = userString.charAt(i);
         if (Character.isDigit(userChar) == true) {
            count++;
         }
         
      }
      if (count == userString.length()) {
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
   }
}
