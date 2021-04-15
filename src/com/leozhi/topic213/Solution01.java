package com.leozhi.topic213;

import java.util.Arrays;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 0ms
 */
public class Solution01 {
    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums.length == 0 ? 0 : nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int result1, result2 ;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 0);
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[2]);
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        result1 = dp[dp.length - 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < dp.length - 1; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        result2 = dp[dp.length - 2];
        return Math.max(result1, result2);
    }
}
