package LinkedList.SinglyLinkedList;

public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;

    LinkedList(){}

    public int size() {
        return size;
    }
    public boolean empty() {
        return size == 0 ? true : false;
    }
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            this.head = newNode;
            this.size++;
        } else {
            Node<T> ptr = this.head;
            while(ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
            this.size++;
        }
    }
    public void push_back(T data) {
        this.add(data);
    }
    public T get(int index) {
        if(index < 0 | index >= this.size)
            throw new IndexOutOfBoundsException(String.format("Size: %s, Index: %s", this.size, index));
        Node<T> ptr = this.head;
        int count = 0;
        while(ptr.next != null) {
            if(index == count) {
                return ptr.data;
            }
            count++;
            ptr = ptr.next;
        }
        // returns null if it doesn't exists
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
}

class Node<T> {
    protected T data;
    protected Node<T> next;

    Node(T data) {
        this.data = data;
    }
}