package com.lwu.algo.guava;

import com.google.common.base.Optional;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OptionalTest {

    @Test
    public void testGet() {
        Optional<Integer> possible = Optional.of(5);
        possible.isPresent();
        Assert.assertEquals(possible.get(), new Integer(5));
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void testGetNull() {
        Optional.fromNullable(null).get();
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testOfNull() {
        Optional.of(null);
    }

    @Test
    public void testAbsent() {
        Assert.assertFalse(Optional.absent().isPresent());
    }

    @Test
    public void testFromNullable() {
        Assert.assertFalse(Optional.fromNullable(null).isPresent());
    }

    @Test
    public void testOr() {
        Assert.assertEquals(Optional.fromNullable(5).or(6), new Integer(5));
        Assert.assertEquals(Optional.fromNullable(null).or(5), new Integer(5));
    }

    @Test
    public void testOrNull() {
        Assert.assertEquals(Optional.fromNullable(5).orNull(), new Integer(5));
        Assert.assertEquals(Optional.fromNullable(null).orNull(), null);
    }

    @Test
    public void testAsSet() {
        Assert.assertEquals(Optional.fromNullable(5).asSet().size(), 1);
        Assert.assertEquals(Optional.fromNullable(null).asSet().size(), 0);
    }

    @Test
    public void myTest() {
        Assert.assertEquals("".substring(0,1), "");
    }

}
