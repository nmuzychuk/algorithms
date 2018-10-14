package com.nmuzychuk;

import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueArrayTest {
    @Test
    public void testInteger() {
        final int addTimes = 5;

        QueueArray<Integer> q1 = new QueueArray<Integer>();
        LinkedBlockingQueue<Integer> q2 = new LinkedBlockingQueue<Integer>();

        for (int i = 0; i < addTimes; i++) {
            assertTrue(q1.add(i));
            q2.add(i);
        }

        assertEquals(q2.size(), q1.size());
        assertEquals(q2.element(), q1.element());

        assertEquals(q2.remove(), q1.remove());

        assertEquals(q2.size(), q1.size());
        assertEquals(q2.element(), q1.element());
    }

    @Test
    public void testString() {
        final String[] words = {"foo", "bar", "baz"};

        QueueArray<String> q1 = new QueueArray<String>();
        LinkedBlockingQueue<String> q2 = new LinkedBlockingQueue<String>();

        for (String word : words) {
            assertTrue(q1.add(word));
            q2.add(word);
        }

        assertEquals(q2.size(), q1.size());
        assertEquals(q2.element(), q1.element());

        assertEquals(q2.remove(), q1.remove());

        assertEquals(q2.size(), q1.size());
        assertEquals(q2.element(), q1.element());
    }
}
