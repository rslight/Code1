import java.util.Scanner;
/**
 * Robert Lightfoot
 * CSCE 111
 * Loop examples
 * dadJoke
 */
public class dadJoke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi, welcome to the simple life.");
        System.out.print("Hi Mattie, how was school today? ");
        String answer = input.nextLine();

        //System.out.println("Debug: "+ (answer.contains("hear") || answer.contains("here")));

        while (answer.contains("hear") || answer.contains("here")) {
            System.out.print("What? ");
            answer = input.nextLine();
        }


        System.out.println("Ok, Glad you are home.");
    }
    
}