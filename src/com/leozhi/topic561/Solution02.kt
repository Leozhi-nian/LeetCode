package com.leozhi.topic561

/**
 * @author leozhi
 * 排序 + 一次遍历
 * 通过
 * 360 ms
 */
class Solution02 {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var res = 0
        for (i in nums.indices step 2) {
            res += nums[i]
        }
        return res
    }
}