package level1;

import java.util.Arrays;
import java.util.List;

public class 자연수_뒤집어_배열_만들기 {
    public static int[] solution(long n) {

//        char[] charArray = Long.toString(n).toCharArray();
//        int[] answer = new int[charArray.length];
//
//        return answer;

        String str = "" + n;
        int[] answer = new int[str.length()];

        int count = 0;

        while (n > 0) {
            answer[count] = (int)(n%10);
            n /= 10;
            System.out.println(n);
            count++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(12345);

        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }
}
