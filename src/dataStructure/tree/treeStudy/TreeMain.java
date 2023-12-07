package dataStructure.tree.treeStudy;

import dataStructure.tree.TreePrinter;

public class TreeMain {
    public static void main(String[] args) {
        TreeTest<Integer> tree = new TreeTest<>();

        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(8);
        tree.add(20);
        tree.add(35);
        tree.add(21);
        tree.add(40);
        tree.add(1);
        tree.add(7);
        tree.add(6);

        TreePrinter.print(tree.root);


        System.out.print("전위 순회: ");
        tree.display("preorder");
        System.out.println();

        System.out.print("중위 순회: ");
        tree.display("inorder");
        System.out.println();

        System.out.print("후위 순회: ");
        tree.display("postorder");
        System.out.println();

    }
}
