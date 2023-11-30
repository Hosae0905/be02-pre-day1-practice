package stack;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        /*Queue<Integer> acrossQueue = new LinkedList<>();
        Queue<Integer> finishQueue = new LinkedList<>();
        int count = 0;

        int truckWeight = truck_weights[0];
        acrossQueue.add(truckWeight);

        while (!acrossQueue.isEmpty()) {
            int i = 1;
            if ((weight - acrossQueue.peek()) > truck_weights[i] && acrossQueue.size() < bridge_length) {    // 3 > 4
                acrossQueue.add(truck_weights[i]);
            } else if (acrossQueue.size() != bridge_length) {
                finishQueue.add(acrossQueue.poll());
                count++;
            }
            i++;
        }*/

        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int count = 0;

        for (int time : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.add(time);
                    sum += time;
                    count++;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    if (sum + time > weight) {
                        queue.add(0);
                        count++;
                    } else {
                        queue.add(time);
                        sum += time;
                        count++;
                        break;
                    }
                }
            }
        }
        return count + bridge_length;
    }

    public static void main(String[] args) {
        int[] arr = {10};
        int solution = solution(100, 100, arr);
        System.out.println("solution = " + solution);
    }
}
