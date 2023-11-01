import java.util.Scanner;
/*
 * Robert Lightfoot
 * CSCE 111
 * scope examples
 * scope1
 */
 class scope1 {
    static final double PI = Math.PI;
    static final double TWO_PI = 2 * PI;
    static boolean debug = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter y for debug mode.");
        if(input.nextLine().equalsIgnoreCase("y")){
            debug = true;
        }
       System.out.println("Java's PI :" + Math.PI); 
       
       System.out.println("My PI : " + PI);
       System.out.println("2 pi is: " + TWO_PI);
       if (debug) {
        System.out.println("We are in debug mode.");
        int sum = 5 + 5;
        System.out.println("sum = " + sum);
       }
       int sum = 99 + 99;
       System.out.println("sum = " + sum);


    }
    
}