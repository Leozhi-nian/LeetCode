package com.leozhi.topic368

/**
 * @author leozhi
 * 动态规划
 * 官方题解
 * 通过
 * 264ms
 */
class Solution01 {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        val len = nums.size
        nums.sort()

        // 第 1 步：动态规划找出最大子集的个数、最大子集中的最大整数
        val dp = IntArray(len) { 1 }
        var maxSize = 1
        var maxVal = dp[0]
        for (i in 1 until len) {
            for (j in 0 until i) {
                // 题目中说「没有重复元素」很重要
                if (nums[i] % nums[j] == 0) {
                    dp[i] = if (dp[i] > dp[j] + 1) dp[i] else dp[j] + 1
                }
            }

            if (dp[i] > maxSize) {
                maxSize = dp[i]
                maxVal = nums[i]
            }
        }

        // 第 2 步：倒推获得最大子集
        val res = ArrayList<Int>()
        if (maxSize == 1) {
            res.add(nums[0])
            return res
        }
        var i = len - 1
        while (i >= 0 && maxSize > 0) {
            if (dp[i] == maxSize && maxVal % nums[i] == 0) {
                res.add(nums[i])
                maxVal = nums[i]
                maxSize--
            }
            --i
        }
        return res
    }
}