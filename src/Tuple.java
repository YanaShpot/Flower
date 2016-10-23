/**
 * Created by Yasya on 23.10.16.
 */
public class Tuple extends Flower {
    public final String type = "tuple";
    public Tuple()
    {
        super("purple",12, 17, true);
        System.out.format("You've created a default %s\n", type);

    }
    public Tuple(String c, int l, int p, boolean isF){
        super(c,l,p,isF);

    }

    public String toString() {
        return "Type: "+ type + super.toString();
    }
}
