import java.util.Scanner;

public class DrawUpsideDownTriangle {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int height = scnr.nextInt();
      for (int i = height; i >= 1; i--) {
         for (int j = i; j >= 1; j--) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}
