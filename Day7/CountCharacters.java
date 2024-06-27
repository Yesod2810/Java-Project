import java.util.Scanner;

public class CountCharacters {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char inputChar;
      String inputString;
      int i;
      int numChar = 0;
      
      inputChar = scnr.next().charAt(0);
      inputString = scnr.nextLine();
      
      for (i = 0; i < inputString.length(); ++i) {
         if (inputString.charAt(i) == inputChar) {
            numChar += 1;
         }
      }
      if (numChar == 1) {
         System.out.println(numChar + " " + inputChar);
      } else {
         System.out.println(numChar + " " + inputChar + "'s");
      }
   }
}
