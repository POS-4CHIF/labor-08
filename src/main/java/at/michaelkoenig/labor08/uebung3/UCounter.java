package at.michaelkoenig.labor08.uebung3;

public class UCounter implements Counter {
    private int count = 0;

    @Override
    public int read() {
        return count;
    }

    @Override
    public Counter tick() {
        count++;
        return this;
    }
}
