/**
 * Created by Yasya on 04.10.16.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public ArrayList<Flower> flowersInStore = new ArrayList<Flower>();
    public ArrayList<Boquet> boquetsInStore = new ArrayList<Boquet>();

    public Store(){}

    public Boquet createBoquet() {
        Boquet yourBoquet = new Boquet();
        Scanner scan = new Scanner (System.in);
        System.out.println("Please, enter the amount of flowers:");

        int size = scan.nextInt();
        while(size!=0) {
            System.out.println("Please, choose the first flower:");
            showFlowers();

            int i = scan.nextInt();
            yourBoquet.addFlower(flowersInStore.get(i));
            flowersInStore.remove(flowersInStore.get(i));
            size--;
        }
        return yourBoquet;
    }

    public void addFlower(Flower ... flowers) {
        for(Flower f : flowers) {
            flowersInStore.add(f);
        }
    }

    public void addBoquet(Boquet ... boquets) {
        for(Boquet b : boquets ) {
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
        for(Boquet b : boquetsInStore) {
            System.out.println(b.toString());
        }
    }

    public Boquet sellBoquet() {
        showBoquets();
        System.out.println("Which one would you like?");
        Scanner scan = new Scanner (System.in);
        int i = scan.nextInt();


        if(boquetsInStore.size()> i) {
            Boquet yourBoquet = boquetsInStore.get(i);
            boquetsInStore.remove(yourBoquet);
            System.out.println("Here is your boquet!\n" + yourBoquet.toString());

            return yourBoquet;
        }
        else {
            System.out.println("We don`t have such boquet %C");
            return null;
        }
    }



    }
