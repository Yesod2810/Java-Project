import java.util.Scanner;

public class GameLeagues{
    public static void main(String[] args){
         Scanner scnr = new Scanner(System.in);
         int playerScore = scnr.nextInt();
        
      // Step 1
         System.out.printf("%-14s", "");
         System.out.printf("%-14s", "Bronze");
         System.out.printf("%-14s", "Silver");
         System.out.printf("%-14s", "Gold");
         System.out.printf("%-14s\n", "Platinum");
        
         System.out.printf("%-14s", "Score Range");
         System.out.printf("%-14s", "500 - 999");
         System.out.printf("%-14s", "1000 - 1999");
         System.out.printf("%-14s", "2000 - 2999");
         System.out.printf("%-14s\n", "3000 +");
        
         System.out.println();
         System.out.println("Please enter the user's score:");
      // Step 2
         if ((playerScore >= 500) && (playerScore < 1000)) {
            System.out.println("Congratulations you have made it into the Bronze!!!");
         } else if ((playerScore >= 1000) && (playerScore < 2000)) {
            System.out.println("Congratulations you have made it into the Silver!!!");
         } else if ((playerScore >= 2000) && (playerScore < 3000)) {
            System.out.println("Congratulations you have made it into the Gold!!!");
         } else if (playerScore >= 3000) {
            System.out.println("Congratulations you have made it into the Platinum!!!");
         } else {
            System.out.println("You have not yet made it into a league");
         }
    }
}