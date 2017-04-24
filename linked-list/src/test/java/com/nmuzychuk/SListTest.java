package com.nmuzychuk;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class SListTest {
    @Test
    public void testInteger() {
        final Integer item1 = 1;
        final Integer item2 = 2;

        SList<Integer> list1 = new SList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        list1.addLast(item1);
        list2.addLast(item1);

        assertEquals(list2.element(), list1.element());
        assertEquals(list2.size(), list1.size());

        list1.addFirst(item2);
        list2.addFirst(item2);

        assertEquals(list2.element(), list1.element());
        assertEquals(list2.size(), list1.size());

        list1.removeFirst();
        list2.removeFirst();

        assertEquals(list2.element(), list1.element());
        assertEquals(list2.size(), list1.size());

        list1.removeLast();
        list2.removeLast();

        assertEquals(list2.size(), list1.size());
    }

    @Test
    public void testString() {
        final String item1 = "foo";
        final String item2 = "bar";

        SList<String> list1 = new SList<String>();
        LinkedList<String> list2 = new LinkedList<String>();

        list1.addLast(item1);
        list2.addLast(item1);

        assertEquals(list2.element(), list1.element());
        assertEquals(list2.size(), list1.size());

        list1.addFirst(item2);
        list2.addFirst(item2);

        assertEquals(list2.element(), list1.element());
        assertEquals(list2.size(), list1.size());

        list1.removeFirst();
        list2.removeFirst();

        assertEquals(list2.element(), list1.element());
        assertEquals(list2.size(), list1.size());

        list1.removeLast();
        list2.removeLast();

        assertEquals(list2.size(), list1.size());
    }
}
