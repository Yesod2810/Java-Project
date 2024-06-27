import java.util.Scanner;

public class Welcome {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
   
      userName = scnr.next();
      
      /* Type your code here. */
      System.out.printf("Hey " + userName + "!\n");
      System.out.println("Welcome to zyBooks!");
   }
}
