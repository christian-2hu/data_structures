package LinkedList.DoublyLinkedList;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    DoublyLinkedList(){}

    public int size() {
        return this.size;
    }
    public boolean empty() {
        return this.size == 0 ? true : false;
    }
    public T get(int index) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        Node<T> ptr = this.head;
        for(int i = 0; i <= index; i++) {
            if(i == index) {
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
    }
    public void pushFront(T data) {
        if(this.head == null) {
            this.add(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        this.head.previous = newNode;
        newNode.next = this.head;
        this.head= newNode;
        this.size++;
    }
    public T popFront() {
        if(this.head == null)
            return null;
        T temp = this.head.data;
        this.head.next.previous = null;
        this.head = this.head.next;
        this.size--;
        return temp;
    }
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            newNode.previous = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }
    public T popBack() {
        if(this.head == null)
            return null;
        T temp = this.tail.data;
        this.tail.previous.next = null;
        this.tail = this.tail.previous;
        this.size--;
        return temp;
    }
    public T getFront() {
        return this.size != 0 ? this.head.data : null;
    }
    public T getBack() {
        return this.size != 0 ? this.tail.data : null;
    }
    public void insert(int index, T data) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        if(index == 0) {
            this.add(data);
            return;
        }
        Node<T> ptr = this.head;
        Node<T> newNode = new Node<>(data);
        for(int i = 0; i < index-1; i++) {
            ptr = ptr.next;
        }
        ptr.next.previous = newNode;
        newNode.next = ptr.next;
        newNode.previous = ptr;
        ptr.next = newNode;
        this.size++;
    }
    public void erase(int index) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        if(index == 0) {
            this.popFront();
            return;
        }
        if(index == this.size-1) {
            this.popBack();
            return;
        }
        Node<T> ptr = this.head;
        for(int i = 0; i < index-1; i++) {
            ptr = ptr.next;
        }
        ptr.next.next.previous = ptr;
        ptr.next = ptr.next.next;
        this.size--;
    }
    public T getNFromEnd(int n) {
        //System.out.println(this.tail.previous.previous.previous.previous);
        int position = 1;
        Node<T> ptr = this.tail;
        while(ptr != null) {
            if(position == n) {
                return ptr.data;
            }
            ptr = ptr.previous;
            position++;
        }
        return null;
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
    public void reversePrint() {
        System.out.print("[");
        Node<T> ptr = this.tail;
        while(ptr.previous != null) {
            System.out.print(String.format("%s, ", ptr.data));
            ptr = ptr.previous;
        }
        System.out.println(String.format("%s]", ptr.data));
    }
}

class Node<T> {
    protected T data;
    protected Node<T> next;
    protected Node<T> previous;

    Node(T data) {
        this.data = data;
    }
}