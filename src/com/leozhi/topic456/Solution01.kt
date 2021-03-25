package com.leozhi.topic456

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 428ms
 */
class Solution01 {
    fun find132pattern(nums: IntArray): Boolean {
        for (i in nums.indices) {
            if (findMiddle(i, nums)) {
                return true
            }
        }
        return false
    }

    fun findMiddle(index: Int, nums: IntArray): Boolean {
        var left = Int.MAX_VALUE
        for (i in 0 until index) {
            left = if (nums[i] < left) nums[i] else left
        }
        for (i in index + 1 until nums.size) {
            if (nums[i] > left && nums[i] < nums[index]) {
                return true
            }
        }
        return false
    }
}