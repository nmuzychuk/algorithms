package com.nmuzychuk;

class PriorityQueueArray {
    private int headIndex, tailIndex, size;
    private int[] queue;

    PriorityQueueArray() {
        final int maxSize = 64;
        queue = new int[maxSize];
        headIndex = 0;
        tailIndex = 0;
        size = 0;
    }

    boolean add(final int item) {
        int i;

        if (tailIndex == 0) {
            queue[tailIndex++] = item;
        } else {
            for (i = tailIndex - 1; i >= headIndex; i--) {
                if (item < queue[i]) {
                    queue[i + 1] = queue[i];
                } else {

                    break;
                }
            }

            queue[i + 1] = item;
            tailIndex++;
        }
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
