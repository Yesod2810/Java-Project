import java.util.Scanner;

public class Distance {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      /* Type your code here. */
      int km;
      int m;
      int cm;
      int mm;
      int totalmm;
      
      System.out.println("Please enter kilometres, metres, centimetres, and millimetres on a single line:");
      
      km = scnr.nextInt();
      m = scnr.nextInt();
      cm = scnr.nextInt();
      mm = scnr.nextInt();
      
      totalmm = km * 1000000 + m * 1000 + cm * 10 + mm;
      
      System.out.println("Total millimetres: " + totalmm);
   }
}