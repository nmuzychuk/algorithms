package com.nmuzychuk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class DListTest {
    private DList dList;

    @Before
    public void init() {
        dList = new DList();
    }

    @Test
    public void testConstructor() {
        assertEquals(0, dList.size());
        assertTrue(dList.isEmpty());
    }

    @Test
    public void testAddFirst() {
        dList.addFirst("listData1");

        assertEquals("listData1", dList.element());
        assertEquals(1, dList.size());
        assertFalse(dList.isEmpty());

        dList.addFirst("listData2");

        assertEquals("listData2", dList.element());
        assertEquals(2, dList.size());
        assertFalse(dList.isEmpty());
    }

    @Test
    public void testAddLast() {
        dList.addLast("listData1");

        assertEquals("listData1", dList.element());
        assertEquals(1, dList.size());
        assertFalse(dList.isEmpty());

        dList.addLast("listData2");

        assertEquals("listData1", dList.element());
        assertEquals(2, dList.size());
        assertFalse(dList.isEmpty());
    }

    @Test
    public void testRemoveFirst() {
        dList.addFirst("listData1");
        dList.addFirst("listData2");

        assertEquals("listData2", dList.removeFirst());
        assertEquals(1, dList.size());
        assertFalse(dList.isEmpty());

        assertEquals("listData1", dList.removeFirst());
        assertEquals(0, dList.size());
        assertTrue(dList.isEmpty());
    }

    @Test
    public void testRemoveLast() {
        dList.addFirst("listData1");
        dList.addFirst("listData2");

        assertEquals("listData1", dList.removeLast());
        assertEquals(1, dList.size());
        assertFalse(dList.isEmpty());

        assertEquals("listData2", dList.removeLast());
        assertEquals(0, dList.size());
        assertTrue(dList.isEmpty());
    }

    @Test
    public void testCompare() {
        LinkedList<String> list = new LinkedList<String>();
        String item1 = "data1";
        String item2 = "data2";

        dList.addLast(item1);
        list.addLast(item1);

        assertEquals(list.element(), dList.element());
        assertEquals(list.size(), dList.size());

        dList.addFirst(item2);
        list.addFirst(item2);

        assertEquals(list.element(), dList.element());
        assertEquals(list.size(), dList.size());

        dList.removeFirst();
        list.removeFirst();

        assertEquals(list.element(), dList.element());
        assertEquals(list.size(), dList.size());

        dList.removeLast();
        list.removeLast();

        assertEquals(list.size(), dList.size());
    }
}
