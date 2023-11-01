/**
 * Robert Lightfoot
 * Cube example
 * Cube
 */
public class Cube extends Square {
    public Cube() {
    }

    public Cube(double l, String name, String color) {
        this.l = l;
        this.name = name;
        this.color = color;

    }
    
    public double getVolume(){
        return l*l*l;
    }

    public double getSurfaceArea(){
        return 6 * getArea();
    }
}