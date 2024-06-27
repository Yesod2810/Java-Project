import java.util.Scanner;

public class GradeCalculator {
   public static double calculateAverage(String studentStatus, double percentHomework, double percentQuizzes, double percentMidterm, double percentFinal) {
      if (studentStatus.equals("UG")) {
         return 0.2 * percentHomework + 0.2 * percentQuizzes + 0.3 * percentMidterm + 0.3 * percentFinal;
      } else if (studentStatus.equals("G")) {
         return 0.15 * percentHomework + 0.05 * percentQuizzes + 0.35 * percentMidterm + 0.45 * percentFinal;
      } else if (studentStatus.equals("DL")) {
         return 0.05 * percentHomework + 0.05 * percentQuizzes + 0.4 * percentMidterm + 0.5 * percentFinal;
      } else {
         return -1;
      }
   }
   
   public static String calculateGrade(double average) {
      if (average < 60.0) {
         return "Course grade: F";
      } else if (average < 70.0) {
         return "Course grade: D";
      } else if (average < 80.0) {
         return "Course grade: C";
      } else if (average < 90.0) {
         return "Course grade: B";
      } else {
         return "Course grade: A";
      }
   }
   
   public static void main(String[] args) {
      
      final double HOMEWORK_MAX = 800.0;
      final double QUIZZES_MAX = 400.0;
      final double MIDTERM_MAX = 150.0;
      final double FINAL_MAX = 200.0;    
      
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String studentStatus = scnr.next();
      double homework = scnr.nextDouble();
      double quizzes = scnr.nextDouble();
      double midterm = scnr.nextDouble();
      double finalTest = scnr.nextDouble();
      double average;
      String grade;
      
      double percentHomework = homework / HOMEWORK_MAX * 100;
      double percentQuizzes = quizzes / QUIZZES_MAX * 100;
      double percentMidterm = midterm / MIDTERM_MAX * 100;
      double percentFinal = finalTest / FINAL_MAX * 100;
      
      if (percentHomework > 100) {
         percentHomework = 100;
      }
      if (percentQuizzes > 100) {
         percentQuizzes = 100;
      }
      if (percentMidterm > 100) {
         percentMidterm = 100;
      }
      if (percentFinal > 100) {
         percentFinal = 100;
      }
      
      if (studentStatus.equals("UG") || studentStatus.equals("G") || studentStatus.equals("DL")) {
         System.out.printf("Homework: %.1f%%\n", percentHomework);
         System.out.printf("Quizzes: %.1f%%\n", percentQuizzes);
         System.out.printf("Midterm: %.1f%%\n", percentMidterm);
         System.out.printf("Final Exam: %.1f%%\n", percentFinal);
         average = calculateAverage(studentStatus, percentHomework, percentQuizzes, percentMidterm, percentFinal);
         System.out.printf("%s average: %.1f%%\n", studentStatus, average);
         grade = calculateGrade(average);
         System.out.println(grade);
      } else {
         System.out.println("Error: student status must be UG, G or DL");
      }
   }
}
