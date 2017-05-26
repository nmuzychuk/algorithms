package com.nmuzychuk;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SelectionSorterTest {
    @Test
    public void testEmptyArray() {
        int[] a1 = {};
        int[] a2 = a1.clone();

        SelectionSorter.sort(a1);
        Arrays.sort(a2);

        assertTrue(Arrays.equals(a1, a2));
    }

    @Test
    public void testOneElementArray() {
        int[] a1 = {1};
        int[] a2 = a1.clone();

        SelectionSorter.sort(a1);
        Arrays.sort(a2);

        assertTrue(Arrays.equals(a1, a2));
    }

    @Test
    public void testTwoElementsArray() {
        int[] a1 = {1, -1};
        int[] a2 = a1.clone();

        SelectionSorter.sort(a1);
        Arrays.sort(a2);

        assertTrue(Arrays.equals(a1, a2));
    }

    @Test
    public void testFewElementsArray() {
        int[] a1 = {1, 0, -1};
        int[] a2 = a1.clone();

        SelectionSorter.sort(a1);
        Arrays.sort(a2);

        assertTrue(Arrays.equals(a1, a2));
    }
}
