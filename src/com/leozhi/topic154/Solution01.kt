package com.leozhi.topic154

/**
 * @author leozhi
 * 排序
 * 通过
 * 220ms
 */
class Solution01 {
    fun findMin(nums: IntArray): Int {
        nums.sort()
        return nums[0]
    }
}