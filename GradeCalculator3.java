import java.util.Scanner;
/*
 * Robert Lightfoot
 * CSCE 111
 * Branching example
 */
/**
 * GradeCalculator1
 */
public class GradeCalculator3 {
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
        
        int grade = (int)average / 10;

        switch (grade) {
            case 10:
            case 9:
                letterGrade = "A";
                break;
            case 8:
                letterGrade = "B";
                break;
            case 7:
                letterGrade = "C";
                break;
            case 6:
                letterGrade = "D";
                break;
            default:
                letterGrade = "F";
                break;
        }
        System.out.println("Your course average is: " + average);
        System.out.println("Your letter grade is: " + letterGrade);

    }
    
}