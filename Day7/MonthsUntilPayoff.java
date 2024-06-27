import java.util.Scanner;

public class MonthsUntilPayoff {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      double loan = scnr.nextDouble();
      double payment = scnr.nextDouble();
      double rate = scnr.nextDouble();
      int count = 0;
      
      while (loan > 0) {
         loan *= (1 + rate);
         loan -= payment;
         count++;
      }
      
      if (count == 1) {
         System.out.println("1 payment");
      } else {
         System.out.println(count + " payments");
      }
   }
}
