package com.nmuzychuk;

import java.util.ArrayList;

class StackArrayList<T> {
    private int topIndex = -1;
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(final T item) {
        stack.add(++topIndex, item);
    }

    public T pop() {
        return stack.remove(topIndex--);
    }

    public T peek() {
        return stack.get(topIndex);
    }

    public int size() {
        return topIndex + 1;
    }
}
