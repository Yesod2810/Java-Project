import java.util.*;

public class PizzaParty {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int numPeople = scnr.nextInt();
      double slicePerPerson = scnr.nextDouble();
      double costPizza = scnr.nextDouble();
      double numSlice = numPeople * slicePerPerson;
      int numPizza = (int)(numSlice / 8) + 1;
      double price = numPizza * costPizza;
      double tax = price * 0.07;
      double delivery = (price + tax) * 0.2;
      double total = price + tax + delivery;
      
      System.out.println("Friday Night Party");
      System.out.printf(numPizza + " Pizzas: $%.2f\n", price);
      System.out.printf("Tax: $%.2f\n", tax);
      System.out.printf("Delivery: $%.2f\n", delivery);
      System.out.printf("Total: $%.2f\n\n", total);
      
      int numPeople1 = scnr.nextInt();
      double slicePerPerson1 = scnr.nextDouble();
      double costPizza1 = scnr.nextDouble();
      double numSlice1 = numPeople1 * slicePerPerson1;
      int numPizza1 = (int)(numSlice1 / 8) + 1;
      double price1 = numPizza1 * costPizza1;
      double tax1 = price1 * 0.07;
      double delivery1 = (price1 + tax1) * 0.2;
      double total1 = price1 + tax1 + delivery1;
      
      System.out.println("Saturday Night Party");
      System.out.printf(numPizza1 + " Pizzas: $%.2f\n", price1);
      System.out.printf("Tax: $%.2f\n", tax1);
      System.out.printf("Delivery: $%.2f\n", delivery1);
      System.out.printf("Total: $%.2f\n\n", total1);
      
      int numPeople2 = scnr.nextInt();
      double slicePerPerson2 = scnr.nextDouble();
      double costPizza2 = scnr.nextDouble();
      double numSlice2 = numPeople2 * slicePerPerson2;
      int numPizza2 = (int)(numSlice2 / 8) + 1;
      double price2 = numPizza2 * costPizza2;
      double tax2 = price2 * 0.07;
      double delivery2 = (price2 + tax2) * 0.2;
      double total2 = price2 + tax2 + delivery2;
      
      System.out.println("Sunday Night Party");
      System.out.printf(numPizza2 + " Pizzas: $%.2f\n", price2);
      System.out.printf("Tax: $%.2f\n", tax2);
      System.out.printf("Delivery: $%.2f\n", delivery2);
      System.out.printf("Total: $%.2f\n\n", total2);
      
      System.out.printf("Weekend Total: $%.2f\n", total + total1 + total2);
   }
}
