package com.nmuzychuk;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BSTreeTest {
    private BSTree bsTree;
    private final int dataRoot = 42;
    private final int dataLeft = 24;
    private final int dataRight = 84;

    @Before
    public void init() {
        bsTree = new BSTree();
    }

    @Test
    public void testFind() {
        assertFalse(bsTree.find(dataRoot));
    }

    @Test
    public void testInsert() {
        bsTree.insert(dataRoot);

        assertTrue(bsTree.find(dataRoot));
    }

    @Test
    public void testTraverse() {
        assertEquals("[]", bsTree.traverse());

        bsTree.insert(dataRoot);

        assertEquals("[42]", bsTree.traverse());

        bsTree.insert(dataLeft);

        assertEquals("[24, 42]", bsTree.traverse());

        bsTree.insert(dataRight);

        assertEquals("[24, 42, 84]", bsTree.traverse());
    }

    @Test
    public void testDeleteEmpty() {
        assertEquals("[]", bsTree.traverse());
        assertFalse(bsTree.delete(dataRoot));
    }

    @Test
    public void testDeleteNonExistent() {
        final int nonExistent = 0;

        bsTree.insert(dataRoot);
        bsTree.insert(dataLeft);
        bsTree.insert(dataRight);

        assertEquals("[24, 42, 84]", bsTree.traverse());
        assertFalse(bsTree.delete(nonExistent));
        assertEquals("[24, 42, 84]", bsTree.traverse());
    }

    @Test
    public void testDeleteRootOnly() {
        bsTree.insert(dataRoot);

        assertEquals("[42]", bsTree.traverse());
        assertTrue(bsTree.delete(dataRoot));
        assertEquals("[]", bsTree.traverse());
    }

    @Test
    public void testDeleteLeftLeaf() {
        bsTree.insert(dataRoot);
        bsTree.insert(dataLeft);
        bsTree.insert(dataRight);

        assertEquals("[24, 42, 84]", bsTree.traverse());
        assertTrue(bsTree.delete(dataLeft));
        assertEquals("[42, 84]", bsTree.traverse());
    }

    @Test
    public void testDeleteRightLeaf() {
        bsTree.insert(dataRoot);
        bsTree.insert(dataLeft);
        bsTree.insert(dataRight);

        assertEquals("[24, 42, 84]", bsTree.traverse());
        assertTrue(bsTree.delete(dataRight));
        assertEquals("[24, 42]", bsTree.traverse());
    }

    @Test
    public void testDeleteRoot() {
        bsTree.insert(dataRoot);
        bsTree.insert(dataLeft);
        bsTree.insert(dataRight);

        assertEquals("[24, 42, 84]", bsTree.traverse());
        assertTrue(bsTree.delete(dataRoot));
        assertEquals("[24, 84]", bsTree.traverse());
    }

    @Test
    public void testDeleteOneChild() {
        final int l1Root = 80;
        final int l2Left = 52;
        final int l3Left = 48;
        final int l3Right = 71;
        final int l4Left = 63;
        final int l5Right = 67;

        bsTree.insert(l1Root);

        bsTree.insert(l2Left);

        bsTree.insert(l3Left);
        bsTree.insert(l3Right);

        bsTree.insert(l4Left);

        bsTree.insert(l5Right);

        assertEquals("[48, 52, 63, 67, 71, 80]", bsTree.traverse());
        assertTrue(bsTree.delete(l3Right));
        assertEquals("[48, 52, 63, 67, 80]", bsTree.traverse());
    }

    @Test
    public void testDeleteTwoChildren() {
        final int l1Root = 50;
        final int l2Left = 25;
        final int l3Left = 15;
        final int l3Right = 35;
        final int l4Left1 = 5;
        final int l4Right1 = 20;
        final int l4Left2 = 30;
        final int l4Right2 = 40;

        bsTree.insert(l1Root);

        bsTree.insert(l2Left);

        bsTree.insert(l3Left);
        bsTree.insert(l3Right);

        bsTree.insert(l4Left1);
        bsTree.insert(l4Right1);
        bsTree.insert(l4Left2);
        bsTree.insert(l4Right2);

        assertEquals("[5, 15, 20, 25, 30, 35, 40, 50]", bsTree.traverse());
        assertTrue(bsTree.delete(l2Left));
        assertEquals("[5, 15, 20, 30, 35, 40, 50]", bsTree.traverse());
    }
}
