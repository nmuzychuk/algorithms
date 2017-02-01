package com.nmuzychuk;

import junit.framework.TestCase;

import java.util.Arrays;

public class InsertionSorterTest extends TestCase {
    public void testEmptyArray() {
        int[] a1 = {};
        int[] a2 = a1.clone();

        InsertionSorter.sort(a1);
        Arrays.sort(a2);

        assert(Arrays.equals(a1, a2));
    }

    public void testOneElementArray() {
        int[] a1 = {1};
        int[] a2 = a1.clone();

        InsertionSorter.sort(a1);
        Arrays.sort(a2);

        assert(Arrays.equals(a1, a2));
    }

    public void testTwoElementsArray() {
        int[] a1 = {1, -1};
        int[] a2 = a1.clone();

        InsertionSorter.sort(a1);
        Arrays.sort(a2);

        assert(Arrays.equals(a1, a2));
    }

    public void testFewElementsArray() {
        int[] a1 = {8, 5, 0, -1, 4};
        int[] a2 = a1.clone();

        InsertionSorter.sort(a1);
        Arrays.sort(a2);

        assert(Arrays.equals(a1, a2));
    }
}
