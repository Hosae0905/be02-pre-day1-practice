package dataStructure.tree;

import dataStructure.list.TreePrinter;

public class TreeMain {
    public static void main(String[] args) {
        TreeTest<Integer> tree = new TreeTest<>();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(8);

        TreePrinter.print(tree.root);
    }
}
