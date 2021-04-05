package com.leozhi.topic268

/**
 * @author leozhi
 * 排序
 * 通过
 * 260ms
 */
class Solution01 {
    fun missingNumber(nums: IntArray): Int {
        nums.sort()
        for ((index, num) in nums.withIndex()) {
            if (num != index) {
                return index
            }
        }
        return nums.size
    }
}