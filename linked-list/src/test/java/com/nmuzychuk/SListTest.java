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
        sList.addFirst("listData");

        assertEquals("listData", sList.element());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testAddLast() {
        sList.addLast("listData");

        assertEquals("listData", sList.element());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testRemoveFirst() {
        sList.addFirst("listData1");
        sList.addFirst("listData2");

        assertEquals("listData2", sList.removeFirst());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testRemoveLast() {
        sList.addFirst("listData1");
        sList.addFirst("listData2");

        assertEquals("listData1", sList.removeLast());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testComplex() {
        final int times = 100;
        final int expectedFirstItem = 98;
        final int expectedSize = 99;

        for (int i = 0; i < times; i++) {
            sList.addFirst(i);
        }
        sList.removeFirst();

        assertEquals(expectedFirstItem, sList.element());
        assertEquals(expectedSize, sList.size());
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
