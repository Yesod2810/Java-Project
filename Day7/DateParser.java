import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String input = scnr.nextLine();
      
      String goodVal;
      
      while (input.compareTo("-1") != 0) {
         int monthIndex = 0;
         int dateIndex = 0;
         String month = "";
         int monthNum;
         String date = "";
         String year = "";
         Boolean dateFormat = true;
         
         int i;
         for (i = 0; i < input.length(); ++i) {
            if (Character.isLetter(input.charAt(i))) {
               ++monthIndex;
            }
         }
         month = input.substring(0, monthIndex);
         
         for (i = monthIndex + 1; i < input.length() - 4; ++i) {
            if (Character.isDigit(input.charAt(i))) {
               ++dateIndex;
            } 
         }
         date = input.substring(monthIndex + 1, monthIndex + 1 + dateIndex);
         
         year = input.substring(monthIndex + 3 + dateIndex, input.length());
         
         dateFormat = (monthIndex == 0)?false:true;
         dateFormat = (input.charAt(monthIndex + 1 + dateIndex) == ',')?true:false;
         
         monthNum = getMonthAsInt(month);
         if (dateFormat) {
            System.out.print(monthNum);
            System.out.println("-" + date + "-" + year);
         }
         input = scnr.nextLine();
      }
      
     
   }
}
