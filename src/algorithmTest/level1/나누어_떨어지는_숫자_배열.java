package algorithmTest.level1;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
    public static int[] solution(int[] arr, int divisor) {

        /*List<Integer> list = new ArrayList<>();
        int[] answer = {};

        // 1. 연산
        int i = 0;
        while (i < arr.length) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
            i++;
        }

        if (list.isEmpty()) {
            answer = new int[] {-1};
        }*/

        int count = 0;
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[number] = arr[i];
                number++;
            }
        }

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {3,2,6};
        int divisor = 10;

        int[] solution = solution(arr, divisor);

        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }
}
