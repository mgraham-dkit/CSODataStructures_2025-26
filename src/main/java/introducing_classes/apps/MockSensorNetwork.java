package introducing_classes.apps;

import introducing_classes.entities.SensorEvent;

import java.util.Random;

public class MockSensorNetwork {
    private static final Random randomGenerator = new Random();
    private static final String [] sources = {"sitting_room", "kitchen", "porch", "hall"};

    public static void displayEvents(SensorEvent [] events){
        for(SensorEvent event : events){
            System.out.println(event.format());
        }
    }

    public static SensorEvent generateEvent(){
        String id = "Event-"+Math.abs(randomGenerator.nextInt());
        String source = sources[randomGenerator.nextInt(sources.length)];
        String description = "Event occurred in " + source;
        double accuracy = randomGenerator.nextDouble();

        return new SensorEvent(id, source, description, accuracy);
    }

    public static SensorEvent getMostAccurate(SensorEvent[] events){
        double maxAccuracy = Double.MIN_VALUE;
        SensorEvent mostAccurate = null;

        for(SensorEvent event: events){
            if(event.getAccuracy() > maxAccuracy){
                maxAccuracy = event.getAccuracy();
                mostAccurate = event;
            }
        }

        return mostAccurate;
    }

    public static void main(String[] args) {
        SensorEvent[] events = generateRandomSensorEvents();
        System.out.println("-----------------------------");
        displayEvents(events);
        System.out.println("-----------------------------");

        System.out.println("Event with highest accuracy: ");
        System.out.println(getMostAccurate(events).format());

        System.gc();
    }

    private static SensorEvent[] generateRandomSensorEvents() {
        SensorEvent [] events = new SensorEvent[5];
        for (int i = 0; i < events.length; i++) {
            events[i] = generateEvent();
        }
        return events;
    }
}
