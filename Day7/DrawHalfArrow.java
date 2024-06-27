import java.util.Scanner;

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int height = scnr.nextInt();
      int width = scnr.nextInt();
      
      for (int i = 0; i < height; ++i) {
         for (int j = 0; j < width; ++j) {
            System.out.print("*");
         }
         System.out.println();
      }
      
      int headWidth1 = scnr.nextInt();
      int max = headWidth1;
      while (scnr.hasNextInt()) {
         int input = scnr.nextInt();
         if (input > max) {
            max = input;
         }
      }

      int temp1 = max;
      int temp2 = max;
      for (int a = 0; a < temp1; ++a) {
         for (int b = 0; b < temp2; ++b) {
            System.out.print("*");
         }
         System.out.println();
         temp2--;
      }
   }
}
