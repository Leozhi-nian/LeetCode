package com.leozhi.topic650

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 176ms
 */
class Solution01 {
    fun minSteps(n: Int): Int {
        val dp = IntArray(n + 1)
        dp[1] = 0
        for (i in 2..n) {
            for (j in i / 2 downTo 1) {
                if ((i - j) % j == 0) {
                    dp[i] = dp[j] + 1 + (i - j) / j
                    break
                }
            }
        }
        return dp[n]
    }
}