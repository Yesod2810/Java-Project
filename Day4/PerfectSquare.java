import java.util.Scanner;

public class PerfectSquare{
    public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Please input your first decimal value:");
      
      double val1st;
      int sqVal1;
      String perSq1;
      
      val1st = scnr.nextDouble();
      sqVal1 = (int) Math.sqrt(val1st);
      if (val1st == sqVal1*sqVal1) {
         perSq1 = "true";
      } else {
         perSq1 = "false";
      }
      
      System.out.println("Please input your second decimal value:");
      
      double val2nd;
      int sqVal2;
      String perSq2;
      
      val2nd = scnr.nextDouble();
      sqVal2 = (int) Math.sqrt(val2nd);
      if (val2nd == sqVal2*sqVal2) {
         perSq2 = "true";
      } else {
         perSq2 = "false";
      }
      
      System.out.println("Please input your third decimal value:");
      
      double val3rd;
      int sqVal3;
      String perSq3;
      
      val3rd = scnr.nextDouble();
      sqVal3 = (int) Math.sqrt(val3rd);
      if (val3rd == sqVal3*sqVal3) {
         perSq3 = "true";
      } else {
         perSq3 = "false";
      }
      
      System.out.println();
      System.out.printf( "%-10s", "Input");
      System.out.printf( "%-30s", "Square Root as Integer");
      System.out.printf( "%-20s\n", "Perfect Square");
      
      System.out.printf( "%-10.2f", val1st);
      System.out.printf( "%-30d", sqVal1);
      System.out.printf( "%-20s\n", perSq1);
      
      System.out.printf( "%-10.2f", val2nd);
      System.out.printf( "%-30d", sqVal2);
      System.out.printf( "%-20s\n", perSq2);
      
      System.out.printf( "%-10.2f", val3rd);
      System.out.printf( "%-30d", sqVal3);
      System.out.printf( "%-20s\n", perSq3);
    }
}