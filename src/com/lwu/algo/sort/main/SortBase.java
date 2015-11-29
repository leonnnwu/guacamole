package com.lwu.algo.sort.main;

/**
 * Created by lwu on 11/24/15.
 */
public abstract class SortBase {
    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    protected static void printOut(Comparable[] a) {
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        System.out.println();
    }

    public abstract void sort(Comparable[] a);
}
