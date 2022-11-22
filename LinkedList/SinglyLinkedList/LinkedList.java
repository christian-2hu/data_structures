package LinkedList.SinglyLinkedList;

public class LinkedList<T> {
    Node<T> head;
    int size = 0;

    LinkedList(){}

    public int size() {
        return size;
    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}