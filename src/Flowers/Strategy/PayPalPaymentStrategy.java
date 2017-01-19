package Flowers.Strategy;

import java.util.Scanner;

/**
 * Created by Yasya on 22.11.16.
 */
public class PayPalPaymentStrategy implements IPayment {
    public boolean pay(double price) {
        System.out.println("***Payment through PayPal***\n");
        return IPayment.super.pay(price);


    }
}
