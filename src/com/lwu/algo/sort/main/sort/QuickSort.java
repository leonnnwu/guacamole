package com.lwu.algo.sort.main.sort;

import java.util.Random;

/**
 * Steps:
 *  1. Find a pivot
 *  2. Partition
 *  3. Recursive
 *
 * Stable:  NO
 * Extra Space: O(lg(n))
 * Time complexity: O(n^2), typically O(nlg(n))
 * Adaptive: NO
 */
public class QuickSort extends SortBase {
    @Override
    public void sort(Comparable[] a) {
        int len = a.length;

        partition(a, 0, len-1);
    }

    private void partition(Comparable[] a, int start, int end) {
        if(start >= end) {
            return;
        }

        //Choose a pivot
        Random random = new Random();
        int pivot = random.nextInt(end-start+1) + start;
        exchange(a, start, pivot);

        pivot = start;

        for(int i=start+1; i<=end; i++) {
//            if(a[i] )
        }
    }
}
