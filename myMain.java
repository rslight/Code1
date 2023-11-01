/**
 * 
 * Robert lightfoot
 * CSCE 111
 * controls example
 * myMain
 */
public class myMain {
    public static void main(String[] args) {
        //controls c = new controls();
        
        System.out.println("Hi, from Main!");
        controls.beep();
        controls.sleep(5);
        controls.beep();
        System.out.println("Sorry, I was sleeping.");

        controls.sleep(2);
        controls.cls();
        System.out.println("Regular colored text.");
        controls.printRed();
        System.out.println("ERROR  red is to show ERROR");
        controls.resetPrint();
        System.out.println("no more red text.");
    }
    
}