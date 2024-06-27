import java.util.Scanner;

public class Transform{
    public static void main(String[] args){
        /**
         WRITE YOUR CODE BELOW
         */
      Scanner scnr = new Scanner(System.in);
      char userChar1;
      char userChar2;
      char userChar3;
      char userChar4;
      char userChar5;
      String userStr;
      
      System.out.println("Prompt the user to input the first character:");
      userChar1 = scnr.nextLine().charAt(0);
      System.out.println("Prompt the user to input the second character:");
      userChar2 = scnr.nextLine().charAt(0);
      System.out.println("Prompt the user to input the third character:");
      userChar3 = scnr.nextLine().charAt(0);
      System.out.println("Prompt the user to input the fourth character:");
      userChar4 = scnr.nextLine().charAt(0);
      System.out.println("Prompt the user to input the fifth character:");
      userChar5 = scnr.nextLine().charAt(0);
      System.out.println();
      System.out.println("Answer:" + "" + userChar1 + userChar2 + userChar3 + userChar4 + userChar5);
      System.out.println();
      System.out.println("Please enter a single word consisting of exactly five characters:");
      userStr = scnr.nextLine();
      System.out.println();
      System.out.println("Answer:");
      System.out.println(userStr.charAt(0));
      System.out.println(userStr.charAt(1));
      System.out.println(userStr.charAt(2));
      System.out.println(userStr.charAt(3));
      System.out.println(userStr.charAt(4));
    }
}