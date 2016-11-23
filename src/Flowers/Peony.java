package Flowers;

/**
 * Created by Yasya on 23.10.16.
 */
public class Peony extends Flower
{
    public final static String type = "peony";

    public Peony()
    {
        super(new FlowerSpec("peony",FlowerColor.PINK,10,true),15);
        //super("pink",10, 15, true);
        //System.out.format("You've created a default %s\n",this.type);
        System.out.format("You've created a default %s\n", this.getSpec().getName());

    }
    public Peony(FlowerSpec s, double d){
        super(s,d);



    }



    public String toString() {
        return "**" + super.toString();
    }


    public String getType() {
        return "It's a "+ type;
    }

}
