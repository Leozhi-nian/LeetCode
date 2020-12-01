package com.leozhi.topic34

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 248ms
 */
class Solution03 {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val len = nums.size
        val res = intArrayOf(-1, -1)
        if (len == 0) {
            return res
        }
        var left = 0
        var right = len
        // 寻找左边界，循环结束条件：left == right
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] >= target) {
                right = mid
            } else if (nums[mid] < target) {
                left = mid + 1
            }
        }
        if (left == len || nums[left] != target) {
            return res
        }
        res[0] = left
        right = len
        // 寻找右边界，循环结束条件：left == right
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] <= target) {
                left = mid + 1
            } else if (nums[mid] > target) {
                right = mid
            }
        }
        res[1] = left - 1
        return res
    }
}