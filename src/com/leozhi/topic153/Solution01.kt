package com.leozhi.topic153

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 188ms
 */
class Solution01 {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid]
            } else if (nums[mid] >= nums[0]) {
                left = mid + 1
            } else if (nums[mid] < nums[0]) {
                right = mid - 1
            }
        }
        return if (nums[0] < nums[nums.size - 1]) nums[0] else nums[nums.size - 1]
    }
}