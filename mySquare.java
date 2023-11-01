/**
 * Robert Lightfoot
 * Square class example
 * mySquare
 */
public class mySquare {
    public static void main(String[] args) {
        Square myRedSquare = new Square(2.0, "RS1", "Red");
        Square myBlueSquare = new Square(4.0, "BS2", "Blue");

        System.out.printf("I have %d squares, this one is called %s and it is %s.\n",
            myRedSquare.getInstance(), myRedSquare.getName(), myRedSquare.getColor());
        System.out.printf("I have %d squares, this one is called %s and it is %s.\n",
            myBlueSquare.getInstance(), myBlueSquare.getName(), myBlueSquare.getColor());

        // myBlueSquare.color = "Green";
        // myBlueSquare.instance = 1000;

        System.out.printf("I have %d squares, this one is called %s and it is %s.\n",
            myRedSquare.getInstance(), myRedSquare.getName(), myRedSquare.getColor());
        System.out.printf("I have %d squares, this one is called %s and it is %s.\n",
            myBlueSquare.getInstance(), myBlueSquare.getName(), myBlueSquare.getColor());


        Square myNewSquare = new Square();

        myNewSquare.copy(myBlueSquare);
        myNewSquare.setColor("Yellow");
        myNewSquare.setL(4.5);

        System.out.printf("I have %d squares, this one is called %s and it is %s.\n",
            myNewSquare.getInstance(), myNewSquare.getName(), myNewSquare.getColor());
        System.out.printf("I have %d squares, this one is called %s and it is %s.\n",
            myBlueSquare.getInstance(), myBlueSquare.getName(), myBlueSquare.getColor());  

        Cube myCube = new Cube(4.5, "cube 1", "Blue");

        System.out.println("my cube is " + myCube.getColor() + " the surface area is: " + 
            myCube.getSurfaceArea());
    }

 
    
}