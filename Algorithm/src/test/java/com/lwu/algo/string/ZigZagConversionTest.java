package com.lwu.algo.string;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by liangwu on 7/16/16.
 */
public class ZigZagConversionTest {

    private final String INPUT="PAYPALISHIRING";
    private final String OUTPUT = "PAHNAPLSIIGYIR";

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"ABCD", 3, "ABDC"},
                {INPUT, 3, OUTPUT}
        };
    }

    @Test(dataProvider = "testData")
    public void testConvert(String input, int row, String output) throws Exception {
        Assert.assertEquals(ZigZagConversion.convert(input, row), output);
    }

}