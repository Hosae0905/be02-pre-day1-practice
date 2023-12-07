package dataStructure.tree.avlTree;

import dataStructure.tree.TreePrinter;

public class AVLMain {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();


        // TODO: 전체적인 상황//
        System.out.println("===================================전체 상황=============================================");
//        tree.add(10);
//        tree.add(5);
//        tree.add(15);
//        tree.add(3);
//        tree.add(9);
//        tree.add(20);
//        tree.add(35);
//        tree.add(21);
//        tree.add(40);
//        tree.add(1);
//        tree.add(8);
//        tree.add(7);
//        tree.add(6);

        // TODO: LL
//        System.out.println("===================================LL Case=============================================");
//        tree.add(10);
//        tree.add(5);
//        tree.add(3);
//        tree.add(1);

        // TODO: RR
//        System.out.println("===================================RR Case=============================================");
        tree.add(10);
        tree.add(12);
        tree.add(14);
        tree.add(15);

        TreePrinter.print(tree.root);
    }
}
