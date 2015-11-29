package com.lwu.algo.sort.main.sort;

/**
 * Like a bubble move to the top
 *
 * Stable:  Yes
 * Extra Space: O(1)
 * Time complexity: O(n^2)
 * Adaptive: O(n) when nearly sorted
 */
public class BubbleSort extends SortBase {

    @Override
    public void sort(Comparable[] a) {
        int len = a.length;

        int i=len;

        while(i>=0) {
            boolean swapped = false;
            for(int j=1; j<i; j++) {
                if(less(a[j], a[j-1])) {
                    exchange(a, j-1, j);
                    swapped = true;
                }
            }

            if(!swapped)
                break;

            i--;
        }

    }

    public void sort2(Comparable[] a) {
        int len = a.length;

        for(int i=0; i<len; i++) {
            boolean swapped = false;
            for(int j=len-1; j>i; j--) {
                if(less(a[j], a[j-1])) {
                    exchange(a, j, j-1);
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }
}
