/**
 * Robert Lightfoot
 * CSCE 111
 * Array and loop examples
 * myArray
 */
public class myArray {
    public static void main(String[] args) {
        int myInt = 5;
        int[] myInts;
        myInts = new int[10];
        int[] myInts2 = new int[10];
        int[] myInts3 = new int[]{2,4,6,8,10};

        System.out.println("myInt = " + myInt);
        for (int i = 0; i < myInts.length; i++) {
            System.out.println("myInts = " + myInts[i]);
        }
        System.out.println("filling my Ints2");
        for (int i = 0; i < myInts2.length; i++) {
            myInts2[i] = 2 * i;
        }
        System.out.println("printing myInts2");
        for (int i = 0; i < myInts2.length; i++) {
            System.out.println(myInts2[i]);
        }
        //System.out.println("myInts2 at 10 is " + myInts2[10]);

        int sum = 0;
        myInts3[3] = 40;
        for (int i : myInts3) {
            System.out.println("MyInts3 is " + i);
            sum += i;
        }
        System.out.println("The sum of all myInt3's is " + sum);
    }
    
    
}