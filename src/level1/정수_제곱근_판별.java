package level1;

public class 정수_제곱근_판별 {
    public static long solution(long n) {

        long answer = 0;

//        double sqrt = Math.sqrt(n);
//        if (sqrt) {
//            sqrt++;
//        } else {
//            return -1;
//        }
//
//        long answer = (long) Math.pow(sqrt, 2);

//        while (n > 0) {
//            for (int i = 1; i < n; i++) {
//                if (n % i == 0) answer = i;
//                else answer = -1;
//                n--;
//            }
//        }
//
//        if (answer == -1) {
//            return -1;
//        } else {
//            answer++;
//            answer = (long)Math.pow(answer, 2);
//            return answer;
//        }

        Double sqrt = Math.sqrt(n);
        if (sqrt.intValue() ==  sqrt) {
            return (long)Math.pow(++sqrt, 2);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        long solution = solution(121);
        System.out.println("solution = " + solution);
    }
}
