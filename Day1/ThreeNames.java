import java.util.Scanner;

public class ThreeNames{
    public static void main(String[] args){
        /**
         WRITE YOUR CODE BELOW
         */
      String name1;
      String name2;
      String name3;
      String result;
      
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Please enter the first student name and press the enter key.");
      name1 = scnr.nextLine();
      
      System.out.println("Please enter the second student name and press the enter key.");
      name2 = scnr.nextLine();
      
      System.out.println("Please enter the third student name and press the enter key.");
      name3 = scnr.nextLine();
      
      result = name1 + ", " + name2 + ", " + name3;
      System.out.println(result);
    }
}