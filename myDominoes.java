/**
 * Robert Lightfoot
 * CSCE 111
 * 
 * myDominoes
 */
public class myDominoes {

    public static void main(String[] args) {
        String[] dominoes = buildSet(6);

        System.out.println("New set order.");
        for (String d : dominoes) {
            System.out.println(d);
        }

        shuffleDominoes(dominoes);

        System.out.println("Shuffled set order.");

        for (String d : dominoes) {
            System.out.println(d);
        }


        int count = dominoes.length;
        int myRoll = myDie.diceRoll(count) - 1;
        int yourRoll = myDie.diceRoll(count) - 1;
        System.out.printf("You have %d dominoes and you rolled a %d.\n", count, myRoll);
        if (checkDouble(dominoes[myRoll])) {
            System.out.println("You got a double!");
        }
        System.out.printf("My dominoe is %s.\n", dominoes[myRoll]);
        if (checkDouble(dominoes[yourRoll])) {
            System.out.println("You got a double!");
        }        
        System.out.printf("Your dominoe is %s.\n", dominoes[yourRoll]);

    }//end main

    public static void shuffleDominoes(String[] d) {
        for (int i = 0; i < d.length; i++) {
            String first = d[i];
            int rand = (int)(Math.random() * d.length - i) + i;
            d[i] = d[rand];
            d[rand] = first;
        }

    }//end shuffleDominoes

    public static String[] buildSet() {
        int tiles = 28;
        int count = 0;
        String[] d = new String[tiles];

        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                //System.out.println(i + "-" + j);
                d[count++] = String.format(" %d-%d",i,j);
            }

        }

        return d;
    }// end buildSet

    public static String[] buildSet(int s) {
        int tiles = ((s * s + 3 * s + 2) / 2);
        int count = 0;
        String[] d = new String[tiles];

        for (int i = 0; i <= s; i++) {
            for (int j = i; j <= s; j++) {
                //System.out.println(i + "-" + j);
                d[count++] = String.format(" %d-%d",i,j);
            }

        }

        return d;
    }//end buildset
    
    
    public static boolean checkDouble(String d) {
        //System.out.println("IN check double, d is" + d);
        if (d.length() == 4) {
            return ((d.regionMatches(1,d,d.length()-1,1)));
           
        } else {
                   return ((d.regionMatches(1,d,d.length()-1,2)));
 
        }
    }// end checkDouble
}//end class