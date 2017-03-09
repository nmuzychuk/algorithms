package com.nmuzychuk;

import java.util.List;
import java.util.ArrayList;

public class BSTree {
    private BSTreeNode root;

    public boolean find(final int data) {
        BSTreeNode current = root;

        while (true) {
            if (current == null) {
                return false;
            } else if (current.data() == data) {
                return true;
            } else {
                if (data < current.data()) {
                    current = current.left();
                } else {
                    current = current.right();
                }
            }
        }
    }

    public void insert(final int data) {
        BSTreeNode current = root;

        if (root == null) {
            root = new BSTreeNode(data);
        } else {
            while (true) {
                if (data < current.data()) {
                    if (current.left() == null) {
                        current.setLeft(new BSTreeNode(data));
                        break;
                    } else {
                        current = current.left();
                    }
                } else {
                    if (current.right() == null) {
                        current.setRight(new BSTreeNode(data));
                        break;
                    } else {
                        current = current.right();
                    }
                }
            }
        }
    }

    public String traverse() {
        List<Integer> resultList = new ArrayList<Integer>();

        traverseInorder(resultList, root);

        return resultList.toString();
    }

    public boolean delete(final int data) {
        BSTreeNode parent = null;
        BSTreeNode current = root;
        boolean isFound = false;

        while (!isFound && current != null) {
            if (current.data() == data) {
                isFound = true;
            } else {
                parent = current;

                if (data < current.data()) {
                    current = current.left();
                } else {
                    current = current.right();
                }
            }
        }

        if (!isFound) {
            return false;
        } else {
            BSTreeNode replacement = getReplacementNode(current);

            if (current == root) {
                // root node
                if (root.left() != null) {
                    replacement.setLeft(root.left());
                }
                root = replacement;

                return true;
            } else {
                if (isLeafNode(current)) {
                    // leaf node
                    setParentRef(parent, current, null);
                } else if (current.right() != null && current.left() != null) {
                    // two children
                    BSTreeNode temp = new BSTreeNode(replacement.data());

                    delete(replacement.data());

                    temp.setLeft(current.left());
                    temp.setRight(current.right());

                    setParentRef(parent, current, temp);
                } else {
                    // one child
                    setParentRef(parent, current, replacement);
                }
            }
            return true;
        }
    }

    private void traverseInorder(final List<Integer> resultList,
                                 final BSTreeNode node) {
        if (node != null) {
            traverseInorder(resultList, node.left());
            resultList.add(node.data());
            traverseInorder(resultList, node.right());
        }
    }

    private boolean isLeafNode(final BSTreeNode node) {
        return (node.left() == null && node.right() == null);
    }

    private void setParentRef(final BSTreeNode parent, final BSTreeNode child,
                              final BSTreeNode replacement) {
        if (child.data() < parent.data()) {
            parent.setLeft(replacement);
        } else {
            parent.setRight(replacement);
        }
    }

    private BSTreeNode getReplacementNode(final BSTreeNode node) {
        if (node.left() != null && node.right() != null) {
            BSTreeNode current = node.right();

            while (current.left() != null) {
                current = current.left();
            }

            return current;
        } else {
            if (node.left() != null) {
                return node.left();
            } else {
                return node.right();
            }
        }
    }
}
