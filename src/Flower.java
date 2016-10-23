/**
 * Created by Yasya on 04.10.16.
 */
public class Flower {


    public int length = 10;
    public int price = 20;
    public boolean isFresh = true;
    public String colour;
    public Flower() {

    }

    public Flower(String c, int l, int p, boolean isF) {
        this.colour = c;
        this.length = l;
        this.price = p;
        this.isFresh = isF;

    }

    @Override
    public String toString() {
        return " Colour: " + colour + " Length: " + Integer.toString(length) + " Price: "
                + Integer.toString(price) + " Is Fresh: " + Boolean.toString(isFresh) + "\n";
    }




}
