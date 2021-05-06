package com.leozhi.topic560

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 1036ms
 */
class Solution01 {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var res = 0
        for (i in nums.indices) {
            var sum = 0
            for (j in i until nums.size) {
                sum += nums[j]
                if (sum == k) {
                    ++res
                }
            }
        }
        return res
    }
}