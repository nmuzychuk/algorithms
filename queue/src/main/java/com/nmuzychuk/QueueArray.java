package com.nmuzychuk;

class QueueArray {
    private int headIndex, tailIndex, size;
    private int[] queue;

    QueueArray() {
        final int maxSize = 64;
        queue = new int[maxSize];
        headIndex = 0;
        tailIndex = 0;
        size = 0;
    }

    boolean add(final int item) {
        queue[tailIndex++] = item;
        size++;
        return true;
    }

    int remove() {
        int item = queue[headIndex++];
        size--;
        return item;
    }

    int element() {
        return queue[headIndex];
    }

    int size() {
        return size;
    }
}
