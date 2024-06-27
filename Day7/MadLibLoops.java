import java.util.Scanner;

public class MadLibLoops {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      String item = scnr.next();
      int quantity = scnr.nextInt();
      
      while (item != "quit" && quantity != 0) {
         System.out.printf("Eating %d %s a day keeps you happy and healthy.\n", quantity, item);
         scnr.nextLine();
         item = scnr.next();
         quantity = scnr.nextInt();
      }
   }
}
