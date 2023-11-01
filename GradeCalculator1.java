import java.util.Scanner;
/*
 * Robert Lightfoot
 * CSCE 111
 * Branching example
 */
/**
 * GradeCalculator1
 */
public class GradeCalculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your four test grades: ");
        double test1 = input.nextDouble(); 
        double test2 = input.nextDouble(); 
        double test3 = input.nextDouble(); 
        double test4 = input.nextDouble(); 
        
        System.out.print("Please enter your Final test grade: ");
        double finalExam = input.nextDouble();

        double average = (test1 + test2 + test3 + test4 ) / 4.0 * 0.75 + finalExam * 0.25;

        String letterGrade = "F";
        if (average >= 90) {
            letterGrade = "A";
        }
        if (average > 80 && average < 89) {
                        letterGrade = "B";

        }
        if (average > 70 && average < 79) {
                        letterGrade = "C";

        }
        if (average > 60 && average < 69) {
                        letterGrade = "D";

        }        
        System.out.println("Your course average is: " + average);
        System.out.println("Your letter grade is: " + letterGrade);

    }
    
}