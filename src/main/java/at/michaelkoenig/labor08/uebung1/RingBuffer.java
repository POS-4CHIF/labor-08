package at.michaelkoenig.labor08.uebung1;

import java.util.ArrayList;

public class RingBuffer<T> implements IRingBuffer<T> {
    private ArrayList<T> list;
    private int size;
    private int addIdx = 0;
    private int getIdx = 0;

    public RingBuffer(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be a positive integer");
        }
        this.list = new ArrayList<T>(size);
        this.size = size;

        for (int i = 0; i < size; i++) {
            list.add(null);
        }
    }

    public void add(T e) throws BufferFullException {
        if (this.elements() == size)
            throw new BufferFullException("Buffer is full");
        list.add(addIdx, e);
        this.incAddIdx();
    }

    public T get() throws BufferEmptyException {
        if (this.elements() == 0)
            throw new BufferEmptyException("Buffer is empty");
        T elem = list.remove(getIdx);
        this.incGetIdx();
        return elem;
    }

    public int elements() {
        return (int) list.stream().filter(e -> e != null).count();
    }

    private void incAddIdx() {
        addIdx = (addIdx + 1) % size;
    }

    private void incGetIdx() {
        getIdx = (getIdx + 1) % size;
    }

}
