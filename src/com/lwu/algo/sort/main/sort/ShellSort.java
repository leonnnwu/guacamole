package com.lwu.algo.sort.main.sort;

/**
 * Gaps + Insertion Sort
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
