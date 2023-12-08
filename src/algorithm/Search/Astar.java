package algorithm.Search;

import java.util.ArrayList;
import java.util.List;

public class Astar {

    int[][] map;

    // 초기화할 때 맵 정보를 전달 받아서 출발지와 목적지 좌표를 변수에 저장
    Node start;
    Node end;

    final int DEFAULT_COST = 10;
    final int DEFAULT_DIAGONAL = 14;

    // 열린 목록
    List<Node> openList;

    // 닫힌 목록
    List<Node> closeList;

    /**
     *    [2, 2] [3, 2] [4, 2]
     *    [2, 3] [3, 3] [4, 3]
     *    [2, 4] [3, 4] [4, 4]
     */

    int[][] location = {
            {-1, -1},
            {0, -1},
            {1, -1},
            {-1, 0},
            {1, 0},
            {-1, 1},
            {0, 1},
            {1, 1}
    };

    public Astar(int[][] map) {
        this.map = map;
        
        openList = new ArrayList<>();
        closeList = new ArrayList<>();
        
        // 출발지와 목적지 좌표 구하기
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {               // 1이면 출발지
                    System.out.printf("출발지 좌표 x:%d y:%d\n", j, i);
                    this.start = new Node(j, i);
                } else if (map[i][j] == 2) {        // 2면 목적지
                    System.out.printf("목적지 좌표 x:%d y:%d\n", j, i);
                    this.end = new Node(j, i);
                    break;
                }
            }
        }
    }

    public void searchPath() {
        // 시작점을 열린 목록에 넣는다.
        openList.add(start);

        Node currentNode = start;

        while (!openList.isEmpty()) {
            if (end.x == currentNode.x && end.y == currentNode.y) {
                printPath(currentNode);
                break;
            } else {
                createNode(currentNode);
                currentNode = startMove(currentNode);
            }
        }
    }


    public Node startMove(Node node) {
        closeList.add(node);
        Node movedNode = null;
        for (int i = 0; i < openList.size(); i++) {
            for (int j = 0; j < openList.size(); j++) {
                movedNode = openList.get(i);
                if (movedNode.f < openList.get(j).f) {
                    movedNode = openList.get(j);
                    openList.remove(node);
                }
            }
        }

        return movedNode;
    }

    public boolean isDuplicate(Node node) {

        // 열린 목록에 있는 노드를 하나씩 가져오면서 반복
        // 가져온 노드의 x와 전달받은 노드의 x가 같고 가져온 노드의 y와 전달받은 노드의 Y가 같으면
        for (int i = 0; i < openList.size(); i++) {
            if (openList.get(i).x == node.x && openList.get(i).y == node.y) {
                return true;
            }
        }

        // 닫힌 목록에 있는 노드를 하나씩 가져오면서 반복
        // 가져온 노드의 x와 전달받은 노드의 x가 같고 가져온 노드의 y와 전달받은 노드의 Y가 같으면
        for (int i = 0; i < closeList.size(); i++) {
            if (closeList.get(i).x == node.x && closeList.get(i).y == node.y) {
                return true;
            }
        }
        return false;
    }

    public void addAdjacentNodes(Node node) {
        openList.add(node);
        sortList(openList);
        return;
    }

    public void sortList(List<Node> nodes) {
        for (int i = 0; i < nodes.size(); i++) {
            for (int j = 1; j < nodes.size(); j++) {
                if (nodes.get(i).f < nodes.get(j).f) {
                    Node temp = nodes.get(i);
                    openList.set(i, nodes.get(j));
                    openList.set(j, temp);
                }
            }
        }
    }

    public void createNode(Node node) {

        for (int i = 0; i < 8; i++) {
            Node adjacentNode = new Node(
                    node.x + location[i][0],
                    node.y + location[i][1]
            );

            if (adjacentNode.x < 0 || adjacentNode.x > 9) {
                adjacentNode.x = 0;
            }
            if (adjacentNode.y < 0 || adjacentNode.y > 9) {
                adjacentNode.y = 0;
            }

            if (map[adjacentNode.x][adjacentNode.y] != 3) {
                int diffLocation = ((end.x - node.x) + (end.y - node.y)) * 10;

                if (i == 0 || i == 2 || i == 5 || i == 7) {
                    adjacentNode.g += DEFAULT_DIAGONAL;
                    adjacentNode.h = diffLocation;
                    adjacentNode.f = adjacentNode.g + adjacentNode.h;
                    adjacentNode.parent = node;
                    if (!isDuplicate(adjacentNode)) {
                        addAdjacentNodes(adjacentNode);
                    }

                } else {
                    adjacentNode.g += DEFAULT_COST;
                    adjacentNode.h = diffLocation;
                    adjacentNode.f = adjacentNode.g + adjacentNode.h;
                    adjacentNode.parent = node;
                    if (!isDuplicate(adjacentNode)) {
                        addAdjacentNodes(adjacentNode);
                    }
                }
            }
        }
        return;
    }


    public void printPath(Node node) {
        // 특정 노드 하나를 받는다.
        // 부모를 계속 찾아가서 출발지가 나오면 출발부터 출력해준다.
        // 재귀로 호출해서 부모가 null이면 거기가 출발지니깐 거기서부터 출력

        if (node.parent == null) {
            System.out.printf("현재 출발지 좌표 x:%d, y:%d\n", node.x, node.y);
        } else {
            System.out.printf("현재 좌표는 x:%d, y:%d 입니다.\n", node.x, node.y);
            printPath(node.parent);
        }
    }
}
