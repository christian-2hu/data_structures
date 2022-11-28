package Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        System.out.println(queue.isEmpty());
        queue.enqueue("First request");
        queue.enqueue("Second request");
        queue.enqueue("Random value");
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}