package com.lwu.algo.string;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by lwu on 7/26/16.
 */
public class LengthOfLastWordTest {

    @Tested
    LengthOfLastWord lengthOfLastWord;

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello World", 5},
                {null, 0},
                {"", 0},
                {" ", 0},
                {"h h h", 1},
                {"Hello World  ", 5}
        };
    }

    @Test(dataProvider = "testData")
    public void testLengthOfLastWord(String testString, int expectedLength) throws Exception {
        Assert.assertEquals(lengthOfLastWord.lengthOfLastWord(testString), expectedLength);
    }

    @Test(dataProvider = "testData")
    public void testLengthOfLastWord2(String testString, int expectedLength) throws Exception {
        Assert.assertEquals(lengthOfLastWord.lengthOfLastWord2(testString), expectedLength);
    }
}