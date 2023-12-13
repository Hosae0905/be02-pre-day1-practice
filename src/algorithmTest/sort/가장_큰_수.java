package algorithmTest.sort;

import java.util.Arrays;

public class 가장_큰_수 {
    public static String solution(int[] numbers) {
        /*String answer = "";
        String num = "";

        for(int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }

        char[] list = num.toCharArray();

        char max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
            answer += max;
        }*/

        String[] str = new String[numbers.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        if (str[0].equals("0")) {
            return "0";
        }

        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] num = {6, 10, 2};
        String solution = solution(num);
        System.out.println("solution = " + solution);

        int[] num1 = { 3, 30, 34, 5, 9 };
        String solution1 = solution(num1);
        System.out.println("solution1 = " + solution1);
    }
}
