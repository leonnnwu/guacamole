package com.lwu.algo.sort.test;

import com.lwu.algo.sort.main.InsertionSort;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by lwu on 11/24/15.
 */
public class SortTest {

    public static final Integer[] input = {1, 4, 3, 5, 6, 2};
    public static final Integer[] output = {1,2,3,4,5,6};

    @Test
    public void testInsertionSort() throws Exception {
        InsertionSort insertionSort = new InsertionSort();

        Integer[] localArray = Arrays.copyOf(input, input.length);

        insertionSort.sort(localArray);

        for(int i=0; i<localArray.length; i++) {
            Assert.assertEquals(output[i], localArray[i]);
        }
    }
}