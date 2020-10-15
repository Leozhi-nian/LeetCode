package com.leozhi.topic416;

import java.util.Arrays;

/**
 * @author leozhi
 * 动态规划 状态压缩
 * 通过
 */
public class Solution03 {
    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        boolean[] dp = new boolean[sum + 1];
        Arrays.fill(dp, false);

        // Base Case
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= 0; j--) {
                if (j - nums[i] >= 0) {
                    dp[j] = dp[j] || dp[j - nums[i]];
                }
            }
        }
        return dp[sum];
    }
}
