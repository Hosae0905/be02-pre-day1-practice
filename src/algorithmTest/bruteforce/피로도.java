package algorithmTest.bruteforce;

/**
 * https://velog.io/@doxxx93/practice-kit-brute-force-2
 */

public class 피로도 {

    static boolean[] visited;
    static int count = 0;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return count;
    }

    private static void dfs(int depth, int fatigue, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || dungeons[i][0] > fatigue) {
                continue;
            }

            visited[i] = true;
            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        count = Math.max(count, depth);
    }

    /*public static int solution(int k, int[][] dungeons) {
        int answer = -1;
        // k는 현재 내 피로도
        // [최소 필요 피로도, 소모 피로도]
        // 최소한의 비용으로 얼마나 많은 던전을 탐험할 수 있냐
        // 제일 많은 피로도가 필요한 던전부터 탐험한다.
        int max = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < dungeons.length; j++) {
                // Math.max로 최소 필요 피로도가 제일 높은 던전을 찾아서 해당 던전의 소모 피로도 값을 빼준다.
                // 뭔가 재귀로 풀 수 있나?
                // DFS로 푸는거네
            }
        }
        // 그 다음 남은 피로도에서 남은 던전의 피로도 소모 값을 빼서 큰 던전으로 탐험한다.
        return answer;
    }*/

    public static void main(String[] args) {
        int k = 80;
        int[][] d = { { 80, 20 }, { 50, 40 }, { 30, 10 } };
        int solution = solution(k, d);
        System.out.println("solution = " + solution);
    }
}
