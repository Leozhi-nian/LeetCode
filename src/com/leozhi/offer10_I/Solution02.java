package com.leozhi.offer10_I;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 0ms
 */
public class Solution02 {
    public int fib(int n) {
        if (n < 3) {
            return n == 0 ? 0 : 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
