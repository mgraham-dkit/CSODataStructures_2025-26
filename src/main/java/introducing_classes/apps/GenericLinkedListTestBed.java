package introducing_classes.apps;

import utils.GenericLinkedList;

public class GenericLinkedListTestBed {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        displayList(list);

        System.out.println("Add new element to end of list (confirm tail is still accurately placed");
        list.add(list.size(), 100);
        displayList(list);

        System.out.println("Add new element to end of list (confirm tail is still accurately placed");
        list.add(list.size(), 200);
        displayList(list);
    }

    private static void displayList(GenericLinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Value: " + list.get(i));
        }
    }

}
