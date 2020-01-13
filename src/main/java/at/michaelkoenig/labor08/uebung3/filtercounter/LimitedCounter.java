package at.michaelkoenig.labor08.uebung3.filtercounter;

import at.michaelkoenig.labor08.uebung3.Counter;

public class LimitedCounter extends FilterCounter  {
    private int limit;

    public LimitedCounter(Counter counter, int limit) {
        super(counter);
        if (limit < 0)
            throw new IllegalArgumentException("limit must not be negative");
        this.limit = limit;
    }

    @Override
    public int read() {
        return Math.min(super.getCounter().read(), limit);
    }

    @Override
    public Counter tick() {
        super.getCounter().tick();
        return this;
    }
}
