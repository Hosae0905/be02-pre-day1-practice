package dataStructure.queue;


public class queueMain {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();
        System.out.println(queue.peek());

        System.out.println(queue.size());

        System.out.println(queue.pool());
        System.out.println(queue.pool());

        queue.display();
        System.out.println(queue.peek());
        System.out.println(queue.size());

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

    }
}
