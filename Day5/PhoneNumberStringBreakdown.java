import java.util.Scanner;

public class PhoneNumberStringBreakdown {
   public static String formatPhoneNumber(String phoneNumber) {
      if (phoneNumber.length() != 10) {
         return "Invaild phone number";
      }
      
      String areaCode = phoneNumber.substring(0, 3);
      String prefix = phoneNumber.substring(3, 6);
      String lineNumber = phoneNumber.substring(6, 10);
      
      return String.format("(%s) %s-%s", areaCode, prefix, lineNumber);
   }
   
   public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in);
      String phoneNumber;
      // Add more variables as needed
      String formatNumber;
      
      phoneNumber = scnr.nextLine();
      
      /* Type your code here */
      formatNumber = formatPhoneNumber(phoneNumber);
      System.out.println(formatNumber);
   }
}