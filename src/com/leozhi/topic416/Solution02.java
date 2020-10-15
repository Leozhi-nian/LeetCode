package com.leozhi.topic416;

/**
 * @author leozhi
 * 动态规划
 * 通过
 */
public class Solution02 {
    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        // Base Case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j - nums[i - 1] < 0) {
                    // 背包容量不足，不能装入第i个物品
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // 装入或不装入
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[n][sum];
    }
}
