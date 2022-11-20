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
    }
}