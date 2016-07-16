package com.lwu.algo.string;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by liangwu on 7/16/16.
 */
public class ReverseStringTest {

    private static final String INPUT_1 = "Alive is awesome";
    private static final String OUTPUT_1 = "emosewa si evilA";

    private static final String INPUT_2 = "Be in present";
    private static final String OUTPUT_2 = "tneserp ni eB";

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {null, null},
                {"", ""},
                {INPUT_1, OUTPUT_1},
                {INPUT_2, OUTPUT_2}
        };
    }

    @Tested
    ReverseString reverseString;

    @Test(dataProvider = "testData")
    public void testReverse1(String input, String output) throws Exception {
        Assert.assertEquals(ReverseString.reverse1(input), output);
    }

    @Test(dataProvider = "testData")
    public void testReverse2(String input, String output) throws Exception {
        Assert.assertEquals(ReverseString.reverse2(input), output);
    }

    @Test(dataProvider = "testData")
    public void testReverse3(String input, String output) throws Exception {
        Assert.assertEquals(ReverseString.reverse3(input), output);
    }

}