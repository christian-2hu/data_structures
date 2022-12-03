package HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer, String> hTable = new HashTable<>();
        hTable.add(10, "Bob");
        hTable.add(15, "Jane");
        hTable.add(20, "Jana");
        hTable.add(25, "Maria");
        hTable.add(30, "Clara");
        hTable.add(35, "John");
        hTable.add(40, "Chris");
        hTable.add(45, "Nana");
        hTable.print(); 
        System.out.println(hTable.get(45));
        System.out.println(hTable.exists(45));
        System.out.println(hTable.exists(50));
    }
}
