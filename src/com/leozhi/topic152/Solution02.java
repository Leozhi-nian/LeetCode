package com.leozhi.topic152;

/**
 * @author leozhi
 * 动态规划
 * 通过
 */
public class Solution02 {
    public int maxProduct(int[] nums) {
        int maxF = nums[0], minF = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int max = maxF, min = minF;
            maxF = Math.max(max * nums[i], Math.max(nums[i], min * nums[i]));
            minF = Math.min(min * nums[i], Math.min(nums[i], max * nums[i]));
            result = Math.max(maxF, result);
        }
        return result;
    }
}
