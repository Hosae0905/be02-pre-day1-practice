package algorithmTest.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {

        int count = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    count++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    count++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] lost = { 2, 4 };
        int[] reserve = { 1, 3, 5 };
//        int[] reserve = {3};

//        int[] lost = { 3 };
//        int[] reserve = { 1 };

        int solution = solution(5, lost, reserve);
        System.out.println("solution = " + solution);
    }
}
