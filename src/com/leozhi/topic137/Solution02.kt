package com.leozhi.topic137

/**
 * @author leozhi
 * 位运算
 * 通过
 * 208ms
 */
class Solution02 {
    fun singleNumber(nums: IntArray): Int {
        var seenOnce = 0
        var seenTwice = 0
        for (num in nums) {
            seenOnce = seenTwice.inv().and(seenOnce.xor(num))
            seenTwice = seenOnce.inv().and(seenTwice.xor(num))
        }
        return seenOnce
    }
}