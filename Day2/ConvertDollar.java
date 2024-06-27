import java.util.Scanner;

public class ConvertDollar {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int nickels = scnr.nextInt();
      int dimes = scnr.nextInt();
      int quarters = scnr.nextInt();
      double dollars;
      dollars = nickels * 0.05 + dimes * 0.1 + quarters * 0.25;
      System.out.printf("Amount: $%.2f\n", dollars);
   }
}