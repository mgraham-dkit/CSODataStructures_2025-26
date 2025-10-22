package introducing_classes.apps;

import utils.LinkedList;

public class LinkedListTestBed {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        displayList(list);

        int removed = list.remove(0);
        System.out.println("Removed from index 0 (should be 0): " + removed);

        removed = list.remove(5);
        System.out.println("Removed from middle (index 5  - this should be 6): " + removed);

        removed = list.remove(list.size()-1);
        System.out.println("Removed from middle (index 7  - this should be 9): " + removed);

        System.out.println("Add new element to end of list (confirm tail is still accurately placed");
        list.add(list.size(), 100);
        displayList(list);

        System.out.println("Add new element to end of list (confirm tail is still accurately placed");
        list.add(list.size(), 200);
        displayList(list);
    }

    private static void displayList(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Value: " + list.get(i));
        }
    }

}
