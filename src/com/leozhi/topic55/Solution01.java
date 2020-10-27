package com.leozhi.topic55;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 2ms
 */
public class Solution01 {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, nums[i] + i);
            if (farthest <= i) {
                return false;
            }
        }
        return farthest >= nums.length - 1;
    }
}
