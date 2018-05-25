package com.nmuzychuk;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BogoSorterTest {
    @Test
    public void testFewElementsArray() {
        int[] a1 = {1, 0, -1};
        int[] a2 = a1.clone();

        BogoSorter.sort(a1);
        Arrays.sort(a2);

        assertTrue(Arrays.equals(a1, a2));
    }
}
