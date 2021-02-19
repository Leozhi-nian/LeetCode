package com.leozhi.topic485

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 284ms
 */
class Solution02 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var x = 0
        var y = 0
        for ((index, value) in nums.withIndex()) {
            if (value == 0) {
                val now = index - y
                x = if (now > x) now else x
                y = index + 1
            }
        }
        // 全为 1
        if (y == 0) {
            return nums.size
        }
        val now = nums.size - y
        x = if (now > x) now else x
        return x
    }
}