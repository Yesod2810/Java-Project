import java.util.Scanner; 

public class CheckIntegerString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
      // Add more variables as needed
      boolean isDigit = true;
      userString = scnr.next();
      /* Type your code here. */
      for (char ch : userString.toCharArray()) {
         if (!Character.isDigit(ch)) {
            isDigit = false;
            break;
         }
      }
      System.out.println(isDigit ? "Yes" : "No");
   }
}
