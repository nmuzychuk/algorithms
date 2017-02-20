package com.nmuzychuk;

public class DListNode {
    private Object item;
    private DListNode previous;
    private DListNode next;

    DListNode(final Object item) {
        this.item = item;
    }

    public Object item() {
        return item;
    }

    public void setItem(final Object item) {
        this.item = item;
    }

    public DListNode previous() {
        return previous;
    }

    public void setPrevious(final DListNode previous) {
        this.previous = previous;
    }

    public DListNode next() {
        return next;
    }

    public void setNext(final DListNode next) {
        this.next = next;
    }
}
