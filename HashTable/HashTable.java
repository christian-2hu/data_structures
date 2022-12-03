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
}