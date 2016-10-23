/**
 * Created by Yasya on 23.10.16.
 */
public class Peony extends Flower
{
    public final String type = "peony";

    public Peony()
    {
        super("pink",10, 15, true);
        System.out.format("You've created a default %s\n",this.type);

    }
    public Peony(String c, int l, int p, boolean isF){
        super(c,l,p,isF);



    }

    public String toString() {
        return "Type: "+ type + super.toString();
    }

}
