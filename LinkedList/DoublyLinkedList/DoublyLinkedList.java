package LinkedList.DoublyLinkedList;

public class DoublyLinkedList<T> {
    DoublyLinkedList(){}

}

class Node<T> {
    protected T data;
    protected Node<T> next;
    protected Node<T> previous;

    Node(T data) {
        this.data = data;
    }
}