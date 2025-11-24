package utils;

public class HashMap <K, V>{
    private Object [] map = new Object[103];
    private int size;

    private int hashFunction(K key){
        validateNullKey(key);

        int calculatedSlot = key.hashCode();
        calculatedSlot = Math.abs(calculatedSlot);
        calculatedSlot = calculatedSlot % map.length;
        return calculatedSlot;
    }

    private void validateNullKey(K key) {
        if(key == null){
            throw new IllegalArgumentException("Key cannot be null");
        }
    }

    // todo: add
    @SuppressWarnings("unchecked")
    public V add(K key, V value){
        validateNullKey(key);

        int slot = hashFunction(key);

        if(map[slot] == null) {
            Entry<K, V> entry = new Entry<K, V>(key, value);
            map[slot] = entry;
            size++;
            return null;
        }

        Entry<K, V> currentEntry = (Entry<K, V>)map[slot];
        if(currentEntry.key.equals(key)){
            V oldValue = currentEntry.value;
            currentEntry.value = value;
            return oldValue;
        }else{
            throw new IllegalStateException("Collision detected. Cannot add key");
        }
    }

    // todo: remove
    // todo: get
    // todo: containsKey
    // todo: keys
    // todo: values
    // todo: size

    public int size(){
        return size;
    }


    private static class Entry<K, V>{
        private K key;
        private V value;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
