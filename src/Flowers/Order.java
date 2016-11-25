package Flowers;
import java.util.LinkedList;
import Flowers.Strategy.*;
import java.util.*;
/**
 * Created by Yasya on 22.11.16.
 */
public class Order {
    public LinkedList<Item> items = new LinkedList<Item>();
    public IPayment payment;
    public IDelivery delivery;

    public Order() {
        setPaymentStrategy(new PayPalPaymentStrategy());
        setDeliveryStrategy(new PostDeliveryStrategy());
    }

    public Order (IPayment p, IDelivery d, LinkedList<Item> i) {
        setPaymentStrategy(p);
        setDeliveryStrategy(d);
        items.addAll(i);
    }

    public void setPaymentStrategy(IPayment p) {
        payment = p;
    }
    public void setDeliveryStrategy(IDelivery d) {
        delivery = d;
    }
    public double calculateTotalPrice() {
        double price = 0;
        for(Item i : items) {
            price +=  i.price();
        }
        if (delivery == new DHLDeliveryStrategy()) {
            price += 20;
        }
        else {
            price += 10;
        }
        return price;
    }

    public void processOrder() {
        boolean b = false;
        while (b != true) {
            b = payment.pay(this.calculateTotalPrice());
        }

                String s = delivery.deliver(items);
            System.out.println("\nHere is your order!\n" + s);
    }

    public void addItem (Item i) {
        items.add(i);

    }

    public void removeItem(Item i) throws Exception {
        if (items.contains(i)) {
            items.remove(i);
        }
        else {
            throw new Exception("There is no such item\n");
        }

    }


}
