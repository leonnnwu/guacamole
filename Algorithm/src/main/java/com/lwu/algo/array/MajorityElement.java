package com.lwu.algo.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode version
 */
public class MajorityElement {

    /**
     * Time complexity: O(n)
     * Extra space: O(n)
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> lookup = new HashMap();
        int len = nums.length;
        for(int i=0; i<len; i++) {
            int count = 1;
            if(lookup.containsKey(nums[i])) {
                count = lookup.get(nums[i]);
                if( ++count > nums.length/2) {
                    return nums[i];
                }
            }

            lookup.put(nums[i], count);
        }

        return nums[0];
    }

    /**
     * Time complexity: O(n^2)
     * Extra space: O(1)
     * @param nums
     * @return
     */
    public int majorityElementBasic(int[] nums) {
        int length = nums.length;

        for (int i=0; i<length; i++) {
            int count = 0;
            for(int j=0; j<length; j++) {
                if(nums[i] == nums[j] && ++count > length/2) {
                    return nums[i];
                }
            }
        }

        return -1;
    }

    /**
     * Time complexity: O(n)
     * Extra space: O(1)
     * @param nums
     * @return
     */
    public int majorityElementVoting(int[] nums) {
        int length = nums.length;

        int count=0;
        int majorityIndex = 0;

        for(int i=0; i<length; i++) {
            if(nums[i] == nums[majorityIndex]) {
                count++;
            }else {
                count--;
            }

            if(count == 0) {
                majorityIndex = i;
                count = 1;
            }

            if(count > length/2) {
                return nums[majorityIndex];
            }
        }

        return nums[majorityIndex];
    }


}
