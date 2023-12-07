package dataStructure.tree.avlTree;

import dataStructure.tree.TreePrinter;

public class Node implements TreePrinter.PrintableNode{

    Node left;          // 현재 노드에서 왼쪽 자식 노드
    Node right;         // 현재 노드에서 오른쪽 자식 노드

    Integer height;     // 높이를 저장할 변수
    Integer value;      // 각 노드의 값을 저장할 변수
    Integer bf;

    // TODO: 생성자
    public Node(Integer data) {
        this.height = 1;
        this.left = null;
        this.right = null;
        this.value = data;
        this.bf = 0;
    }

    // TODO: BF 저장하기
    public void setBf(Integer bf) {
        this.bf = bf;
    }

    @Override
    public TreePrinter.PrintableNode getLeft() {
        return this.left;
    }

    @Override
    public TreePrinter.PrintableNode getRight() {
        return this.right;
    }

    @Override
    public String getText() {
        return "["+ value +" BF:"+bf+"]";
    }

}
