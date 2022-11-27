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
    public void pushBack(T data) {
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
    public void pushFront(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    public T popFront() {
        T removedItem = this.head.data;
        this.head = this.head.next;
        this.size--;
        return removedItem;
    }
    public T popBack() {
        if(this.head == null)
            return null;
        Node<T> current = this.head;
        Node<T> newTail = current;
        while(current.next != null) {
            newTail = current;
            current = current.next;
        }
        this.tail = newTail;
        this.tail.next = null;
        this.size--;
        return current.data;
    }
    public T getFront() {
        return this.size != 0 ? this.head.data : null;
    }
    public T getBack() {
        return this.size != 0 ? this.tail.data : null;
    }
    public void erase(int index) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        Node<T> current = this.head;
        if(index == 0) {
            this.popFront();
            return;
        }
        if(index == this.size-1) {
            this.popBack();
            return;
        }
        for(int i = 0; i < index-1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        this.size--;
    }
    public void remove(T value) {
        Node<T> ptr = this.head;
        Node<T> nextPtr = ptr.next;
        // The while loop won't work for the first node so we'll check it first
        if(this.get(0).equals(value)) {
            this.popFront();
            return;
        }
        while(ptr.next != null) {
            if(nextPtr.data.equals(value)) {
                ptr.next = nextPtr.next;
                this.size--;
                break;
            }
            ptr = ptr.next;
            nextPtr = ptr.next;
        }
        // Update tail
        Node<T> newTail = this.head;
        while(newTail.next != null) {
            newTail = newTail.next;
        }
        this.tail = newTail;
        this.tail.next = null;
    }
    public void insert(int index, T value) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        if(index == 0) {
            this.pushFront(value);
            return;
        }
        Node<T> ptr = this.head;
        Node<T> nextPtr = ptr.next;
        Node<T> newValue = new Node<>(value);
        int counterNextPtr = 1;
        while(ptr.next != null) {
            if(counterNextPtr == index) {
                ptr.next = newValue;
                newValue.next = nextPtr;
                break;
            }
            ptr = ptr.next;
            nextPtr = ptr.next;
            counterNextPtr++;
        }
    }
    /**
     * @param n The position 
     * @return The value of the node at nth position from the end of the list
     */
    public T nFromEnd(int n) {
        int position = this.size;
        Node<T> ptr = this.head;
        while(ptr.next != null) {
            if(position == n) {
                return ptr.data;
            }
            ptr = ptr.next;
            position--;
        }
        return null;
    }
    public void reverse() {
        Node<T> prevPr = null;
        Node<T> ptr = this.head;
        Node<T> nextPtr = null;
        this.tail = ptr;
        while(ptr != null) {
            nextPtr = ptr.next;
            ptr.next = prevPr;
            prevPr = ptr;
            ptr = nextPtr;
        }
        this.head = prevPr;
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