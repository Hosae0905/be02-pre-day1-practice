package algorithmTest.bruteforce;

public class 카펫 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        /**
         * brown / 2를 했을 때 나오는 몫까지 brown으로 칠하고 그 다음부터는 yellow로 칠하고 나서
         * yellow가 끝나면 나머지는 brown으로 칠한다.
         */

        for (int i = 3; i < brown + yellow; i++) {
            int width = (brown + yellow) / i;
            if (width >= i) {
                if ((i - 2) * (width - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(10, 2);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }
}
