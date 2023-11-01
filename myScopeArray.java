/*
 * Robert Lightfoot
 * csce 111
 * Scope examples
 */
public class myScopeArray {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,6,8} ;
        int[] b = new int[]{5,10,15,20};

        //System.out.println("In main, before my Double add, a = " + a + " b = " + b);
        System.out.println("In the arrays, the values are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(" a = " + a[i] + " b = " + b[i]);
        }

        myDoubleAdd(a, b);

        //System.out.println("In main, after my Double add, a = " + a + " b = " + b);

        System.out.println("In the arrays after myDoubleAdd, the values are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(" a = " + a[i] + " b = " + b[i]);
        }

    }//end main

    // public static void myDoubleAdd(int a, int b) {
    //     a += a;
    //     b += b;

    //     System.out.println("In myDoubleAdd, a = " + a + " b = " + b);

    // }// end myDoubleAdd

    public static void myDoubleAdd(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] += a[i];
            b[i] += b[i];
    
        }
        System.out.println("In myDoubleAdd, a = " + a + " b = " + b);

    }// end myDoubleAdd
}
