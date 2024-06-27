import java.util.Scanner;

public class DrawRightJustifiedTriangle {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int height = scnr.nextInt();
      for (int i = 1; i <= height; i++) {
         for (int j = 1; j <= height - i; j++) {
            System.out.print("  ");
         }
         for (int j = 1; j <= i; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}
