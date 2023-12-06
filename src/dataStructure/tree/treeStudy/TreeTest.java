package dataStructure.tree.treeStudy;

public class TreeTest<E> {
    Node<E> root;
    private Node<E> preNode;

    public TreeTest() {
        this.root = null;
    }

    public void add(int value) {
        if (root == null) {
            root = new Node<>(value);
        } else if (root.left == null && value <= root.data) {
            root.left = new Node<>(value);
        } else if (root.right == null && value > root.data){
            root.right = new Node<>(value);
        } else {
            createNode(root, value);
        }
    }

    public void removeNode() {
        this.removeNode(this.root);
    }

    private void removeNode(Node<E> node) {
        if (node.left != null) {
            preNode = node;
            node = node.left;
            removeNode(node);
        } else if (node.right != null) {
            preNode = node;
            node = node.right;
            removeNode(node);
        } else if (node.left == null && node.right == null) {
            // 현재 node의 이전 node 정보가 있어야 된다.
            preNode.left = null;
            preNode.right = null;
        }
    }

    public void removeChildOne() {
        this.removeChildOne(this.root);
    }

    private void removeChildOne(Node<E> node) {
        preNode = node;
        if (node.left != null && node.right == null) {

        } else if (node.left == null && node.right != null) {

        }
    }

    public void removeChildTwo() {

    }



    private void createNode(Node<E> node, int value) {
        if (value <= node.data) {
            if (node.left == null) {
                node.left = new Node<>(value);
            } else {
                node = node.left;
                createNode(node, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(value);
            } else {
                node = node.right;
                createNode(node, value);
            }
        }
    }


    public void display(String type) {
        if (type.equals("preorder")) preorderDisplay(this.root);
        else if (type.equals("inorder")) inorderDisplay(this.root);
        else if (type.equals("postorder")) postorderDisplay(this.root);
    }

    private void inorderDisplay(Node<E> node) {
        if(node != null) {
            inorderDisplay(node.left);	// 왼쪽 자식 노드
            System.out.printf("[%d]", node.data);   // 부모 노드
            inorderDisplay(node.right);	// 오른쪽 자식 노드
        }
    }

    private void preorderDisplay(Node<E> node) {
        if(node != null) {
            System.out.printf("[%d]", node.data);   // 부모 노드
            preorderDisplay(node.left);	// 왼쪽 자식 노드
            preorderDisplay(node.right);	// 오른쪽 자식 노드
        }
    }

    private void postorderDisplay(Node<E> node) {
        if(node != null) {
            postorderDisplay(node.left);	// 왼쪽 자식 노드
            postorderDisplay(node.right);	// 오른쪽 자식 노드
            System.out.printf("[%d]", node.data);   // 부모 노드
        }
    }
}
