 /*
  * Robert Lightfoot
  * CSCE 111
  * Choice example
  */
 
  public class myChoice {
    public static void main(String[] args) {
        int x, y, a, z;
        double xx = 3.0;
        double aa;
        x = 5;
        y = 10;
        z = 0;
        a = x + y;
        aa = x + y;
        System.out.println("My answer is " + aa);
        boolean b;
        // b = (5 < 5);
        // System.out.println("This is " + b);
        //a = x / z;
        if (x > y  && a < 10 / z) {
           System.out.println("Inside if");
           System.out.println("This should print if true");
           System.exit(0);
        } 
        System.out.println("outside the if");

        String myName = "Rob";
        myName = myName + "ert";

        System.out.println(myName.equals("Robert"));
        System.out.println(myName);
    }
  }