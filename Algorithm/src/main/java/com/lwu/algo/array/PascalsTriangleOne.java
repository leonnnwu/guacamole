package com.lwu.algo.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode: 118. Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class PascalsTriangleOne {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows<=0) {
            return result;
        }

        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        result.add(pre);

        for(int i=1; i<=numRows; i++) {
            List<Integer> cur = new ArrayList<>();
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
}
