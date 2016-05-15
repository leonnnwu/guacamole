package com.lwu.algo.string;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Leon on 5/15/16.
 */
public class SpaceReplacementTest {

    @Tested
    SpaceReplacement spaceReplacement;

    @Test
    public void testReplaceBlank() {
        char[] test = "Mr John Smith    ".toCharArray();
        int newLen = spaceReplacement.replaceBlank(test, 13);

        Assert.assertEquals(String.copyValueOf(test), "Mr%20John%20Smith");
        Assert.assertEquals(newLen, "Mr%20John%20Smith".length());
    }
}
