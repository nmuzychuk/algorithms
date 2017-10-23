package com.nmuzychuk;

public final class TSearch {

    private static final int PARTS = 3;

    private TSearch() {
    }

    public static int search(final int[] array, final int value) {
        return search(array, value, 0, array.length - 1);
    }

    private static int search(final int[] array, final int value,
                              final int start, final int end) {

        if (start > end) {
            return -1;
        }

        int lb = start + (end - start) / PARTS;
        int rb = start + 2 * (end - start) / PARTS;

        if (array[lb] == value) {
            return lb;
        }

        if (array[rb] == value) {
            return rb;
        }

        if (value < array[lb]) {
            return search(array, value, start, lb - 1);
        }

        if (value > array[rb]) {
            return search(array, value, rb + 1, end);
        }

        return search(array, value, lb, rb);
    }

}
