package com.nmuzychuk;

public class SList {
    private SListNode head;

    SList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    // addLast
    public void add(final int item) {
        if (isEmpty()) {
            head = new SListNode(item);
        } else {
            SListNode current = head;

            while (current.next() != null) {
                current = current.next();
            }
            SListNode node = new SListNode(item);
            current.setNext(node);
        }
    }

    public int element() {
        return head.item();
    }

    @Override
    public String toString() {
        String s = "";
        s += "[";

        SListNode current = head;

        while (current != null) {
            s += current.item();
            current = current.next();

            if (current != null) {
                s += " -> ";
            }
        }

        s += "]";

        return s;
    }
}
