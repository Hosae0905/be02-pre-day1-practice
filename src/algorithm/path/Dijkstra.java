package algorithm.path;

import java.util.Arrays;

/**
 * 시작 노드를 0으로 설정
 * 시작 노드의 costs를 0으로 설정
 * 방문하지 않은 노드 중에서 가장 비용이 적은 노드를 선택
 * 선택한 노드를 방문 처리
 * 
 * graph에서 하나 가져와서
 *      방문한 적 없고 출발지가 선택한 노드고 출발지의 비용이 INF가 아니고 출발지의 비용 + 간산의 비용이 목적지의 비용보다 작으면
 *      비용 갱신, 경로 갱신
 */

public class Dijkstra {

    static final int INF = 10000;
    boolean[] visited;      // 방문 배열
    int[] costs;            // 간선 값
    int[] path;             // 최단 경로

    public void search(int N, int[][] graph) {
        visited = new boolean[N];       // 노드의 수만큼 생성
        costs = new int[N];             // 노드의 수만큼 생성
        path = new int[N];              // 노드의 수만큼 생성

        Arrays.fill(costs, INF);        // costs 배열을 INF 값으로 채우기

        int startNode = 0;              // 시작 노드 설정
        costs[startNode] = 0;           // 시작 노드의 간선 값 설정

        for (int i = 0; i < N - 1; i++) {
            int minNode = findMinNode(costs, visited);      // 간선 값이 최소인 노드를 가져온다.
            visited[minNode] = true;                        // 해당 노드 방문 처리

            for (int[] edge : graph) {      // graph에 있는 간선을 확인
                int from = 0;               // 출발지 노드
                int to = 0;                 // 목적지 노드
                int cost = 0;               // 간선 값

                // 방향이 없는 그래프에서 값이 잘 못 들어왔을 경우 ex) 6, 2, 2 --> 2, 6, 2
                if (minNode == edge[0]) {   // 간선 값이 최소인 노드가 graph에서 가져온 노드의 출발지와 같다면
                    from = edge[0];         // 출발지 노드 설정
                    to = edge[1];           // 목적지 노드 설정
                    cost = edge[2];         // 간선 값 설정
                } else if (minNode == edge[1]) {        // graph에서 가져온 노드의 목적지와 같다면
                    from = edge[1];         // 목적지 노드를 출발지로 설정
                    to = edge[0];           // 출발지 노드를 목적지로 설정
                    cost = edge[2];         // 간선 값 설정
                }

                // 목적지를 방문하지 않았고 출발지와 선택한 노드가 같으며 출발지의 간선 값 + graph에서 가져온 간선 값이 
                // 목적지 간선 값보다 작을 경우
                if (!visited[to] && from == minNode && costs[from] + cost < costs[to]) {
                    costs[to] = costs[from] + cost;     // 목적지의 간선 값을 갱신
                    path[to] = from;                    // 목적지 경로 갱신
                }
            }
        }
    }

    private int findMinNode(int[] costs, boolean[] visited) {
        int minCost = INF;
        int minNode = -1;

        for (int i = 0; i < costs.length; i++) {
            if (!visited[i] && costs[i] < minCost) {
                minCost = costs[i];
                minNode = i;
            }
        }

        return minNode;
    }


    public void printPath() {

        System.out.println("costs:");
        for (int i = 0; i < costs.length; i++) {
            System.out.println("To node " + i + ": " + costs[i]);
        }

        System.out.println("path:");
        for (int i = 0; i < path.length; i++) {
            System.out.println("To node " + i + ": " + path[i]);
        }

        for (int i = 0; i < path.length; i++) {
            System.out.print(i + " : ");
            int current = i;
            while (path[current] != 0) {
                current = path[current];
                System.out.print(current + " ");
            }
            System.out.println(0);

        }
    }
}
