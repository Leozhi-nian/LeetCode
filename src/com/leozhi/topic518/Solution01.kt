package com.leozhi.topic518

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 180ms
 */
class Solution01 {
    fun change(amount: Int, coins: IntArray): Int {
        val dp = IntArray(amount + 1)
        dp[0] = 1
        for (coin in coins) {
            for (i in coin..amount) {
                dp[i] += dp[i - coin]
            }
        }
        return dp[amount]
    }
}