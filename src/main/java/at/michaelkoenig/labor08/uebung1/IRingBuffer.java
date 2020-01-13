package at.michaelkoenig.labor08.uebung1;

public interface IRingBuffer<T> {
    /**
     * F¨ugt dem Ringpuffer das Element e hinzu
     *
     * @throws BufferFullException, wenn der Puffer voll ist
     */
    void add(T e) throws BufferFullException;
    /**
     * Liefert und entfernt jenes Element, das am l¨angsten im Ringpuffer
     * gespeichert ist
     *
     * @throws BufferEmptyException, wenn der Puffer leer ist
     */
    T get() throws BufferEmptyException;
    /**
     * liefert die Anzahl der aktuell im Ringpuffer gespeicherten Elemente
     */
    int elements();
}
