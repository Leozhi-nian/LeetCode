package com.leozhi.topic746;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 1ms
 */
public class Solution01 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        // base case
        dp[n - 1] = cost[n - 1];
        dp[n - 2] = cost[n - 2];
        for (int i = n - 3; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }
        return dp[0];
    }
}
