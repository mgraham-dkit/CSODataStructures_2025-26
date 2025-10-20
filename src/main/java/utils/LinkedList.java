package utils;

public class LinkedList {
    private int size;
    private Node head;

    public LinkedList(){
        this.size = 0;
        this.head = null;
    }

    private static class Node{
        private Node next;
        private int data;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int index, int value){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Supplied index is outside boundary of list");
        }

        Node newNode = new Node(value);
        if(index == 0){
            newNode.next = head;
            head = newNode;
        }else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    // todo: size() -> return the size of the list
    // todo: get() -> take an index and return the value at that index in the list
    // todo: isEmpty() -> return a boolean indicating if the list is empty
    // todo: indexOf() -> take a number and return the index at which that number first appears
    // todo: clear() -> take nothing in and wipe the list of data
    // todo: contains() -> take a number and return true if the list contains the value, false otherwise
    // todo: set() -> take in an index at which to replace the current value and a new value with which to replace it
    //  . This should return the value originally found at the specified index
    // todo: deduplicate() -> should return a new list containing one instance of each value from current list
    // todo: join() -> should take in a second list and add its contents onto this list
    // todo: rotate() -> should take in the number of positions by which the list should be rotated. For example, if
    //  1 is supplied, it should take the final element from the list and move it to the start of the list
}
