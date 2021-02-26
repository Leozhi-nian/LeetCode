package com.leozhi.topic96

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 148ms
 */
class Solution01 {
    fun numTrees(n: Int): Int {
        // 1
        // 12                                                21
        // 312          132             123                  321         213             (231)
        // 4312 3124    4132 1432 1324  4123 1423 1243 1234  4321 3214   4213 2143 2134
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