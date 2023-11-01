/**
 * Robert Lightfoot
 * CSCE 111
 * Control examples
 * controls
 */
public class controls {

    public static void sleep(int s) {
        
        //System.out.println("Hi, how are you today?");
        // sleep
        try {
            Thread.sleep(s * 1000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Not sleepy.");
        }

        //System.out.println("Oh, a little tired.");
    }// end sleep

    public static void beep(){
        //beeps one time
        System.out.println("\007");
    }//end beep

    public static void cls(){
        //clears the screen on a mac or pc
        if(System.getProperty("os.name").contains("Mac")){
            System.out.println("\033[H\033[23");
        } else {
            try {
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("cls error.");
            }
        }
    }// end cls

    public static void printRed(){
        String  RED_TEXT = "\u001B[31m";
        System.out.println(RED_TEXT);
    }//end print red

    public static void resetPrint(){
        String RESET = "\u001B[0m";
        System.out.println(RESET);
    }//reset print color
}