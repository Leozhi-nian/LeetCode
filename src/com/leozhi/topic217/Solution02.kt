package com.leozhi.topic217

/**
 * @author leozhi
 * 排序
 * 通过
 * 280ms
 */
class Solution02 {
    fun containsDuplicate(nums: IntArray): Boolean {
        nums.sort()
        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                return true
            }
        }
        return false
    }
}