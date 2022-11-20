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
    public void push(T value) {
        if(this.size == this.capacity)
            resize(this.capacity * 2);
        this.arr[this.size] = value;
        this.size++;
    }
    public void add(T value) {
        this.push(value);
    }
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        return (T) this.arr[index];
    }
    private void resize(int newCapacity) {
        Object[] new_array = new Object[newCapacity];
        for(int i = 0; i < this.size; i++) {
            new_array[i] = this.arr[i];
        }
        this.capacity = newCapacity;
        this.arr = new_array;
    }
    public int capacity() {
        return this.capacity;
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0 ? true : false;
    }
    // Quite ugly, but I just want to see the result in a fast way
    public void print() {
        String array = "";
        if(size == 0) {
            array = "[]";
            System.out.println(array);
            return;
        }
        array = "[";
        for(int i = 0; i <= this.size-1; i++) {
            if(i != this.size-1) {
                array = array + this.arr[i].toString() + ", ";
            } else {
                array = array + this.arr[i].toString();
            }
        }
        array = array + "]";
        System.out.println(array);
    }
}