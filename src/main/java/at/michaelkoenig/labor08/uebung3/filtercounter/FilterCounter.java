package at.michaelkoenig.labor08.uebung3.filtercounter;

import at.michaelkoenig.labor08.uebung3.Counter;

public abstract class FilterCounter implements Counter{
    private Counter counter;

    public FilterCounter(Counter counter) {
        this.counter = counter;
    }

    public Counter getCounter() {
        return counter;
    }

}
