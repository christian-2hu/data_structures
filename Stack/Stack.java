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
        if(this.size == 0)
            throw new NullPointerException("The stack is empty!");
        T removedItem = this.head.data;
        this.head = this.head.next;
        this.size--;
        return removedItem;
    }
    public boolean isEmpty() {
        return this.size == 0 ? true : false;
    }
    public T peek() {
        if(this.size == 0)
            throw new NullPointerException("The stack is empty!");
        return this.head.data;
    }
    public int size() {
        return this.size;
    }
}

class Node<T> {
    protected T data;
    protected Node<T> next;

    Node(T data) {
        this.data = data;
    }
}