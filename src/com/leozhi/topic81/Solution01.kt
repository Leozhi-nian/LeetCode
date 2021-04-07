package com.leozhi.topic81

/**
 * @author leozhi
 * 排序 + 二分查找
 * 通过
 * 232ms
 */
class Solution01 {
    fun search(nums: IntArray, target: Int): Boolean {
        nums.sort()
        var left = 0;
        var right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                return true
            } else if (nums[mid] > target) {
                right = mid - 1
            } else if (nums[mid] < target) {
                left = mid + 1
            }
        }
        return false
    }
}