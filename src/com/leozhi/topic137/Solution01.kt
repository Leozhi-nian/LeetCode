package com.leozhi.topic137

/**
 * @author leozhi
 * 排序
 * 通过
 * 236ms
 */
class Solution01 {
    fun singleNumber(nums: IntArray): Int {
        nums.sort()
        var index = 0
        while (index == nums.size || nums[index] == nums[index + 1]) {
            index += 3
        }
        return nums[index]
    }
}