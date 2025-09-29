package utils;

public class DynamicArray {
    private int [] data;
    private int size;

    public DynamicArray(){
        data = new int[16];
        size = 0;
    }

    public int size(){
        return size;
    }

    private void ensureCapacity(){
        if(size == data.length){
            int [] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            // OR
            //System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
    }

    public void add(int element){
        ensureCapacity();

        data[size] = element;
        size++;
    }
}
