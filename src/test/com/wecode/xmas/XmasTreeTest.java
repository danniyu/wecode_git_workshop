package com.wecode.xmas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XmasTreeTest {

    @Test
    public void testXmasTreeWithOneTriangle(){
        XmasTree xmasTree = new XmasTree(2);
        assertEquals(" X\n X\nXXX\n", xmasTree.getXmasTree());
    }
}
