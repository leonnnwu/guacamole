package com.lwu.algo.sort.test;

import com.lwu.algo.sort.main.InsertionSort;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lwu on 11/24/15.
 */
public class InsertionSortTest {

    public static final Integer[] input = {1, 4, 3, 5, 6, 2};
    public static final Integer[] output = {1,2,3,4,5,6};

    @Test
    public void testSort() throws Exception {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(input);

        for(int i=0; i<input.length; i++) {
            Assert.assertEquals(output[i], input[i]);
        }
    }
}