package com.nmuzychuk;

public final class BSearch {
    private BSearch() {
    }

    public static int searchLoop(final int[] a, final int key) {
        int lowerBound = 0;
        int upperBound = a.length - 1;

        int index;

        while (true) {
            index = (lowerBound + upperBound) / 2;

            if (a[index] == key) {
                return index;
            } else if (lowerBound > upperBound) {
                return -1;
            } else {
                if (a[index] < key) {
                    lowerBound = index + 1;
                } else {
                    upperBound = index - 1;
                }
            }
        }
    }

    public static int searchRec(final int[] a, final int key,
                                final int lower, final int upper) {
        int index = (lower + upper) / 2;

        if (a[index] == key) {
            return index;
        } else if (lower > upper) {
            return -1;
        } else {
            if (a[index] < key) {
                return searchRec(a, key, index + 1, upper);
            } else {
                return searchRec(a, key, lower, index - 1);
            }
        }
    }
}
