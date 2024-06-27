import java.util.Scanner;

public class EventPlaning {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
   // Prompt for day 1 data
      System.out.println("Please enter expected temperature, rain and humidity for Day 1:");
   // Get three values from user input
      double expTem1 = scnr.nextDouble();
      int rain1 = scnr.nextInt();
      int hum1 = scnr.nextInt();
      double temScore1;
      double rainScore1;
      double humScore1;
      double score1;
   // Prompt for day 2 data
      System.out.println("Please enter expected temperature, rain and humidity for Day 2:");
      System.out.println();
   // Get three values from user input
      double expTem2 = scnr.nextDouble();
      int rain2 = scnr.nextInt();
      int hum2 = scnr.nextInt();
      double temScore2;
      double rainScore2;
      double humScore2;
      double score2;
   // Calculate individual scores for day 1
      if (expTem1 > 25) { // Temperature
         temScore1 = 1;
      } else if (expTem1 < 15) {
         temScore1 = 2;
      } else {
         temScore1 = 3;
      }
      
      if (rain1 > 8) { // Rain
         rainScore1 = 1;
      } else if (rain1 < 4) {
         rainScore1 = 3;
      } else {
         rainScore1 = 2;
      }
      
      if (hum1 > 60) { // Humidity
         humScore1 = 1;
      } else if (hum1 < 46) {
         humScore1 = 3;
      } else {
         humScore1 = 2;
      }
   // Calculate outcome score for day 1
      score1 = 3 * temScore1 + 2 * rainScore1 + humScore1;
      System.out.println("Outcome score day 1: " + score1);
   // Calculate individual scores for day 2
      if (expTem2 > 25) { // Temperature
         temScore2 = 1;
      } else if (expTem2 < 15) {
         temScore2 = 2;
      } else {
         temScore2 = 3;
      }
      
      if (rain2 > 8) { // Rain
         rainScore2 = 1;
      } else if (rain2 < 4) {
         rainScore2 = 3;
      } else {
         rainScore2 = 2;
      }
      
      if (hum2 > 60) { // Humidity
         humScore2 = 1;
      } else if (hum2 < 46) {
         humScore2 = 3;
      } else {
         humScore2 = 2;
      }
   // Calculate outcome score for day 2
      score2 = 3 * temScore2 + 2 * rainScore2 + humScore2;
      System.out.println("Outcome score day 2: " + score2);
   // Compare outcome scores for day 1 & day 2
      String bestDay;
      if (score1 > score2) {
         bestDay = "Day 1";
      } else if (score1 < score2){
         bestDay = "Day 2";
      } else {
         bestDay = "Day 1 or Day 2";
      }
   // Output the recommendation
      System.out.println("The best day to hold your event is: " + bestDay);
   }
}