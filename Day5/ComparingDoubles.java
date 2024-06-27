import java.util.Scanner;

public class ComparingDoubles {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      double firstDouble = scnr.nextDouble();
      double secondDouble = scnr.nextDouble();
      double threshold = scnr.nextDouble();
      double result = Math.abs(firstDouble - secondDouble);
      if (result < 0.001) {
         System.out.println("equal");
      } else if (result < threshold) {
         System.out.println("close enough");
      } else {
         System.out.println("not close");
      }
   }
}
