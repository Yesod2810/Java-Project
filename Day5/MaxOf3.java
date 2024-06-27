import java.util.Scanner;

public class MaxOf3 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int a = scnr.nextInt();
      int b = scnr.nextInt();
      int c = scnr.nextInt();
      int max = a;
      if (a < b) {
         max = b;
      } 
      if (b < c) {
         max = c;
      }
      System.out.printf("Max of [%d, %d, %d] is %d\n", a, b, c, max);
   }
}
