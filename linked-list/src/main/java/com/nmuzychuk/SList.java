package com.nmuzychuk;

public class SList<T> {
    private SListNode<T> head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void addFirst(final T item) {
        if (isEmpty()) {
            head = new SListNode<T>(item);
        } else {
            SListNode<T> oldHead = head;
            head = new SListNode<T>(item);
            head.setNext(oldHead);
        }
    }

    public void addLast(final T item) {
        if (isEmpty()) {
            head = new SListNode<T>(item);
        } else {
            SListNode<T> current = head;

            while (current.next() != null) {
                current = current.next();
            }
            SListNode<T> node = new SListNode<T>(item);
            current.setNext(node);
        }
    }

    public T removeFirst() {
        T result = head.item();
        head = head.next();

        return result;
    }

    public T removeLast() {
        if (head.next() == null) {
            T result = head.item();
            head = null;

            return result;
        } else {
            SListNode<T> current = head;

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
        SListNode<T> current = head;

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
