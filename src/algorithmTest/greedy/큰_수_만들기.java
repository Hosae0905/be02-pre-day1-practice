package algorithmTest.greedy;

/**
 * https://hyojun.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%81%B0-%EC%88%98-%EB%A7%8C%EB%93%A4%EA%B8%B0-Java
 */

public class 큰_수_만들기 {
    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int start = 0;

        for (int i = 0; i < number.length() - k; i++) {
            char max = 0;
            for (int j = start; j <= i + k; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    start = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String solution = solution("4177252841", 4);
        System.out.println("solution = " + solution);
    }
}
