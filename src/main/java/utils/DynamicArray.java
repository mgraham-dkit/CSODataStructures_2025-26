package utils;

public class DynamicArray {
    private int [] data;
    private int size;

    public DynamicArray(){
        data = new int[16];
        size = 0;
    }

    private void ensureCapacity(){
        if(size == data.length){

        }
    }

    public void add(int element){
        ensureCapacity();

        data[size] = element;
        size++;
    }
}
