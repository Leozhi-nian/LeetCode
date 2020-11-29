package com.leozhi.topic665

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 340ms
 */
class Solution02 {
    fun checkPossibility(nums: IntArray): Boolean {
        var count = 0
        for (i in 0 until nums.size - 1) {
            if (nums[i] > nums[i + 1]) {
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1]
                } else {
                    nums[i + 1] = nums[i]
                }
                if (++count > 1) {
                    return false
                }
            }
        }
        return true
    }
}