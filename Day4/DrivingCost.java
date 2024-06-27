import java.util.Scanner;

public class DrivingCost {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      double gasMile = scnr.nextDouble();
      double gasCost = scnr.nextDouble();
      System.out.printf("%.2f ", (20 / gasMile) * gasCost);
      System.out.printf("%.2f ", (75 / gasMile) * gasCost);
      System.out.printf("%.2f\n", (500 / gasMile) * gasCost);
   }
}
