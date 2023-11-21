package level1;

public class x만큼_간격이_있는_n개의_숫자 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;
        for(int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }

    public static void main(String[] args) {
        long[] solution = solution(-4, 2);

        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }
}
