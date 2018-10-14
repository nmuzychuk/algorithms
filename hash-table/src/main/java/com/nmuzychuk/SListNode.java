package com.nmuzychuk;

public class SListNode {
    private int item;
    private SListNode next;

    SListNode(final int item) {
        this.item = item;
    }

    public int item() {
        return item;
    }

    public SListNode next() {
        return next;
    }

    public void setNext(final SListNode next) {
        this.next = next;
    }
}
