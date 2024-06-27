import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   /* Type your code here. */
	   double a = scnr.nextDouble();
	   double b = scnr.nextDouble();
	   double c = scnr.nextDouble();
	   double halfPerimeter = (a + b + c) / 2;
	   double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
      System.out.printf("Triangle area = %.2f\n", area);
	}
}