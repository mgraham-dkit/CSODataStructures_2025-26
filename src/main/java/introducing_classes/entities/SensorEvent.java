package introducing_classes.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class SensorEvent {
    private String id;
    private LocalDateTime timestamp;
    private String source;
    private String description;
    private double accuracy;

    public SensorEvent(String id, LocalDateTime timestamp, String source, String description, double accuracy) {
        this.id = id;
        this.timestamp = timestamp;
        this.source = source;
        this.description = description;
        this.accuracy = accuracy;
    }

    public SensorEvent(String id, String source, String description, double accuracy) {
        this.id = id;
        this.timestamp = LocalDateTime.now();
        this.source = source;
        this.description = description;
        this.accuracy = accuracy;
    }

    public SensorEvent(String id, LocalDateTime timestamp, String source, double accuracy) {
        this.id = id;
        this.timestamp = timestamp;
        this.source = source;
        this.accuracy = accuracy;
        this.description = "N/A";
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getSource() {
        return source;
    }

    public String getDescription() {
        return description;
    }

    public double getAccuracy() {
        return accuracy;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof SensorEvent that)) return false;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "SensorEvent{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", source='" + source + '\'' +
                ", description='" + description + '\'' +
                ", accuracy=" + accuracy +
                '}';
    }

    public String format(){
        return (timestamp + ": " + id + " -> " + source + ": " + description + " (" + accuracy + ")");
    }
}