package Flowers.Observer;
import Flowers.Order;

import java.util.ArrayList;

/**
 * Created by Yasya on 25.12.16.
 */
public class Observable<T> {
    private ArrayList<Observer> observers;
    private T items;
    public Observable() {
        observers = new ArrayList<>();
    }
    public Observable(T i) {
        items = i;
        observers = new ArrayList<>();
    }

    public T getState(){
        return this.items;
    }

    public void setState(T items){
        this.items = items;
        notifyAllobservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllobservers(){
        for(Observer observer: observers) {
            observer.update(items);
        }
    }

}
