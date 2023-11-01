/**
 * Robert Lightfoot
 * CSCE 111
 * 
 * myFor - for loop examples
 */
public class myFor {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print( i + " ");
        }
        System.out.println();

        // int i = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print( i + " ");
            count += i;
        }
        // System.out.println("The value of i is: " + i);
        System.out.println("\nThe value of the sum of i's is: " + count);

        for (int j = 3; j <= 30; j+=3){
            if (j >= 18) {
                break;
            }
            System.out.print( j + " ");

        }
        System.out.println();
    
        for (int j = 3; j <= 30; j+=3){
            if (j == 12  || j == 15) {
                continue;
            }
            System.out.print( j + " ");

        }
        System.out.println();  

        for (int j = 3; j <= 30; j+=3){
            if (j == 12  || j == 15) {
                j += 4;
            }
            System.out.print( j + " ");

        }
        System.out.println(); 
    }
}