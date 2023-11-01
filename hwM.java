/**
 * Robert Lightfoot
 * CSCE 111
 * hwM
 */
public class hwM {
    public static void main(String[] args) {
        int sides = 24;
        hw();
        System.out.println("You rolled a " + diceRoll());
        System.out.println("But I rolled a " + diceRoll(sides));
        System.out.println("Sides is " + sides);
    }// end main
    
    public static void hw() {
        System.out.println("Hello World!");
        return;
    }// end hw

    public static int diceRoll() {
        return 1 + (int)(Math.random() * 6);
    }// end diceRoll

    public static int diceRoll(int s) {
        //s = 6;
        return 1 + (int)(Math.random() * s);
    }// end diceRoll - multi sided

    public static double name() {
        return 0.0;
    }
}// end class