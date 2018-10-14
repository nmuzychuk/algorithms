package com.nmuzychuk;

class PriorityQueueArray {
    private int headIndex = 0;
    private int tailIndex = 0;
    private int[] queue;

    PriorityQueueArray() {
        queue = new int[Byte.MAX_VALUE];
    }

    public boolean add(final int item) {
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
        return true;
    }

    public int remove() {
        return queue[headIndex++];
    }

    public int element() {
        return queue[headIndex];
    }

    public int size() {
        return tailIndex - headIndex;
    }
}
