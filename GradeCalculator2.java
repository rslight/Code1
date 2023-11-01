import java.util.Scanner;
/*
 * Robert Lightfoot
 * CSCE 111
 * Branching example
 */
/**
 * GradeCalculator1
 */
public class GradeCalculator2 {
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

        String letterGrade = "";
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80 ) {
           letterGrade = "B";
        } else if (average >= 70 ) {
           letterGrade = "C";
        }else if (average >= 60 ) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }       
        System.out.println("Your course average is: " + average);
        System.out.println("Your letter grade is: " + letterGrade);

    }
    
}