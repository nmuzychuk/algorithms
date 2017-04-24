package com.nmuzychuk;

class QueueArray<T> {
    private int headIndex, tailIndex = 0;
    private T[] queue;

    QueueArray() {
        queue = (T[]) new Object[Byte.MAX_VALUE];
    }

    boolean add(final T item) {
        queue[tailIndex++] = item;
        return true;
    }

    T remove() {
        T item = queue[headIndex++];
        return item;
    }

    T element() {
        return queue[headIndex];
    }

    int size() {
        return tailIndex - headIndex;
    }
}
