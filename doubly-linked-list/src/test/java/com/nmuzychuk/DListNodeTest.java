package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DListNodeTest {
    @Test
    public void testInteger() {
        final Integer item1 = 1;
        final Integer item2 = 2;
        final Integer newItem1 = 0;

        DListNode<Integer> node1 = new DListNode<Integer>(item1);
        DListNode<Integer> node2 = new DListNode<Integer>(item2);

        assertEquals(item1, node1.item());
        assertEquals(null, node1.next());

        assertEquals(item2, node2.item());
        assertEquals(null, node2.next());

        node1.setItem(newItem1);

        assertEquals(newItem1, node1.item());

        node1.setNext(node2);

        assertEquals(node2, node1.next());

        assertEquals(null, node2.previous());

        node2.setPrevious(node1);

        assertEquals(node1, node2.previous());
    }

    @Test
    public void testString() {
        final String item1 = "foo";
        final String item2 = "bar";
        final String newItem1 = "baz";

        DListNode<String> node1 = new DListNode<String>(item1);
        DListNode<String> node2 = new DListNode<String>(item2);

        assertEquals(item1, node1.item());
        assertEquals(null, node1.next());

        assertEquals(item2, node2.item());
        assertEquals(null, node2.next());

        node1.setItem(newItem1);

        assertEquals(newItem1, node1.item());

        node1.setNext(node2);

        assertEquals(node2, node1.next());

        assertEquals(null, node2.previous());

        node2.setPrevious(node1);

        assertEquals(node1, node2.previous());
    }
}
