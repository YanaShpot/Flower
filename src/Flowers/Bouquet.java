package Flowers; /**
 * Created by Yasya on 04.10.16.
 */


import java.util.ArrayList;
import java.util.Iterator;


public class Bouquet extends Item {
    public ArrayList<Flower> arrOfF = new ArrayList<Flower>();



    public Bouquet() {
        arrOfF = new ArrayList<Flower>();
    };

    public Bouquet(ArrayList<Flower> arr) {

        arrOfF = (ArrayList<Flower>)arr.clone();
        //System.arraycopy(arr, 0, arrOfF, 0, size);


    }

    public  double getPrice() {
        double price = 0;
        for (Flower f : this.arrOfF) {
            price += f.getPrice();
        }
        return price;
    }

    public boolean isFresh() {
        boolean isF = true;
        for (Flower f : this.arrOfF) {
            isF = isF && f.getSpec().getFreshness();
        }
        return isF;

    }

    public double getLength() {
        double len = 0;
        for (Flower f : this.arrOfF) {
            len = Double.max(len, f.getSpec().getLen());
        }
        return len;

    }



    public Flower findFlowerOfLen(int fromL, int toL) {
        for ( Flower f : this.arrOfF){
            if(f.getSpec().getLen() <= toL && f.getSpec().getLen() >= fromL) {
                return f;

            }

        }
        return null;
    }

    public String toString() {
        String info = "Flowers` info:\n";
        for(Flower f : arrOfF) {
            info = info + f.toString();
        }
        info += "Flowers.Bouquet`s price: " + Double.toString(this.getPrice()) + " Length: "
                + Double.toString(this.getLength()) + " Freshness: " + Boolean.toString(this.isFresh()) + "\n";
        return info;
    }

    public void addFlowers(Flower...flowers) {
        for (Flower f : flowers) {
            arrOfF.add(f);

        }
    }

    /*public void sortByPrice(){

        for (int i = 0; i< arrOfF.size() - 1; ++i) {
            Flowers.Flower f1 = arrOfF.get(0);
            for (Flowers.Flower f2 : arrOfF.subList(1,arrOfF.size() - arrOfF.indexOf(f1))) {
                if (f1.getPrice() > f2.getPrice()) {
                    arrOfF.add(arrOfF.indexOf(f1),f2);
                    arrOfF.remove(f1);
                    f2 =
                }

            }
        }*/


    public Flower[] searchFlower(FlowerSpec searchSpec) {
        ArrayList<Flower> matchingFlowers= new ArrayList<Flower>();
        for (Iterator i = arrOfF.iterator(); i.hasNext(); ) {
            Flower f = (Flower)i.next();
            if (f.getSpec().matches(searchSpec))
                matchingFlowers.add(f);
        }
        Flower[] retmF = new Flower[matchingFlowers.size()];
        int i = 0;
        for (Flower f : matchingFlowers) {
            retmF[i] = f;
            i++;
        }
        return retmF;
    }

    public double price() {
        return this.getPrice();

    }
}



