package com.nmuzychuk;

public final class LSearch {
    private LSearch() {
    }

    public static int search(final int[] a, final int key) {
        int value = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }

        return value;
    }
}
