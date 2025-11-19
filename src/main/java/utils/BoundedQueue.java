package utils;

public class BoundedQueue<E> extends Queue<E> {
    private static final int DEFAULT_MAX = 10;
    private int capacity;

    public BoundedQueue(){
        capacity = DEFAULT_MAX;
    }

    public BoundedQueue(int maxSize){
        if(maxSize < 1){
            throw new IllegalArgumentException("Max queue size cannot be 0 or less");
        }
        this.capacity = maxSize;
    }

    public void add(E elem){
        if(size() == capacity){
            throw new IllegalStateException("Cannot add to a full queue");
        }
        add(elem);
    }
}
