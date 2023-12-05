package dataStructure.tree;

import dataStructure.list.TreePrinter;

public class Node<E> implements TreePrinter.PrintableNode {
    int data;
    Node<E> left;
    Node<E> right;

    public Node(int data, Node<E> left, Node<E> right) {
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
