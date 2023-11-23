package level1;

/**
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 *
 * ex) 주어진 수가 1이면 0, 작업을 500번 반복했는데 없으면 -1
 */


public class 콜라츠_추측 {
    public static int solution(int num) {

        int count = 0;
        long test = (long)num;

        if (test == 1) {
            return 0;
        }

        while (test > 1) {
            if (test % 2 == 0) {
                test /= 2;
                count++;
            } else if (test % 2 == 1) {
                test = (test * 3) + 1;
                count++;
            }
        }

        if (count >= 500) {
            return -1;
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        int solution = solution(626331);
        System.out.println(solution);
    }
}
