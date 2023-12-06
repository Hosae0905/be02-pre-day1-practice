package dataStructure.tree.treeStudy;

import dataStructure.tree.TreePrinter;

public class Node<E> implements TreePrinter.PrintableNode {
    Integer data;
    Node<E> left;
    Node<E> right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
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
        return "["+data+"]";
    }
}
