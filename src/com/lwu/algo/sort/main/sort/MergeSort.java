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

    /**
     * Top-down merge sort
     * @param a
     */
    @Override
    public void sort(Comparable[] a) {
        splitAndMerge(a, 0, a.length-1);
    }

    /**
     * Bottom-down merge sort
     * @param a
     */
    public void sort2(Comparable[] a) {
        System.out.println("=================");
        printOut(a);
        splitAndMerge2(a, 0, a.length-1);
    }

    /**
     * Top-down split and merge
     * @param a
     * @param start
     * @param end
     */
    private void splitAndMerge(Comparable[] a, int start, int end) {
        if(start >= end) {
            return;
        }

        int middle = (end-start)/2 + start;

        splitAndMerge(a, start, middle);
        splitAndMerge(a, middle+1, end);

        merge(a, start, middle, end);
    }

    private void merge(Comparable[] a, int start, int middle, int end) {
        Comparable[] helper = Arrays.copyOf(a, a.length);

        int i = start;
        int j = middle+1;
        int k = start;

        while(i <= middle && j <= end) {
            a[k++] = less(helper[i], helper[j]) ? helper[i++] : helper[j++];
        }

        while(i <= middle) {
            a[k++] = helper[i++];
        }

        while(j <= end) {
            a[k++] = helper[j++];
        }
    }

    /**
     * Bottom-up split and merge
     * @param a
     * @param start
     * @param end
     */
    private void splitAndMerge2(Comparable[] a, int start, int end) {
        for(int width = 1; width<=end; width = 2*width) {
            for(int i=start; i+width-1 <= end; i = i + 2*width) {
                merge(a, i, i+width-1, Math.min(i+2*width-1, end));
            }
        }
    }
}
