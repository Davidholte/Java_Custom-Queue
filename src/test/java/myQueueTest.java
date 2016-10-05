package test.java;

import main.java.myQueue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 3299779 on 04/10/2016.
 */
public class myQueueTest {

    myQueue<Integer> queue = new myQueue<Integer>();

    @Before
    public void setUp() throws Exception {

        queue.myAdd(1);
        queue.myAdd(2);
        queue.myAdd(3);
        queue.myAdd(4);
        queue.myAdd(5);

    }

    @Test
    public void myAdd() throws Exception {
        assertEquals(queue.myPeek(), new Integer (1));
    }

    @Test
    public void myRemove() throws Exception {
        assertEquals(queue.myRemove(), new Integer (1));
    }

    @Test
    public void myIsEmpty() throws Exception {
        assertEquals(false, queue.myIsEmpty());
    }

    @Test
    public void myPeek() throws Exception {
        assertEquals(new Integer(1), queue.myPeek());
    }

    @Test
    public void mySize() throws Exception {
        assertEquals(5, queue.mySize());
    }

}