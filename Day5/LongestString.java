import java.util.Scanner;

public class LongestString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String str1 = scnr.next();
      String str2 = scnr.next();
      
      if (str1.length() > str2.length()) {
         System.out.printf("%s is longer than %s\n", str1, str2);
      } else if (str2.length() > str1.length()) {
         System.out.printf("%s is longer than %s\n", str2, str1);
      } else {
         System.out.printf("%s and %s have the same length\n", str1, str2);
      }
   }
}
