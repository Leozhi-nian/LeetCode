package com.leozhi.topic153

/**
 * @author leozhi
 * 二分查找
 * 官方题解
 * 通过
 * 224ms
 */
class Solution02 {
    fun findMin(nums: IntArray): Int {
        var low = 0
        var high = nums.size - 1
        while (low < high) {
            val pivot = low + (high - low) / 2
            if (nums[pivot] < nums[high]) {
                high = pivot
            } else {
                low = pivot + 1
            }
        }
        return nums[low]
    }
}