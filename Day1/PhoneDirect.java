import java.util.Scanner;

public class PhoneDirect {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int areaCode = scnr.nextInt();
      int prefix = scnr.nextInt();
      int lineNumber = scnr.nextInt();
      System.out.println("Country  Phone Number");
      System.out.println("-------  ------------");
      System.out.println("U.S.     +1 (" + areaCode + ")" + prefix + "-" + lineNumber);
      System.out.println("Brazil   +55 (" + areaCode + ")" + (prefix + 100) + "-" + lineNumber);
      System.out.println("Croatia  +385 (" + areaCode + ")" + prefix + "-" + (lineNumber + 50));
      System.out.println("Egypt    +20 (" + (areaCode + 30) + ")" + prefix + "-" + lineNumber);
      System.out.println("France   +33 (" + prefix + ")" + areaCode + "-" + lineNumber);
   }
}
