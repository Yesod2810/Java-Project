import java.util.Scanner;

public class SimpleStatistics {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      int product;
      int average;
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      product = num1 * num2 * num3 * num4;
      average = (num1 + num2 + num3 + num4) / 4;
      System.out.printf(product + " " + average + "\n");
      
      double newNum1 = (double) num1;
      double newNum2 = (double) num2;
      double newNum3 = (double) num3;
      double newNum4 = (double) num4;
      double newProduct = newNum1 * newNum2 * newNum3 * newNum4;
      double newAverage = (newNum1 + newNum2 + newNum3 + newNum4) / 4;
      System.out.printf("%.3f ", newProduct);
      System.out.printf("%.3f\n", newAverage);
   }
}
