package com.nmuzychuk;

public class BSTreeNode {
    private int data;
    private BSTreeNode left;
    private BSTreeNode right;

    public BSTreeNode(final int data) {
        this.data = data;
    }

    public int data() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public BSTreeNode left() {
        return left;
    }

    public void setLeft(final BSTreeNode node) {
        this.left = node;
    }

    public BSTreeNode right() {
        return right;
    }

    public void setRight(final BSTreeNode node) {
        this.right = node;
    }
}
