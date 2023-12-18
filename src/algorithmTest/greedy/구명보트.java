package algorithmTest.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 구명보트 {
    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int i = 0;
        for (int j = people.length - 1; i <= j; j--) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 70, 50, 80, 50 };
        int[] arr1 = { 70, 80, 50 };
        int solution = solution(arr1, 100);
        System.out.println("solution = " + solution);
    }
}
