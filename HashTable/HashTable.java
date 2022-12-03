package HashTable;

public class HashTable<K, V> {
    private Object[] key;
    private Object[] value;
    private int capacity;
    private int size = 0;

    /*
     * If no arguments are provided, then the capacity is 4 by default
     */
    public HashTable() {
        this.capacity = 8;
        this.key = new Object[this.capacity];
        this.value = new Object[this.capacity];
    }
    /*
     * If there's an argument for the constructor, then use it as the capacity
     */
    public HashTable(int initialCapacity) {
        this.capacity = initialCapacity;
        this.key = new Object[this.capacity];
        this.value = new Object[this.capacity];
    }
    public void add(K key, V value) {
        int hash = this.hash(key);
        int temp = hash;
        // let's resize when it gets to 70% of the capacity
        if(this.size == Math.round(this.capacity * 0.70))
            this.resize(this.capacity * 2);
        do {
            if(this.key[temp] == null) {
                this.key[temp] = key;
                this.value[temp] = value;
                this.size++;
                return;
            }
            if(this.key[temp].equals(key)) {
                this.value[temp] = value;
                return;
            }
            temp = (temp + 1) % this.capacity;
        } while(temp != hash);
    }
    private int hash(K key) {
        return Math.abs(key.hashCode() % this.capacity);
    }
    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        Object[] tempKey = this.key;
        Object[] tempValue = this.value;
        this.key = new Object[newCapacity];
        this.value = new Object[newCapacity];
        this.capacity = newCapacity;
        this.size = 0;
        for(int i = 0; i < tempKey.length; i++) {
            if(tempKey[i] != null)
                this.add((K)tempKey[i], (V)tempValue[i]);
        }
    }
    // Just to check things inside
    public void print() {
        for(int i = 0; i < this.capacity; i++) {
            System.out.println(String.format("[%s] %s -> %s", i, this.key[i], this.value[i]));
        }
    }
    @SuppressWarnings("unchecked")
    public V get(K key) {
        int hash = this.hash(key);
        int count = this.capacity;
        while(count != 0) {
            if(this.key[hash] != null && this.key[hash].equals(key)) {
                return (V) this.value[hash];
            }
            hash = (hash + 1) % this.capacity;
            count--;
        }
        return null;
    }
}