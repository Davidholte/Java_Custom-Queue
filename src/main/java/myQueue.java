package main.java;

import java.util.LinkedList;

/**
 * Created by 3299779 on 27/09/2016.
 */
//Her har jeg brugt en LinkedList til at lave en implementation af en Queue:
public class myQueue<E> implements main.java.myQueueInterface<E> {

    private LinkedList<E> list = new LinkedList<E>();
    //private Object front = list.getFirst();

    public myQueue() {
    }

    public void myAdd(E e) {

        list.addLast(e);
    }

    public E myRemove() {
        if (list.getFirst() == null) {
            throw new EmptyQueueException("Queue is empty yoyoyoyo");
        }
        return list.removeFirst();
    }

    public boolean myIsEmpty() {

        return list.isEmpty();
    }

    public E myPeek() {
        return list.getFirst();
    }

    public int mySize() {
        return list.size();
    }
}

class EmptyQueueException extends RuntimeException {

    public EmptyQueueException() {
        this("Queue is empty yoooooo");
    }
    public EmptyQueueException(String exception) {
        super(exception);
    }
}