package Flowers.Strategy;
import Flowers.Item;
import java.util.LinkedList;

/**
 * Created by Yasya on 22.11.16.
 */
public class PostDeliveryStrategy implements IDelivery {
    public String deliver(LinkedList<Item> items) {
        System.out.println( "Delivering by post:\n");
        return IDelivery.super.deliver(items);

    }
}
