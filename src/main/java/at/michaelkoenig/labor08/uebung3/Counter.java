package at.michaelkoenig.labor08.uebung3;

public interface Counter {
    /**
     * Liefert den aktuellen Zaehlerstand.
     *
     * @return aktueller Zaehlerstand.
     */
    int read();
    /**
     * Zaehlt weiter.
     *
     * @return dieser Zaehler.
     */
    Counter tick();
}

