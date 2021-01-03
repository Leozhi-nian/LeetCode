package com.leozhi.topic509

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 148ms
 */
class Solution03 {
    fun fib(n: Int): Int {
        if (n == 0) {
            return 0
        }
        val dp = IntArray(n + 1)
        dp[0] = 0
        dp[1] = 1
        for (i in 2..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }
        return dp[n]
    }
}