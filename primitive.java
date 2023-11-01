/*
 * Robert Lightfoot
 * CSCE 111
 * Primitive example
 * 
 */
class primitive{
    public static void main(String[] args) {
        boolean does = true;
        String myName = "Robert";
        does = ( 5 > 9);
        System.out.println(does);
        char myChar = 'r';
        myChar++;
        System.out.printf("my character is %c and its ASCII value is %d\n\n",myChar,(int)myChar);
        byte myByte = 124;
        System.out.println("My byte value is: " + myByte);
        System.out.println("My byte value is: " + myByte++);
        System.out.println("My byte value is: " + myByte);
        myByte++;
        System.out.println("My byte value is: " + myByte);
        myByte++;
        System.out.println("My byte value is: " + myByte);
        myByte++;
        System.out.println("My byte value is: " + myByte);
        System.out.println("My byte value is: " + Math.abs(myByte));
        double myRand = Math.random();
        System.out.println("My random number is: " + myRand);
        int myDice = 1 + (int)(Math.random() * 6);
        System.out.println("My dice value is: " + myDice);

        System.out.println("my name is :" + myName);
        System.out.printf("my name is %d letters long.\n\n", myName.length());
        System.out.println("my nic-name is :" + myName.substring(0, 3));

        
    }
}