package com.nmuzychuk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class SListTest {
    private SList sList;

    @Before
    public void init() {
        sList = new SList();
    }

    @Test
    public void testConstructor() {
        assertEquals(0, sList.size());
        assertTrue(sList.isEmpty());
    }

    @Test
    public void testAddFirst() {
        sList.addFirst(10);

        assertEquals(10, sList.element());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testAddLast() {
        sList.addLast(10);

        assertEquals(10, sList.element());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testRemoveFirst() {
        sList.addFirst(10);
        sList.addFirst(11);

        assertEquals(11, sList.removeFirst());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testRemoveLast() {
        sList.addFirst(10);
        sList.addFirst(11);

        assertEquals(10, sList.removeLast());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testComplex() {
        for (int i = 0; i < 100; i++) {
            sList.addFirst(i);
        }
        sList.removeFirst();

        assertEquals(98, sList.element());
        assertEquals(99, sList.size());
    }

    @Test
    public void testCompare() {
        LinkedList<String> list = new LinkedList<String>();
        String item = "data";

        sList.addFirst(item);
        list.addFirst(item);

        assertEquals(list.element(), sList.element());
        assertEquals(list.size(), sList.size());
        assertEquals(list.removeFirst(), sList.removeFirst());
    }
}
