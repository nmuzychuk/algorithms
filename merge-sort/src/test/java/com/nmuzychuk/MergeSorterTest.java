package com.nmuzychuk;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

public class MergeSorterTest {
    @Test
    public void testEmptyArray() {
        final int[] array1 = {};
        final int[] array2 = array1.clone();

        Arrays.sort(array1);
        MergeSorter.sort(array2);

        assertTrue(Arrays.equals(array1, array2));
    }

    @Test
    public void testOneElementArray() {
        final int[] array1 = {1};
        final int[] array2 = array1.clone();

        Arrays.sort(array1);
        MergeSorter.sort(array2);

        assertTrue(Arrays.equals(array1, array2));
    }

    @Test
    public void testTwoElementsArray() {
        final int[] array1 = {1, -1};
        final int[] array2 = array1.clone();

        Arrays.sort(array1);
        MergeSorter.sort(array2);

        assertTrue(Arrays.equals(array1, array2));
    }

    @Test
    public void testFewElementsArray() {
        final int[] array1 = {1, 42, -1, 5, 8, 5};
        final int[] array2 = array1.clone();

        Arrays.sort(array1);
        MergeSorter.sort(array2);

        assertTrue(Arrays.equals(array1, array2));
    }
}
