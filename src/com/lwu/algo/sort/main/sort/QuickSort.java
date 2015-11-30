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
        int len = a.length;

        partition2(a, 0, len - 1);
    }

    private void partition2(Comparable[] a, int start, int end) {
        if(start >= end) {
            return;
        }

        Random random = new Random();
        int pivot = random.nextInt(end-start+1) + start;
        exchange(a, pivot, end);

        pivot = end;

        int cursor = start;
        int k = start;
        int n = end;

        while(cursor<n) {
            if(less(a[cursor], a[pivot])) {
                exchange(a, cursor++, k++);
            } else if(a[cursor] == a[pivot]) {
                exchange(a, cursor, --n);
            } else {
                cursor++;
            }
        }

        //Move the pivots to the center
        int len_min = Math.min(n-k, end-n+1);
        int indexOfGreater = k;
        int indexOfPivot = end-len_min+1;

        while(indexOfGreater < k+len_min) {
            exchange(a, indexOfGreater++, indexOfPivot++);
        }

        partition2(a, start, k-1);
        partition2(a, k, end);
    }
}
