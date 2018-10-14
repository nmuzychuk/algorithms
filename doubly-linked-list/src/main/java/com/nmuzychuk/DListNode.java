package com.nmuzychuk;

public class DListNode<T> {
    private T item;
    private DListNode<T> previous;
    private DListNode<T> next;

    DListNode(final T item) {
        this.item = item;
    }

    public T item() {
        return item;
    }

    public void setItem(final T item) {
        this.item = item;
    }

    public DListNode<T> previous() {
        return previous;
    }

    public void setPrevious(final DListNode<T> previous) {
        this.previous = previous;
    }

    public DListNode<T> next() {
        return next;
    }

    public void setNext(final DListNode<T> next) {
        this.next = next;
    }
}
