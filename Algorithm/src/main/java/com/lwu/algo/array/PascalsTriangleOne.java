package com.lwu.algo.array;

import com.lwu.algo.dp.BinomialCoefficient;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode: 118. Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class PascalsTriangleOne {

    /**
     * Time complexity: O(n^2)
     * Extra space: O(n)
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();

        if(numRows<=0) {
            return result;
        }

        List<Integer> pre = new ArrayList();
        pre.add(1);
        result.add(pre);

        for(int i=2; i<=numRows; i++) {
            List<Integer> cur = new ArrayList();
            cur.add(1);

            for(int j=0; j<pre.size()-1; j++) {
                cur.add(pre.get(j) + pre.get(j+1));
            }
            cur.add(1);
            result.add(cur);
            pre = cur;
        }
        return result;
    }

    /**
     * Time complexity: O(n^2)
     * Extra space: O(n)
     * @param numRows
     * @return
     */
    public List<List<Integer>> generateOptimized(int numRows) {
        List<List<Integer>> result = new ArrayList();

        if(numRows<=0) {
            return result;
        }

        for(int line = 1; line <= numRows; line++) {
            List<Integer> cur = new ArrayList<Integer>();
            int holder = 1;

            if(line == 1) {
                cur.add(holder);
                result.add(cur);
                continue;
            }

            cur.add(holder);
            for(int i=1; i<line-1; i++) {
                holder = holder * (line-i) / i;
                cur.add(holder);
            }

            cur.add(1);
            result.add(cur);
        }

        return result;
    }
}
