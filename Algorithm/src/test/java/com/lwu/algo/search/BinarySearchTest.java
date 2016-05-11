package com.lwu.algo.search;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Leon on 5/10/16.
 */
public class BinarySearchTest {

    @Tested
    BinarySearch binarySearch;

    private static final int arr[] = {2, 3, 4, 10, 40};
    private static final int x = 10;

    @Test
    public void testBinarySearch() {
        int result = BinarySearch.binarySearch(arr, 0, arr.length-1, x);
        Assert.assertEquals(result, 3);

        result =  BinarySearch.binarySearch(arr, x);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testLessComparisonSearch() {
        int result = BinarySearch.lessComparisonSearch(arr, 0, arr.length-1, x);
        Assert.assertEquals(result, 3);
    }
}
