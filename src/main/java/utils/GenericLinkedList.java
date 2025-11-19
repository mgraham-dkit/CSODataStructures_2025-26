package utils;

public class GenericLinkedList<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public GenericLinkedList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    private static class Node<E>{
        private Node<E> next;
        private E data;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    public int size(){
        return size;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Supplied index is outside boundary of list");
        }
    }

    public E get(int index){
        checkIndex(index);

        Node<E> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    public void add(E elem){
        Node<E> newNode = new Node<E>(elem);
        if(head == null){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void add(int index, E elem){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Supplied index is outside boundary of list");
        }
        if(index == size){
            add(elem);
            return;
        }

        Node<E> newNode = new Node<E>(elem);
        if(index == 0){
            newNode.next = head;
            if(head == null){
                tail = newNode;
            }
            head = newNode;
        }else {
            Node<E> current = head;
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

    public E remove(int index){
        checkIndex(index);
        E removed = null;
        if(index == 0){
            removed = head.data;
            head = head.next;
            if(head == null){
                tail = null;
            }
        }else{
            Node<E> prev = head;
            Node<E> current = head.next;
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
}
