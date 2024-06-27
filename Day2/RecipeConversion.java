import java.util.Scanner;
public class RecipeConversion{
    public static void main(String[] args){
        /**
         WRITE YOUR CODE BELOW
         */
      Scanner scnr = new Scanner(System.in);
      //PROMPT the user with "Please input the name of your ingredient:"
      System.out.println("Please input the name of your ingredient:");
      //STORE the input value
      String name = scnr.nextLine();
      //PROMPT the user with "Please input the measurement in grams:"
      System.out.println("Please input the measurement in grams:");
      //STORE the input value
      double msm = scnr.nextDouble();
      //PROMPT the user with "Please input the scale factor:"
      System.out.println("Please input the scale factor:");
      //STORE the input value
      double scl = scnr.nextDouble();
      //CONVERT the grams into Australian cups and scale the result by the scale value
      double cup = msm / 250.0 * scl;
      //OUTPUT the headings
      System.out.println();
      System.out.printf( "%-15s", "Ingredient");
      System.out.printf( "%-15s", "Grams");
      System.out.printf( "%-15s", "Scale Factor");
      System.out.printf( "%-4s", "Cups");
      System.out.println();
      //OUTPUT the values for each of the column headings
      System.out.printf( "%-15s", name);
      System.out.printf( "%-15.0f", msm);
      System.out.printf( "%-15.1f", scl);
      System.out.printf( "%-4.2f", cup);
      System.out.println();
      System.out.println();
      
      int money = (int) (cup * 2.64 + 0.5);
      System.out.printf("The cost of %.0f cups at $2.64 per cup is $%,d", cup, money);
    }
}