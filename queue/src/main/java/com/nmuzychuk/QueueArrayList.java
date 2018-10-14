package com.nmuzychuk;

import java.util.ArrayList;

public class QueueArrayList<T> {
    private int headIndex, tailIndex = 0;
    private ArrayList<T> queue = new ArrayList<T>();

    public boolean add(final T item) {
        queue.add(tailIndex++, item);
        return true;
    }

    public T remove() {
        return queue.get(headIndex++);
    }

    public T element() {
        return queue.get(headIndex);
    }

    public int size() {
        return tailIndex - headIndex;
    }
}
