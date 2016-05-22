package com.lwu.algo.dp;

/**
 * C(n, k)
 *
 * Dynamic Programming
 * 1) Optimal Substructure
 * C(n,k) = C(n-1, k-1) + C(n-1, k)
 * C(n, 0) = C(n, n) = 1
 *
 */
public class BinomialCoefficient {

    public int binomialCoefficientResursive(int n, int k) {
        if(k==0 || k==n) {
            return 1;
        }

        return binomialCoefficientResursive(n-1, k-1) + binomialCoefficientResursive(n-1, k);
    }

    /**
     * Time complexity: O(n*k) time
     * Extra space: O(n*k)
     */
    public int binomialCoefficientDP(int n, int k) {
        int[][] bc = new int[n+1][k+1];

        for(int i=0; i<=n; i++) {
            for(int j=0; j<= Math.min(i, k); j++) {
                if(i==0 || j==0) {
                    bc[i][j] = 1;
                }else {
                    bc[i][j] = bc[i-1][j-1] + bc[i-1][j];
                }
            }
        }

        return bc[n][k];
    }

    /**
     * Idea of Pascal Triangle
     * Time complexity: O(n*k) time
     * Extra space: O(k)
     */
    public int binomialCoefficientSpaceOptimized(int n, int k) {
        int[] bc = new int[k+1];

        bc[0] = 1;

        for(int i=1; i<=n; i++) {
            for(int j=Math.min(i,k); j>0; j--) {
                bc[j] = bc[j-1] + bc[j];
            }
        }

        return bc[k];
    }

    /**
     * C(n,k)
     * = n!/((n-k)!*k!)
     * = [n * (n-1) * ... * (n-k+1)] / k!
     * C(n, k) = C(n, n-k)
     * Time complexity: O(k) time
     * Extra space: O(1)
     */
    public int binomialCoefficient(int n, int k) {

        //C(n,0) = C(n, n) = 1
        int result = 1;

        //C(n, k) = C(n, n-k)
        if(k > n-k) {
            k = n-k;
        }

        for(int i=1; i<=k; i++) {
            result *= (n-i+1);
            result /= i;
        }

        return result;
    }
}
