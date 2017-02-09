package com.nmuzychuk;

import junit.framework.TestCase;

import java.util.Stack;

public class StackArrayTest
        extends TestCase {

    public void testEmpty() {
        StackArray s1 = new StackArray();
        Stack<Integer> s2 = new Stack<Integer>();

        assertEquals(s2.empty(), s1.empty());
    }

    public void testPush() {
        StackArray s1 = new StackArray();
        Stack<Integer> s2 = new Stack<Integer>();

        final int item1 = 42;

        s1.push(item1);
        s2.push(item1);

        assertEquals((int) s2.peek(), s1.peek());
    }

    public void testPop() {
        StackArray s1 = new StackArray();
        Stack<Integer> s2 = new Stack<Integer>();

        final int item1 = 42;

        s1.push(item1);
        s2.push(item1);

        assertEquals((int) s2.pop(), s1.pop());
    }

    public void testComplex() {
        StackArray s1 = new StackArray();
        Stack<Integer> s2 = new Stack<Integer>();

        final int pushTimes = 50;
        final int popTimes = 30;

        for (int i = 0; i < pushTimes; i++) {
            s1.push(i);
            s2.push(i);
        }

        for (int i = 0; i < popTimes; i++) {
            s1.pop();
            s2.pop();

        }

        assertEquals(s2.size(), s1.size());
        assertEquals((int) s2.peek(), s1.peek());
    }
}
