package Flowers.Decorator;
import Flowers.Item;

/**
 * Created by Yasya on 22.11.16.
 */
public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item i){
        super(i);
    }
    public String getDescription() {
        return itm.getDescription() + "Flowers.Bouquet is in basket now\n";
    }

    public double price() {
        return this.itm.price() + 40;
    }

    public String toString() {
        return itm.toString() + getDescription();
    }

}
