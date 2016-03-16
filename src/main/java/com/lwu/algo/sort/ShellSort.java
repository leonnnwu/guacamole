package com.lwu.algo.sort;

/**
 * Gaps + Insertion Sort
 *
 * Stable:  No
 * Extra Space: O(1)
 * Time complexity: O(n^3/2)
 * Adaptive: O(nlgn) when nearly sorted
 */
public class ShellSort extends SortBase {

    private static final int[] MARCIN_CIURA_GAPS = {701, 301, 132, 57, 23, 10, 4, 1};

    @Override
    public void sort(Comparable[] a) {
        int len = a.length;

        for(int gap : MARCIN_CIURA_GAPS) {
            // Insertion Sort
            for(int i=gap; i<len; i++) {
                Comparable temp = a[i];

                int j = i;

                while(j>=gap && less(temp, a[j-gap])) {
                    a[j] = a[j-gap];
                    j -= gap;
                }

                a[j] = temp;
            }
        }
    }
}
