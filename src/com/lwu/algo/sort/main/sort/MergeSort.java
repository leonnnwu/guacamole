package com.lwu.algo.sort.main.sort;

import java.util.Arrays;

/**
 * Stable:  Yes
 * Extra Space: O(n)
 * Time complexity: O(nlgn)
 * Adaptive: No
 * Random Access: No
 */
public class MergeSort extends SortBase{

    @Override
    public void sort(Comparable[] a) {
        splitAndMerge(a, 0, a.length-1);
    }

    /**
     * Top down split and merge
     * @param a
     * @param start
     * @param end
     */
    private void splitAndMerge(Comparable[] a, int start, int end) {
        if(start >= end) {
            return;
        }

        int middle = (end - start)/2 + start;

        splitAndMerge(a, start, middle);
        splitAndMerge(a, middle+1, end);

        merge(a, start, middle, end);
    }

    private void merge(Comparable[] a, int start, int middle, int end) {
        int i = start;
        int j = middle+1;
        int k = start;

        Comparable[] helper = Arrays.copyOf(a, a.length);

        while(i <= middle && j <= end) {
            a[k++] = less(helper[i], helper[j]) ? helper[i++] : helper[j++];
        }

        while(i <= middle) {
            a[k++] = helper[i++];
        }

        while (j <= end) {
            a[k++] = helper[j++];
        }
    }

}
