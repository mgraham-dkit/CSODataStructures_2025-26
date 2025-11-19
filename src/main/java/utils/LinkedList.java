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
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
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
            if(head == null){
                tail = newNode;
            }
            head = newNode;
        }else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            if(current == tail){
                tail = newNode;
            }
        }

        size++;
    }

    public int get(int index){
        checkIndex(index);

        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }

        return current.data;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Supplied index is outside boundary of list");
        }
    }

    public int remove(int index){
        checkIndex(index);
        int removed = 0;
        if(index == 0){
            removed = head.data;
            head = head.next;
            if(head == null){
                tail = null;
            }
        }else{
            Node prev = head;
            Node current = head.next;
            for (int i = 1; i < index; i++) {
                prev = current;
                current = current.next;
            }
            removed = current.data;
            prev.next = current.next;
            if(current == tail){
                tail = prev;
            }
        }

        size--;
        return removed;
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
