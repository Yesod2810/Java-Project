import java.util.Scanner;

public class DivineNumber {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int number = scnr.nextInt();
      int devide = scnr.nextInt();
      
      System.out.printf((number/devide) + " ");
      System.out.printf(((number/devide)/devide) + " ");
      System.out.printf((((number/devide)/devide)/devide) + "\n");
   }
}
