package Flowers.Decorator;

import Flowers.Item;

/**
 * Created by Yasya on 22.11.16.
 */
public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item i){
        super(i);
    }
    public String getDescription() {
        return "Bouquet is decorated with paper\n";//Total price:" + Double.toString(this.getPrice());
    }

    public double price() {
        return this.itm.price() + 5;
    }

    public String toString() {
        return itm.toString() + getDescription();
    }

}
