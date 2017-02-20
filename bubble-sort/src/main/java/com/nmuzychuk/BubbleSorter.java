package com.nmuzychuk;

public final class BubbleSorter {
    private BubbleSorter() {
    }

    public static void sort(final int[] array) {
        int size = array.length;

        for (int i = size - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
