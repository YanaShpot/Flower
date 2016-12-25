package Flowers.Observer;

/**
 * Created by Yasya on 25.12.16.
 */
public abstract class Observer<T> {
    protected Observable<T> subject;
    public abstract void update(T i);

}
