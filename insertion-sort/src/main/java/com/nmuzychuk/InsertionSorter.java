package com.nmuzychuk;

class InsertionSorter {
    static void sort(int[] array) {
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
