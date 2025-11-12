package utils;

import introducing_classes.entities.SensorEvent;

import java.util.Random;

public class SensorEventGenerator {

    private static final Random randomGenerator = new Random();
    private static final String [] sources = {"sitting_room", "kitchen", "porch", "hall"};

    public static SensorEvent generateEvent(){
        String id = "Event-"+Math.abs(randomGenerator.nextInt());
        String source = sources[randomGenerator.nextInt(sources.length)];
        String description = "Event occurred in " + source;
        double accuracy = randomGenerator.nextDouble();

        return new SensorEvent(id, source, description, accuracy);
    }

    public static SensorEvent[] generateRandomSensorEvents() {
        SensorEvent [] events = new SensorEvent[5];
        for (int i = 0; i < events.length; i++) {
            events[i] = generateEvent();
        }
        return events;
    }
}
