package Flowers.Strategy;
import java.util.LinkedList;
import Flowers.Item;
/**
 * Created by Yasya on 22.11.16.
 */
public interface IDelivery {
    default String deliver(LinkedList<Item> items) {
        System.out.println("Delivering order ");
        int i = 0;
        while(i != 3
                ) {

            try {

                Thread.sleep(1000);

            }
            catch (InterruptedException ex)

            {

            }

            System.out.print(" .");
            i++;
        }
        System.out.print("\n");

        String s = "";
        for (Item it : items) {
            s += it.toString() + "\n";
        }
        return s;
    }
}