import java.util.Scanner;

public class SecondConvert {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int seconds;
      int minutes;
      int hours;
      int input;
      /* Type your code here. */
      input = scnr.nextInt();
      hours = input / 3600;
      input -= hours * 3600;
      minutes = input / 60;
      seconds = input - minutes * 60;
      System.out.println("Seconds: " + seconds);
      System.out.println("Minutes: " + minutes);
      System.out.println("Hours: " + hours);
   }
}
