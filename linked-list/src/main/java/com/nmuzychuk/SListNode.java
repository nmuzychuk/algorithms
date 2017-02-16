package com.nmuzychuk;

public class SListNode {
    private Object item;
    private SListNode next;

    SListNode(Object item) {
        this.item = item;
    }

    public Object item() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public SListNode next() {
        return next;
    }

    public void setNext(SListNode next) {
        this.next = next;
    }
}
