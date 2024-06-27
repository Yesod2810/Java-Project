import java.util.Scanner;

public class ConvertSecond {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int seconds;
      int minutes;
      int hours;
      int result;
      /* Type your code here. */
      seconds = scnr.nextInt();
      minutes = scnr.nextInt();
      hours = scnr.nextInt();
      result = seconds + 60 * minutes + 3600 * hours;
      System.out.println(result + " seconds");
      
   }
}
