package com.leozhi.topic213

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 164ms
 */
class Solution02 {
    fun rob(nums: IntArray): Int {
        val len = nums.size
        if (len <= 2) {
            return if (len == 2) if (nums[0] > nums[1]) nums[0] else nums[1] else nums[0]
        }
        val result1: Int
        val result2: Int
        val dp = IntArray(len) { 0 }
        dp[1] = nums[1]
        dp[2] = if (nums[1] > nums[2]) nums[1] else nums[2]
        for (i in 3 until len) {
            dp[i] = if (nums[i] + dp[i - 2] > dp[i - 1]) nums[i] + dp[i - 2] else dp[i - 1]
        }
        result1 = dp[len - 1]
        dp[0] = nums[0]
        dp[1] = if (nums[0] > nums[1]) nums[0] else nums[1]
        for (i in 2 until len - 1) {
            dp[i] = if (nums[i] + dp[i - 2] > dp[i - 1]) nums[i] + dp[i - 2] else dp[i - 1]
        }
        result2 = dp[len - 2]
        return if (result1 > result2) result1 else result2
    }
}