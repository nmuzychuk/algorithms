package com.nmuzychuk;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class StackArrayTest {
    @Test
    public void testInteger() {
        StackArray<Integer> s1 = new StackArray<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        final int pushTimes = 5;

        for (int i = 0; i < pushTimes; i++) {
            s1.push(i);
            s2.push(i);
        }

        assertEquals(s2.size(), s1.size());
        assertEquals(s2.peek(), s1.peek());

        assertEquals(s2.pop(), s1.pop());

        assertEquals(s2.size(), s1.size());
        assertEquals(s2.peek(), s1.peek());
    }

    @Test
    public void testString() {
        StackArray<String> s1 = new StackArray<String>();
        Stack<String> s2 = new Stack<String>();

        final String[] words = {"foo", "bar", "baz"};

        for (String word : words) {
            s1.push(word);
            s2.push(word);
        }

        assertEquals(s2.size(), s1.size());
        assertEquals(s2.peek(), s1.peek());

        assertEquals(s2.pop(), s1.pop());

        assertEquals(s2.size(), s1.size());
        assertEquals(s2.peek(), s1.peek());
    }
}
