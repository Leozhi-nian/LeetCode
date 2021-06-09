package com.leozhi.topic879

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 216ms
 */
class Solution01 {
    fun profitableSchemes(n: Int, minProfit: Int, group: IntArray, profit: IntArray): Int {
        val dp = Array(n + 1) { IntArray(minProfit + 1) }
        for (i in 0..n) {
            dp[i][0] = 1
        }
        val len = group.size
        val mod = 1e9.toInt() + 7
        for (i in 1..len) {
            val members = group[i - 1]
            val earn = profit[i - 1]
            for (j in n downTo members) {
                for (k in minProfit downTo 0) {
                    dp[j][k] = (dp[j][k] + dp[j - members][Math.max(0, k - earn)]) % mod
                }
            }
        }
        return dp[n][minProfit]
    }
}