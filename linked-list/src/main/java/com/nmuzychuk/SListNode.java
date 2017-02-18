package com.nmuzychuk;

public class SListNode {
    private Object item;
    private SListNode next;

    SListNode(final Object item) {
        this.item = item;
    }

    public Object item() {
        return item;
    }

    public void setItem(final Object item) {
        this.item = item;
    }

    public SListNode next() {
        return next;
    }

    public void setNext(final SListNode next) {
        this.next = next;
    }
}
