package Stack;

public class Stack<T> {
    private int size = 0;
    private Node<T> head;

    Stack(){}

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    public T pop() {

    }
    public boolean isEmpty() {

    }
    public T peek() {

    }
    public int size() {

    }
}

class Node<T> {
    protected T data;
    protected Node<T> next;

    Node(T data) {
        this.data = data;
    }
}