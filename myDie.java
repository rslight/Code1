import javax.swing.JOptionPane;

/**
 * Robert Lightfoot
 * CSCE 111
 * example of JOptionPane
 */
public class myDie {
    public static void main(String[] args) {
        int sides = 24;
        int option = 0;
        int roll = 0;
        String output = "";
        // System.out.println("You rolled a " + diceRoll());
        // System.out.println("But I rolled a " + diceRoll(sides));
        
        do {
            roll = diceRoll();
            output = String.format("You rolled a %d \n Roll again?", roll);
            option = JOptionPane.showConfirmDialog(null, output,"Dice Roll", 
                JOptionPane.YES_NO_OPTION);
        } while (option == 0);
        JOptionPane.showMessageDialog(null, "Thanks for rolling!");
    }// end main
    


    public static int diceRoll() {
        return 1 + (int)(Math.random() * 6);
    }// end diceRoll

    public static int diceRoll(int s) {
        //s = 6;
        return 1 + (int)(Math.random() * s);
    }// end diceRoll - multi sided


}// end class