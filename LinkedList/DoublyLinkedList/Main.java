package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        System.out.println(String.format("Size -> %s", list.size()));
        System.out.println(list.empty());
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        list.print();
        System.out.println(String.format("First item is -> %s", list.get(0)));
        System.out.println(String.format("Last item is -> %s", list.get(list.size()-1)));
        list.pushFront(5);
        list.print();
        list.reversePrint();
        Integer pop = list.popFront();
        System.out.println(String.format("popFront = %s", pop));
        list.print();
        list.reversePrint();
        Integer popBack = list.popBack();
        System.out.println(String.format("popBack = %s", popBack));
        list.print();
        list.reversePrint();
        list.add(popBack);
        list.print();
        list.reversePrint();
        list.insert(1, 14);
        list.print();
        list.reversePrint();
    }
}