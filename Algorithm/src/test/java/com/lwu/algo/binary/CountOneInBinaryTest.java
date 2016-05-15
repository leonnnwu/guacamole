package com.lwu.algo.binary;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Leon on 5/15/16.
 */
public class CountOneInBinaryTest {
    @Tested
    CountOneInBinary countOneInBinary;

    @Test
    public void testCountOnes() {
        Assert.assertEquals(countOneInBinary.countOnes(32), 1);
        Assert.assertEquals(countOneInBinary.countOnes(5), 2);
        Assert.assertEquals(countOneInBinary.countOnes(1023), 10);
    }
}
