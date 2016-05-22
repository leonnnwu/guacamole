package com.lwu.algo.array;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liangwu on 5/21/16.
 */
public class PascalsTriangleTwoTest {

    @Tested
    PascalsTriangleTwo pascalsTriangleTwo;

    @Test
    public void testGenerate() {
        Integer[] expect1 = {1};
        Integer[] expect2 = {1,1};
        Integer[] expect3 = {1,2,1};
        Integer[] expect4 = {1,3,3,1};
        Integer[] expect5 = {1,4,6,4,1};

        Assert.assertTrue(Arrays.equals(pascalsTriangleTwo.getRow(0).toArray(), expect1));
        Assert.assertTrue(Arrays.equals(pascalsTriangleTwo.getRow(1).toArray(), expect2));
        Assert.assertTrue(Arrays.equals(pascalsTriangleTwo.getRow(2).toArray(), expect3));
        Assert.assertTrue(Arrays.equals(pascalsTriangleTwo.getRow(3).toArray(), expect4));
        Assert.assertTrue(Arrays.equals(pascalsTriangleTwo.getRow(4).toArray(), expect5));

    }

}
