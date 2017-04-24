package com.nmuzychuk;

import java.util.ArrayList;

public class QueueArrayList<T> {
    private int headIndex, tailIndex = 0;
    private ArrayList<T> queue = new ArrayList<T>();

    boolean add(final T item) {
        queue.add(tailIndex++, item);
        return true;
    }

    T remove() {
        return queue.get(headIndex++);
    }

    T element() {
        return queue.get(headIndex);
    }

    int size() {
        return tailIndex - headIndex;
    }
}
