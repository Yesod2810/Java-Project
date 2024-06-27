import java.util.Scanner; 

public class ReverseBinary {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int decimal = scnr.nextInt();
      StringBuilder binary = new StringBuilder();
      while (decimal > 0) {
         binary.append(decimal % 2);
         decimal /= 2;
      }
      System.out.println(binary);
   }
}
