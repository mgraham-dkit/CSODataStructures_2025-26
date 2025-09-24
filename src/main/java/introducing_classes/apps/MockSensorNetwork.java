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
        String id = "Event-"+randomGenerator.nextInt();
        String source = sources[randomGenerator.nextInt(sources.length)];
        String description = "Event occurred in " + source;
        double accuracy = randomGenerator.nextDouble();

        return new SensorEvent(id, source, description, accuracy);
    }

    public static void main(String[] args) {
        SensorEvent [] events = new SensorEvent[5];
        for (int i = 0; i < events.length; i++) {
            events[i] = generateEvent();
        }
        System.out.println("-----------------------------");
        displayEvents(events);
        System.out.println("-----------------------------");
    }
}
