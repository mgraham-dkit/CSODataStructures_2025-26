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

    // todo: size()
    // todo: get()
    // todo: isEmpty()
    // todo: indexOf()
    // todo: clear()
    // todo: contains()
    // todo: set()
}
