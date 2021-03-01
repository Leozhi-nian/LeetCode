package com.leozhi.topic303

/**
 * @author leozhi
 * 一次循环
 * 通过
 * 648ms
 */
class NumArray(nums: IntArray) {
    val nums = nums
    fun sumRange(i: Int, j: Int): Int {
        var sum = 0
        for (k in i..j) {
            sum += nums[k]
        }
        return sum
    }
}