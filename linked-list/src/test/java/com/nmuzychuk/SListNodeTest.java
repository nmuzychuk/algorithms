package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SListNodeTest {
    private SListNode node1;

    @Before
    public void init() {
        node1 = new SListNode("data1");
    }

    @Test
    public void testItem() {
        assertEquals("data1", node1.item());
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
    public void testSetNext() {
        SListNode node2 = new SListNode("data2");
        node1.setNext(node2);

        assertEquals(node2, node1.next());
    }
}
