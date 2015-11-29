package com.lwu.algo.sort.main.sort;

/**
 * Find the smallest value and put on the left
 */
public class SelectionSort extends SortBase{

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        for(int i=0; i<N-1; i++) {
            int minIndex = i;

            int j=i+1;
            while(j<N) {
                if(less(a[j], a[minIndex])) {
                    minIndex = j;
                }

                j++;
            }

            exchange(a, i, minIndex);
        }
    }
}
