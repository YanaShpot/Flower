package Flowers.Strategy;

import Flowers.Item;

import java.util.LinkedList;

/**
 * Created by Yasya on 22.11.16.
 */
public class DHLDeliveryStrategy implements IDelivery {
    public String deliver(LinkedList<Item> items) {
        System.out.println( "Delivering by DHL:\n");
        return IDelivery.super.deliver(items);
    }
}
