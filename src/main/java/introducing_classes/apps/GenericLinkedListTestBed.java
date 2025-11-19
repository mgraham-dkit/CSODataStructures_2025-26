package introducing_classes.apps;

import utils.GenericLinkedList;

public class GenericLinkedListTestBed {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        displayList(list);

        System.out.println("Add new element to end of list (confirm tail is still accurately placed)");
        list.add(list.size(), 100);
        displayList(list);

        System.out.println("Add new element to middle of list (confirm tail is still accurately placed)");
        list.add(list.size()/2, 200);
        displayList(list);

        System.out.println("Add new element to start of list");
        list.add(0, 500);
        displayList(list);

        System.out.println("Remove element from middle of list (currently: " + list.get(list.size()/2) + ")");
        list.remove(list.size()/2);
        displayList(list);
    }

    private static void displayList(GenericLinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Value: " + list.get(i));
        }
    }

}
