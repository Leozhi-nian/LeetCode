package com.leozhi.topic477

/**
 * @author leozhi
 * 位运算
 * 通过
 * 1656ms
 */
class Solution01 {
    fun totalHammingDistance(nums: IntArray): Int {
        var res = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                res += bitCount(nums[i].xor(nums[j]))
            }
        }
        return res
    }

    private fun bitCount(n: Int): Int {
        var i = n
        i -= (i.ushr(1)).and(0x55555555)
        i = (i.and(0x33333333)) + ((i.ushr(2)).and(0x33333333))
        i = (i + (i.ushr(4))).and(0x0f0f0f0f)
        i += i.ushr(8)
        i += i.ushr(16)
        return i.and(0x3f)
    }
}