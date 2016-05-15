package com.lwu.algo.math;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Leon on 5/15/16.
 */
public class FibonacciTest {

    @Tested
    Fibonacci fibonacci;

    @Test
    public void testFibonacciRecursion() {
        Assert.assertEquals(fibonacci.fibonacciRecursion(1), 0);
        Assert.assertEquals(fibonacci.fibonacciRecursion(2), 1);
        Assert.assertEquals(fibonacci.fibonacciRecursion(10), 34);
    }

    @Test
    public void testFibonacciDP() {
        Assert.assertEquals(fibonacci.fibonacciDP(1), 0);
        Assert.assertEquals(fibonacci.fibonacciDP(2), 1);
        Assert.assertEquals(fibonacci.fibonacciDP(10), 34);
    }

    @Test
    public void testFibonacciDP2() {
        Assert.assertEquals(fibonacci.fibonacciDP2(1), 0);
        Assert.assertEquals(fibonacci.fibonacciDP2(2), 1);
        Assert.assertEquals(fibonacci.fibonacciDP2(10), 34);
    }
}
