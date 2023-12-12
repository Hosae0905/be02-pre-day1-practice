package algorithmTest.search;

import java.util.Stack;

public class 네트워크 {
    // {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}
    public static int solution(int n, int[][] computers) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        int[] computer;
        int count = 0;
        stack.push(n);      // 3

        while (!stack.isEmpty()) {
            int pop = stack.pop();      //
            computer = computers[pop];      // {0, 0, 1} --> {1, 1, 0}

            for (int i = 0; i < computer.length; i++) {
                if (computer[i] == 1) {
                    count++;
                    stack.push(computer[i]);
                }
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        int[][] test = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int n = 3;

        int solution = solution(n, test);
        System.out.println(solution);
    }
}
