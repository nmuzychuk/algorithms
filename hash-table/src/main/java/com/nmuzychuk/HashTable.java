package com.nmuzychuk;

public class HashTable {
    private SList[] table;
    private int size;

    HashTable(final int size) {
        this.size = size;
        table = new SList[size];

        for (int i = 0; i < size; i++) {
            table[i] = new SList();
        }
    }

    public void put(final int key) {
        int index = hashKey(key);
        SList chain = table[index];
        chain.add(key);
    }

    public SList get(final int key) {
        int index = hashKey(key);

        return table[index];
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < size; i++) {
            s += String.format("%s: ", i);
            s += table[i].toString();

            if (i != size - 1) {
                s += " ";
            }

        }

        return s;
    }

    private int hashKey(final int key) {
        return key % size;
    }
}
