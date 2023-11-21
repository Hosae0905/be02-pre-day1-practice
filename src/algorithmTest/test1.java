package algorithmTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test1 {
    public static int[] solution(int []arr) {

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {

            if (!queue.isEmpty()) {
                queue.peek();
            }
            queue.add(arr[i]);



            if(i == 0) {
                queue.add(arr[i]);
            } else {
                if (queue.peek() == arr[i]) {
                    queue.add(arr[i]);
                }
            }
        }

        int[] answer = new int[queue.size()];

        for(int i = 0; i < queue.size(); i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
