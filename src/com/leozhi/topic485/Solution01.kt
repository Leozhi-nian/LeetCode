package com.leozhi.topic485

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 284ms
 */
class Solution01 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var index = 0
        var res = 0

        while (index < nums.size) {
            if (nums[index++] == 1) {
                ++count
            } else {
                res = if (res > count) res else count
                count = 0
            }
        }
        res = if (res > count) res else count
        return res
    }
}