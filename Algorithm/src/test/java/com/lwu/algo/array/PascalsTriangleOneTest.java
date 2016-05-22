package com.lwu.algo.array;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liangwu on 5/17/16.
 */
public class PascalsTriangleOneTest {
    @Tested
    PascalsTriangleOne pascalsTriangleOne;

    @Test
    public void testGenerate() {
        List<List<Integer>> result = pascalsTriangleOne.generate(5);
        Assert.assertEquals(result.get(0).size(), 1);
        Assert.assertEquals(result.get(1).size(), 2);
        Assert.assertEquals(result.get(2).size(), 3);
        Assert.assertEquals(result.get(3).size(), 4);
        Assert.assertEquals(result.get(4).size(), 5);

        Integer[] expect1 = {1};
        Integer[] expect2 = {1,1};
        Integer[] expect3 = {1,2,1};
        Integer[] expect4 = {1,3,3,1};
        Integer[] expect5 = {1,4,6,4,1};

        Assert.assertTrue(Arrays.equals(result.get(0).toArray(), expect1));
        Assert.assertTrue(Arrays.equals(result.get(1).toArray(), expect2));
        Assert.assertTrue(Arrays.equals(result.get(2).toArray(), expect3));
        Assert.assertTrue(Arrays.equals(result.get(3).toArray(), expect4));
        Assert.assertTrue(Arrays.equals(result.get(4).toArray(), expect5));


        result = pascalsTriangleOne.generateOptimized(5);
        Assert.assertEquals(result.get(0).size(), 1);
        Assert.assertEquals(result.get(1).size(), 2);
        Assert.assertEquals(result.get(2).size(), 3);
        Assert.assertEquals(result.get(3).size(), 4);
        Assert.assertEquals(result.get(4).size(), 5);

        Assert.assertTrue(Arrays.equals(result.get(0).toArray(), expect1));
        Assert.assertTrue(Arrays.equals(result.get(1).toArray(), expect2));
        Assert.assertTrue(Arrays.equals(result.get(2).toArray(), expect3));
        Assert.assertTrue(Arrays.equals(result.get(3).toArray(), expect4));
        Assert.assertTrue(Arrays.equals(result.get(4).toArray(), expect5));
    }
}
