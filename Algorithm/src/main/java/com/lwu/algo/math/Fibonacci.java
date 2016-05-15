package com.lwu.algo.math;

/**
 * Created by Leon on 5/15/16.
 */
public class Fibonacci {

    /**
     * Time complexity: T(n) = T(n-1) + T(n-2)
     * Extra space: O(n) of call stack size.
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacciRecursion(int n) {
        if(n<1) {
            throw new IllegalArgumentException();
        }

        if(n==1) {
            return 0;
        }else if(n==2) {
            return 1;
        }

        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }

    /**
     *
     * Time complexity: O(n)
     * Extra space: O(n)
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacciDP(int n) {
        if(n<1) {
            throw new IllegalArgumentException();
        }

        int[] fArray = new int[n+2];

        fArray[1] = 0;
        fArray[2] = 1;

        for(int i=3; i<=n; i++) {
            fArray[i] = fArray[i-2] + fArray[i-1];
        }

        return fArray[n];
    }

    /**
     * Time complexity: O(n)
     * Extra space: O(1)
     * @param n
     * @return
     */
    public int fibonacciDP2(int n) {
        if(n<1) {
            throw new IllegalArgumentException();
        }

        if(n <=2) {
            return n-1;
        }

        int pre = 0;
        int pre1 = 1;
        int holder = 0;

        for(int i=3; i<=n; i++) {
            holder = pre+pre1;
            pre = pre1;
            pre1 = holder;
        }

        return holder;
    }
}
