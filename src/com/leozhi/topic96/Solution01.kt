package com.leozhi.topic96

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 148ms
 */
class Solution01 {
    fun numTrees(n: Int): Int {
        val dp = Array(n + 1) { 0 }
        dp[0] = 1
        dp[1] = 1
        for (i in 2..n) {
            for (j in 1..i) {
                dp[i] += dp[j - 1] * dp[i - j]
            }
        }
        return dp[n]
    }
}