package com.leozhi.offer03

/**
 * @author leozhi
 * 排序
 * 通过
 * 392ms
 */
class Solution01 {
    fun findRepeatNumber(nums: IntArray): Int {
        nums.sort()
        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                return nums[i]
            }
        }
        return nums[0]
    }
}