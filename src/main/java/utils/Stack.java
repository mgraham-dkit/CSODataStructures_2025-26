package utils;

import java.util.EmptyStackException;

public class Stack<E> {
    private int size;
    private Node<E> head;

    public Stack(){
        this.size = 0;
        this.head = null;
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

    public boolean isEmpty(){
        return head == null;
    }

    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return head.data;
    }

    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        E popped = head.data;
        head = head.next;
        size--;

        return popped;
    }

    public void push(E elem){
        if(elem == null){
            throw new IllegalArgumentException("Null elements are not permitted in this Stack");
        }

        Node<E> newNode = new Node<E>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }
}
