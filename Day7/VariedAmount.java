import java.util.Scanner; 

public class VariedAmount {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int input = scnr.nextInt();
      int total = 0;
      int max = 0;
      int count = 0;
      while (input >= 0) {
         total += input;
         count++;
         if (input > max) {
            max = input;
         }
         input = scnr.nextInt();
      }
      double average = (double) total / count;
      System.out.print(max + " ");
      System.out.printf("%.2f\n", average);
   }
}
