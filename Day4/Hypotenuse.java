import java.util.Scanner;

public class Hypotenuse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      double a = scnr.nextDouble();
      double b = scnr.nextDouble();
      System.out.printf("Right triangle has side lengths %.2f and %.2f\n", a, b);
      
      /* Type your code here. */
      double c = Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0));
       System.out.printf("Hypotenuse is %.2f\n", c);
   }
}
