import java.util.Scanner;

public class AnnualBalance{
  public static void main(String[] args){
    String name;
    double balance;
    double interest;
      
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter your first name only, the balance of your savings account, and the annual interest paid on your savings account.");
    name = userInput.next();
    balance = userInput.nextDouble();
    interest = userInput.nextDouble();
      
    System.out.println();
    System.out.println("Opening Balance: $" + balance);
    balance = balance + ((balance * interest) / 100);
    System.out.println("First Year: $" + balance);
    balance = balance + ((balance * interest) / 100);
    System.out.println("Second Year: $" + balance);
    balance = balance + ((balance * interest) / 100);
    System.out.print("Third Year: $" + balance);
  }
}