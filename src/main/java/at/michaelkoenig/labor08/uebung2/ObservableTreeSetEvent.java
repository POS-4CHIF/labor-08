package at.michaelkoenig.labor08.uebung2;

import java.time.LocalDateTime;

public class ObservableTreeSetEvent {
    private ObservableTreeSet source;
    private LocalDateTime timestamp;
    private String message;

    public ObservableTreeSetEvent(ObservableTreeSet source, LocalDateTime timestamp, String message) {
        this.source = source;
        this.timestamp = timestamp;
        this.message = message;
    }

    public ObservableTreeSet getSource() {
        return source;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }
}
