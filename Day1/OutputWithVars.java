import java.util.Scanner; 

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;

      System.out.println("Enter integer:");
      userNum = scnr.nextInt();  
      
      /* Type your code here */
      System.out.println("You entered: " + userNum);
      System.out.println(userNum + " squared is " + (userNum * userNum));
      System.out.println("And " + userNum + " cubed is " + userNum * userNum * userNum + "!!");
      System.out.println("Enter another integer:");
      int userNum1;
      userNum1 = scnr.nextInt();
      System.out.println(userNum + " + " + userNum1 + " is " + (userNum + userNum1));
      System.out.println(userNum + " * " + userNum1 + " is " + (userNum * userNum1));
   }
}