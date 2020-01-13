package at.michaelkoenig.labor08.uebung3.filtercounter;

import at.michaelkoenig.labor08.uebung3.Counter;

public class PrintCounter extends FilterCounter {
    private char endl;

    public PrintCounter(Counter counter, char endl) {
        super(counter);
        if (counter == null)
            throw new IllegalArgumentException("Counter may not be null");
        this.endl = endl;
    }

    @Override
    public int read() {
        return super.getCounter().read();
    }

    @Override
    public Counter tick() {
        System.out.print(super.getCounter().read() + "" + endl);
        super.getCounter().tick();
        return this;
    }
}
