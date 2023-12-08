package algorithmTest.stack;

import java.util.*;

public class 프로세스 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        /*Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }


        for (int i = 0; i < priorities.length; i++) {
            int max = queue.poll();
            if (max < queue.peek()) {
                queue.add(max);
                max = queue.poll();
            } else {
                queue.add(max);
                list.add(i);
            }
        }*/

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : priorities) {
            priorityQueue.add(num);
        }

        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == priorityQueue.peek()) {
                    priorityQueue.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,9,1,1,1 };
        int location = 0;
        int solution = solution(arr, location);
        System.out.println("solution = " + solution);
    }
}
