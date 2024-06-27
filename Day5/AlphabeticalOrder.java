import java.util.Scanner;

public class AlphabeticalOrder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      char char1 = scnr.next().charAt(0);
      char char2 = scnr.next().charAt(0);
      char char3 = scnr.next().charAt(0);
      
      char min = char1;
      char mid = char2;
      char max = char3;
      
      if (char1 > char2) {
         min = char2;
         mid = char1;
      }
      
      if (min > char3) {
         char temp = min;
         min = char3;
         max = temp;
      } else if (mid > char3) {
         char temp = mid;
         mid = char3;
         max = temp;
      }
      
      if (mid > max) {
         char temp = mid;
         mid = max;
         max = temp;
      }
      
      System.out.println(min + " " + mid + " " + max);
   }
}
