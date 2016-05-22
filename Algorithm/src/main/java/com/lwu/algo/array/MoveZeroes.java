package com.lwu.algo.array;

/**
 * Leetcode 283: Move Zeros
 * Solution:
 * - Time complexity: O(n)
 * - Extra spaces: O(1)
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int length = nums.length;

        int count = 0;

        for(int i=0; i<length; i++) {
            if(nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while(count < length) {
            nums[count++] = 0;
        }
    }
}
