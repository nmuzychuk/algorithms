package com.nmuzychuk;

public final class SelectionSorter {
    private SelectionSorter() {
    }

    public static void sort(final int[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            int minIndex = i;

            for (int j = i; j < size; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
