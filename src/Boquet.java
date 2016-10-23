/**
 * Created by Yasya on 04.10.16.
 */

import java.util.ArrayList;




public class Boquet {
    public ArrayList<Flower> arrOfF = new ArrayList<Flower>();
    public int price;
    public int size ;
    public int length;
    public boolean isFresh = true;

    public Boquet() {};

    public Boquet(ArrayList<Flower> arr) {
        size = arr.size();
        arrOfF = (ArrayList<Flower>)arr.clone();
        //System.arraycopy(arr, 0, arrOfF, 0, size);
        for (int i = 0; i < size; ++i)
        {
            this.price += arrOfF.get(i).price;
            this.isFresh = isFresh && arrOfF.get(i).isFresh;
            length = Integer.max(length,arrOfF.get(i).length);
        }

    }
    public Flower findFlowerOfLen(int fromL, int toL) {
        for ( int i=0; i<arrOfF.size(); ++i){
            if(arrOfF.get(i).length<=toL && arrOfF.get(i).length>=fromL) {
                return arrOfF.get(i);

            }

        }
        return null;
    }

    public String toString() {
        String info = "Flowers` info:\n";
        for(Flower f : arrOfF) {
            info = info + f.toString();
        }
        info += "Boquet`s price: " + Integer.toString(price) + " Length: "
                + Integer.toString(length) + " Freshness: " + Boolean.toString(isFresh);
        return info;
    }

    public void addFlower(Flower ...flowers) {
        for (Flower f : flowers) {
            arrOfF.add(f);
            size += 1;
            length = Integer.max(length, f.length);
            isFresh = isFresh && f.isFresh;
            price += f.price;
        }
    }

    public void sortByPrice(){
        for (int i = 1; i < size; i ++) {
            Flower tmp = arrOfF.get(i);
            int j = i - 1;
            while (j >= 0 && (arrOfF.get(i).price < arrOfF.get(j).price)) {
                arrOfF.remove(i);
                arrOfF.add(i,arrOfF.get(j));
                j --;
            }
            arrOfF.remove(j+1);
            arrOfF.add(j+1,tmp);
        }
    }



    }


