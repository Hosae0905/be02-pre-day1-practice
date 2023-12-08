package algorithmTest.level1;

public class 자릿수_더하기 {

    public static int solution(int num) {
        /*int answer = 0;

        int size = Arrays.asList(num).size();

        for (int i = 1; i <= size; i++) {
            answer += num / i;
            num %= i;
        }

        while (size > 0) {
            answer += num / 100;
            num = num % 100;

            size--;
        }
        return answer;*/

        int answer = 0;

        while (num > 0) {
            answer += num % 10;
            num /= 10;
        }

        return answer;
    }
    public static void main(String[] args) {
        int solution = solution(100000000);
        System.out.println(solution);
    }
}
