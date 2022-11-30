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
    public T getFront() {
        return this.size != 0 ? this.head.data : null;
    }
    public T getBack() {
        return this.size != 0 ? this.tail.data : null;
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
    protected Node<T> previous;

    Node(T data) {
        this.data = data;
    }
}