import java.util.ArrayList;

/**
 * Created by Yasya on 04.10.16.
 */
public class Main {

    public static void main(String [] args)
    {
        Flower peonyD = new Peony();
        Flower tupleD = new Tuple();
        Flower peony = new Peony("red",11,16,true);
        Flower tuple = new Tuple("red",11,16,false);
        ArrayList<Flower> arrF = new ArrayList<Flower>(4);
        arrF.add(peonyD);
        arrF.add(tuple);
        Boquet boquet = new Boquet(arrF);
        System.out.println(boquet.toString());
        boquet.addFlower(peony);
        boquet.addFlower(tupleD);
        System.out.println(boquet.toString());

        boquet.sortByPrice();
        System.out.println(boquet.toString());

        Flower f = boquet.findFlowerOfLen(11,11);
        System.out.println(f.toString());

        Store store = new Store();
        store.addFlower(peony,peonyD,tuple,tupleD);
        Boquet b = store.createBoquet();
        store.addBoquet(b);
        store.sellBoquet();

        store.showFlowers();
        store.showBoquets();





    }

}
