package utils;

public class HashMap <K, V>{
    private ArrayList<Entry<K, V>> [] map = new ArrayList[103];
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

    @SuppressWarnings("unchecked")
    public V put(K key, V value){
        validateNullKey(key);

        int slot = hashFunction(key);

        if(map[slot] == null) {
            ArrayList<Entry<K, V>> newList = new ArrayList<>();
            map[slot] = newList;
            Entry<K, V> entry = new Entry<K, V>(key, value);
            newList.add(entry);
            size++;
            return null;
        }

        Entry<K, V> newEntry = new Entry<>(key, value);
        int index = map[slot].indexOf(newEntry);
        if(index == -1){
            map[slot].add(newEntry);
            size++;
            return null;
        }else{
            Entry<K, V> oldEntry = map[slot].get(index);
            V oldValue = oldEntry.value;
            oldEntry.value = value;
            return oldValue;
        }

    }

    @SuppressWarnings("unchecked")
    public V get(K key){
        validateNullKey(key);

        int slot = hashFunction(key);
        return (V) map[slot];
    }

    // todo: remove
    // todo: containsKey
    // todo: keys
    // todo: values

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

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            Entry<?, ?> entry = (Entry<?, ?>) o;
            return key.equals(entry.key);
        }

        @Override
        public int hashCode() {
            return key.hashCode();
        }
    }
}
