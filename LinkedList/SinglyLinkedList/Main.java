package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(String.format("Size -> %s", list.size()));
        list.print();
        System.out.println(list.get(2));
        list.push_front(5);
        list.push_front(4);
        list.push_front(3);
        list.print();
        System.out.println(String.format("Size -> %s", list.size()));
        Integer removed = list.pop_front();
        System.out.println(removed);
        list.print();
        System.out.println(String.format("Size -> %s", list.size()));
    }
}