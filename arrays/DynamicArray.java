package arrays;

public class DynamicArray {
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
}