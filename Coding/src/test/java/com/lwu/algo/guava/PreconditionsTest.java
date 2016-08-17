package com.lwu.algo.guava;

import com.google.common.base.Preconditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PreconditionsTest {

    @Test
    public void testCheckArgument() {
        Preconditions.checkArgument(true);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCheckArgument_Successfully() {
        Preconditions.checkArgument(false);
    }

    @Test
    public void testCheckNotNull() {
        Preconditions.checkNotNull(new Object());
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testCheckNotNull_Successfully() {
        Preconditions.checkNotNull(null);
    }

    @Test
    public void testCheckState() {
        Preconditions.checkState(true);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void testCheckState_Successfully() {
        Preconditions.checkState(false);
    }

    @Test
    public void testCheckElementIndex_ok() {
        Assert.assertEquals(Preconditions.checkElementIndex(0, 1), 0);
        Assert.assertEquals(Preconditions.checkElementIndex(0, 2), 0);
        Assert.assertEquals(Preconditions.checkElementIndex(1, 2), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCheckElementIndex_badSize() {
        Preconditions.checkElementIndex(1, -1);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testCheckElementIndex_negative() {
        Preconditions.checkElementIndex(3, 1);
    }

    @Test
    public void testCheckPositionIndex_ok() {
        Assert.assertEquals(Preconditions.checkPositionIndex(0, 0), 0);
        Assert.assertEquals(Preconditions.checkPositionIndex(0, 1), 0);
        Assert.assertEquals(Preconditions.checkPositionIndex(1, 2), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCheckPositionIndex_badSize() {
        Preconditions.checkPositionIndex(1, -1);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testCheckPositionIndex_negative() {
        Preconditions.checkPositionIndex(3, 1);
    }

    @Test
    public void testCheckPositionIndexes_ok() {
        Preconditions.checkPositionIndexes(0, 0, 0);
        Preconditions.checkPositionIndexes(0, 0, 1);
        Preconditions.checkPositionIndexes(0, 1, 1);
        Preconditions.checkPositionIndexes(1, 1, 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCheckPositionIndexes_badSize() {
        Preconditions.checkPositionIndexes(0, 1, -1);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testCheckPositionIndexes_negative() {
        Preconditions.checkPositionIndexes(0, 2, 1);
    }
}
