package Flowers;
import Flowers.Decorator.*;
import Flowers.Strategy.CreditCardPaymentStrategy;
import Flowers.Strategy.IDelivery;
import Flowers.Strategy.PostDeliveryStrategy;

import java.util.ArrayList;
import java.util.LinkedList;

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
        bouquet.addFlowers(peony);
        Flower [] peonies = bouquet.searchFlower(new FlowerSpec("peony",FlowerColor.PINK,10,true));
        for (Flower p : peonies) {
            System.out.println(p.toString());
        }
        System.out.println(bouquet.getPrice());

        Item item = bouquet;
        item = new RibbonDecorator(item);
        System.out.println(item.getDescription());
        item = new PaperDecorator(item);
        System.out.println(item.getDescription());
        System.out.println(item.price());

        //System.out.println(bouquet.toString());

        LinkedList<Item> i = new LinkedList<Item>();
        i.add(item);
        System.out.println(i.getFirst().toString());
        CreditCardPaymentStrategy c = new CreditCardPaymentStrategy();
        PostDeliveryStrategy p = new PostDeliveryStrategy();
        Order o = new Order(c, p,i);
        o.processOrder();








    }

}
