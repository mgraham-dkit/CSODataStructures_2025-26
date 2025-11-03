package utils;

public class ArrayList<E> {
    private Object [] data;
    private int size;

    public ArrayList(){
        data = new Object[16];
        size = 0;
    }

    public int size(){
        return size;
    }

    private void ensureCapacity(){
        if(size == data.length){
            Object [] temp = new Object[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            // OR
            //System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
    }

    public void add(E element){
        ensureCapacity();

        data[size] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E get(int pos){
        validatePosition(pos);

        return (E) data[pos];
    }

    private void validatePosition(int pos) {
        // Check that the specified position exists within the DATA (not just within the array)
        if(pos < 0 || pos >= size){
            // If it does not, throw an exception to indicate this
            throw new IndexOutOfBoundsException("Cannot access position outside boundaries of the list");
        }
    }

    private void validatePositionForInsert(int pos) {
        // Check that the specified position exists within the DATA (not just within the array)
        if(pos < 0 || pos > size){
            // If it does not, throw an exception to indicate this
            throw new IndexOutOfBoundsException("Cannot add at position outside boundaries of the list");
        }
    }

    @SuppressWarnings("unchecked")
    public E remove(int pos){
        // Confirm the specified position exists within the data
        validatePosition(pos);

        // SAVE value at original position
        E deleted = (E) data[pos];

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

    public int indexOf(E element){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E element){
        return indexOf(element) != -1;
    }

    public void clear(){
        data = new Object[data.length];
        size = 0;
    }

    public void add(int position, E element){
        validatePositionForInsert(position);

        ensureCapacity();

        for(int i = size; i > position; i--){
            data[i] = data[i-1];
        }

        data[position] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E set(int position, E element){
        validatePosition(position);

        E originalValue = (E) data[position];
        data[position] = element;

        return originalValue;
    }

    public boolean removeElement(E element){
        int pos = indexOf(element);
        if(pos == -1){
            return false;
        }

        remove(pos);
        return true;
    }

    public void join(ArrayList<E> other){
        // If there's not enough space in the array
        if(this.size + other.size > data.length){
            // Make a new array with enough space to hold all data in this internal array
            // and the other list's internal array
            Object [] tempData = new Object[data.length + other.data.length];
            // Copy the data from this internal array into the temporary array
            System.arraycopy(this.data, 0, tempData, 0, this.size);
            // Replace this list's internal array with the temporary one
            this.data = tempData;
        }
        // Copy everything from the other list into this one
        System.arraycopy(other.data, 0, this.data, this.size, other.size);
        // Increase count to reflect joined elements
        this.size = this.size + other.size;
    }
}






