package introducing_classes.apps;

import utils.HashMap;

public class HashCollisions {
    public static void main(String[] args) {
        String value1 = "Teheran";
        String value2 = "Siblings";

        System.out.println("Hashcode of "  +value1 + " = " + value1.hashCode());
        System.out.println("Hashcode of "  +value2 + " = " + value2.hashCode());

        HashMap<String, String> map = new HashMap<>();
        map.put(value1, value1);
        map.put(value2, value2);

        String fakeKey = "no such key";
        String noMatch = map.get(fakeKey);
        System.out.println("Value for " + fakeKey + ": " + noMatch);

        String match = map.get(value1);
        System.out.println("Value for " + value1 + ": " + match);
    }
}
