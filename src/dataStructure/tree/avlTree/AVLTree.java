package dataStructure.tree.avlTree;

public class AVLTree {

    Node root;

    public AVLTree() {
        this.root = null;
    }

    public void add(int value) {
        if (root == null) {         // 처음 삽입되는 노드를 루트 노드로
            root = new Node(value);
        } else {                    // 다음으로 들어오는 노드는 루트 노드를 기준으로 삽입
            insert(root, value);
        }
    }

    // TODO: 데이터 삽입 기능
    private Node insert(Node node, int value) {
        if (node == null) return new Node(value);   // 노드가 없을 때 노드를 추가해준다.

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        } else {
            return node;
        }

        // 현재 노드의 높이를 구한다.
        maxHeight(node);

        Integer bf = getBf(node);
        node.setBf(bf);

        if (bf > 1 && value < node.left.value) {        // LL Case
            root = rightRotate(node);
            return root;
//            return rightRotate(node);
        }
        if (bf < -1 && value > node.right.value) {      // RR Case
            root = rightRotate(node);
            return root;
//            return leftRotate(node);
        }
        if (bf > 1 && value > node.left.value) {        // LR Case
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (bf < -1 && value < node.right.value) {      // RL Case
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }


    // TODO: 우회전 기능
    private Node rightRotate(Node parent) {
        // 노드 회전하기
        Node newParent = parent.left;
        Node rightSubTree = newParent.right;

        newParent.right = parent;
        parent.left = rightSubTree;

        // 새로운 높이 구하기
        maxHeight(parent);
        maxHeight(newParent);

        // 위치가 변경된 노드들의 BF값 새로 구하기
        Integer parentBf = getBf(parent);
        Integer newParentBf = getBf(newParent);
        parent.setBf(parentBf);
        newParent.setBf(newParentBf);

        return newParent;
    }

    // TODO: 좌회전 기능
    private Node leftRotate(Node parent) {
        // 노드 회전하기
        Node newParent = parent.right;
        Node leftSubTree = newParent.left;

        newParent.left = parent;
        parent.right = leftSubTree;

        // 새로운 높이 구하기
        maxHeight(parent);
        maxHeight(newParent);


//        parent.height = Math.max(getHeight(parent.left), getHeight(parent.right)) + 1;
//        if (getHeight(parent.left) >= getHeight(parent.right)) {
//            parent.height = getHeight(parent.left) + 1;
//        } else if (getHeight(parent.right) >= getHeight(parent.left)){
//            parent.height = getHeight(parent.right) + 1;
//        }

//        newParent.height = Math.max(getHeight(newParent.left), getHeight(newParent.right)) + 1;
//        if (getHeight(newParent.left) >= getHeight(newParent.right)) {
//            newParent.height = getHeight(newParent.left) + 1;
//        } else if (getHeight(newParent.right) >= getHeight(newParent.left)) {
//            newParent.height = getHeight(newParent.right) + 1;
//        }
        
        // 위치가 변경된 노드들의 BF값 새로 구하기
        Integer parentBf = getBf(parent);
        Integer newParentBf = getBf(newParent);
        parent.setBf(parentBf);
        newParent.setBf(newParentBf);

        return newParent;
    }

    // TODO: 높이를 구하는 기능
    private Integer getHeight(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    // TODO: BF를 구하는 기능
    private Integer getBf(Node node) {
        if (node == null) return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    // TODO: 높이를 구하는 기능
    private void maxHeight(Node node) {
        if (getHeight(node.left) >= getHeight(node.right)) {
            node.height = getHeight(node.left) + 1;
        } else if (getHeight(node.right) >= getHeight(node.left)) {
            node.height = getHeight(node.right) + 1;
        }
    }
}
