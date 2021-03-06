package Flowers;

/**
 * Created by Yasya on 23.10.16.
 */
public class Tulip extends Flower {
    public final static String type = "tulip";
    public Tulip()
    {
        super(new FlowerSpec("tulip",FlowerColor.PURPLE,12,true),17);
        //super("purple",12, 17, true);
        //System.out.format("You've created a default %s\n", type);
        System.out.format("You've created a default %s\n", super.getSpec().getName());

    }
    public Tulip(FlowerSpec s, double p) throws Exception {
        super(s,p);
        if ( s.getName() != "tulip" ) {
            throw new Exception("It's not a tulip!") ;
        }

    }

    public String getType() {
        return "It's a "+ type;
    }

    public String toString() {
        return "*" + super.toString();
    }
}
