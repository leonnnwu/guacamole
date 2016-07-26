package com.lwu.algo.string;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by lwu on 7/19/16.
 */
public class CountAndSayTest {

    @Tested
    CountAndSay countAndSay;

    @DataProvider(name = "testData")
    public Object[][] testData(){
        return new Object[][] {
                {1, "1"},
                {2, "11"},
                {3, "21"},
                {4, "1211"},
                {5, "111221"},
                {6, "312211"}
        };
    }

    @Test(dataProvider = "testData")
    public void testCountAndSay(int n, String expectedResult) throws Exception {
        Assert.assertEquals(countAndSay.countAndSay(n), expectedResult);
    }
}