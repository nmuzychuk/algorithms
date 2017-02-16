package com.nmuzychuk;

public class SList {
    private SListNode head;

    SList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void addFirst(Object item) {
        if (isEmpty()) {
            head = new SListNode(item);
        } else {
            SListNode oldHead = head;
            head = new SListNode(item);
            head.setNext(oldHead);
        }
    }

    public void addLast(Object item) {
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

    public Object removeFirst() {
        Object result = head.item();
        head = head.next();
        return result;
    }

    public Object removeLast() {
        SListNode current = head;

        while (current.next().next() != null) {
            current = current.next();
        }

        Object result = current.next().item();
        current.setNext(null);

        return result;
    }

    public int size() {
        int count = 0;
        SListNode current = head;

        while (current != null) {
            current = current.next();
            count++;
        }
        return count;
    }

    public Object element() {
        return head.item();
    }
}
