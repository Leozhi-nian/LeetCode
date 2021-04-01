package com.leozhi.topic421

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 528ms
 */
class Solution01 {
    fun findMaximumXOR(nums: IntArray): Int {
        var res = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                val value = nums[j].xor(nums[i])
                res = if (res > value) res else value
            }
        }
        return res
    }
}