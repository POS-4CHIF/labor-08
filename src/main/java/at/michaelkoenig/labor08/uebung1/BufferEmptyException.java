package at.michaelkoenig.labor08.uebung1;

public class BufferEmptyException extends RuntimeException {
    public BufferEmptyException() {
        super();
    }

    public BufferEmptyException(String message) {
        super(message);
    }
}
