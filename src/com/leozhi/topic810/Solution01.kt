package com.leozhi.topic810

/**
 * @author leozhi
 * 位运算
 * 通过
 * 228ms
 */
class Solution01 {
    fun xorGame(nums: IntArray): Boolean {
        if (nums.size % 2 == 0) {
            return true
        }
        var xor = 0
        for (num in nums) {
            xor = xor.xor(num)
        }
        return xor == 0
    }
}