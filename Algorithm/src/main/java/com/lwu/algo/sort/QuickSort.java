package com.lwu.algo.sort;

import java.util.Random;

/**
 * Steps:
 *  1. Find a pivot
 *  2. Partition
 *  3. Recursive
 *
 * Stable:  No
 * Extra Space: O(lgn) recursive
 * Time complexity: O(n^2) when few unique keys, but typically O(nlgn)
 * Adaptive: No
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
        int firstGreater = start;

        while(cursor < pivot) {
            if(less(a[cursor], a[end])) {
                exchange(a, cursor++, firstGreater++);
            } else if(a[cursor].equals(a[end])) {
                exchange(a, cursor, --pivot);
            } else {
                cursor++;
            }
        }

        //Move the pivots to the center
        int len_min = Math.min(pivot-firstGreater, end-pivot+1);
        int indexOfGreater = firstGreater;
        int indexOfPivot = end-len_min+1;
        while(indexOfGreater < firstGreater+len_min) {
            exchange(a, indexOfGreater++, indexOfPivot++);
        }

        partition2(a, start, firstGreater-1);
        partition2(a, end-pivot+firstGreater+1, end);
    }
}
