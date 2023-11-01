/**
 * Robert Lightfoot
 * String class example
 * 
 * myString
 */
public class myString {

    /**
     * reverse is a fuction that takes a string and reverses it.
     * 
     * @param s the initial string
     * @return the string reversed
     */
    public static String reverse(String s){
        String r = "";
        for (int index = 0; index < s.length(); index++) {
            r = s.substring(index, index + 1) + r;
        }

        return r;
    }

    /**
     * allDigits is a function that looks at a string and returns true
     * if all the digits are integers, false otherwise.
     * 
     * @param s the original string
     * @return true or false
     */
    public static boolean allDigits(String s){
        return s.matches("^[0-9]*$");
    }

    /**
     * padLeft is a function that pads the string sent with the number of 0's in n.
     * 
     * @param s string needing padding
     * @param n number of zeros to pad 
     * @return
     */
    public static String padLeft(String s, int n){
        for (int index = 0; index < n; index++) {
           s = "0" + s;
        }
        return s;
    }
    
}