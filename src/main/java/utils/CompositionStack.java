package utils;

import java.util.EmptyStackException;

public class CompositionStack<E> {
    private ArrayList<E> stack;

    public CompositionStack(){
        stack = new ArrayList<E>();
    }

    public void push(E elem){
        stack.add(0, elem);
    }

    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack.remove(0);
    }

    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack.get(0);
    }

    public boolean isEmpty(){
        return stack.size() == 0;
    }
}
