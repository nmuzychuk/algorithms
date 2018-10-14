package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BSTreeNodeTest {
    private BSTreeNode node1;

    @Before
    public void init() {
        final int node1Data = 42;
        node1 = new BSTreeNode(node1Data);
    }

    @Test
    public void testSetData() {
        final int data = 24;

        node1.setData(data);

        assertEquals(data, node1.data());

    }

    @Test
    public void testSetRight() {
        final int node2Data = 24;
        BSTreeNode node2 = new BSTreeNode(node2Data);

        node1.setRight(node2);

        assertEquals(node2, node1.right());
    }

    @Test
    public void testSetLeft() {
        final int node2Data = 24;
        BSTreeNode node2 = new BSTreeNode(node2Data);

        node1.setLeft(node2);

        assertEquals(node2, node1.left());
    }
}
