package LinkedList.SinglyLinkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    LinkedList(){}

    public int size() {
        return this.size;
    }
    public boolean empty() {
        return this.size == 0 ? true : false;
    }
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }
    public void push_back(T data) {
        this.add(data);
    }
    public T get(int index) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        Node<T> ptr = this.head;
        int count = 0;
        while(ptr != null) {
            if(index == count) {
                return ptr.data;
            }
            count++;
            ptr = ptr.next;
        }
        // returns null if it doesn't exists
        return null;
    }
    public T value_at(int index) {
        return this.get(index);
    }
    public void push_front(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    public T pop_front() {
        T removedItem = this.head.data;
        this.head = this.head.next;
        this.size--;
        return removedItem;
    }
    public T pop_back() {
        if(this.head == null)
            return null;
        var current = this.head;
        var newTail = current;
        while(current.next != null) {
            newTail = current;
            current = current.next;
        }
        this.tail = newTail;
        this.tail.next = null;
        this.size--;
        return current.data;
    }
    public T front() {
        return this.size != 0 ? this.head.data : null;
    }
    public T back() {
        return this.size != 0? this.tail.data : null;
    }
    // A simple(ugly) print method just to check if things are alright
    public void print() {
        System.out.print("[");
        Node<T> ptr = this.head;
        while(ptr.next != null) {
            System.out.print(String.format("%s, ", ptr.data));
            ptr = ptr.next;
        }
        System.out.println(String.format("%s]", ptr.data));
    }
}

class Node<T> {
    protected T data;
    protected Node<T> next;

    Node(T data) {
        this.data = data;
    }
}