package com.lwu.algo.string;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by liangwu on 7/16/16.
 */
public class ReverseVowelsTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {null, null},
                {"", ""},
                {"hello", "holle"},
                {"leetcode", "leotcede"}
        };
    }

    @Test(dataProvider = "testData")
    public void testReverseVowels1(String input, String output) throws Exception {
        Assert.assertEquals(ReverseVowels.reverseVowels1(input), output);
    }

}