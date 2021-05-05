package com.leozhi.topic740

/**
 * @author leozhi
 * 动态规划
 * 官方题解
 * 通过
 * 204ms
 */
class Solution01 {
    fun deleteAndEarn(nums: IntArray): Int {
        var maxVal = 0
        for (num in nums) {
            maxVal = if (maxVal > num) maxVal else num
        }
        val sum = IntArray(maxVal + 1)
        for (num in nums) {
            sum[num] += num
        }
        return rob(sum)
    }

    private fun rob(nums: IntArray): Int {
        val size = nums.size
        var first = nums[0]
        var second = if (nums[0] > nums[1]) nums[0] else nums[1]
        for (i in 2 until size) {
            val temp = second
            second = if (first + nums[i] > second) first + nums[i] else second
            first = temp
        }
        return second
    }
}