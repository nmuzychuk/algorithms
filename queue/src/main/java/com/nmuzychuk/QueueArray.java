package com.nmuzychuk;

class QueueArray<T> {
    private int headIndex, tailIndex = 0;
    private T[] queue;

    QueueArray() {
        queue = (T[]) new Object[Byte.MAX_VALUE];
    }

    public boolean add(final T item) {
        queue[tailIndex++] = item;
        return true;
    }

    public T remove() {
        T item = queue[headIndex++];
        return item;
    }

    public T element() {
        return queue[headIndex];
    }

    public int size() {
        return tailIndex - headIndex;
    }
}
