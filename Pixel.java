/**
 * Robert Lightfoot
 * CSCE 111
 * Object demo
 * Pixel
 */
public class Pixel {
    int r;
    int g;
    int b;

    public Pixel(){
        //default Pixel, Black
        r = 0;
        g = 0;
        b = 0;
    }
    
    public Pixel(int r, int g, int b){
        // new pixel, with chosen color
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void setPixel(int r, int g, int b){
        // change pixel, with chosen color
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getRed(){
        return r;
    }

    public int getGreen(){
        return g;
    }

    public int getBlue(){
        return b;
    }

    public int getGray(){
        return (int)(r * 0.3) + (int)(g * 0.59) + (int)(b * 0.11);
    }

    public void setGray(){
        int gray = getGray();
        this.r = gray;
        this.g = gray;
        this.b = gray;
    }
}