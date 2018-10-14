package com.nmuzychuk;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class DListTest {
    @Test
    public void testInteger() {
        final Integer item1 = 1;
        final Integer item2 = 2;

        DList<Integer> list1 = new DList<Integer>();
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

        DList<String> list1 = new DList<String>();
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
