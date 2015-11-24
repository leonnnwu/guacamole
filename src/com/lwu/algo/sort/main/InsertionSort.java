package com.lwu.algo.sort.main;

/**
 * Insert the pivot into the appropriate position
 */
public class InsertionSort extends SortBase {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        for(int i=1; i<N; i++) {
            //Store the pivot
            Comparable tempV = a[i];

            int j = i;

            //Compare the values on the left site of pivot. If less, then put the value back seat to have a position for pivot.
            while(j>0 && less(tempV, a[j-1])) {
                a[j] = a[j-1];
                j--;
            }


            //Put the pivot in this position
            a[j] = tempV;

        }
    }
}
