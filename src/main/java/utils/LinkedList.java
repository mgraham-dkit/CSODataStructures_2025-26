package utils;

public class LinkedList {
    private int size;
    // Track the start of the list (so we know where data begins)
    private Node head;
    // Track the end of the list (so we can add new elements to the end more efficiently)
    private Node tail;

    public LinkedList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    private static class Node{
        private Node next;
        private int data;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int size(){
        return size;
    }

    public void add(int value){
        // Wrap the data to be added in a Node so it can be attached to the linked list chain
        Node newNode = new Node(value);
        // If the head is null, the list is empty
        if(head == null){
            // The first element in the list should be the new node
            head = newNode;
            // The last element in the list should ALSO be the new node
            tail = newNode;
        }else {
            // If the head is not null, update the tail to add after the end of the list
            // (set the end of the list to point to the new node)
            tail.next = newNode;
            // Now that the new node is the final element in the list,
            // update tail to point there
            tail = newNode;
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

    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Supplied index is outside boundary of list");
        }

        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }

        return current.data;
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
