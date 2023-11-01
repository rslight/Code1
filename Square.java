/**
 * Robert Lightfoot
 * Square class example
 * Square
 */
public class Square {
     double l;
     String color;
     String name;
    private static int instance = 0;

    public Square() {
       l = 1.0;
       instance++;
       name = "Square - " + instance;
       color = "";
    }
    
    public Square(double l) {
        this.l = l;
        name = "Square - " + instance;
        instance++;
        color = "";
    }

    public Square(double l, String name, String color) {
        this.l = l;
        this.name = name;
        this.color = color;
        instance++;

    }

    public void copy(Square s){
        this.color = s.color;
        this.l = s.l;
        this.name = s.name;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public double getL() {
        return l;
    }

    public double getArea(){
        return l * l;
    }
}
