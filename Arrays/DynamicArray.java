package Arrays;

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
    public int size() {
        return this.size;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public boolean isEmpty() {
        return this.size == 0 ? true : false;
    }
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        return (T) this.arr[index];
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
    public void insert(int index, T value) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        if(this.size == this.capacity)
            resize(this.capacity*2);
        
        this.size++;
        for(int i = this.size-1; i > index; i--) {
            this.arr[i] = this.arr[i-1];
        }
        this.arr[index] = value;
    }
    public void prepend(T value) {
        this.insert(0, value);
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        T lastItem = (T) this.arr[this.size-1];
        this.size--;
        // when popping an item, if size is 1/4 of capacity, resize to half 
        if((this.capacity/4) == this.size)
            this.resize(this.capacity/2);
        return lastItem;
    }
    public void delete(int index) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        // O(1) to add/delete at end 
        if(index == this.size-1) {
            this.pop();
            return;
        }
        for(int i = index; i < this.size; i++) {
            if(i == this.size-1)
                break;
            this.arr[i] = this.arr[i+1];
        }
        // when deleting an item, if size is 1/4 of capacity, resize to half 
        if((this.capacity/4) == this.size)
            this.resize(this.capacity/2);
        this.size--;
    }
    public void remove(T value) {
        int counter = 0;
        for(int i = 0; i < this.size; i++) {
            if(this.arr[i] != value) {
                this.arr[counter] = this.arr[i];
                counter++;
            }
        }
        this.size = counter;
        // when removing an item, if size is less or equals to 1/4 of capacity, resize to half 
        if(this.size <= (this.capacity/4))
            this.resize(this.capacity/2);
    }
    public int find(T value) {
        for(int i = 0; i < this.size; i++) {
            if(this.arr[i].equals(value))
                return i;
        }
        return -1;
    }
    private void resize(int newCapacity) {
        Object[] new_array = new Object[newCapacity];
        for(int i = 0; i < this.size; i++) {
            new_array[i] = this.arr[i];
        }
        this.capacity = newCapacity;
        this.arr = new_array;
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
            } else if(this.arr[i] == null) {
                array = array + "NULL";
            } else {
                array = array + this.arr[i].toString();
            }
        }
        array = array + "]";
        System.out.println(array);
    }
}