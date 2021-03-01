package com.leozhi.topic322

/**
 * @author leozhi
 * 动态规划 自底而上
 * 通过
 * 200ms
 */
class Solution03 {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1) { amount + 1 }
        dp[0] = 0
        for (i in 1..amount) {
            for (coin in coins) {
                if (i - coin < 0) {
                    continue
                }
                dp[i] = if (dp[i] < dp[i - coin] + 1) dp[i] else dp[i - coin] + 1
            }
        }
        return if (dp[amount] == amount + 1) -1 else dp[amount]
    }
}