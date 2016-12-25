package Flowers.Observer;

import Flowers.Bouquet;
import Flowers.Flower;
import Flowers.Item;
import Flowers.Tulip;

import java.util.LinkedList;

/**
 * Created by Yasya on 25.12.16.
 */
public class TulipSupplierObserver extends Observer<LinkedList<Item>> {
    public TulipSupplierObserver(Observable subject) {
        this.subject = subject;
        this.subject.attach(this);

    }
    @Override
    public void update(LinkedList<Item> order){
        int quantity = 0;
        Bouquet bouquet = new Bouquet();
        for(Item item: order) {
            if (item.getClass() == new Bouquet().getClass()) {
                bouquet = (Bouquet) item;
                for(Flower flower : bouquet.arrOfF){
                    if(flower instanceof Tulip) {
                        quantity += 1;
                    }
                }
            }
        }
        System.out.println("We will supply you with " + Integer.toString(quantity) + " tulips\n");
    }

}
