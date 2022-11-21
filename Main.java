import arrays.DynamicArray;

class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> arr = new DynamicArray<>();
        arr.add(10);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        System.out.println(String.format("Capacity -> %s", arr.capacity()));
        System.out.println(String.format("Size -> %s", arr.size()));
        arr.add(20);
        arr.add(21);
        System.out.println(String.format("Capacity -> %s", arr.capacity()));
        System.out.println(String.format("Size -> %s", arr.size()));
        arr.print();
        System.out.println(arr.get(5));
        arr.insert(1, 13);
        arr.print();
        arr.insert(arr.size()-1, 22);
        arr.print();
        System.out.println(String.format("Capacity -> %s", arr.capacity()));
        System.out.println(String.format("Size -> %s", arr.size()));
        arr.insert(0, 1);
        arr.print();
        arr.prepend(0);
        arr.print();
        Integer pop = arr.pop();
        System.out.println(pop);
        arr.print();
        System.out.println(String.format("Capacity -> %s", arr.capacity()));
        System.out.println(String.format("Size -> %s", arr.size()));
        arr.delete(0);
        arr.print();
        System.out.println(String.format("Capacity -> %s", arr.capacity()));
        System.out.println(String.format("Size -> %s", arr.size()));
        arr.add(1);
        arr.remove(1);
        arr.print();
        System.out.println(String.format("Capacity -> %s", arr.capacity()));
        System.out.println(String.format("Size -> %s", arr.size()));
        System.out.println(arr.find(22));
    }
}