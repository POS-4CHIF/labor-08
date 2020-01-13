package at.michaelkoenig.labor08.uebung1;

public class BufferFullException extends RuntimeException {
    public BufferFullException() {
        super();
    }

    public BufferFullException(String message) {
        super(message);
    }
}
