package com.leozhi.topic310

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 188ms
 */
class Solution01 {
    fun lastStoneWeightII(stones: IntArray): Int {
        val sum = stones.sum()
        val m = sum / 2
        val dp = BooleanArray(m + 1)
        dp[0] = true
        for (weight in stones) {
            for (j in m downTo weight) {
                dp[j] = dp[j] || dp[j - weight]
            }
        }
        for (j in m downTo 0) {
            if (dp[j]) {
                return sum - 2 * j
            }
        }
        return sum
    }
}