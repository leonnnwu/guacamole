package com.lwu.algo.sort;

/**
 * Using Heap
 *
 * Stable:  No
 * Extra Space: O(1)
 * Time complexity: O(nlgn)
 * Adaptive: No
 */
public class HeapSort extends SortBase {

    @Override
    public void sort(Comparable[] a) {
        int len = a.length;

        //Heapify
        for(int i=len/2; i>=0 ; i--) {
            sink(a, i, len);
        }

        int end = len-1;

        //Remove the maximum item (root) and sink (re-heapify)
        while(len > 0) {
            exchange(a, 0, end--);
            sink(a, 0, --len);
        }
    }

    private void swim(Comparable[] a, int k) {
        while(k > 0 && less(a[k/2], a[k])) {
            exchange(a, k/2, k);
            k = k/2;
        }
    }

    /**
     * Top-down re-heapify
     * @param a
     * @param k
     * @param len
     */
    private void sink(Comparable[] a, int k, int len) {
        // Check valid child position
        while(2*k < len) {
            int j = 2*k;
            // Find greater child
            if(j+1 <len && less(a[j], a[j+1])) {
                j++;
            }

            // Break the loop if the child is smaller than the parent
            if(!less(a[k], a[j])) {
                break;
            }

            // Exchange the parent with the child
            exchange(a, k, j);
            k=j;
        }
    }

    /**
     * Sink from i in a[1..n]
     * @param a
     * @param i
     * @param N
     */
    private void sink2(Comparable[] a, int i, int N) {
        // {lc, rc, mc} = {left, right, max} child index
        int lc = 2*i;

    }
}
