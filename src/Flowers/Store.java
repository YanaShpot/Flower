package Flowers; /**
 * Created by Yasya on 04.10.16.
 */


import Flowers.Strategy.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Store {
    public ArrayList<Flower> flowersInStore = new ArrayList<Flower>();
    public ArrayList<Bouquet> boquetsInStore = new ArrayList<Bouquet>();

    public Store(){}

    public Bouquet createBouquet() {
        Bouquet yourBouquet = new Bouquet();
        Scanner scan = new Scanner (System.in);
        System.out.println("Please, enter the amount of flowers:");

        int size = scan.nextInt();
        while(size!=0) {
            System.out.println("Please, choose the first flower:");
            showFlowers();

            int i = scan.nextInt();
            yourBouquet.addFlowers(flowersInStore.get(i));
            flowersInStore.remove(flowersInStore.get(i));
            size--;
        }
        return yourBouquet;
    }

    public void addFlower(Flower ... flowers) {
        for(Flower f : flowers) {
            flowersInStore.add(f);
        }
    }

    public void addBouquet(Bouquet... bouquets) {
        for(Bouquet b : bouquets) {
            boquetsInStore.add(b);
        }

    }


    public void showFlowers() {
        for(Flower f : flowersInStore) {
            System.out.print(f.toString());
        }

    }

    public void showBouquets() {
        System.out.println("Here the boquets from the store:");
        for(Bouquet b : boquetsInStore) {
            System.out.println(b.toString());
        }
    }

    public Bouquet chooseBouquet() {
        showBouquets();
        System.out.println("Which one would you like?");
        Scanner scan = new Scanner (System.in);
        int i = scan.nextInt();


        if(boquetsInStore.size()> i) {
            Bouquet yourBouquet = boquetsInStore.get(i);
            boquetsInStore.remove(yourBouquet);
            System.out.println("Here is your bouquet!\n" + yourBouquet.toString());

            return yourBouquet;
        }
        else {
            System.out.println("We don`t have such bouquet %C");
            return null;
        }
    }

    public Order makeOrder() {
        LinkedList<Item> items = new LinkedList<Item>();
        Scanner scan = new Scanner (System.in);
        boolean end = false;
        while (end != true) {
            Bouquet item = chooseBouquet();
            if (item != null) {
                items.add(item);
            }
            System.out.println("Would you like something else?");

            String answer = scan.next().toString();
            //answer.toLowerCase();
            if ("yes".compareTo(answer) != 0 ) {
                end = true;
            }

        }
        if (!items.isEmpty()) {
            System.out.println("Please, choose how to pay and deliver flowers:\nPayment:\n1\tcredit card\n2\tPayPal\nDelivery:\n1\tpost\n2\tDHL\n");
            int p = scan.nextInt();
            int d = scan.nextInt();
            IDelivery delivery = null;
            IPayment payment = null;
            switch(p) {
                case 1: payment = new CreditCardPaymentStrategy();
                    break;
                case 2: payment = new PayPalPaymentStrategy();
            }
            switch(d) {
                case 1: delivery = new PostDeliveryStrategy();
                    break;
                case 2: delivery = new DHLDeliveryStrategy();
                    break;
            }
            if (payment != null || delivery != null) {
                return new Order(payment,delivery,items);
            }
            return null;


        }
        return null;


    }





    }
