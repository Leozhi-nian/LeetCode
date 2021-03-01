package com.leozhi.topic322

/**
 * @author leozhi
 * 动态规划 自顶而下
 * 通过
 * 476ms
 */
class Solution02 {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val memo = HashMap<Int, Int>()
        fun dp(amount: Int): Int {
            var res = Integer.MAX_VALUE
            if (amount in memo) {
                return memo[amount]!!
            }
            if (amount == 0) {
                return 0
            }
            if (amount < 0) {
                return -1
            }
            for (coin in coins) {
                val subProblem = dp(amount - coin)
                if (subProblem == -1) {
                    continue
                }
                res = if (subProblem + 1 < res) subProblem + 1 else res
            }
            memo[amount] = if (res != Integer.MAX_VALUE) res else - 1
            return memo[amount]!!
        }
        return dp(amount)
    }
}