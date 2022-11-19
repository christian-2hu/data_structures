package arrays;

public class DynamicArray<T> {
    private int capacity;
    private int size = 0;
    private Object[] arr;

    /*
     * If no arguments are provided, then the capacity is 4 by default
     */
    public DynamicArray() {
        this.capacity = 4;
        this.arr = new Object[this.capacity];
    }
    /*
     * If there's an argumento for the constructor, then use it as the capacity
     */
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[this.capacity];
    }
    public void add(T value) {
        this.arr[this.size] = value;
        this.size++;
    }
    private void resize(int newCapacity) {
        Object[] new_array = new Object[newCapacity];
        for(int i = 0; i < this.size; i++) {
            new_array[i] = this.arr[i];
        }
        this.capacity = newCapacity;
        this.arr = new_array;
    }
}