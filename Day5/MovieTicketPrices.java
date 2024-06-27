import java.util.Scanner;

public class MovieTicketPrices {
   public static int ticketPrice(String time, int age) {
      if (time.equals("day")) {
         if (age < 4) {
            return 0;
         } else {
            return 8;
         }
      } else {
         if (age < 4) {
            return 0;
         } else if (age <= 16) {
            return 12;
         } else if (age <= 54) {
            return 15;
         } else {
            return 13;
         }
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String time = scnr.next();
      int age = scnr.nextInt();
      int price = ticketPrice(time, age);
      if (price == 0) {
         System.out.println("free");
      } else {
         System.out.println("$" + price);
      }
   }
}
