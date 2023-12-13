package algorithmTest.sort;

import java.util.ArrayList;
import java.util.Collections;

public class H_Index {
    public static int solution(int[] citations) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < citations.length; i++) {
            list.add(citations[i]);
        }

        list.sort(Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(0) == 0) {
                return 0;
            } else if (list.get(i) <= i) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 6, 1, 5 };
        int[] arr1 = { 0, 0, 0, 0, 0 };
        int solution = solution(arr);
        System.out.println("solution = " + solution);
    }
}
