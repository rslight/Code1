/*
 * Robert Lightfoot
 * csce 111
 * Scope examples
 */
public class myScope {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("In main, before my Double add, a = " + a + " b = " + b);
    
        myDoubleAdd(a, b);

        System.out.println("In main, after my Double add, a = " + a + " b = " + b);

    }//end main

    public static void myDoubleAdd(int a, int b) {
        a += a;
        b += b;

        System.out.println("In myDoubleAdd, a = " + a + " b = " + b);

    }// end myDoubleAdd
}
