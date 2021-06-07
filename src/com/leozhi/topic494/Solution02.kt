package com.leozhi.topic494

/**
 * @author leozhi
 * 动态规划（0-1背包）
 * 通过
 * 232ms
 */
class Solution02 {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        val neg = (nums.sum() - target).let { if (it < 0 || it % 2 != 0) return 0 else it / 2 }
        val size = nums.size
        val dp = Array(size + 1) { IntArray(neg + 1) }
        dp[0][0] = 1
        for (i in 1..size) {
            val num = nums[i - 1]
            for (j in 0..neg) {
                dp[i][j] = dp[i - 1][j]
                if (j >= num) {
                    dp[i][j] += dp[i - 1][j - num]
                }
            }
        }
        return dp[size][neg]
    }
}