package Queue;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;
    Queue(){}

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if(this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }
    public T dequeue() {
        T removedItem = this.head.data;
        this.head = this.head.next;
        this.size--;
        return removedItem;
    }
    public boolean isEmpty() {
        return (this.size == 0) ? true : false;
    }
}

class Node<T> {
    protected T data;
    protected Node<T> next;

    Node(T data) {
        this.data = data;
    }
}