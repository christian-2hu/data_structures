package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        list.print();
        System.out.println(list.get(3));
    }
}