package com.nmuzychuk;

import junit.framework.TestCase;

public class QueueArrayTest
        extends TestCase {

    public void testEmpty() {
        QueueArray q = new QueueArray();

        assertEquals(0, q.size());
    }

    public void testAdd() {
        final int item = 42;
        QueueArray q = new QueueArray();

        q.add(item);

        assertEquals(1, q.size());
        assertEquals(item, q.element());
    }

    public void testRemove() {
        final int item = 42;
        QueueArray q = new QueueArray();

        q.add(item);

        assertEquals(item, q.remove());
        assertEquals(0, q.size());
    }

    public void testComplex() {
        final int times = 50;
        int i;

        QueueArray q = new QueueArray();

        for (i = 0; i < times; i++) {
            q.add(i);
        }

        assertEquals(0, q.element());
        assertEquals(0, q.remove());
        assertEquals(times - 1, q.size());
    }
}
