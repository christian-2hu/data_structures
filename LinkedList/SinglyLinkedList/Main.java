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
        System.out.println(list.pop_back());
        list.print();
        System.out.println(list.front());
        System.out.println(list.back());
        list.erase(2);
        list.print();
        list.add(1);
        list.add(3);
        list.push_front(3);
        list.print();
        list.remove_value(3);
        list.print();
        list.add(3);
        list.add(4);
        list.add(3);
        list.print();
        list.remove_value(3);
        list.print();
        list.push_back(11);
        list.print();
        list.remove_value(11);
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
        System.out.println(list.value_n_from_end(7));
    }
}
