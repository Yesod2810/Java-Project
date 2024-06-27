import java.util.Scanner;

public class SpeedingTicket {
   public static int trafficTicket(int speed) {
      if (speed <= -10) {
         return 50;
      } else if (speed < 6) {
         return 0;
      } else if (speed <= 20) {
         return 75;
      } else if (speed <= 40) {
         return 150;
      } else {
         return 300;
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int speedLimit = scnr.nextInt();
      int drivingSpeed = scnr.nextInt();
      int speed = drivingSpeed - speedLimit;
      int ticket = trafficTicket(speed);
      
      System.out.println(ticket);
   }
}
