package algorithm.Search;

public class AstarMain {
    public static void main(String[] args) {
        int[][] map = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 3, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3, 0, 2, 0, 0, 0 },
                { 0, 0, 0, 0, 3, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        Astar astar = new Astar(map);
        astar.searchPath();
    }
}
