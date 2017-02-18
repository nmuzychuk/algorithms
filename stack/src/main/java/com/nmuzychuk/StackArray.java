package com.nmuzychuk;

class StackArray {
    private int topIndex;
    private int[] stack;

    StackArray() {
        final int size = 64;
        stack = new int[size];
        topIndex = -1;
    }

    void push(final int item) {
        stack[++topIndex] = item;
    }

    int pop() {
        return stack[topIndex--];
    }

    int peek() {
        return stack[topIndex];
    }

    boolean empty() {
        return topIndex == -1;
    }

    int size() {
        return topIndex + 1;
    }
}
