package com.lwu.algo.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo {

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(n)
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();

        if(rowIndex < 0) {
            return result;
        }

        result.add(1);

        for(int i=1; i<=rowIndex; i++) {
            for(int j=result.size()-1; j>0; j--) {
                result.set(j, result.get(j-1) + result.get(j));
            }
            result.add(1);
        }

        return result;
    }
}
