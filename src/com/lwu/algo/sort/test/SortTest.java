package com.lwu.algo.sort.test;

import com.lwu.algo.sort.main.sort.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by lwu on 11/24/15.
 */
public class SortTest {

    public static final Integer[] INPUT_SHORT = {1, 4, 3, 5, 6, 2};
    public static final Integer[] INPUT_LONG = {62, 83, 18, 53, 7, 17, 95, 86, 47, 69, 25, 28};
    public static final Integer[] OUTPUT_SHORT = {1,2,3,4,5,6};
    public static final Integer[] OUTPUT_LONG = {7, 17, 18, 25, 28, 47, 53, 62, 69, 83, 86, 95};

    @Test
    public void testInsertionSort() throws Exception {
        SortBase insertionSort = new InsertionSort();

        Integer[] localArray = Arrays.copyOf(INPUT_SHORT, INPUT_SHORT.length);

        insertionSort.sort(localArray);

        assertResult(OUTPUT_SHORT, localArray);

        localArray = Arrays.copyOf(INPUT_LONG, INPUT_LONG.length);
        insertionSort.sort(localArray);
        assertResult(OUTPUT_LONG, localArray);
    }

    @Test
    public void testSelectionSort(){
        SortBase selectionSort = new SelectionSort();

        Integer[] localArray = Arrays.copyOf(INPUT_SHORT, INPUT_SHORT.length);

        selectionSort.sort(localArray);

        assertResult(OUTPUT_SHORT, localArray);

        localArray = Arrays.copyOf(INPUT_LONG, INPUT_LONG.length);
        selectionSort.sort(localArray);
        assertResult(OUTPUT_LONG, localArray);
    }

    @Test
    public void testShellSort() {
        SortBase shellSort = new ShellSort();

        Integer[] localArray = Arrays.copyOf(INPUT_LONG, INPUT_LONG.length);
        shellSort.sort(localArray);
        assertResult(OUTPUT_LONG, localArray);
    }

    @Test
    public void testBubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] localArray = Arrays.copyOf(INPUT_SHORT, INPUT_SHORT.length);

        bubbleSort.sort(localArray);

        assertResult(OUTPUT_SHORT, localArray);

        localArray = Arrays.copyOf(INPUT_LONG, INPUT_LONG.length);
        bubbleSort.sort2(localArray);
        assertResult(OUTPUT_LONG, localArray);
    }

    private void assertResult(Comparable[] expect, Comparable[] actual) {
        for(int i=0; i<expect.length; i++) {
            Assert.assertEquals(actual[i], expect[i]);
        }
    }
}