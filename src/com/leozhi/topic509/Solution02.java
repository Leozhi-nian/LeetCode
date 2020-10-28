package com.leozhi.topic509;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 0ms
 */
public class Solution02 {
    public int fib(int N) {
        if (N < 3) {
            return N == 0 ? 0 : 1;
        }
        int[] dp = new int[N];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N - 1];
    }
}
