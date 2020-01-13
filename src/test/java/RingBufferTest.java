import at.michaelkoenig.labor08.uebung1.BufferFullException;
import at.michaelkoenig.labor08.uebung1.RingBuffer;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;

public class RingBufferTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor() {
        RingBuffer<Integer> r = new RingBuffer<>(-1);
    }

    @Test
    public void testAdd() {
        RingBuffer<Integer> r = new RingBuffer<>(3);
        r.add(1);
        r.add(2);
        assertEquals(2, r.elements());
    }

    @Test(expected = BufferFullException.class)
    public void testAddBufferFull() {
        RingBuffer<Integer> r = new RingBuffer<>(1);
        r.add(1);
        r.add(2);
    }

    @Test
    public void testAddGet() {
        RingBuffer<Integer> r = new RingBuffer<>(2);
        r.add(1);
        assertEquals(Integer.valueOf(1), r.get());
        r.add(2);
        assertEquals(Integer.valueOf(2), r.get());
        r.add(3);
        assertEquals(Integer.valueOf(3), r.get());
    }

    @Test
    public void testElements() {
        RingBuffer<Integer> r = new RingBuffer<>(2);
        r.add(1);
        assertEquals(1, r.elements());
        r.get();
        assertEquals(0, r.elements());
    }

}
