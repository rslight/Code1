/**
 * Robert Lightfoot
 * CSCE 111
 * loop examples
 * myLoop
 */
public class myLoop {
    public static void main(String[] args) {
        int i = 5;
        int j;

        for ( j = 5; j < 10; j++) {
            if (j == 7) {
                continue;
            }
            
            System.out.println("Howdy?");
            System.out.println("j is " + j);
        }

        while (i < 10) {
            i++;
            if (i == 7) {
                continue;
            }
            
            System.out.println("Howdy");
            System.out.println("i is " + i);
        }

        do {
            if (i == 10) {
                break;
            }
            i++;
            System.out.println("Howdy!");
            System.out.println("i is " + i);
        } while (i < 10);
            
        

        System.out.println("Out of all loops.");
    }
    
}