package Flowers;
import Flowers.Decorator.*;
import Flowers.Strategy.CreditCardPaymentStrategy;
import Flowers.Strategy.DHLDeliveryStrategy;
import Flowers.Strategy.IDelivery;
import Flowers.Strategy.PostDeliveryStrategy;
import Flowers.Observer.*;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Yasya on 04.10.16.
 */
public class Main {

    public static void main(String [] args) throws Exception {
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

        /*LinkedList<Item> i = new LinkedList<Item>();
        i.add(item);

        CreditCardPaymentStrategy c = new CreditCardPaymentStrategy();
        PostDeliveryStrategy p = new PostDeliveryStrategy();
        Order o = new Order(c, p,i);
        o.processOrder();
        bouquet.addFlowers(new Peony(),new Tulip(),new Tulip(new FlowerSpec("tulip",FlowerColor.WHITE,10,true),10));
        o.addItem(bouquet);
        o.removeItem(item);
        o.setDeliveryStrategy(new DHLDeliveryStrategy());
        o.setPaymentStrategy(new CreditCardPaymentStrategy());
        o.processOrder();*/

        Order order = new Order();
        order.addItem(bouquet);
        new PeonySupplierObserver(order);
        new TulipSupplierObserver(order);
        order.processOrder();


       /* Store s = new Store();
        s.addBouquet(bouquet);
        Order o2= s.makeOrder();
        o2.processOrder();*/









    }

}
