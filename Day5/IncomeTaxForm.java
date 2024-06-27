import java.util.Scanner;

public class IncomeTaxForm {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int wages;
      int interest;
      int unemployment;
      int status = 1;
      int taxes;
      int agi;
      int deduction;
      int income = 0;
      int tax;
      int taxDue;
      
      wages = scnr.nextInt();
      interest = scnr.nextInt();
      unemployment = scnr.nextInt();
      status = scnr.nextInt();
      taxes = scnr.nextInt();
      agi = wages + interest + unemployment;
      
      if (agi > 120000) {
         System.out.printf("AGI: $%,d\n", agi);
         System.out.println("Error: Income too high to use this form");
      } else {
         System.out.printf("AGI: $%,d\n", agi);
         
         if (status == 2) {
            deduction = 24000;
            System.out.println("Deduction: $24,000");
         } else {
            deduction = 12000;
            System.out.println("Deduction: $12,000");
         }
         
         if (agi - deduction < 0) {
            System.out.printf("Taxable income: $%,d\n", income);
         } else {
            income = agi - deduction;
            System.out.printf("Taxable income: $%,d\n", income);
         }
         
         if (status == 2) {
            if (income <= 20000) {
               tax = (int) Math.round(income * 0.1);
            } else if (income < 80000) {
               tax = (int) Math.round((income - 20000) * 0.12 + 2000);
            } else {
               tax = (int) Math.round((income - 80000) * 0.22 + 9200);
            }
         } else {
            if (income <= 10000) {
               tax = (int) Math.round(income * 0.1);
            } else if (income < 40000) {
               tax = (int) Math.round((income - 10000) * 0.12 + 1000);
            } else if (income < 85000) {
               tax = (int) Math.round((income - 40000) * 0.22 + 4600);
            } else {
               tax = (int) Math.round((income - 85000) * 0.24 + 14500);
            }
         }
         System.out.printf("Federal tax: $%,d\n", tax);
         
         taxDue = taxes - tax;
         if (taxDue > 0) {
            System.out.printf("Tax refund: $%,d\n", taxDue);
         } else {
            System.out.printf("Tax due: $%,d\n", taxDue * -1);
         }
      }
   }
}
