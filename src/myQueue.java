import java.util.LinkedList;

/**
 * Created by 3299779 on 27/09/2016.
 */
//Her har jeg brugt en LinkedList til at lave en implementation af en Queue:
public abstract class myQueue<E> implements myQueueInterface<E> {

    private LinkedList<E> list = new LinkedList<E>();
    private Object front = list.getFirst();

    public myQueue() {
    }

    public void myAdd(E e) {

        list.addLast(e);
    }

    public Object myRemove() {
        if (front == null) {
            throw new EmptyQueueException("Queue is empty yoyoyoyo");
        }
        return list.pollFirst();
    }

    public boolean myIsEmpty() {

        return list.isEmpty();
    }

    public Object myPeek() {
        return front;
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