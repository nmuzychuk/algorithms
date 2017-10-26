package com.nmuzychuk;

import java.util.concurrent.ThreadLocalRandom;

public final class NaiveShuffler {

    private NaiveShuffler() {
    }

    public static void shuffle(final Object[] array) {
        Object temp;

        for (int i = 0; i < array.length; i++) {
            int r = ThreadLocalRandom.current().nextInt(0, array.length);
            temp = array[r];
            array[r] = array[i];
            array[i] = temp;
        }
    }

}
