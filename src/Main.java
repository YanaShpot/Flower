import java.util.ArrayList;

/**
 * Created by Yasya on 04.10.16.
 */
public class Main {

    public static void main(String [] args)
    {
        Flower peonyD = new Peony();
        Flower tulipD = new Tulip();
        Flower peony = new Peony();
        peony.setPrice(20);
        ArrayList<Flower> arrF = new ArrayList<Flower>(3);
        arrF.add(peonyD);
        arrF.add(tulipD);
        Bouquet bouquet = new Bouquet(arrF);
        bouquet.addFlower(peony);
        Flower [] peonies = bouquet.search(new FlowerSpec("peony",FlowerColor.PINK,10,true));
        for (Flower p : peonies) {
            System.out.println(p.toString());

        }






    }

}
