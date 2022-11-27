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
        list.pushFront(5);
        list.pushFront(4);
        list.pushFront(3);
        list.print();
        System.out.println(String.format("Size -> %s", list.size()));
        Integer removed = list.popFront();
        System.out.println(removed);
        list.print();
        System.out.println(String.format("Size -> %s", list.size()));
        System.out.println(list.popBack());
        list.print();
        System.out.println(list.getFront());
        System.out.println(list.getBack());
        list.erase(2);
        list.print();
        list.add(1);
        list.add(3);
        list.pushFront(3);
        list.print();
        list.remove(3);
        list.print();
        list.add(3);
        list.add(4);
        list.add(3);
        list.print();
        list.remove(3);
        list.print();
        list.pushBack(11);
        list.print();
        list.remove(11);
        list.print();
        //=======================//
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        list2.add("five");
        list2.add("six");
        list2.print();
        list2.insert(3, "three point nine");
        list2.print();
        //=====================//
        list.print();
        System.out.println(list.nFromEnd(7));
        list.erase(2);
        list.print();
        list.erase(5);
        list.print();
        System.out.println(list.getBack());
        list.add(6);
        list.print();
        list.remove(6);
        list.print();
        System.out.println(list.getBack());
        list2.erase(list2.size()-1);
        list2.print();
        list.add(56);
        list.print();
        list.reverse();
        list.print();
        System.out.println(list.getFront());
        System.out.println(list.getBack());
    }
}
