package com.nmuzychuk;

public class DList {
    private DListNode head;

    DList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void addFirst(final Object item) {
        if (isEmpty()) {
            head = new DListNode(item);
        } else {
            DListNode oldHead = head;
            head = new DListNode(item);
            head.setNext(oldHead);
            oldHead.setPrevious(head);
        }
    }

    public void addLast(final Object item) {
        if (isEmpty()) {
            head = new DListNode(item);
        } else {
            DListNode current = head;

            while (current.next() != null) {
                current = current.next();
            }
            DListNode node = new DListNode(item);
            current.setNext(node);
            node.setPrevious(current);
        }
    }

    public Object removeFirst() {
        Object result = head.item();
        head.setPrevious(null);
        head = head.next();

        return result;
    }

    public Object removeLast() {
        if (head.next() == null) {
            Object result = head.item();
            head = null;

            return result;
        } else {
            DListNode current = head;

            while (current.next().next() != null) {
                current = current.next();
            }

            Object result = current.next().item();
            current.setNext(null);

            return result;
        }
    }

    public int size() {
        int count = 0;
        DListNode current = head;

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
