package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        System.out.println(String.format("Size -> %s", list.size()));
        System.out.println(list.empty());
        list.add(10);
        list.add(15);
        list.print();
    }
}