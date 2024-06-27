import java.util.Scanner;

public class PhrasesAndSubphrases {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String line1 = scnr.nextLine();
      String line2 = scnr.nextLine();
      
      if (line1.equals(line2)) {
         System.out.println("Both phrases match");
      } else if (line1.indexOf(line2) != -1) {
         System.out.println(line2 + " is found within " + line1);
      } else if (line2.indexOf(line1) != -1) {
         System.out.println(line1 + " is found within " + line2);
      } else {
         System.out.println("No matches");
      }
   }
}
