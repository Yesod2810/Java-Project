import java.util.Scanner;

public class ProgramSummary{
    public static void main(String[] args){
        /**
         WRITE YOUR CODE BELOW
         */
      String goal1;
      String goal2;
      String goal3;
      
      Scanner scnr = new Scanner(System.in);
      goal1 = scnr.nextLine();
      goal2 = scnr.nextLine();
      goal3 = scnr.nextLine();
      
      System.out.println("Please enter the first goal and press the enter key.");
      System.out.println("Please enter the second goal and press the enter key.");
      System.out.println("Please enter the third goal and press the enter key.");
      System.out.println();
      System.out.println("1. " + goal1);
      System.out.println("2. " + goal2);
      System.out.println("3. " + goal3);
      System.out.println();
      System.out.println("3. " + goal3);
      System.out.println("2. " + goal2);
      System.out.println("1. " + goal1);
    }
}