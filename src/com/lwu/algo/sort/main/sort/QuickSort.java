package com.lwu.algo.sort.main.sort;

import java.util.Random;

/**
 * Steps:
 *  1. Find a pivot
 *  2. Partition
 *  3. Recursive
 *
 */
public class QuickSort extends SortBase {

    /**
     * 2-way partition
     *
     * Stable:  NO
     * Extra Space: O(lg(n))
     * Time complexity: O(n^2), typically O(nlg(n))
     * Adaptive: NO
     * @param a
     */
    @Override
    public void sort(Comparable[] a) {
        int len = a.length;

        partition(a, 0, len-1);
    }

    private void partition(Comparable[] a, int start, int end) {
        if(start >= end) {
            return;
        }

        Random random = new Random();
        int pivot = random.nextInt(end-start+1) + start;
        exchange(a, pivot, end);

        pivot = end;

        int index = start;

        for(int i=start; i<end; i++) {
            if(less(a[i], a[pivot])) {
                exchange(a, i, index++);
            }
        }

        exchange(a, index, pivot);

        partition(a, start, index-1);
        partition(a, index+1, end);
    }

    /**
     * 3-way partition
     * @param a
     */
    public void sort2(Comparable[] a){

    }
}
