package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LSearchTest {
    @Test
    public void testCase1() {
        final int[] array = {0, -1, 1};
        final int key = 1;
        final int index = 2;

        assertEquals(index, LSearch.search(array, key));
    }

    @Test
    public void testCase2() {
        final int[] array = {8, 5, 4, 3, 2};
        final int key = 4;
        final int index = 2;

        assertEquals(index, LSearch.search(array, key));
    }

    @Test
    public void testCase3() {
        final int[] array = {8, 4, 4, 6, 1};
        final int key = 4;
        final int index = 1;

        assertEquals(index, LSearch.search(array, key));
    }

    @Test
    public void testCaseNoKey() {
        final int[] array = {1, 2, 3};
        final int key = 4;
        final int index = -1;

        assertEquals(index, LSearch.search(array, key));
    }
}
