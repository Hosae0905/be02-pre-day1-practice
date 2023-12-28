package algorithmTest.bruteforce;

import java.util.ArrayList;

/**
 * https://isshosng.tistory.com/162
 */

public class 전력망을_둘로_나누기 {

    static ArrayList<Integer>[] node;
    static int min;

    public static int solution(int n, int[][] wires) {

        /**
         * 두 전력망이 가지고 있는 송전탑 개수의 차이(절대값)를 구한다. --> Math.abs(양수, 음수)
         * 송전탑의 개수를 최대한 비슷하게 한다는 것은 차이가 최소인 것을 의미한다.
         * 송전탑(노드) 전선(엣지)
         * 여행경로 문제랑 비슷한 것 같음
         *
         */

        node = new ArrayList[n + 1];
        min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            node[i] = new ArrayList<>();
        }

        for (int i = 0; i < wires.length; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            node[v1].add(v2);
            node[v2].add(v1);
        }

        for (int i = 0; i < wires.length; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];

            boolean[] visited = new boolean[n + 1];

            node[v1].remove(Integer.valueOf(v2));
            node[v2].remove(Integer.valueOf(v1));

            int count = dfs(1, visited);

            int diff = Math.abs(count - (n - count));
            min = Math.min(min, diff);

            node[v1].add(v2);
            node[v2].add(v1);
        }

        return min;
    }

    private static int dfs(int v, boolean[] visited) {
        visited[v] = true;
        int count = 1;

        for (int next : node[v]) {
            if (!visited[next]) {
                count += dfs(next, visited);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] wires = { { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 4, 6 }, { 4, 7 }, { 7, 8 }, { 7, 9 } };
        int n = 9;
        int solution = solution(n, wires);
        System.out.println("solution = " + solution);
    }
}
