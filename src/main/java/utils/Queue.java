package utils;

import java.util.NoSuchElementException;

public class Queue<E> {
    private GenericLinkedList<E> queue;

    public Queue(){
        queue = new GenericLinkedList<E>();
    }

    public void add(E elem){
        queue.add(elem);
    }

    public E remove(){
        validateEmpty();

        return queue.remove(0);
    }

    private void validateEmpty() {
        if(isEmpty()){
            throw new NoSuchElementException("Cannot remove from empty Queue");
        }
    }

    public E element(){
        validateEmpty();

        return queue.get(0);
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.size() == 0;
    }
}
