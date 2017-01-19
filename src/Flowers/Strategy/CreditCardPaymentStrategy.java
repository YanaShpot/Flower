package Flowers.Strategy;

/**
 * Created by Yasya on 22.11.16.
 */
public class CreditCardPaymentStrategy implements IPayment {
    public boolean pay(double price) {
        System.out.println("***Payment through credit card***\n");
        return IPayment.super.pay(price);


    }

}
