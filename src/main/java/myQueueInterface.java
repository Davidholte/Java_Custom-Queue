package main.java;

/**
 * Created by 3299779 on 27/09/2016.
 */
public interface myQueueInterface<E> {

    void myAdd(E e);

    Object myRemove();

    boolean myIsEmpty();

    Object myPeek();

    int mySize();
}
