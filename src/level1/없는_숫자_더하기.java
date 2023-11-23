package level1;

public class 없는_숫자_더하기 {

    public static int solution(int[] numbers) {

        int count = 1;

        int a = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            a += count++;
        }

        for (int i = 0; i < numbers.length; i++) {
            b += numbers[i];
        }

        return a - b;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,4,0,6,7,9};
        int solution = solution(arr);
        System.out.println("solution = " + solution);
    }
}
