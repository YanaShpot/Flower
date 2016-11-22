/**
 * Created by Yasya on 04.10.16.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public ArrayList<Flower> flowersInStore = new ArrayList<Flower>();
    public ArrayList<Bouquet> boquetsInStore = new ArrayList<Bouquet>();

    public Store(){}

    public Bouquet createBoquet() {
        Bouquet yourBouquet = new Bouquet();
        Scanner scan = new Scanner (System.in);
        System.out.println("Please, enter the amount of flowers:");

        int size = scan.nextInt();
        while(size!=0) {
            System.out.println("Please, choose the first flower:");
            showFlowers();

            int i = scan.nextInt();
            yourBouquet.addFlower(flowersInStore.get(i));
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

    public void addBoquet(Bouquet... bouquets) {
        for(Bouquet b : bouquets) {
            boquetsInStore.add(b);
        }

    }


    public void showFlowers() {
        for(Flower f : flowersInStore) {
            System.out.print(f.toString());
        }

    }

    public void showBoquets() {
        System.out.println("Here the boquets from the store:");
        for(Bouquet b : boquetsInStore) {
            System.out.println(b.toString());
        }
    }

    public Bouquet sellBoquet() {
        showBoquets();
        System.out.println("Which one would you like?");
        Scanner scan = new Scanner (System.in);
        int i = scan.nextInt();


        if(boquetsInStore.size()> i) {
            Bouquet yourBouquet = boquetsInStore.get(i);
            boquetsInStore.remove(yourBouquet);
            System.out.println("Here is your boquet!\n" + yourBouquet.toString());

            return yourBouquet;
        }
        else {
            System.out.println("We don`t have such boquet %C");
            return null;
        }
    }





    }
