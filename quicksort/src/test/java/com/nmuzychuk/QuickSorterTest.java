package com.nmuzychuk;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

public class QuickSorterTest {
    @Test
    public void testThreeElementsArray() {
        int[] a1 = {1, 0, -1};
        int[] a2 = a1.clone();

        QuickSorter.sort(a1);
        Arrays.sort(a2);

        assertTrue(Arrays.equals(a1, a2));
    }

    @Test
    public void testFewElementsArray() {
        final int[] array1 = {1, 42, -1, 5, 8, 5};
        final int[] array2 = array1.clone();

        Arrays.sort(array1);
        QuickSorter.sort(array2);

        assertTrue(Arrays.equals(array1, array2));
    }
}
