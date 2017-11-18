package com.nmuzychuk;

import java.util.concurrent.ThreadLocalRandom;

public final class Bogosorter {

    private Bogosorter() {
    }

    public static void sort(final int[] array) {
        while (!isSorted(array)) {
            shuffle(array);
        }
    }

    private static boolean isSorted(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private static void shuffle(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            int r = ThreadLocalRandom.current().nextInt(0, i + 1);
            int temp = array[r];
            array[r] = array[i];
            array[i] = temp;
        }
    }

}
