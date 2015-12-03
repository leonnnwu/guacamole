package com.lwu.algo.sort.main.sort;

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
        splitAndMerge(a, 0, a.length-1, new Comparable[a.length]);
    }

    private void splitAndMerge(Comparable[] a, int start, int end, Comparable[] helper) {
        if(end-start < 2) {
            return;
        }

        int middle = (end - start)/2;

        splitAndMerge(a, start, middle+start, helper);
        splitAndMerge(a, middle+start+1, end, helper);

        merge(a, start, middle+start, end, helper);
    }

    private void merge(Comparable[] a, int start, int middle, int end, Comparable[] helper) {
        while(start < middle)
    }

}
