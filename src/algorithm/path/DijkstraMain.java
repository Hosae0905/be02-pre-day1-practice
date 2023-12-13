package algorithm.path;

import java.util.ArrayList;

public class DijkstraMain {
    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        int[][] graph = {
                { 0, 2, 7 },
                { 0, 4, 4 },
                { 2, 6, 1 },
                { 4, 7, 5 },
                { 7, 3, 1 },
                { 7, 5, 8 },
                { 5, 1, 3 },
                { 3, 1, 3 }
        };

//        Dijkstra dijkstar = new Dijkstra();
//        dijkstar.search(8, graph);
//        dijkstar.printPath();

        DijkstraTest dt = new DijkstraTest();

        int[][] arr = {
                { 1, 2, 1 },
                { 2, 3, 3 },
                { 5, 2, 2 },
                { 1, 4, 2 },
                { 5, 3, 1 },
                { 5, 4, 2 }
        };

        int[] search = dt.search(5, arr, 3);
        int answer = 0;
        for (int i = 0; i < search.length; i++) {
            if (search[i] <= 3) {
                answer++;
            }
        }

        System.out.println("search = " + answer);

        /*int[][] arr1 = {
                { 1, 2, 1 },
                { 1, 3, 2 },
                { 2, 3, 2 },
                { 3, 4, 3 },
                { 3, 5, 2 },
                { 3, 5, 3 },
                { 5, 6, 1 }
        };

        int[] search1 = dt.search(6, arr1, 4);
        int answer1 = 0;
        for (int i = 0; i < search1.length; i++) {
            if (search1[i] <= 4) {
                answer1++;
            }
        }

        System.out.println("search1 = " + answer1);*/
    }
}
