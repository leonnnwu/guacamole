package com.lwu.algo.dp;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BinomialCoefficientTest {

    @Tested
    BinomialCoefficient binomialCoefficient;

    @Test
    public void testRecursive() {
        Assert.assertEquals(binomialCoefficient.binomialCoefficientResursive(5, 2), 10);
    }

    @Test
    public void testDP() {
        Assert.assertEquals(binomialCoefficient.binomialCoefficientDP(5, 2), 10);
    }

    @Test
    public void testSpaceOptimized() {
        Assert.assertEquals(binomialCoefficient.binomialCoefficientSpaceOptimized(5, 2), 10);
    }

    @Test
    public void testBC() {
        Assert.assertEquals(binomialCoefficient.binomialCoefficient(5, 2), 10);
    }
}
