package algorithm.Search;

public class Node {
    int f;
    int g;
    int h;

    int x;
    int y;

    Node parent;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
