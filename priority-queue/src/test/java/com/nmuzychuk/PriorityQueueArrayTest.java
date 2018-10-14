package com.nmuzychuk;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PriorityQueueArrayTest {
    @Test
    public void testInteger() {
        int[] elements = {0, 2, -1, 1};

        PriorityQueueArray q1 = new PriorityQueueArray();
        PriorityQueue<Integer> q2 = new PriorityQueue<Integer>();

        for (int element : elements) {
            assertTrue(q1.add(element));
            q2.add(element);
        }

        assertEquals(q2.size(), q1.size());
        assertEquals(q2.element(), (Integer) q1.element());

        assertEquals(q2.remove(), (Integer) q1.remove());

        assertEquals(q2.size(), q1.size());
        assertEquals(q2.element(), (Integer) q1.element());
    }
}
