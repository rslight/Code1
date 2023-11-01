/*
 * Robert lightfoot
 * CSCE 111
 * Stack example
 */
public class myStack {
    public static void main(String[] args) {
        theStack(1);
    }//end main

    public static void theStack(int i) {
        System.out.println("in the stack with " + i++);
        if (i > 3000) {
            System.out.println("out of the stack with " + i--);
            return;
        }
        theStack(i);
    }
}
