package utils;

import java.util.EmptyStackException;

public class ListStack<E> extends ArrayList<E>{
    public ListStack(){
        super();
    }

    public void push(E elem){
        super.add(0, elem);
    }

    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return super.remove(0);
    }

    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return super.get(0);
    }

    public boolean isEmpty(){
        return super.size() == 0;
    }
}
