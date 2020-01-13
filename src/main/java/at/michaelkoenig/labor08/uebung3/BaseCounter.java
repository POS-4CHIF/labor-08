package at.michaelkoenig.labor08.uebung3;

public class BaseCounter implements Counter {
    private int base;
    private int count = 0;

    public BaseCounter(int base) {
        if (base < 2 || base > 9)
            throw new IllegalArgumentException("Base must be within 2-9");
        this.base = base;
    }

    @Override
    public int read() {
        return Integer.parseInt(Integer.toString(count, base));
    }

    @Override
    public Counter tick() {
        count++;
        return this;
    }
}
