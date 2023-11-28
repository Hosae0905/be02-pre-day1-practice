package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {

        /*Queue<Integer> proQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            proQueue.add(progresses[i]);
            speedQueue.add(speeds[i]);
        }

        Queue<Integer> countQueue = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < progresses.length; i++) {
            Integer pro = proQueue.poll();
            Integer speed = speedQueue.poll();

            while (pro < 100) {
                pro += speed;
                count++;
            }
            countQueue.add(count);
            count = 0;
        }

        for (int i = 0; i < countQueue.size(); i++) {
            Integer poll = countQueue.poll();
            Integer peek = countQueue.peek();
            if (poll > peek) {
                count++;
            }
        }*/

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int x = queue.poll();
        int count = 1;
        while (!queue.isEmpty()) {
            if (x >= queue.peek()) {
                count++;
                queue.poll();
            } else {
                list.add(count);
                count = 1;
                x = queue.poll();
            }
        }

        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] pro = {93, 30, 55};
        int[] speed = {1, 30, 5};

        int[] solution = solution(pro, speed);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }
}
