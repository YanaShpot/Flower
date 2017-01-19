package Flowers;

/**
 * Created by Yasya on 24.10.16.
 */
public class FlowerSpec {
    private String name = "just a flower";
    private int length = 10;
    private FlowerColor colour;
    private boolean isFresh = true;
    public FlowerSpec(String n,FlowerColor c, int l, boolean f) {
        name = n;
        colour = c;
        length = l;
        isFresh = f;
    }
    public int getLen() {
        return length;
    }
    public FlowerColor getCol(){
        return colour;
    }
    public String getName(){
        return name;
    }
    public boolean getFreshness() { return isFresh; }
    public boolean matches(FlowerSpec other) {
        if(name != other.name) {
            return false;
        }
        if(colour != other.colour) {
            return false;
        }
        if(length != other.length) {
            return false;
        }
        if (isFresh != other.isFresh) {
            return false;
        }
        return true;

    }
}
