import java.util.Scanner;

public class MaxOf2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      
      if (num1 > num2) {
         System.out.printf("Max of %d and %d is %d\n", num1, num2, num1);
      } else if (num1 < num2) {
         System.out.printf("Max of %d and %d is %d\n", num1, num2, num2);
      } else {
         System.out.printf("Max of %d and %d is %d\n", num1, num2, num1);
      }
   }
}
