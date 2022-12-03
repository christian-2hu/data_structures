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
    // Just to check things inside
    public void print() {
        for(int i = 0; i < this.capacity; i++) {
            System.out.println(String.format("[%s] %s -> %s", i, this.key[i], this.value[i]));
        }
    }
}