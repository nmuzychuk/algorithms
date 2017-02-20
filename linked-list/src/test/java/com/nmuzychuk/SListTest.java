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
        sList.addFirst("listData1");

        assertEquals("listData1", sList.element());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());

        sList.addFirst("listData2");

        assertEquals("listData2", sList.element());
        assertEquals(2, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testAddLast() {
        sList.addLast("listData1");

        assertEquals("listData1", sList.element());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());

        sList.addLast("listData2");

        assertEquals("listData1", sList.element());
        assertEquals(2, sList.size());
        assertFalse(sList.isEmpty());
    }

    @Test
    public void testRemoveFirst() {
        sList.addFirst("listData1");
        sList.addFirst("listData2");

        assertEquals("listData2", sList.removeFirst());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());

        assertEquals("listData1", sList.removeFirst());
        assertEquals(0, sList.size());
        assertTrue(sList.isEmpty());
    }

    @Test
    public void testRemoveLast() {
        sList.addFirst("listData1");
        sList.addFirst("listData2");

        assertEquals("listData1", sList.removeLast());
        assertEquals(1, sList.size());
        assertFalse(sList.isEmpty());

        assertEquals("listData2", sList.removeLast());
        assertEquals(0, sList.size());
        assertTrue(sList.isEmpty());
    }

    @Test
    public void testCompare() {
        LinkedList<String> list = new LinkedList<String>();
        String item1 = "data1";
        String item2 = "data2";

        sList.addLast(item1);
        list.addLast(item1);

        assertEquals(list.element(), sList.element());
        assertEquals(list.size(), sList.size());

        sList.addFirst(item2);
        list.addFirst(item2);

        assertEquals(list.element(), sList.element());
        assertEquals(list.size(), sList.size());

        sList.removeFirst();
        list.removeFirst();

        assertEquals(list.element(), sList.element());
        assertEquals(list.size(), sList.size());

        System.out.printf("%s, %s", sList.size(), sList.element());

        sList.removeLast();
        list.removeLast();

        assertEquals(list.size(), sList.size());
    }
}
