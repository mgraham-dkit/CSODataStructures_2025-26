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

    public int get(int pos){
        validatePosition(pos);

        return data[pos];
    }

    private void validatePosition(int pos) {
        // Check that the specified position exists within the DATA (not just within the array)
        if(pos < 0 || pos >= size){
            // If it does not, throw an exception to indicate this
            throw new IndexOutOfBoundsException("Cannot access position outside boundaries of the list");
        }
    }

    public int remove(int pos){
        // Confirm the specified position exists within the data
        validatePosition(pos);

        // SAVE value at original position
        int deleted = data[pos];

        // SHIFT all data back in the array by one space
        for (int i = pos; i < size-1; i++) {
            data[i] = data[i+1];
        }

        // Replace (overwrite) the final space in the data with a "blank"
        data[size-1] = 0;
        // Decrease how many elements are in the array
        size--;

        // Return the value that was deleted from specified position in the array
        return deleted;
    }
}
