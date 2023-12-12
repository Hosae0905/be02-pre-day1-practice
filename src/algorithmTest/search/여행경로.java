package algorithmTest.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class 여행경로 {

    static ArrayList<String> list = new ArrayList<>();
    static boolean[] visited;

    public static String[] solution(String[][] tickets) {



        /*Stack<String> stack = new Stack<>();
        ArrayList<String> list = new ArrayList<>();
        String[] next;
        stack.push(tickets[0][0]);
        while (!stack.isEmpty()) {

            String fromAirport = stack.pop();
            String arriveAirport;

            list.add(fromAirport);
            list.add(arriveAirport);

            for (int i = 0; i < tickets.length; i++) {
                next = tickets[i];
                for (int j = 0; j < next.length; j++) {
                    if (!stack.contains(next[j])) {
                        stack.push(next[j]);
                    } else {
                        String pop = stack.pop();
                        list.add(pop);
                    }
                }
            }
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }*/


        visited  = new boolean[tickets.length];

        dfs(0, "ICN", "ICN", tickets);

        Collections.sort(list);

        return list.get(0).split(" ");
    }

    public static void dfs(int depth, String from, String arrive, String[][] tickets) {
        if (depth == tickets.length) {
            list.add(arrive);
            return;
        }

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && from.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(depth + 1, tickets[i][1], arrive + " " + tickets[i][1], tickets);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] solution = solution(tickets);
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }
}
