package Flowers.Strategy;

import java.util.Scanner;

/**
 * Created by Yasya on 22.11.16.
 */
public interface IPayment {
    default boolean pay(double price) {
        System.out.println("Please,pay " + Double.toString(price));
        Scanner scan = new Scanner (System.in);
        double p = scan.nextDouble();
        if (p == price) {
            return true;
        }
        else {
            return false;
        }

    }

}
