package at.michaelkoenig.labor08.uebung3.filtercounter;

import at.michaelkoenig.labor08.uebung3.Counter;

public class MultiCounter extends FilterCounter {

    private int iterations;
    private int currIteration;

    public MultiCounter(Counter counter, int iterations) {
        super(counter);
        if (iterations <= 0)
            throw new IllegalArgumentException("iterations must be a positive integer");
        this.iterations = iterations;
    }

    @Override
    public int read() {
        return super.getCounter().read();
    }

    @Override
    public Counter tick() {
        if (currIteration + 1 == iterations) {
            super.getCounter().tick();
            currIteration = 0;
            return this;
        }
        currIteration++;
        return this;
    }
}
