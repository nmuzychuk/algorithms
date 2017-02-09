package com.nmuzychuk;

import junit.framework.TestCase;

public class PriorityQueueArrayTest
        extends TestCase {

    public void testEmpty() {
        PriorityQueueArray q = new PriorityQueueArray();

        assertEquals(0, q.size());
    }

    public void testAdd() {
        final int item = 42;
        PriorityQueueArray q = new PriorityQueueArray();

        q.add(item);

        assertEquals(item, q.element());
        assertEquals(1, q.size());
    }

    public void testRemove() {
        final int item = 42;
        PriorityQueueArray q = new PriorityQueueArray();

        q.add(item);

        assertEquals(item, q.remove());
        assertEquals(0, q.size());
    }

    public void testComplex() {
        final int times = 10;
        final int topPriorityElement = 1;
        int i;

        PriorityQueueArray q = new PriorityQueueArray();

        for (i = times; i >= topPriorityElement; i--) {
            q.add(i);
        }

        assertEquals(topPriorityElement, q.element());
        assertEquals(topPriorityElement, q.remove());
        assertEquals(times - 1, q.size());
    }
}
