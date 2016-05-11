package com.lwu.algo.search;

/**
 * Time complexity: O(lgn)
 * T(n) = T(n/2) + c
 *
 * Auxiliary space:
 *  - Iterative: O(1)
 *  - Recursive: O(logn)
 *
 * Input: sortedArray
 */
public class BinarySearch {

    /**
     * Recursion implementation
     * @param arr
     * @param l
     * @param r
     * @param x
     * @return
     */
    static int binarySearch(int[] arr, int l, int r, int x) {
        if(r >= l) {
            int mid = l + (r-l)/2;

            if(arr[mid] == x) {
                return mid;
            }

            if(arr[mid] < x) {
                return binarySearch(arr, mid+1, r, x);
            }

            return binarySearch(arr, l, mid-1, x);
        }

        return -1;
    }

    /**
     * Iterative implementation.
     *
     * @param arr
     * @param x
     * @return
     */
    static int binarySearch(int[] arr, int x) {
        int l=0;
        int r = arr.length - 1;

        while(l<=r) {
            int mid = l + (r-l)/2;
            if(arr[mid] == x) {
                return mid;
            }

            if(arr[mid] > x) {
                r = mid -1;
            }else {
                l = mid +1;
            }
        }

        return -1;
    }

    static int lessComparisonSearch(int[] arr, int l, int r, int x) {
        int mid = -1;
        while(r - l > 1) {
            mid = l + (r-l)/2;

            if(arr[mid] <= x) {
                l = mid;
            }else {
                r = mid;
            }
        }

        if(arr[mid] == x) {
            return mid;
        }else {
            return -1;
        }
    }
}
