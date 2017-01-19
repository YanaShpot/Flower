package Flowers.Decorator;


import Flowers.Item;

/**
 * Created by Yasya on 22.11.16.
 */
abstract class ItemDecorator extends Item {
    protected Item itm;
    ItemDecorator(Item itmToDecorate) {
        this.itm = itmToDecorate;
    }

    public abstract String getDescription();

    public double price() {
        return itm.price();
    }

}
