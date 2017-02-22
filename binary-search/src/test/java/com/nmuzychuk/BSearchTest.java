package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class BSearchTest {
    @Test
    public void testOneElement() {
        final int[] array = {0};
        final int key = 0;
        final int index = 0;

        assertEquals(index, BSearch.searchLoop(array, key));
        assertEquals(index, BSearch.searchRec(array, key, 0, array.length - 1));
        assertEquals(Arrays.binarySearch(array, key),
                BSearch.searchLoop(array, key));
    }

    @Test
    public void testTwoElements() {
        final int[] array = {1, 2};
        final int key = 2;
        final int index = 1;

        assertEquals(index, BSearch.searchLoop(array, key));
        assertEquals(index, BSearch.searchRec(array, key, 0, array.length - 1));
        assertEquals(Arrays.binarySearch(array, key),
                BSearch.searchLoop(array, key));
    }

    @Test
    public void testMultipleElements() {
        final int[] array = {-34, -7, 1, 3, 5, 14, 54};
        final int key = 5;
        final int index = 4;

        assertEquals(index, BSearch.searchLoop(array, key));
        assertEquals(index, BSearch.searchRec(array, key, 0, array.length - 1));
        assertEquals(Arrays.binarySearch(array, key),
                BSearch.searchLoop(array, key));
    }

    @Test
    public void testFirst() {
        final int[] array = {-1, 0, 1};
        final int key = -1;
        final int index = 0;

        assertEquals(index, BSearch.searchLoop(array, key));
        assertEquals(index, BSearch.searchRec(array, key, 0, array.length - 1));
        assertEquals(Arrays.binarySearch(array, key),
                BSearch.searchLoop(array, key));
    }

    @Test
    public void testLast() {
        final int[] array = {-1, 0, 1};
        final int key = 1;
        final int index = 2;

        assertEquals(index, BSearch.searchLoop(array, key));
        assertEquals(index, BSearch.searchRec(array, key, 0, array.length - 1));
        assertEquals(Arrays.binarySearch(array, key),
                BSearch.searchLoop(array, key));
    }

    @Test
    public void testNoKey() {
        final int[] array = {1, 2, 3};
        final int key = 42;
        final int index = -1;

        assertEquals(index, BSearch.searchLoop(array, key));
        assertEquals(index, BSearch.searchRec(array, key, 0, array.length - 1));
    }
}
