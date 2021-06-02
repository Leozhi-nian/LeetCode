package com.leozhi.topic523

import com.leozhi.testcase.array.convertToString
import com.leozhi.testcase.array.createIntArray

/**
 * @author leozhi
 * 动态规划
 * 超出时间限制
 */
class Solution01 {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val size = nums.size
        val dp = IntArray(size)
        for (i in 0 until size) {
            dp[i] = nums[i]
        }
        for (i in size - 2 downTo 0) {
            var pre = 0
            for (j in i + 1 until size) {
                val temp = dp[j]
                dp[j] = dp[j - 1] + dp[j] - pre
                if (dp[j] % k == 0) {
                    return true
                }
                pre = temp
            }
        }
        return false
    }
}

fun main() {
    println(createIntArray(100000, 1000, 0).convertToString())
    val solution01 = Solution01()
    solution01.checkSubarraySum(intArrayOf(23,2,4,6,6), 7)
}