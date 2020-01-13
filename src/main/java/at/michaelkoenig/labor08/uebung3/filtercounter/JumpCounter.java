package at.michaelkoenig.labor08.uebung3.filtercounter;

import at.michaelkoenig.labor08.uebung3.Counter;

public class JumpCounter extends FilterCounter {
    private int step;

    public JumpCounter(Counter counter, int step) {
        super(counter);
        if (step <= 0)
            throw new IllegalArgumentException("step must be a positive integer");
        this.step = step;
    }

    @Override
    public int read() {
        return super.getCounter().read();
    }

    @Override
    public Counter tick() {
        for (int i = 0; i < step; i++) {
            super.getCounter().tick();
        }
        return this;
    }
}
