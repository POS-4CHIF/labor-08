package at.michaelkoenig.labor08.uebung3;

import at.michaelkoenig.labor08.uebung3.Counter;

import java.util.NoSuchElementException;

public class LoopCounter implements Counter {
    private int[] elements;
    private int idx;

    public LoopCounter(int... elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("No elements specified");
        }
        this.elements = elements;
    }

    @Override
    public int read() {
        int elem = elements[idx];
        return elem;
    }

    @Override
    public Counter tick() {
        idx = (idx + 1) % elements.length;
        return this;
    }
}
