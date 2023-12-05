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
        int count = 0;      // 트럭이 다리를 지나간 시간

        for (int time : truck_weights) {        // 현재 트럭은 4대
            while (true) {
                if (queue.isEmpty()) {
                    queue.add(time);
                    sum += time;                // 처음 트럭이 다리를 건널 때(무게 7인 트럭)
                    count++;                    // 시간 + 1
                    break;
                } else if (queue.size() == bridge_length) {     // 현재 다리에 있는 트럭이 총 다리의 길이와 같을 때
                    sum -= queue.poll();        // 다리에서 트럭을 하나 빼주기
                } else {
                    if (sum + time > weight) {      // 다리를 건너고 있는 트럭과 다음 건너는 순서인 트럭의 무게를 합쳤을 때 다리가 견딜 수 있는 무게보다 클 경우
                        queue.add(0);               // 다리에 트럭을 올리지 않고 그냥 0을 추가
                        count++;                    // 시간 + 1
                    } else {
                        queue.add(time);            // 다리를 건너고 있는 트럭과 다음 건너는 순서인 트럭의 무게를 합쳤을 때 다리가 견딜 수 있는 무게보다 작을 경우
                        sum += time;                // 현재 다리를 건너고 있는 트럭의 무게에 새로 다리를 건너는 트럭의 무게를 더하기
                        count++;                    // 시간 + 1
                        break;
                    }
                }
            }
        }
        return count + bridge_length;           // 마지막으로 다리를 건너는 트럭은 다리의 길이 만큼 시간이 걸리기 때문에 더해준다.
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 6};
        int solution = solution(2, 10, arr);
        System.out.println("solution = " + solution);
    }
}
