import java.util.Scanner;

public class HailstoneSequence {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int n = scnr.nextInt();
      int line = 0;
      while (n != 1) {
         System.out.print(n + "\t");
         if (n % 2 == 0) {
            n = n / 2;
            line++;
         } else if (n % 2 == 1) {
            n = 3*n + 1;
            line++;
         }
         if (line % 5 == 0) {
            System.out.println();
         }
      }
      System.out.println(1 + "\t");
   }
}
