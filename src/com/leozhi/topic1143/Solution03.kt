package com.leozhi.topic1143

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 184ms
 */
class Solution03 {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val m = text1.length
        val n = text2.length
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (i in 1..m) {
            for (j in 1..n) {
                if (text1[i - 1] == text2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]
                } else {
                    dp[i][j] = if (dp[i - 1][j] > dp[i][j - 1]) dp[i - 1][j] else dp[i][j - 1]
                }
            }
        }
        return dp[m][n]
    }
}