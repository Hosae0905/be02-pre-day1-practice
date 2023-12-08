package algorithmTest.stack;

import java.util.Stack;

public class 같은_숫자는_싫어 {
    public static int[] solution(int []arr) {

        /*Queue<Integer> queue = new LinkedList<>();

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

        return answer;*/

        int[] answer;

        Stack<Integer> stack = new Stack<>();   // Integer 스택 생성

        for (int i = 0; i < arr.length; i++) {  // 입력값만큼 반복문을 돈다.
            if (i == 0) stack.push(arr[i]);     // 스택에 데이터 삽입
            else if (stack.peek() != arr[i]) stack.push(arr[i]);    // 최근에 삽입한 데이터가 현재 데이터와 다를 경우 삽입
        }

        answer = new int[stack.size()];     // 최종 스택의 사이즈만큼 배열을 초기화
        for (int i = stack.size() - 1; i >= 0; i--) {       // 스택의 사이즈만큼 반복문을 돌면서 배열에 데이터 삽입
            answer[i] = stack.pop();
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
