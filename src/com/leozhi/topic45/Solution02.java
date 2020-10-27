package com.leozhi.topic45;

import java.util.Arrays;

/**
 * @author leozhi
 * 动态规划 dp数组
 * 失败
 * 超时
 */
public class Solution02 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return n - 1;
        }
        int[] dp = new int[n];
        Arrays.fill(dp, n);
        dp[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            int steps = nums[i];
            for (int j = 1; j <= steps; j++) {
                int p = i + j;
                if (i + j < n - 1) {
                    dp[i] = Math.min(dp[i + j] + 1, dp[i]);
                }
            }
        }
        return dp[0];
    }
}
