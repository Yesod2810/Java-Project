import java.util.Scanner;

public class CylinderVolumeArea {
   public static void main(String[] args) {
	  Scanner scnr = new Scanner(System.in);
	  /* Type your code here. */
	  double radius = scnr.nextDouble();
	  double height = scnr.nextDouble();
	  double volume = Math.PI * Math.pow(radius, 2) * height;
	  double area = 2 * Math.PI * radius * (radius + height);
	  System.out.printf("Volume (cubic inches): %.2f\n", volume);
	  System.out.printf("Surface area (square inches): %.2f\n", area);
   }
}