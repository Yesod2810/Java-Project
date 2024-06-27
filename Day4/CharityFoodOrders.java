import java.util.Scanner;

public class CharityFoodOrders{
    public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      int numPeople;
      int numMeal;
      int totalMeal;
      int bagRice;
      double costRice;
      double totalCost;
      
      System.out.println("Number of people:");
      numPeople = scnr.nextInt();
      
      System.out.println("Number of meals per person:");
      numMeal = scnr.nextInt();
      
      System.out.println("Cost per bag of rice:");
      costRice = scnr.nextDouble();
      
      System.out.println();
      totalMeal = numPeople * numMeal;
      bagRice = (int) Math.ceil((double)totalMeal / 12);
      totalCost = costRice * bagRice;
      
      System.out.printf("This order will support %,d people to each make %d rice based meals.\n", numPeople, numMeal);
      System.out.printf("Total meals: %,d\n", totalMeal);
      System.out.printf("You will need %d bags of rice for a cost of $%,.02f.\n", bagRice, totalCost);
      
      System.out.println();
      System.out.println("Please input the expected percentage of late orders:");
      System.out.println();
      
      double expPer;
      
      expPer = scnr.nextDouble();
      
      numPeople = (int) (numPeople * (1 + expPer));
      totalMeal = numPeople * numMeal;
      bagRice = (int) Math.ceil((double) totalMeal / 12);
      totalCost = bagRice * costRice;
      
      System.out.printf("Allowing for late orders, you should order: %d bags of rice for a cost of $%,.02f.", bagRice, totalCost);
    }
}