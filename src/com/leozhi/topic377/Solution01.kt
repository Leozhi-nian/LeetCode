package com.leozhi.topic377

/**
 * @author leozhi
 * 动态规划
 * 官方题解
 * 通过
 * 164ms
 */
class Solution01 {
    fun combinationSum4(nums: IntArray, target: Int): Int {
        val dp = IntArray(target + 1)
        dp[0] = 1
        for (i in 1..target) {
            for (num in nums) {
                if (num <= i) {
                    dp[i] += dp[i - num]
                }
            }
        }
        return dp[target]
    }
}