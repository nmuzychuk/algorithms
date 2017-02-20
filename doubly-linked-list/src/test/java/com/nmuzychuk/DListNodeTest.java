package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DListNodeTest {
    private DListNode node1;

    @Before
    public void init() {
        node1 = new DListNode("data1");
    }

    @Test
    public void testItem() {
        assertEquals("data1", node1.item());
    }

    @Test
    public void testPrevious() {
        assertEquals(null, node1.previous());
    }

    @Test
    public void testNext() {
        assertEquals(null, node1.next());
    }

    @Test
    public void testSetItem() {
        String s = "newData1";
        node1.setItem(s);

        assertEquals(s, node1.item());
    }

    @Test
    public void testSetPrevious() {
        DListNode node2 = new DListNode("data2");
        node1.setPrevious(node2);

        assertEquals(node2, node1.previous());
    }

    @Test
    public void testSetNext() {
        DListNode node2 = new DListNode("data2");
        node1.setNext(node2);

        assertEquals(node2, node1.next());
    }
}
