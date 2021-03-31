package com.leozhi.topic260

/**
 * @author leozhi
 * 位运算
 * 通过
 * 228ms
 */
class Solution01 {
    fun singleNumber(nums: IntArray): IntArray {
        var total = 0
        for (num in nums) {
            total = total.xor(num)
        }
        var mask = 1
        while (total.and(mask) == 0) {
            mask = mask.shl(1)
        }
        var num1 = 0
        var num2 = 0
        for (num in nums) {
            if (mask.and(num) == 0) {
                num1 = num1.xor(num)
            } else {
                num2 = num2.xor(num)
            }
        }
        return intArrayOf(num1, num2)
    }
}