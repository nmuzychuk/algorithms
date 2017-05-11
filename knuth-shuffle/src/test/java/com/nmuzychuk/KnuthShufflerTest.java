package com.nmuzychuk;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNotEquals;

public class KnuthShufflerTest {
    @Test
    public void testIntegers() {
        final int times = 10;
        Object[] array = new Object[times];
        String unshuffled, shuffled;

        for (int i = 0; i < times; i++) {
            array[i] = i;
        }

        unshuffled = Arrays.toString(array);
        KnuthShuffler.shuffle(array);
        shuffled = Arrays.toString(array);

        assertNotEquals(unshuffled, shuffled);
    }

    @Test
    public void testStrings() {
        Object[] array = {"foobar", "foo", "bar", "baz", "qux"};
        String unshuffled, shuffled;

        unshuffled = Arrays.toString(array);
        KnuthShuffler.shuffle(array);
        shuffled = Arrays.toString(array);

        assertNotEquals(unshuffled, shuffled);
    }
}
