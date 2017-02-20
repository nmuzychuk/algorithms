package com.nmuzychuk;

public final class InsertionSorter {
    private InsertionSorter() {
    }

    public static void sort(final int[] array) {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int temp = array[i];
            int j = i;

            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                j--;
            }

            array[j] = temp;
        }
    }
}
