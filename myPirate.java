/**
 * Robert Lightfoot
 * CSCE 111
 * args example
 * myPirate
 */
public class myPirate {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java myPirate <words>");
            System.out.println("Where <words> are any words you want repated.");
        }
        for (String s : args) {
            System.out.println(s);
        }
        int myReturn = myMain(10);
        System.out.println(myMain(20) + " end of program.");
    }

    public static int myMain(int r) {
        return 6 + r;
    }
    
}