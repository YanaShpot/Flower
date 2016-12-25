package Flowers.Observer;
import Flowers.Item;
import Flowers.Order;
import Flowers.Peony;
import Flowers.Flower;
import Flowers.Bouquet;

import java.util.LinkedList;

/**
 * Created by Yasya on 25.12.16.
 */
public class PeonySupplierObserver extends Observer<LinkedList<Item>> {
    public PeonySupplierObserver(Observable subject) {
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
                    if(flower instanceof Peony) {
                        quantity += 1;
                    }
                }
            }
        }
        System.out.println("We will supply you with " + Integer.toString(quantity) + " peonies\n");
    }




}
