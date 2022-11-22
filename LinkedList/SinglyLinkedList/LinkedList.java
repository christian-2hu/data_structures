package LinkedList.SinglyLinkedList;

public class LinkedList<T> {
    Node<T> head;
    int size = 0;

    LinkedList(){}

    public int size() {
        return size;
    }
    public boolean empty() {
        return size == 0 ? true : false;
    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}