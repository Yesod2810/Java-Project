import java.util.Scanner;

public class MedianOf3 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int a = scnr.nextInt();
      int b = scnr.nextInt();
      int c = scnr.nextInt();
      int min = a;
      int max = a;
      
      if (min > b) {
         min = b;
      }
      if (min > c) {
         min = c;
      }
      if (max < b) {
         max = b;
      }
      if (max < c) {
         max = c;
      }
      
      if (a > min && a < max) {
         System.out.println(a);
      } else if (b > min && b < max) {
         System.out.println(b);
      } else {
         System.out.println(c);
      }
      
   }
}