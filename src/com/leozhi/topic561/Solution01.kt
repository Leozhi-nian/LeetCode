package com.leozhi.topic561

import com.leozhi.testcase.array.IntegerArray

/**
 * @author leozhi
 * 排序 + 一次遍历
 * 通过
 * 344 ms
 */
class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var res = 0
        for ((index, value) in nums.withIndex()) {
            if (index % 2 == 0) {
                res += value
            }
        }
        return res
    }
}