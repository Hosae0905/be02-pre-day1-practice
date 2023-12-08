package algorithmTest.sort;

public class 가장_큰_수 {
    public static String solution(int[] numbers) {
        String answer = "";
        String num = "";

        for(int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }

        char[] list = num.toCharArray();

        for (int i = 0; i < list.length; i++) {
            char max = list[i];
            for (int j = i; j < list.length; j++) {
                if (max < list[j] && max != list[j]) {
                    max = list[j];
                }
            }
            answer += max;
        }

        return answer;
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
