package com.nmuzychuk;

public class SListNode<T> {
    private T item;
    private SListNode<T> next;

    SListNode(final T item) {
        this.item = item;
    }

    public T item() {
        return item;
    }

    public void setItem(final T item) {
        this.item = item;
    }

    public SListNode<T> next() {
        return next;
    }

    public void setNext(final SListNode<T> next) {
        this.next = next;
    }
}
