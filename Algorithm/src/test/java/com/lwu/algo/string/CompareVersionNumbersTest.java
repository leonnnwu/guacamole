package com.lwu.algo.string;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lwu on 7/17/16.
 */
public class CompareVersionNumbersTest {

    @Tested
    CompareVersionNumbers compareVersionNumbers;

    @Test
    public void testCompareVersion() throws Exception {
        Assert.assertEquals(compareVersionNumbers.compareVersion("0.1", "1.1"), -1);
        Assert.assertEquals(compareVersionNumbers.compareVersion("1.1", "1.2"), -1);
        Assert.assertEquals(compareVersionNumbers.compareVersion("1.2", "13.37"), -1);
        Assert.assertEquals(compareVersionNumbers.compareVersion("1", "0"), 1);
        Assert.assertEquals(compareVersionNumbers.compareVersion("0.1", "0.0.1"), 1);
        Assert.assertEquals(compareVersionNumbers.compareVersion("1.0", "1"), 0);
    }
}