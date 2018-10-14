package com.nmuzychuk;

public class StackArray<T> {
    private int topIndex = -1;
    private T[] stack;

    public StackArray() {
        stack = (T[]) new Object[Byte.MAX_VALUE];
    }

    public void push(final T item) {
        stack[++topIndex] = item;
    }

    public T pop() {
        T result = stack[topIndex];
        stack[topIndex--] = null;

        return result;
    }

    public T peek() {
        return stack[topIndex];
    }

    public int size() {
        return topIndex + 1;
    }
}
