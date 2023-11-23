package level1;

public class 음양_더하기 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                sum += absolutes[i];
            } else if (signs[i] == false) {
                sum -= absolutes[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] abs = {1, 2, 3};
        boolean[] signs = {false, false, true};

        System.out.println(solution(abs, signs));
    }
}
