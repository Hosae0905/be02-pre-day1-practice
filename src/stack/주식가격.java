package stack;

import java.util.LinkedList;
import java.util.Queue;

public class 주식가격 {
    public static int[] solution(int[] prices) {

        Queue<Integer> queue = new LinkedList<>();

//        int count = 0;

        for (int i = 0; i < prices.length; i++) {
            queue.add(prices[i]);
        }

        int[] answer = new int[prices.length];
        int index = 0;
        while (!queue.isEmpty()) {
            int currentPrice = queue.poll();
            for (int i = (prices.length - queue.size()); i < prices.length; i++) {
                if (currentPrice > prices[i]) {
                    answer[index]++;
                    break;
                } else if (currentPrice <= prices[i]) {
                    answer[index]++;
                }
            }
            index++;
        }


        /*while (!queue.isEmpty()) {
            int first = queue.poll();
            for (int j = queue.size(); j > 0; j--) {
                int other = queue.poll();
                if (first <= other) {
                    count++;
                    queue.add(other);
                } else {
                    queue.add(other);
                }
            }
            answer[i] = count;
            count = 0;
            i++;
        }*/
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,2,3 };
        int[] solution = solution(arr);
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i]);
        }
    }
}
