package algorithmTest.stack;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());


        queue.add(1);
        queue.add(3);
        queue.add(7);
        queue.add(2);
        queue.add(5);
        queue.add(6);


        System.out.println(queue.toString());
    }
}
