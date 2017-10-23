package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TSearchTest {

    @Test
    public void testOneElement() {
        final int[] a = {0};
        final int v = 0;
        final int index = 0;

        assertEquals(index, TSearch.search(a, v));
    }

    @Test
    public void testTwoElements() {
        final int[] a = {0, 1};
        final int v = 1;
        final int index = 1;

        assertEquals(index, TSearch.search(a, v));

    }

    @Test
    public void testMultiple() {
        final int[] a = {-34, -7, 1, 3, 5, 14, 54};
        final int v = 5;
        final int index = 4;

        assertEquals(index, TSearch.search(a, v));
    }

    @Test
    public void testNoKey() {
        final int[] a = {1, 2, 3};
        final int v = 42;
        final int index = -1;

        assertEquals(index, TSearch.search(a, v));
    }

}
