package com.nmuzychuk;

import java.util.concurrent.ThreadLocalRandom;

public final class KnuthShuffler {
    private KnuthShuffler() {
    }

    public static void shuffle(final Object[] array) {
        Object temp;

        for (int i = 0; i < array.length; i++) {
            int r = ThreadLocalRandom.current().nextInt(0, i + 1);
            temp = array[r];
            array[r] = array[i];
            array[i] = temp;
        }
    }
}
