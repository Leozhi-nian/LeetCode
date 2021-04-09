package com.leozhi.topic154

/**
 * @author leozhi
 * 二分查找
 * 官方题解
 * 通过
 * 232ms
 */
class Solution02 {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] < nums[right]) {
                right = mid
            } else if (nums[mid] > nums[right]) {
                left = mid + 1
            } else {
                right -= 1
            }
        }
        return nums[left]
    }
}