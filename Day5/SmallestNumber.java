import java.util.Scanner;

public class SmallestNumber {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int input = scnr.nextInt();
      int min = input;
      for (int i = 0; i < 2; i++) {
         input = scnr.nextInt();
         if (min > input) {
            min = input;
         }
      }
      System.out.println(min);
   }
}
