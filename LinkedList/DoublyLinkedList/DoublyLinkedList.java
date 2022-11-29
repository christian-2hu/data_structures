package LinkedList.DoublyLinkedList;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    DoublyLinkedList(){}

    public int size() {
        return this.size;
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