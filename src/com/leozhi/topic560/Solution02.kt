package com.leozhi.topic560

/**
 * @author leozhi
 * 前缀和
 * 通过
 * 1076ms
 */
class Solution02 {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val len = nums.size
        val preSum = IntArray(len + 1)
        preSum[0] = 0
        for (i in 1..len) {
            preSum[i] = preSum[i - 1] + nums[i - 1]
        }
        var res = 0
        for (i in preSum.indices) {
            for (j in 1..i) {
                if (preSum[i] - preSum[j - 1] == k) {
                    ++res
                }
            }
        }
        return res
    }
}