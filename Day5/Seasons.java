import java.util.Scanner; 

public class Seasons {
   private static boolean isValidMonth(String month) {
    return month.equals("january") || month.equals("february") || month.equals("march") || 
           month.equals("april") || month.equals("may") || month.equals("june") || 
           month.equals("july") || month.equals("august") || month.equals("september") || 
           month.equals("october") || month.equals("november") || month.equals("december");
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      String inputMonth;
      int inputDay;
      String season;
      
      /* Type your code here. */
      inputMonth = scnr.next().toLowerCase();
      inputDay = scnr.nextInt();
      
      if (inputDay <= 0 || inputDay > 31 || !isValidMonth(inputMonth)) {
         System.out.println("Invalid");
         return;
      }
      
      if (inputDay >= 31 && inputMonth.equals("september")) {
         System.out.println("Invalid");
         return;
      }
      
      if ((inputMonth.equals("december") && inputDay >= 21) || inputMonth.equals("january") || inputMonth.equals("february") || (inputMonth.equals("march") && inputDay <= 19)) {
         season = "Winter";
      } else if ((inputMonth.equals("march") && inputDay >= 20) || inputMonth.equals("april") || inputMonth.equals("may") || (inputMonth.equals("june") && inputDay <= 20)) {
         season = "Spring";
      } else if ((inputMonth.equals("june") && inputDay >= 21) || inputMonth.equals("july") || inputMonth.equals("august") || (inputMonth.equals("september") && inputDay <= 21)) {
         season = "Summer";
      } else {
         season = "Autumn";
      }
      
      System.out.println(season);
   }
}
