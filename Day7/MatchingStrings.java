import java.util.Scanner;

public class MatchingStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String str1 = scnr.next();
      String str2 = scnr.next();
      int count = 0;
      int minLength = Math.min(str1.length(), str2.length());
      for (int i = 0; i < minLength; i++) {
         if (str1.charAt(i) == str2.charAt(i)) {
            count++;
         }
      }
      if (count == 1) {
         System.out.println("1 character matches");
      } else {
         System.out.println(count + " characters match");
      }
   }
}