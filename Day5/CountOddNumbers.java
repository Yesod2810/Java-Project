import java.util.Scanner;

public class CountOddNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int input;
      int count = 0;
      for (int i = 0; i < 4; i++) {
         input = scnr.nextInt();
         if (input % 2 != 0) {
            count +=1;
         }
      }
      System.out.println(count);
   }
}
