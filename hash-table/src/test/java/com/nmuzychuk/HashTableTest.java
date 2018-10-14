package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HashTableTest {
    @Test(expected = ArithmeticException.class)
    public void testConstructorZero() {
        final int elem = 5;
        final int size = 0;

        HashTable t = new HashTable(size);
        t.put(elem);
    }

    @Test
    public void testMulti() {
        final int elem1 = 0;
        final int elem2 = 5;
        final int elem3 = 10;
        final int size = 5;

        HashTable t = new HashTable(size);

        String exp0 = "0: [] 1: [] 2: [] 3: [] 4: []";
        assertEquals(exp0, t.toString());

        t.put(elem1);

        String exp1 = "0: [0] 1: [] 2: [] 3: [] 4: []";
        assertEquals(exp1, t.toString());
        assertEquals(elem1, t.get(elem1).element());

        t.put(elem2);

        String exp2 = "0: [0 -> 5] 1: [] 2: [] 3: [] 4: []";
        assertEquals(exp2, t.toString());
        assertEquals(elem1, t.get(elem2).element());

        t.put(elem3);

        String exp3 = "0: [0 -> 5 -> 10] 1: [] 2: [] 3: [] 4: []";
        assertEquals(exp3, t.toString());
        assertEquals(elem1, t.get(elem3).element());
    }
}
