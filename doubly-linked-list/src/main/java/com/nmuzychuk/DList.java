package com.nmuzychuk;

public class DList<T> {
    private DListNode<T> head;

    DList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void addFirst(final T item) {
        if (isEmpty()) {
            head = new DListNode<T>(item);
        } else {
            DListNode<T> oldHead = head;
            head = new DListNode<T>(item);
            head.setNext(oldHead);
            oldHead.setPrevious(head);
        }
    }

    public void addLast(final T item) {
        if (isEmpty()) {
            head = new DListNode<T>(item);
        } else {
            DListNode<T> current = head;

            while (current.next() != null) {
                current = current.next();
            }
            DListNode<T> node = new DListNode<T>(item);
            current.setNext(node);
            node.setPrevious(current);
        }
    }

    public T removeFirst() {
        T result = head.item();
        head.setPrevious(null);
        head = head.next();

        return result;
    }

    public T removeLast() {
        if (head.next() == null) {
            T result = head.item();
            head = null;

            return result;
        } else {
            DListNode<T> current = head;

            while (current.next().next() != null) {
                current = current.next();
            }

            T result = current.next().item();
            current.setNext(null);

            return result;
        }
    }

    public int size() {
        int count = 0;
        DListNode<T> current = head;

        while (current != null) {
            current = current.next();
            count++;
        }
        return count;
    }

    public T element() {
        return head.item();
    }
}
