package com.nmuzychuk;

public final class QuickSorter {

    private QuickSorter() {
    }

    public static void sort(final int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    @SuppressWarnings("finalparameters")
    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = partition(arr, left, right);

            quickSort(arr, left, index - 1);
            quickSort(arr, index + 1, right);
        }
    }

    @SuppressWarnings("finalparameters")
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        int tmp;

        for (int j = left; j <= right - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        tmp = arr[right];
        arr[right] = arr[i + 1];
        arr[i + 1] = tmp;

        return (i + 1);
    }
}
