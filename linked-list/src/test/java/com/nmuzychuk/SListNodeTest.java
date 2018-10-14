package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SListNodeTest {
    @Test
    public void testInteger() {
        final Integer item1 = 1;
        final Integer item2 = 2;
        final Integer newItem1 = 0;

        SListNode<Integer> node1 = new SListNode<Integer>(item1);
        SListNode<Integer> node2 = new SListNode<Integer>(item2);

        assertEquals(item1, node1.item());
        assertEquals(null, node1.next());

        assertEquals(item2, node2.item());
        assertEquals(null, node2.next());

        node1.setItem(newItem1);

        assertEquals(newItem1, node1.item());

        node1.setNext(node2);

        assertEquals(node2, node1.next());
    }

    @Test
    public void testString() {
        final String item1 = "foo";
        final String item2 = "bar";
        final String newItem1 = "baz";

        SListNode<String> node1 = new SListNode<String>(item1);
        SListNode<String> node2 = new SListNode<String>(item2);

        assertEquals(item1, node1.item());
        assertEquals(null, node1.next());

        assertEquals(item2, node2.item());
        assertEquals(null, node2.next());

        node1.setItem(newItem1);

        assertEquals(newItem1, node1.item());

        node1.setNext(node2);

        assertEquals(node2, node1.next());
    }
}
