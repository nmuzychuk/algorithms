package com.nmuzychuk;

public final class MergeSorter {
    private MergeSorter() {
    }

    public static void sort(final int[] array) {
        if (array.length <= 1) {
            return;
        }

        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - left.length];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        sort(left);
        sort(right);

        merge(left, right, array);
    }

    private static void merge(final int[] left, final int[] right,
                              final int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                array[i] = left[leftIndex];
                leftIndex++;
            } else {
                array[i] = right[rightIndex];
                rightIndex++;
            }
            i++;
        }

        System.arraycopy(left, leftIndex, array, i,
                left.length - leftIndex);
        System.arraycopy(right, rightIndex, array, i,
                right.length - rightIndex);
    }
}
