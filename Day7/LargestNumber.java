import java.util.Scanner;

public class LargestNumber {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int input = scnr.nextInt();
      int maximum = input;
      
      while (input >= 0) {
         if (input > maximum) {
            maximum = input;
         }
         input = scnr.nextInt();
      }
      System.out.println("Largest integer: " + maximum);
   }
}
