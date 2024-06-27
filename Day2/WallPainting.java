import java.util.Scanner;

public class WallPainting {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      double wallHeight = scnr.nextDouble();
      double wallWidth = scnr.nextDouble();
      double costCan = scnr.nextDouble();
      
      double area = wallHeight * wallWidth;
      System.out.printf("Wall area: %.1f sq ft\n", area);
      
      double numGallon = area / 350.0;
      System.out.printf("Paint needed: %.3f gallons\n", numGallon);
      
      System.out.printf("Cans needed: %.0f can(s)\n", Math.ceil(numGallon));
      
      double price = costCan * Math.ceil(numGallon);
      System.out.printf("Paint cost: $%.2f\n", price);
      System.out.printf("Sales tax: $%.2f\n", price * 0.07);
      System.out.printf("Total cost: $%.2f\n", price * 1.07);
   }
}
