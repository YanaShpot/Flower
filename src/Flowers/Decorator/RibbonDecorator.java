package Flowers.Decorator;

import Flowers.Item;

/**
 * Created by Yasya on 22.11.16.
 */
public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item i){
        super(i);
    }
    public String getDescription() {
        return "Bouquet is decorated with ribbon\n";// Total price:" + Double.toString(this.getPrice());
    }

    public double price() {
        return this.itm.price() + 1;
    }

    public String toString() {
        return itm.toString() + getDescription();
    }
}
