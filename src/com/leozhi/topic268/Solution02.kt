package com.leozhi.topic268

/**
 * @author leozhi
 * 位运算
 * 官方题解
 * 通过
 * 256ms
 */
class Solution02 {
    fun missingNumber(nums: IntArray): Int {
        var missing = nums.size
        for ((index, num) in nums.withIndex()) {
            missing = missing.xor(index.xor(num))
        }
        return missing
    }
}