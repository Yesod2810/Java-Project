import java.util.Scanner;

public class NoteFrequencies {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      /* Type your code here. */
      double f0 = scnr.nextDouble();
      double f1 = f0 * Math.pow(2.0, 1.0/12);
      double f2 = f1 * Math.pow(2.0, 1.0/12);
      double f3 = f2 * Math.pow(2.0, 1.0/12);
      System.out.printf("%.2f Hz\n", f0);
      System.out.printf("%.2f Hz\n", f1);
      System.out.printf("%.2f Hz\n", f2);
      System.out.printf("%.2f Hz\n", f3);
   }
}
