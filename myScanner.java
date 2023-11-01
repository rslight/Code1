/*
 * Robert Lighfoot
 * CSCE 111
 * Scanner example
 */

import java.util.Scanner;

public class myScanner {
    public static void main(String[] args) {
        String myName;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        myName = input.nextLine();
        //mycomment
        System.out.println("\nHowdy \u00BD my name is " + myName + "!\n");
    }// end main
}// end class
