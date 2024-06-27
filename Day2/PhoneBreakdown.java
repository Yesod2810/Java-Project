import java.util.Scanner;

public class PhoneBreakdown {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      // Add more variables as needed
      int firstThreeNumber;
      int secondThreeNumber;

      phoneNumber = scnr.nextLong();
      
      /* Type your code here. */
      firstThreeNumber = (int)(phoneNumber / 10000000);
      phoneNumber = phoneNumber % 10000000;
      secondThreeNumber = (int)(phoneNumber / 10000);
      phoneNumber = phoneNumber % 10000;
      System.out.println("(" + firstThreeNumber + ") " + secondThreeNumber + "-" + phoneNumber);
   }
}
