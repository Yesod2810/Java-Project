import java.util.Scanner;

public class HowManyDigits {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int input = scnr.nextInt();
      int count = 0;
      
      if (input == 0) {
         System.out.println("1 digit");
         return;
      }
      
      while (input != 0) {
         input /= 10;
         count++;
      }
      if (count == 1) {
         System.out.println("1 digit");
      } else {
         System.out.println(count + " digits");
      }
   }
}
