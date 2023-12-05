package dataStructure.tree;

public class TreeTest<E> {
    Node<E> root;

    public TreeTest() {
        this.root = null;
    }

    public void add(int value) {
        if (root == null) {
            root = new Node<>(value, null, null);
        } else if (root.left == null && value <= root.data) {
            root.left = new Node<>(value, null, null);
        } else if (root.right == null && value > root.data){
            root.right = new Node<>(value, null, null);
        } else {
            createNode(root, value);
        }
    }

    private void createNode(Node<E> node, int value) {
        if (value <= node.data) {
            if (node.left == null) {
                node.left = new Node<>(value, null, null);
            } else {
                node = node.left;
                createNode(node, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(value, null, null);
            } else {
                node = node.right;
                createNode(node, value);
            }
        }
    }

    public void display() {
        display(this.root);
    }

    public void display(Node<E> node) {
        if(node != null) {
            display(node.left);	// 왼쪽 자식 노드
            System.out.printf("[%d]", node.data);   // 부모 노드
            display(node.right);	// 오른쪽 자식 노드
        }
    }
}
